package data;

/**
 *
 * @author Tanmayee Kalluri
 */
public class MedicalRecord {
    private long recordNum;
    private String allergy1;
    private String allergy2;
    private String allergy3;

    /**
     * @return the recordNum
     */
    public long getRecordNum() {
        return recordNum;
    }

    /**
     * @param recordNum the recordNum to set
     */
    public void setRecordNum(long recordNum) {
        this.recordNum = recordNum;
    }

    /**
     * @return the allergy1
     */
    public String getAllergy1() {
        return allergy1;
    }

    /**
     * @param allergy1 the allergy1 to set
     */
    public void setAllergy1(String allergy1) {
        this.allergy1 = allergy1;
    }

    /**
     * @return the allergy2
     */
    public String getAllergy2() {
        return allergy2;
    }

    /**
     * @param allergy2 the allergy2 to set
     */
    public void setAllergy2(String allergy2) {
        this.allergy2 = allergy2;
    }

    /**
     * @return the allergy3
     */
    public String getAllergy3() {
        return allergy3;
    }

    /**
     * @param allergy3 the allergy3 to set
     */
    public void setAllergy3(String allergy3) {
        this.allergy3 = allergy3;
    }
}
