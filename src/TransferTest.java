public class TransferTest {

    public static void main(String[] args) {

        Person person1 = new Person("John", 4500);
        Person person2 = new Person("Tim");

        //person1.details();
        //person2.details();

        TransferList money = new TransferList(person1, person2);

        money.transfer(new ApplePayStrategy("person1@apple.com", "abcde"));

        //person1.details();
        //person2.details();

    }

}