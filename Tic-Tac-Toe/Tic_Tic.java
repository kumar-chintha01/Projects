import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class GUI extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	JButton l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JLabel hl;
    JPanel p;
    JTextField tf;
    String p1,p2;
    
    int choice=0;

    GUI(String p1,String p2){
        this.p1=p1;
        this.p2=p2;
        this.choice=0;
        this.setLayout(new BorderLayout());

        hl=new JLabel("Tic Tac Toe",JLabel.CENTER);
        hl.setFont(new FontUIResource("BOLD",Font.BOLD,15));
        hl.setForeground(Color.blue);
        hl.setBorder(BorderFactory.createCompoundBorder(new EmptyBorder(1, 0, 1, 0),new EtchedBorder(Color.red,Color.GRAY)));
        this.add(hl,BorderLayout.NORTH);


        p=new JPanel();
        p.setLayout(new GridLayout(3,3));
        p.setSize(new DimensionUIResource(300, 300));    
        this.add(p,BorderLayout.CENTER);

        tf=new JTextField("Choice::"+p1);
        tf.setFont(new Font("Bold",Font.BOLD,20));
        tf.setForeground(Color.CYAN);
        tf.setSize(new DimensionUIResource(300, 100)); 
        tf.setHorizontalAlignment(JTextField.CENTER);   
        this.add(tf,BorderLayout.SOUTH);

        l1=new JButton();
        l2=new JButton();
        l3=new JButton();
        l4=new JButton();
        l5=new JButton();
        l6=new JButton();
        l7=new JButton();
        l8=new JButton();
        l9=new JButton();

        Font f=new Font("Bold",Font.BOLD,15);
        
        l1.setFont(f);
        l2.setFont(f);
        l3.setFont(f);
        l4.setFont(f);
        l5.setFont(f);
        l6.setFont(f);
        l7.setFont(f);
        l8.setFont(f);
        l9.setFont(f);

        l1.setForeground(Color.BLACK);
        l2.setForeground(Color.BLACK);
        l3.setForeground(Color.BLACK);
        l4.setForeground(Color.BLACK);
        l5.setForeground(Color.BLACK);
        l6.setForeground(Color.BLACK);
        l7.setForeground(Color.BLACK);
        l8.setForeground(Color.BLACK);
        l9.setForeground(Color.BLACK);
        

        l1.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        l2.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        l3.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        l4.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        l5.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        l6.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        l7.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        l8.setBorder(BorderFactory.createLineBorder(Color.red, 2));
        l9.setBorder(BorderFactory.createLineBorder(Color.red, 2));

        l2.addActionListener(this);
        l3.addActionListener(this);
        l4.addActionListener(this);
        l5.addActionListener(this);
        l6.addActionListener(this);
        l7.addActionListener(this);
        l8.addActionListener(this);
        l9.addActionListener(this);
        l1.addActionListener(this);
        

        p.add(l1);
        p.add(l2);
        p.add(l3);
        p.add(l4);
        p.add(l5);
        p.add(l6);
        p.add(l7);
        p.add(l8);
        p.add(l9);

        this.setSize(300,400);
        this.setTitle("TIC TAC TIC");
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void winner(String win) {
       
        JFrame f=new JFrame();
        f.setTitle("Winner");
        f.setVisible(true);
        this.dispose();
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel ce=new JLabel(win);
        ce.setFont(new Font("BOLD",Font.BOLD,30));
        
        ce.setHorizontalTextPosition(JLabel.CENTER);
        ce.setVerticalTextPosition(JLabel.CENTER);
        ce.setForeground(new Color(221, 122,122));
        f.add(ce);
        f.pack();
        f.setResizable(false);
    }

    public void actionPerformed(ActionEvent e){
        Object s=e.getSource();
        if(this.choice%2!=0) tf.setText("Choice::"+this.p1);
        else if(this.choice%2==0) tf.setText("Choice::"+this.p2);
        if(s==l1){
            if(this.choice%2==0){  
                l1.setText(this.p1);
                l1.setBackground(Color.green);
            }
            else  {l1.setText(this.p2);l1.setBackground(Color.CYAN);}
            this.choice++;
            l1.setEnabled(false);
            l1.removeActionListener(this);
        }else if(s==l2){
            if(this.choice%2==0) { l2.setText(this.p1);l2.setBackground(Color.green);}
            else  {l2.setText(this.p2);l2.setBackground(Color.CYAN);}
            this.choice++;
            l2.setEnabled(false);
            l2.removeActionListener(this);
        }else if(s==l3){
            if(this.choice%2==0){  l3.setText(this.p1);l3.setBackground(Color.green);}
            else  {l3.setText(this.p2);l3.setBackground(Color.CYAN);}
            this.choice++;
            l3.setEnabled(false);
            l3.removeActionListener(this);
        }else if(s==l4){
            if(this.choice%2==0) { l4.setText(this.p1);l4.setBackground(Color.green);}
            else  {l4.setText(this.p2);l4.setBackground(Color.CYAN);}
            this.choice++;
            l4.setEnabled(false);
            l4.removeActionListener(this);
        }else if(s==l5){
            if(this.choice%2==0){  l5.setText(this.p1);l5.setBackground(Color.green);}
            else { l5.setText(this.p2);l5.setBackground(Color.CYAN);}
            this.choice++;
            l5.setEnabled(false);
            l5.removeActionListener(this);
        }else if(s==l6){
            if(this.choice%2==0)  {l6.setText(this.p1);l6.setBackground(Color.green);}
            else  {l6.setText(this.p2);l6.setBackground(Color.CYAN);}
            this.choice++;
            l6.setEnabled(false);
            l6.removeActionListener(this);
        }else if(s==l7){
            if(this.choice%2==0)  {l7.setText(this.p1);l7.setBackground(Color.green);}
            else {l7.setBackground(Color.CYAN); l7.setText(this.p2);}
            this.choice++;
            l7.setEnabled(false);
            l7.removeActionListener(this);
        }else if(s==l8){
            if(this.choice%2==0){  l8.setText(this.p1);l8.setBackground(Color.green);}
            else  {l8.setBackground(Color.CYAN);l8.setText(this.p2);}
            this.choice++;
            l8.setEnabled(false);
            l8.removeActionListener(this);
        }else if(s==l9){
            if(this.choice%2==0) {l9.setBackground(Color.green); l9.setText(this.p1);}
            else  {l9.setText(this.p2);l9.setBackground(Color.CYAN);}
            this.choice++;
            l9.setEnabled(false);
            l9.removeActionListener(this);
        }
        if(this.choice>4){
            if(l1.getText().equals(l2.getText()) && l2.getText().equals(l3.getText()) && !l1.getText().equals("")){
                String win=l2.getText();
                this.choice=0;
                this.winner("Winner is "+win);
            }else if(l4.getText().equals(l5.getText()) && l5.getText().equals(l6.getText()) && !l4.getText().equals("")){
                String win=l4.getText();
                this.choice=0;
                this.winner("Winner is "+win);
            }else if(l9.getText().equals(l8.getText()) && l8.getText().equals(l7.getText())&& !l9.getText().equals("")){
                String win=l7.getText();
                this.choice=0;
                this.winner("Winner is "+win);
            }else if(l1.getText().equals(l4.getText()) && l4.getText().equals(l7.getText())&& !l4.getText().equals("")){
                String win=l1.getText();
                this.choice=0;
                this.winner("Winner is "+win);
            }else if(l5.getText().equals(l2.getText()) && l5.getText().equals(l8.getText())&& !l5.getText().equals("")){
                this.choice=0;
                String win=l5.getText();
                this.winner("Winner is "+win);
            }else if(l3.getText().equals(l6.getText()) && l6.getText().equals(l9.getText())&& !l3.getText().equals("")){
                this.choice=0;
                String win=l3.getText();
               this.winner("Winner is "+win);
            }else if(l1.getText().equals(l5.getText()) && l5.getText().equals(l9.getText())&& !l5.getText().equals("")){
                String win=l1.getText();                this.choice=0;

                this.winner("Winner is "+win);
            }else if(l7.getText().equals(l5.getText()) && l5.getText().equals(l3.getText())&& !l7.getText().equals("")){
                String win=l7.getText();
                this.winner("Winner is "+win);
                this.choice=0;
            }
        }
        if(this.choice==9){
                this.winner("Draw Match");
        }
    }
}



public class Tic_Tic {
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Player Name::");
        String p1=sc.nextLine();
        System.out.print("Enter Player Name::");
        String p2=sc.nextLine();
        new GUI(p1,p2);
        sc.close();
    }
}
