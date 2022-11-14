public class GooglePayStrategy implements MoneyTransferStrategy {

    private String email;
    private String password;

    public GooglePayStrategy(String email, String pwd){
        this.email=email;
        this.password=pwd;
    }

    @Override
    public void transfer(int amount) {
        System.out.println(amount + " transferred with Google Pay");
    }

}