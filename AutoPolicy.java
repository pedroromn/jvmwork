// AutoPolicy.java
// Class that represents an auto insurance policy

public class AutoPolicy{
    private String accountNumber; // policy account number
    private String makeAndModel; // car that the policy applies to
    private String state; // two-letter state abbreviation

    // constructor
    public AutoPolicy(String accountNumber,
                      String makeAndModel,
                      String state){
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    
}
