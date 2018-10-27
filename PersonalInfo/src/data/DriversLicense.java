package data;

/**
 *
 * @author Tanmayee Kalluri
 */
public class DriversLicense {
    private long licenseNum;
    private String bloodType;
    private String dateOfIssue;
    private String dateOfExpiration;
    private String absolutePath;
    //put a picture also

    /**
     * @return the licenseNum
     */
    public long getLicenseNum() {
        return licenseNum;
    }

    /**
     * @param licenseNum the licenseNum to set
     */
    public void setLicenseNum(long licenseNum) {
        this.licenseNum = licenseNum;
    }

    /**
     * @return the bloodType
     */
    public String getBloodType() {
        return bloodType;
    }

    /**
     * @param bloodType the bloodType to set
     */
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    /**
     * @return the dateOfIssue
     */
    public String getDateOfIssue() {
        return dateOfIssue;
    }

    /**
     * @param dateOfIssue the dateOfIssue to set
     */
    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    /**
     * @return the dateOfExpiration
     */
    public String getDateOfExpiration() {
        return dateOfExpiration;
    }

    /**
     * @param dateOfExpiration the dateOfExpiration to set
     */
    public void setDateOfExpiration(String dateOfExpiration) {
        this.dateOfExpiration = dateOfExpiration;
    }

    /**
     * @return the absolutePath
     */
    public String getAbsolutePath() {
        return absolutePath;
    }

    /**
     * @param absolutePath the absolutePath to set
     */
    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
    }
}
