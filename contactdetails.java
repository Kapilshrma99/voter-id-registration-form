
import java.awt.Color;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.event.*;
public class contactdetails extends array {
    JFrame jf2;
    contactdetails(){
        JFrame jf2 = new JFrame();
        jf2.setSize(2000, 800);
        jf2.setVisible(true);
        jf2.setLayout(null);
        JLabel jle =new JLabel();
        jf2.add(jle);
                jle.setText("Your Second  Step 'Contact Details'");
        jle.setBounds(500, 0, 500, 100);
        jle.setForeground(Color.BLUE);
        jle.setFont(new FontUIResource("Italic", 50, 30));
        JLabel mmn =new JLabel("Your Mother Mobile No ?:-");
        jf2.add(mmn);
        mmn.setBounds(100, 150, 300, 40);
        mmn.setFont(new FontUIResource("Italic", 50, 20));
        JTextField mmnt =new JTextField();
        jf2.add(mmnt);
        mmnt.setBounds(370, 150, 150, 40);
        JLabel mn =new JLabel("your Mobile No:-");
        jf2.add(mn);
        mn.setBounds(100, 200, 160, 40);
        mn.setFont(new FontUIResource("Italic", 50, 20));
        JTextField mnt =new JTextField();
        jf2.add(mnt);
        mnt.setBounds(260, 200, 150, 40);
        JLabel ei =new JLabel("Enter EMail ID:-");
        jf2.add(ei);
        ei.setBounds(100, 250, 160, 40);
        ei.setFont(new FontUIResource("Italic", 50, 20));
        JTextField eit =new JTextField();
        jf2.add(eit);
        eit.setBounds(300, 250, 150, 40);
        JLabel fmn =new JLabel(" Your Father Mobile No:-");
        jf2.add(fmn);
        fmn.setBounds(100, 330, 300, 40);
        fmn.setFont(new FontUIResource("Italic", 50, 20));
        JTextField fmnt =new JTextField();
        jf2.add(fmnt);
        fmnt.setBounds(370, 330, 150, 40);
        JLabel amn =new JLabel("Enter Your Alternate Mobile No:-");
        jf2.add(amn);
        amn.setBounds(100, 370, 300, 40);
        amn.setFont(new FontUIResource("Italic", 50, 20));
        JTextField amnt =new JTextField();
        jf2.add(amnt);
        amnt.setBounds(380, 380, 150, 40);
        JButton pd =new JButton("SUBMIT");
        jf2.add(pd);
        pd.setBounds(500, 450, 80, 30); 
        pd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                a[5][1]=mmn.getText();
                a[5][2]=mmnt.getText();
                a[6][1]=mn.getText();
                a[6][2]=mnt.getText();
                a[7][1]=ei.getText();
                a[7][2]=eit.getText();
                a[8][1]=fmn.getText();
                a[8][2]=fmnt.getText();
                a[9][1]=amn.getText();
                a[9][2]=amnt.getText();
               jf2.dispose();
                new parentdetails();
                jf2.dispose();
            }});

    }
}
