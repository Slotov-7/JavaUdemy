package ultil;

public class Bank {
    private String holderName;
    private final int accountNumber;
    private double totalAccount;

    public Bank(int accountNumber, String holderName){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    public Bank(int accountNumber, String holderName, double depositInitial) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        addDeposit(depositInitial);
    }

    public String getHolderName() {
        return holderName;
    }
    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    public int getAccountNumber() {
        return accountNumber;
    }

    public double getTotalAccount() {
        return totalAccount;
    }

    public void addDeposit(double depositValue){
        totalAccount += depositValue;
    }
    public void withdraw(double withdrawValue){
        totalAccount -= (withdrawValue + 5);
    }
    @Override
    public String toString() {
        return "Account: " + accountNumber +
                ", Holder: "+ holderName +
                ", Balance: $ " + String.format("%.2f", totalAccount) + "\n";
    }
}
