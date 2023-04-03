import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class SaveInQueue {

    public static void getInformation(Map<String, Mail> mails,Map<Integer, House> houses,PriorityQueue<PostalBox> postalBoxQueue)
    {
        String content="";
        String title = "Postal Boxes :";
        boolean returned = false;
        int receiverPostalCode = 0;
        int senderPostalCode=0;
        int receiver=0;
        int sender=0;
        String receiverAddress = null;
        String senderAddress= null;
        int receiverFlag=0;

        PostalBox postalBox ;

        Set<Map.Entry<String, Mail>> st = mails.entrySet();
        Set<Map.Entry<Integer, House>> st2 = houses.entrySet();

        for(Map.Entry<String, Mail> me : st)
        {
            receiver=me.getValue().receiver;
            sender=me.getValue().sender;
            for(Map.Entry<Integer, House> he : st2)
            {
                if(receiver == he.getValue().ownerNationalCode)
                {
                    receiverPostalCode=he.getValue().key;
                    receiverAddress=he.getValue().address;
                    receiverFlag=1;
                    break;
                }
            }
            for (Map.Entry<Integer, House> he : st2)
            {
                if(sender == he.getValue().ownerNationalCode)
                {
                    senderPostalCode=he.getValue().key;
                    senderAddress=he.getValue().address;
                    break;
                }
            }
            if(receiverFlag==0)
            {
                returned = true;
            }
            postalBox = new PostalBox(me.getValue(),receiverPostalCode,senderPostalCode,receiverAddress,senderAddress,returned);
            postalBoxQueue.add(postalBox);
            content= content + postalBox.toString()+"\n";
        }
        new GraphicPanel(title,content);
    }

    public SaveInQueue()
    {

    }
}
