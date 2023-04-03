import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Map<Integer, Person> people = new HashMap<>();
        Map<Integer, House> houses = new HashMap<>();
        Map<String, Mail> mails = new HashMap<>();

        compareMails c = new compareMails();
        PriorityQueue<PostalBox> postalBoxQueue = new PriorityQueue<PostalBox>(c);

        PersonReader pr = new PersonReader(people);
        HouseReader hr = new HouseReader(houses);
        MailReader mr = new MailReader(mails);

        Thread t1 = new Thread(pr);
        Thread t2 = new Thread(hr);
        Thread t3 = new Thread(mr);
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        SaveInQueue.getInformation(mails,houses,postalBoxQueue);

        System.out.println("main finished !");
    }
    //color
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
}
