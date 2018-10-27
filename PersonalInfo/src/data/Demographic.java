package data;
import java.util.*;

/**
 *
 * @author Tanmayee Kalluri
 */
public class Demographic {
    private String firstName;
    private String lastName;
    private long phNum;
    private String dob;
    private double height;
    private double weight;
    private String ssn;
    private Address addr;
    private MedicalRecord medical;
    private DriversLicense dl;
    private BankAccount bankAccountSaving;
    private BankAccount bankAccountChecking;

    //public Demographic(Address add){
       public Demographic(){ 
       addr= new Address(); 
       //this.addr= add;
       medical= new MedicalRecord();
       dl= new DriversLicense();
       bankAccountSaving= new BankAccount();
       bankAccountChecking= new BankAccount();
       }
    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the phNum
     */
    public long getPhNum() {
        return phNum;
    }

    /**
     * @param phNum the phNum to set
     */
    public void setPhNum(long phNum) {
        this.phNum = phNum;
    }

    /**
     * @return the dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * @param dob the dob to set
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * @return the height
     */
    public double getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * @return the ssn
     */
    public String getSsn() {
        return ssn;
    }

    /**
     * @param ssn the ssn to set
     */
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    /**
     * @return the addr
     */
    public Address getAddr() {
        return addr;
    }

    /**
     * @return the medical
     */
    public MedicalRecord getMedical() {
        return medical;
    }

    /**
     * @return the dl
     */
    public DriversLicense getDl() {
        return dl;
    }

    /**
     * @param addr the addr to set
     */
    public void setAddr(Address addr) {
        this.addr = addr;
    }

    /**
     * @param medical the medical to set
     */
    public void setMedical(MedicalRecord medical) {
        this.medical = medical;
    }

    /**
     * @param dl the dl to set
     */
    public void setDl(DriversLicense dl) {
        this.dl = dl;
    }

    /**
     * @return the bankAccountSaving
     */
    public BankAccount getBankAccountSaving() {
        return bankAccountSaving;
    }

    /**
     * @param bankAccountSaving the bankAccountSaving to set
     */
    public void setBankAccountSaving(BankAccount bankAccountSaving) {
        this.bankAccountSaving = bankAccountSaving;
    }

    /**
     * @return the bankAccountChecking
     */
    public BankAccount getBankAccountChecking() {
        return bankAccountChecking;
    }

    /**
     * @param bankAccountChecking the bankAccountChecking to set
     */
    public void setBankAccountChecking(BankAccount bankAccountChecking) {
        this.bankAccountChecking = bankAccountChecking;
    }
    
}
