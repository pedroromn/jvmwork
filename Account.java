public class Account
{
    private String name; // instance variable
    private double balance;

    public Account(String name, double balance){
        this.name = name;
        if(balance > 0.0){
            this.balance = balance;
        }
    }

    public void withdraw(double withdrawAmount){
        if(withdrawAmount > this.balance){
            System.out.printf("Withdrawal amount exceeded account"
                              +"balance");
            else{
                this.balance = this.balance - withdrawAmount;
            }
        }
    }

    public void deposit(double depositAmount){
        if(depositAmount > 0.0)
            this.balance = this.balance + depositAmount;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
