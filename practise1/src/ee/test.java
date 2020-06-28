package ee;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class test extends JFrame{
	private JList jList1;
    private JButton jButton1;
    private JButton jButton2;
    private JList jList2;
    private DefaultListModel listModel1;
    private DefaultListModel listModel2;
    private JButton jButton4;
    private JButton jButton3;
    {
        //Set Look & Feel
        try {
            javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Auto-generated main method to display this JFrame
     */
    public static void main(String[] args) {
        test inst = new test();
        inst.setVisible(true);
    }

    public test() {
        super();
        initGUI();
    }

    private void initGUI() {
        try {
            setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            getContentPane().setLayout(null);
            {
                listModel1 = new DefaultListModel();
                listModel1.addElement("item 1");
                listModel1.addElement("item 2");
                listModel1.addElement("item 3");
                listModel1.addElement("item 4");
                listModel1.addElement("item 5");
                listModel1.addElement("item 6");
                jList1 = new JList(listModel1);
                getContentPane().add(jList1);
                jList1.setBounds(42, 28, 119, 203);
            }
            {
                listModel2 = new DefaultListModel();
                jList2 = new JList(listModel2);
                getContentPane().add(jList2);
                jList2.setBounds(238, 28, 119, 196);
            }
           
            {
                jButton4 = new JButton();
                getContentPane().add(jButton4);
                jButton4.setText("É¾³ý");
                jButton4.setBounds(168, 189, 63, 28);
                jButton4.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        jButton4ActionPerformed(evt);
                    }
                });
            }
            pack();
            setSize(400, 300);
            setLocationRelativeTo(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
    /** jList1É¾³ýÏî*/
    private void jButton4ActionPerformed(ActionEvent evt) {
        if(jList1.getSelectedIndex()!=-1){
            listModel1.remove(jList1.getSelectedIndex());   
        }

    }
}
