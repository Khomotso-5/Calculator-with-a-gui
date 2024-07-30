
package guiscalculator;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Khomotso
 */
public class MyFrame extends JFrame implements ActionListener{

    JLabel lnum1,lnum2,lsum;
    JTextField tnum1,tnum2;
    JTextArea tsum;
    JButton BtnCalculate,BtnClear,BtnExit;
    JPanel mainPanel,subPanel,panel;
    
    public MyFrame() throws HeadlessException {
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Sum Calculator");
        this.setLocationRelativeTo(null);
        this.setSize(450,480);
        
        lnum1 = new JLabel("Please enter num1: ");
        lnum2 = new JLabel("Please enter num2: ");
        lsum = new JLabel("Sum:");

        tnum1 = new JTextField();
        tnum1.setPreferredSize(new Dimension(50, 20));
        tnum2 = new JTextField();
        tnum2.setPreferredSize(new Dimension(100, 20));
        tsum = new JTextArea();
        
        BtnCalculate = new JButton("Calculate");
        BtnCalculate.addActionListener(this);
        BtnClear = new JButton("Clear");
        BtnClear.addActionListener(this);
        BtnExit = new JButton("Exit");
        BtnExit.addActionListener(this);
        
        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));
        mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        
        subPanel = new JPanel();
        
        subPanel.setLayout(new GridLayout(3,1,-180,35));
        subPanel.add(lnum1);
        subPanel.add(tnum1);
        subPanel.add(lnum2);
        subPanel.add(tnum2);
        subPanel.add(lsum);
        subPanel.add(tsum);
        
        mainPanel.add(BtnCalculate);
        mainPanel.add(BtnClear);
        mainPanel.add(BtnExit);
        panel.add(subPanel);
        panel.add(mainPanel);
        this.add(panel);
        //pack();
        this.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource()==BtnCalculate){
            int num1 = Integer.parseInt(tnum1.getText());
            int num2 = Integer.parseInt(tnum2.getText());
            int sum = num1 + num2;
            
            tsum.append(String.valueOf(sum));
            
        }
        if(ae.getSource()==BtnClear){
            tnum1.setText("");
            tnum2.setText("");
            tsum.setText("");
        }
        if(ae.getSource()==BtnExit){
            this.dispose();
        }

    }
    
    
    
}
