import javax.swing.*;
import java.awt.*;
import java.util.Map;

public class GraphicPanel extends JFrame {
    public GraphicPanel(String title,String str)
    {
        JFrame newJFrame = new JFrame();
        newJFrame.setTitle(title);
        newJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newJFrame.setBounds(500,300,600,600);
        newJFrame.setVisible(true);

        FlowLayout flowLayout = new FlowLayout();
        newJFrame.setLayout(flowLayout);

        //JLabel label = new JLabel();
        //label.setText(str);
        //label.setSize(200,200);

        JTextArea jTextField = new JTextArea(str);
        jTextField.setBounds(50,100,500,500);
        JPanel jp = new JPanel();
        //jp.add(label);
        jp.add(jTextField);
        newJFrame.add(jp);


        //JTextArea area = new JTextArea("ssssss");
        //area.setBounds(10,30, 200,200);
        //newJFrame.add(area);

    }
}
