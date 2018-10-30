/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tanmayee Kalluri
 */
public class VitalSignHistory {
    
    private List<VitalSigns> vitalSignHistory;
    public VitalSignHistory(){
        vitalSignHistory =  new ArrayList<VitalSigns>() ;
    }

    public List<VitalSigns> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(List<VitalSigns> VitalSignHistory) {
        this.vitalSignHistory = VitalSignHistory;
    }
    
    public VitalSigns addVitals(){
        VitalSigns vs = new VitalSigns();
        vitalSignHistory.add(vs);
        return vs;
    }
    
    public void deleteVitals(VitalSigns vs){
        vitalSignHistory.remove(vs);
    }

    public List<VitalSigns> getAbnormalSigns(double maxbp, double minbp) {
        if(maxbp == -1 && minbp ==-1){
            List<VitalSigns> abnormal = new ArrayList<>();
            for (VitalSigns vs : vitalSignHistory){
                abnormal.add(vs);
        }
            
        return abnormal;
       }
        else{
        List<VitalSigns> abnormal = new ArrayList<>();
        for (VitalSigns vs : vitalSignHistory){
            if(vs.getBloodPressure()>maxbp || vs.getBloodPressure()<minbp)
                abnormal.add(vs);
        }
        return abnormal;
        }
        }
    
}
