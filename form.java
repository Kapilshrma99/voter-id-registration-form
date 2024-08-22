import java.awt.Color;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.event.*;
public class form { 
JFrame jf;    
    form(){
    JFrame jf = new JFrame();
    jf.setSize(2000, 800);
    jf.setVisible(true);
    jf.setLayout(null);
    JLabel jl =new JLabel();
    jf.add(jl);
    jl.setText("VOTER ID REGISTRATION FORM");
    jl.setBounds(500, 0, 500, 100);
    jl.setForeground(Color.BLUE);
    jl.setFont(new FontUIResource("Italic", 50, 30));
    JLabel jl1 =new JLabel();
    jf.add(jl1);
    jl1.setText("<html><h1>This is a voter id registeration form.<h1><br>it is ensure that you are eligeble for this form'by age'.<br>if any kind of faliure occur.<br>this will your responsibility.<br><h1>THANKYOU<h1><html>");
    jl1.setBounds(0, 200, 1500, 250);
    jl1.setForeground(Color.BLUE);
    jl1.setFont(new FontUIResource("Italic", 50, 30));
    JButton nd =new JButton("I Agree");
    jf.add(nd);
    nd.setForeground(Color.RED);
    nd.setBounds(500, 500, 100, 30);
    nd.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
               new prsonal();
            jf.dispose();
        }});
    }
public static void main(String[] args) {
   new form(); 
}    
}
