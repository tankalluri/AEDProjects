package data;

/**
 *
 * @author Tanmayee Kalluri
 */
public class BankAccount {
    private String bankName;
    private int routingNum;
    private int accNum;
    private double accBalance;
    //private String accType; //check what to do about this later

    /**
     * @return the bankName
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * @param bankName the bankName to set
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    /**
     * @return the routingNum
     */
    public int getRoutingNum() {
        return routingNum;
    }

    /**
     * @param routingNum the routingNum to set
     */
    public void setRoutingNum(int routingNum) {
        this.routingNum = routingNum;
    }

    /**
     * @return the accNum
     */
    public int getAccNum() {
        return accNum;
    }

    /**
     * @param accNum the accNum to set
     */
    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    /**
     * @return the accBalance
     */
    public double getAccBalance() {
        return accBalance;
    }

    /**
     * @param accBalance the accBalance to set
     */
    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }
}
