import java.awt.*;
import java.awt.event.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Calculator extends JFrame implements ActionListener {
      
      JFrame frame ;
      JButton[] numberButtons = new JButton[10];
      JButton[] functionButtons = new JButton[7]; 
      JButton toplama , cikarma , carpma , bolme , nokta , esittir , temizle ;
      JPanel panel ;
      DisplayPanel displayPanel ;

      Font font = new Font(null,Font.BOLD,32);
      

      private double number1 = 0 ;
      private double number2 = 0 ;
      private double result = 0 ;
      private char operator = ' ';


      public Calculator(){
            super();
            
            // setSize(500,500);
            // setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // getContentPane().setBackground(Color.WHITE);
            // setVisible(true);

            this.setTitle("Hesap Makinesi");
            // frame = new JFrame("Hesap Makinesi");
            // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // frame.getContentPane().setBackground(Color.WHITE);
            // frame.setSize(800,1000);
            // frame.setResizable(false);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            getContentPane().setBackground(Color.WHITE);
            setSize(800,1000);
            setResizable(false);
            setLayout(null);
            
            //  frame.setLayout(null);
            
            

            toplama = new JButton("+");         
            cikarma = new JButton("-");
            carpma = new JButton("X");
            bolme = new JButton("÷");
            nokta = new JButton(".");
            esittir = new JButton("=");
            temizle = new JButton("C");

            functionButtons[0] = toplama;
            functionButtons[1] = cikarma;
            functionButtons[2] = carpma;
            functionButtons[3] = bolme;
            functionButtons[4] = nokta;
            functionButtons[5] = esittir;
            functionButtons[6] = temizle;

            for(int i = 0 ; i<functionButtons.length;i++){
                  functionButtons[i].addActionListener(this);
                  functionButtons[i].setBackground(new Color(60,100,220));
                  functionButtons[i].setFont(font);
                  functionButtons[i].setForeground(Color.WHITE);
                  functionButtons[i].setBorder(BorderFactory.createEtchedBorder(Color.BLUE, Color.BLACK));
                  //? functionButtons[i].setFocusable(false);
            }
            for(int i = 0 ; i<numberButtons.length;i++){
                  numberButtons[i] = new JButton(String.valueOf(i));
                  numberButtons[i].addActionListener(this);
                  numberButtons[i].setBackground(new Color(60,100,220));
                  numberButtons[i].setFont(font);
                  numberButtons[i].setForeground(Color.WHITE);
                  numberButtons[i].setBorder(BorderFactory.createEtchedBorder(Color.BLUE, Color.BLACK));
            }
            // drawing lines 
           


           // EKRAN 50 50 700 180

            temizle.setBounds(50, 300, 700, 85);
            temizle.setBackground(new Color(60,100,220));
            
            // adding to panel
            panel = new JPanel();
            displayPanel = new DisplayPanel(); 
           
            

            panel.setBounds(50, 395, 700, 400);
            panel.setLayout(new GridLayout(4,4,50,50));
            panel.add(numberButtons[7]);
            panel.add(numberButtons[8]);
            panel.add(numberButtons[9]);
            panel.add(toplama);
            panel.add(numberButtons[4]);
            panel.add(numberButtons[5]);
            panel.add(numberButtons[6]);
            panel.add(cikarma);
            panel.add(numberButtons[1]);
            panel.add(numberButtons[2]);
            panel.add(numberButtons[3]);
            panel.add(carpma);
            panel.add(numberButtons[0]);
            panel.add(nokta);
            panel.add(esittir);
            panel.add(bolme);
            // adding to frame
            // frame.add(temizle);
            //frame.add(panel);

           add(panel);
           add(temizle);
           add(displayPanel);
          
           
           setVisible(true);
        
         //   frame.setVisible(true);

      }
      
      @Override
      public void actionPerformed(ActionEvent e) {
           String actionCommand = e.getActionCommand();
           // '.' yi kapsiyor.
            if(!(actionCommand.equals("+")  || actionCommand.equals("-") || actionCommand.equals("X") || actionCommand.equals("=") || actionCommand.equals("÷")|| actionCommand.equals("C"))){
                  displayPanel.addToTheList(actionCommand); 
                  displayPanel.distributionToPanels();
                  getContentPane().validate();
                  getContentPane().repaint();
            }
            
            
            if(actionCommand.equals("+")){
                  System.out.println(displayPanel.getTheNumber());
                  //number1 = displayPanel.getTheNumber();
                 // System.out.println("Number1 :"+number1);
                  operator = '+';
                 
                  
            }
            
            if(actionCommand.equals("-")){
                  number1 = displayPanel.getTheNumber();
                  operator = '-';
                  
            }
            if(actionCommand.equals("X")){
                  number1 = displayPanel.getTheNumber();
                  operator = '*';
                  
            }
            if(actionCommand.equals("÷")){
                  number1 = displayPanel.getTheNumber();
                  operator = '/';
                  
            }
            if(actionCommand.equals("=")){
                  number2 = displayPanel.getTheNumber();
                  System.out.println("Number 2 : " + number2);
                  getContentPane().validate();
                  getContentPane().repaint();
                  switch(operator){
                        case '+' :
                              result = number1 + number2 ;
                              break ;
                        case '-' :
                              result = number1 - number2 ;
                              break ;
                        case '*' :
                              result = number1 * number2 ;
                              break ;
                        case '/' :
                              result = number1 / number2 ;
                              break ;
                  }
                  System.out.println("Result :" + result);
                  displayPanel.addResultToTheList(result);
                  displayPanel.distributionToPanels();
      
                  getContentPane().validate();
                  getContentPane().repaint();
                  number1 = result ;
                  
                  
            }


      }

}