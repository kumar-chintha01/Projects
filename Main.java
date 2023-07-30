import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Gui extends JFrame implements ActionListener{
    
    JFrame frame;
    JButton submit;
    JComboBox<String> cb1,cb2;
    String country[]={"America","Brazil","Canada","Dubai","Egypt","France","Germany","India","Japan","North Korea","Libya","Malaysia","Nepal","Oman","Poland","Qatar","Russia","South Africa","Thailand","United Kingdom"};
    String currency[]={"US-Dollar 82","Brazilian-Real 17.31","Canadian-Dollar 62","Emirati-Dirham 22.32","Egypt-Round 2.65","Euro 90.81","Euro 90.81","Rupee 1","Japanese-Yen 0.58","South-Korea-Won 0.064","Libyan-Dinar 17.15","Malaysian-Ringgit 17.15","Nepalese-Rupee 1.6","Omani-Rial 212.91","Polish-Zloty 20.51","Qatar-Riyal 22.48","Russian-Ruble 0.91","SA-Rand 4.64","Thai-Baht 2.39","Round 105.96"};
    JLabel result;
    JTextField amount;

    Gui(){
        frame=new JFrame("Currency Converter");

        JLabel title=new JLabel("Enter Amount");
        title.setBounds(40,10,200,30);
        frame.add(title);

        amount=new JTextField(20);
        amount.setBounds(130,20,150,25);
        frame.add(amount);

        cb1=new JComboBox<String>(country);    
        cb1.setBounds(100, 65,90,20);    
        frame.add(cb1);  
        
        cb2=new JComboBox<String>(country);    
        cb2.setBounds(100, 105,90,20);    
        frame.add(cb2); 

        JLabel from=new JLabel("From");
        from.setBounds(40,60,200,30);
        frame.add(from);

        JLabel to=new JLabel("To:");
        to.setBounds(40,100,200,30);
        frame.add(to);
        
        submit=new JButton("Convert");
        submit.setBounds(40,150,150,30);
        submit.setFocusable(false);
        submit.setBorderPainted(false);
        submit.setBackground(Color.orange);
        submit.setForeground(Color.black);
        frame.add(submit);
        submit.addActionListener(this);


        result=new JLabel("Result:");
        result.setBounds(40,200,300,30);
        result.setForeground(Color.red);
        frame.add(result);
        

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(350,300);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submit){
            String counterFrom=cb1.getItemAt(cb1.getSelectedIndex());
            String counterTo=cb2.getItemAt(cb2.getSelectedIndex());
            if(counterFrom.equals(counterTo)){
                JOptionPane.showMessageDialog(this,"FROM and TO cant be SAME");
                return;
            }
            else{
                String fromInd[]=currency[cb1.getSelectedIndex()].split(" ");
                String toInd[]=currency[cb2.getSelectedIndex()].split(" ");
                String amo=amount.getText();
                if(amo.equals("")){

                }
                try{
                    double res=Double.parseDouble(amo);
                    double val1=Double.parseDouble(fromInd[1]);
                    double val2=Double.parseDouble(toInd[1]);
                    res=(res*val1)/val2;
                    result.setText(toInd[0]+"::"+res);
                }  
                catch(NumberFormatException execption){
                    JOptionPane.showMessageDialog(this,"Invalid Number");
                }  
            }
        }
    }
}

public class Main{
    public static void main(String args[]){
       new Gui();
    }
}