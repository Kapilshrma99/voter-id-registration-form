import java.awt.Color;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.event.*;
public class prsonal extends array {
    prsonal(){
    JFrame jf1 = new JFrame();
    jf1.setSize(2000, 800);
    jf1.setVisible(true);
    jf1.setLayout(null);
    JPanel jp2=new JPanel();
    jf1.add(jp2);
    jp2.setBounds(800, 400, 300, 300);
    jp2.setBackground(Color.MAGENTA);
    JLabel mt=new JLabel("<html>MATDAN AAM<br><br> AADMI<br><br> KA ADHIKAR.<html>");
    jp2.add(mt);
    mt.setForeground(Color.yellow);
    mt.setFont(new FontUIResource("Dialog",40, 30));
    JLabel jli =new JLabel();
jf1.add(jli);
    jli.setText("Your First Step 'Personl Detail'");
jli.setBounds(500, 0, 500, 100);
jli.setForeground(Color.BLUE);
jli.setFont(new FontUIResource("Italic", 50, 30));
JLabel jl1 =new JLabel();
jf1.add(jl1);
jl1.setText("Your Name:-");
jl1.setBounds(100, 90, 500, 100);
jl1.setFont(new FontUIResource("Italic", 50, 20));
JTextField tf =new JTextField();
jf1.add(tf);
    tf.setBounds(230, 120, 150, 40); 
     JLabel jl2 =new JLabel("First Name");
jf1.add(jl2);
   jl2.setBounds(230, 80, 150, 40);
JTextField sn =new JTextField();
jf1.add(sn);
sn.setBounds(400, 120, 150, 40); 
JLabel snl =new JLabel("Second Name");
jf1.add(snl);
snl.setBounds(400, 80, 150, 40);
JLabel dob =new JLabel("Your Date Of Birth:-");
jf1.add(dob);
dob.setBounds(100, 250, 200, 40);
dob.setFont(new FontUIResource("Italic", 50, 20));
JTextField dobt =new JTextField();
jf1.add(dobt);
    dobt.setBounds(300, 250, 150, 40);
    JLabel sex =new JLabel("Enter Your Sex:-");
jf1.add(sex);
sex.setBounds(100, 300, 200, 40);
sex.setFont(new FontUIResource("Italic", 50, 20));
JTextField sext =new JTextField();
jf1.add(sext);
sext.setBounds(300, 300, 150, 40);
JLabel ad =new JLabel("Enter Your Adhar no.:-");
jf1.add(ad);
ad.setBounds(100, 350, 200, 40);
ad.setFont(new FontUIResource("Italic", 50, 20));
JTextField adt =new JTextField();
jf1.add(adt);
adt.setBounds(300, 350, 150, 40);
JButton nd1 =new JButton("SUBMIT");
jf1.add(nd1);
nd1.setBounds(500, 400, 80, 30);
nd1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
    a[1][1]=jl1.getText();
String x=tf.getText();
                String y=sn.getText();
               a[1][2]=x+y;
                a[2][1]=dob.getText();
               a[2][2]=dobt.getText();
                a[3][1]=sex.getText();
                a[3][2]=sext.getText();
                a[4][1]=ad.getText();
                a[4][2]=adt.getText();
      new contactdetails();
jf1.dispose();
}});}   
}
