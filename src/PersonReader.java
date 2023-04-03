import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Date;
import java.util.Map;
import java.util.Scanner;
public class PersonReader implements Runnable {

    Map<Integer, Person> newMap;




    public PersonReader(Map<Integer, Person> people) throws FileNotFoundException {
        newMap = people;
    }

    public void readingPerson() throws FileNotFoundException {
        String content="";
        String title = "People :";
        Scanner sc1 = new Scanner(new File("people.txt"));
        sc1.nextLine();
        while (sc1.hasNext()) {
            Person p = new Person(sc1.next(), sc1.next(), sc1.nextInt(), Date.valueOf(sc1.next()), sc1.next());
            content += p.toString()+"\n";
            //System.out.println(content);
            //System.out.println(ANSI_CYAN+p+ANSI_RESET);
            newMap.put(p.key, p);
        }
        new GraphicPanel(title,content);
    }

    @Override
    public void run() {
        try {
            readingPerson();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
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
