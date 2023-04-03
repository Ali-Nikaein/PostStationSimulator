import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class HouseReader implements Runnable {
    Map<Integer, House> houses;

    public HouseReader(Map<Integer, House> newMap) {
        houses = newMap;
    }

    public void readingHouse() throws FileNotFoundException {
        String content="";
        String title = "Houses :";
        Scanner sc2 = new Scanner(new File("home.txt"));
        sc2.nextLine();
        while (sc2.hasNext()) {
            House h = new House(sc2.nextInt(), sc2.nextInt(), sc2.next(), sc2.nextInt(), sc2.nextInt());
            content += h.toString()+"\n";
            //System.out.println(ANSI_RED+h+ANSI_RESET);
            houses.put(h.key, h);
        }
        new GraphicPanel(title,content);
    }

    @Override
    public void run() {
        try {
            readingHouse();
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
