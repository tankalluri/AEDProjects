/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Game of Threads
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name) {};
            enterpriseList.add(enterprise);
        }
        else if (type==Enterprise.EnterpriseType.Awareness){
            enterprise=new AwarenessCampEnterprise(name) {};
            enterpriseList.add(enterprise);
        }
        else if (type==Enterprise.EnterpriseType.Laboratory){
            enterprise=new CentralLaboratoryEnterprise(name) {};
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}

