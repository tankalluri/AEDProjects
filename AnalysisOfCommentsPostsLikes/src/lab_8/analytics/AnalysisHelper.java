/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_8.analytics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;
import lab_8.entities.Comment;
import lab_8.entities.Post;
import lab_8.entities.User;

/**
 *
 * @author Tanmayee Kalluri
 */
public class AnalysisHelper {
    public void userWithMostLikes(){
       Map<Integer, Integer> userLikeCount = new HashMap<Integer, Integer>();

       Map<Integer, User> users = DataStore.getInstance().getUsers();
       for(User user : users.values()){
           for(Comment c : user.getComments()){
               int likes = 0;
               if(userLikeCount.containsKey(user.getId())){
                   likes = userLikeCount.get(user.getId());
                   likes += c.getLikes();
                   userLikeCount.put(user.getId(), likes);
               }
           }

       }
           int max = 0;
           int maxId = 0;
           for(int id: userLikeCount.keySet()){
               if(userLikeCount.get(id) > max){
                   max = userLikeCount.get(id);
                   maxId = id;
               }
           }
       System.out.println("_____________________________________________");
       System.out.println("User with the most likes : "+max+"\n"+users.get(maxId));
   }
    
    public void getFiveMostLikedComment(){
       Map<Integer, Comment> comments = DataStore.getInstance().getComments();

       List<Comment> commentList = new ArrayList<>(comments.values());

      Collections.sort(commentList, new Comparator<Comment>(){
          @Override
          public int compare(Comment o1, Comment o2) {
              //so as to get decending list
              return o2.getLikes() - o1.getLikes();
          }
      });
        System.out.println("_____________________________________________");
        System.out.println("5 most liked comments : ");
        for(int i = 0; i < commentList.size() && i < 5; i++){
            System.out.println(commentList.get(i));
        }
   }
    
    public void getPostWithMostLikedComment() {
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        
        Map<Integer, Integer> postsWithMostLikedComments = new HashMap<Integer, Integer>();
         Map.Entry<Integer,Integer> entry;

        for(Post post : posts.values()){
            int maxLikes = 0;
            for(Comment c : post.getComments()){
                if(c.getLikes() > maxLikes){
                    maxLikes = c.getLikes();
                }
            }
            if(!postsWithMostLikedComments.isEmpty()){
                entry = postsWithMostLikedComments.entrySet().iterator().next();
                int existingMaxVal = entry.getValue();
                if(existingMaxVal < maxLikes){
                    postsWithMostLikedComments.clear();
                    postsWithMostLikedComments.put(post.getPostId(), maxLikes);
                } 
                else if(existingMaxVal == maxLikes)
                    postsWithMostLikedComments.put(post.getPostId(), maxLikes);               
            }else{
                postsWithMostLikedComments.put(post.getPostId(), maxLikes);
            }
        }
        
        Iterator<Map.Entry<Integer, Integer>> iterator = postsWithMostLikedComments.entrySet().iterator();
        System.out.println("_____________________________");
        System.out.println("Post with most liked comment:");
        while(iterator.hasNext()){
            Map.Entry<Integer, Integer> element = iterator.next();
            System.out.println("PostId = " +element.getKey()+ " Max likes = " +element.getValue());
        }
        System.out.println("_____________________________");
    }

        public void gettop5inactiveusersoverll()
    {
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
         List<Comment> commentList = new ArrayList<>(comments.values());
         List<User> userList = new ArrayList<>(users.values());
         List<Integer> postKey = new ArrayList<>(posts.keySet());
         
        Map<Integer, Integer> overallCount = new HashMap<Integer, Integer>();
        int postCount = 1;

        for(Post post : posts.values()){
           int userId = post.getUserId();
           if(overallCount.containsKey(userId)){
               postCount = overallCount.get(userId);
               overallCount.put(userId, ++postCount);
           }else{
               overallCount.put(userId, postCount);
           }
       }
         for(User user : users.values()){
        int size = user.getComments().size();
        if(overallCount.containsKey(user.getId())){
            int count = overallCount.get(user.getId()) + size;
            overallCount.put(user.getId(), count);
        }
         } 
      List<Map.Entry<Integer, Integer>> entryList = new ArrayList<Map.Entry<Integer, Integer>>(overallCount.entrySet());

         Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
         @Override
         public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
             return o1.getValue().compareTo(o2.getValue());
         }
      });
      
      System.out.println(entryList);
      System.out.println("Top 5 inactive users overall based on comments,posts and likes : ");
      ListIterator it = entryList.listIterator();
      int size = 0;
      while(it.hasNext() && size < 5){
      Map.Entry pair = (Map.Entry)it.next();
      System.out.println("UserId = " +pair.getKey()+ " overall value " +pair.getValue());
      size++;
       }
      size = 0;
      System.out.println("-------------------------------------------------------------------");;
      System.out.println("Top 5 proactive users overall based on comments,posts and likes : ");
      while(it.hasPrevious() && size < 5){
      Map.Entry pair = (Map.Entry)it.next();
      System.out.println("UserId = " +pair.getKey()+ " overall value " +pair.getValue());
      size++;
      }
 
    }    

    public void avgLikesPerComment(){
        int likesCount=0;
        int commentsCount=0;
        Map<Integer, Comment> comments = DataStore.getInstance().getComments();
         for(Comment c : comments.values()){
             likesCount+=c.getLikes();
             commentsCount++;
         }
         System.out.println("____________________________________________");
         System.out.println("Total number of likes "+likesCount);
         System.out.println("Total number of comments "+commentsCount);
         double avg =(double) likesCount/commentsCount;
         System.out.println("Average number of likes per comment "+avg);
         System.out.println("_____________________________________________");
        }
    
    public void fiveInactiveUsersComments(){
        Map<Integer, Integer> useractivity = new HashMap<Integer, Integer>();
        Map<Integer, User> users = DataStore.getInstance().getUsers();
        for(User user : users.values()){
        useractivity.put(user.getId(), user.getComments().size());
//           for(Comment c : user.getComments()){
//               int count =0;
//               for(int i=0;i<=9;i++){
//                if(i == c.getUserId()){
//                    count++;
              }
        List<Map.Entry<Integer, Integer>> activityList = new ArrayList<Map.Entry<Integer, Integer>>(useractivity.entrySet());
        Collections.sort(activityList, new Comparator<Map.Entry<Integer, Integer>>() {
          @Override
          public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
              return o1.getValue().compareTo(o2.getValue());
          }
       });
        //System.out.println(activityList);
        //System.out.println("_____________________________________________");
        System.out.println("Top 5 inactive users based on comments");
        Iterator it = activityList.listIterator();
        int size = 0;
        while(it.hasNext() && size < 5){
           Map.Entry keyValuePair = (Map.Entry)it.next();
           System.out.println("UserId = " +keyValuePair.getKey()+ " and number of comments = " +keyValuePair.getValue());
           size++;
       }
        //System.out.println("_____________________________________________");
    
    }
    
    public void top5InactiveUsersBasedOnPost(){
       Map<Integer, Post> posts = DataStore.getInstance().getPosts();
       
       //add UserId and number of posts created by that user into hashmap
        Map<Integer, Integer> userPostCount = new HashMap<Integer, Integer>();
        
        int postCount = 1;
        
        for(Post post : posts.values()){
            int userId = post.getUserId();
            if(userPostCount.containsKey(userId)){
                postCount = userPostCount.get(userId);
                userPostCount.put(userId, ++postCount);
            }else{
                userPostCount.put(userId, postCount);
            }
        }
        
        System.out.println("_____________________________________________");
        //System.out.println("UserId and number of posts before sorting");
        //System.out.println(userPostCount);
        
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<Map.Entry<Integer, Integer>>(userPostCount.entrySet());
        
        Collections.sort(entryList, new Comparator<Map.Entry<Integer, Integer>>() {
           @Override
           public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
               return o1.getValue().compareTo(o2.getValue());
           }
        });
        
        //System.out.println("UserId and number of posts after sorting");
        //System.out.println(entryList);
        System.out.println("Top 5 inactive users based on post : ");
        Iterator it = entryList.listIterator();
        int size = 0;
        while(it.hasNext() && size < 5){
            Map.Entry pair = (Map.Entry)it.next();
            System.out.println("UserId = " +pair.getKey()+ " and number of posts = " +pair.getValue());
            size++;
        }
         System.out.println("_____________________________________________");
   }
    
    public void postWithMostComments(){
        Map<Integer, Integer> topPostComment = new HashMap<Integer, Integer>();
        Map<Integer, Post> posts = DataStore.getInstance().getPosts();
        for(Post p : posts.values()){
        topPostComment.put(p.getPostId(),p.getComments().size());
    }
        List<Map.Entry<Integer, Integer>> postCommentList = new ArrayList<Map.Entry<Integer, Integer>>(topPostComment.entrySet());
        Collections.sort(postCommentList, new Comparator<Map.Entry<Integer, Integer>>() {
          @Override
          public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
              return o2.getValue().compareTo(o1.getValue());
          }
       });
        System.out.println("Post with most comments");
        int maxComment= postCommentList.get(0).getValue();
        Iterator iter = postCommentList.listIterator();
        while(iter.hasNext()){
            Map.Entry keyValuePair=(Map.Entry)iter.next();
            if((int)keyValuePair.getValue()== maxComment){
               System.out.println("Post ID "+keyValuePair.getKey()+" || Number of comments "+maxComment);
            }
        }
        //System.out.println("Post with most comments {Post ID: "+postCommentList.get(0).getKey()+" Number of comments: "+postCommentList.get(0).getValue()+"}");
        System.out.println("_____________________________________________");
    }      
}
