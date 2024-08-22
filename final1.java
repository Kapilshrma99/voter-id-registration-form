import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.Color;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.event.*;
public class final1 extends array {
    final1(){
        JFrame jf5 = new JFrame();
                jf5.setSize(2000, 800);
                jf5.setVisible(true);
                jf5.setLayout(null);
                JLabel jlfi=new JLabel();
                jlfi.setText("Your Final Form For Rechecking");
        jlfi.setBounds(500, 0, 500, 100);
        jlfi.setForeground(Color.BLUE);
        jlfi.setFont(new FontUIResource("Italic", 50, 30));
        jf5.add(jlfi);
                int p=10,b=0,c=0,count=0,q=10;
                for(int i=1;i<=19;i++)
                {if(count==11){
                        p=550;
                        q=850;
                        b=10;
                        c=10;
                }
                        for(int j=1;j<=2;j++)
                    {JLabel l=new JLabel();
                        jf5.add(l);
                     
                        if(j==1){if(count<11){p=10;}
                        l.setBounds(p, b, 500, 300);
                        b=b+50;
                        l.setText(a[i][j]);
                        l.setFont(new FontUIResource("Italic", 50, 20));
                        count++;
                }
                if(j==2){if(count<11){q=300;}
                        l.setBounds(q, c, 500, 300);
                       c=c+50;
                        l.setText(a[i][j]);
                        l.setForeground(Color.RED);
                        l.setFont(new FontUIResource("Italic", 50, 15));
                }
                      }
                }
                JButton ca =new JButton("Cancel");
                ca.setBounds(900, 600, 80, 30);
                jf5.add(ca);
                ca.setBackground(Color.RED);
                ca.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                               jf5.dispose();
                        }});            
                JButton fs =new JButton("Final Submit");
                fs.setBounds(1000, 600, 150, 30);
                jf5.add(fs);
                fs.setBackground(Color.GREEN);
                fs.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                         File file = new File("voter id");
                         boolean result;
                         try{
                         result=file.createNewFile();
                         if(result){
                                BufferedWriter mw =new BufferedWriter(new FileWriter("voter id"));
                                for(int i=1;i<=19;i++){
                                        for(int j=1;j<=2;j++){
                                mw.write(a[i][j]+"-");}
                                mw.write("\n");
                                }
                       mw.flush();
                                mw.close();
                         }
                        }
                        catch(IOException t){}
                        JPanel final1 = new JPanel();
                        jf5.add(final1);
                        JLabel fila = new JLabel("your response has been saved.");
                        fila.setBounds(100, 100, 400, 300);
                        final1.add(fila);
                        final1.setBounds(100, 100, 400, 300);
                        final1.setBackground(Color.LIGHT_GRAY);
                        final1.setFont(new FontUIResource("Italic", 50, 30));
                        JButton fijb =new JButton("close");
                        final1.add(fijb);
                        fijb.setBounds(200, 600, 80, 30);
                        fijb.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent e){
                        jf5.dispose();
                        }});
                JLabel no=new JLabel();
                jf5.add(no);
                no.setText("<html>click on final submit will result on final submission of form.<br>click on cancel will result reset your form.<html/>");
                no.setBounds(0, 0, 300, 150);
                no.setForeground(Color.red);
    }});
}}
    
