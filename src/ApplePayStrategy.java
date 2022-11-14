public class ApplePayStrategy implements MoneyTransferStrategy {

    private String email;
    private String password;

    public ApplePayStrategy(String email, String password){
        this.email=email;
        this.password=password;
    }
    @Override
    public void transfer(int amount) {
        System.out.println(amount +" transferred with Apple Pay");
    }

}