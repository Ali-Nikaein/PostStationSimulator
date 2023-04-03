import java.util.Comparator;

public class compareMails implements Comparator<PostalBox> {

    @Override
    public int compare(PostalBox o1, PostalBox o2) {
        return Integer.compare(o1.mail.priority,o2.mail.priority);
    }
    public compareMails()
    {

    }
}
