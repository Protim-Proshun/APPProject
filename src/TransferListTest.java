import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransferListTest {

    @Test
    void calculateBalance() {
        Person sender1 = new Person("Sender1", 500);
        Person receiver1 = new Person("Receiver1");
        TransferList t = new TransferList(sender1, receiver1);
        assertEquals(500, t.calculateBalance());

    }

    @Test
    void transfer() {
        Person sender2 = new Person("Sender2", 900);
        Person receiver2 = new Person("Receiver2");
        TransferList t1 = new TransferList(sender2, receiver2);
        t1.transfer(new ApplePayStrategy("test@apple.com", "password"));
        assertEquals(900, t1.calculateBalance());

        Person sender3 = new Person("Sender3", 200);
        Person receiver3 = new Person("Receiver3");
        TransferList t2 = new TransferList(sender3, receiver3);
        t2.transfer(new GooglePayStrategy("test@google.com", "password"));
        assertEquals(200, t2.calculateBalance());

    }

}