public class Person {

    private String name;
    private int transferAmount;
    private int bankBalance;


    public Person() {

    }

    public Person(String name) {
        this.name = name;
        this.bankBalance = 10000;
    }

    public Person(String name, int transferAmount) {
        this.name = name;
        this.bankBalance = 10000;
        this.transferAmount = transferAmount;
    }

   /*public Person(String name, int bankBalance, int transferAmount){
        this.name = name;
        this.bankBalance = bankBalance;
        this.transferAmount = transferAmount;
    }*/

    public String getName() {
        return this.name;
    }

    public int getTransferAmount() {
        return this.transferAmount;
    }

    public void setBankBalance(int newBalance) {
        this.bankBalance = newBalance;
    }

    public int getBankBalance() {
        return this.bankBalance;
    }

    public void details() {
        System.out.println("Name: " + this.name + " Balance: " + this.bankBalance);
    }


}