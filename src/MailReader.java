import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class MailReader implements Runnable {
    Map<String, Mail> mails;

    public MailReader(Map<String, Mail> newMap) {
        mails = newMap;
    }

    public void readingMails() throws FileNotFoundException {
        String content="";
        String title = "Mails :";
        Scanner sc3 = new Scanner(new File("letter.txt"));
        sc3.nextLine();
        while (sc3.hasNext()) {
            Mail m = new Mail(sc3.nextInt(), sc3.next(), sc3.next(), sc3.nextInt(), sc3.nextInt());
            content += m.toString()+"\n";
            //System.out.println(ANSI_GREEN+m+ANSI_RESET);
            mails.put(m.key, m);
        }
        new GraphicPanel(title,content);
    }

    @Override
    public void run() {
        try {
            readingMails();
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
