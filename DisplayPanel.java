import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;
public class DisplayPanel extends JPanel {

      ArrayList<String> inputFromButtons = new ArrayList<>();

      private Font font ;

      private String theNumber = "" ;

      NumberPanel1 numberPanel1 ;
      NumberPanel2 numberPanel2 ;
      NumberPanel3 numberPanel3 ;
      NumberPanel4 numberPanel4 ;
      NumberPanel5 numberPanel5 ;
      NumberPanel6 numberPanel6 ;
      NumberPanel7 numberPanel7 ;
      NumberPanel8 numberPanel8 ;
      NumberPanel9 numberPanel9 ;
      NumberPanel10 numberPanel10 ;
      JPanel[] numberPanelArray = new JPanel[10];
      public DisplayPanel(){
           
            setBounds(30, 30, 720, 180);
            setLayout(new  GridLayout());
            setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK));
            font = new Font(null,Font.BOLD,32);
            numberPanel1 = new NumberPanel1();
            numberPanel2 = new NumberPanel2();
            numberPanel3 = new NumberPanel3();
            numberPanel4 = new NumberPanel4();
            numberPanel5 = new NumberPanel5();
            numberPanel6 = new NumberPanel6();
            numberPanel7 = new NumberPanel7();
            numberPanel8 = new NumberPanel8();
            numberPanel9 = new NumberPanel9();
            numberPanel10 = new NumberPanel10();
            
            numberPanelArray[0] = numberPanel1;
            numberPanelArray[1] = numberPanel2;
            numberPanelArray[2] = numberPanel3;
            numberPanelArray[3] = numberPanel4;
            numberPanelArray[4] = numberPanel5;
            numberPanelArray[5] = numberPanel6;
            numberPanelArray[6] = numberPanel7;
            numberPanelArray[7] = numberPanel8;
            numberPanelArray[8] = numberPanel9;
            numberPanelArray[9] = numberPanel10;

            add(numberPanel10);
            add(numberPanel9); 
            add(numberPanel8);
            add(numberPanel7); 
            add(numberPanel6);
            add(numberPanel5); 
            add(numberPanel4);
            add(numberPanel3); 
            add(numberPanel2);
            add(numberPanel1);            
      }
      public void addResultToTheList(double result){
            String temp = result + "";
            inputFromButtons.clear();
            inputFromButtons.trimToSize();
            for(int i = 0 ; i<temp.length();i++){
                  inputFromButtons.add(temp.charAt(i) + "");
                  
            }
      }

      public void addToTheList(String s) {
            inputFromButtons.add(s);                  
      
      } 
      public void write(){
            for(String s : inputFromButtons){
                  System.out.println(s);
            }
      }
      public void distributionToPanels(){
            int tempIndex = inputFromButtons.size()-1 ;
            
            numberPanel1.setValueOfButton(inputFromButtons.get(tempIndex));
            theNumber = inputFromButtons.get(tempIndex) + theNumber ;
            tempIndex = tempIndex - 1 ;
            if(tempIndex < 0){return ;} 
            numberPanel2.setValueOfButton(inputFromButtons.get(tempIndex));
            theNumber = inputFromButtons.get(tempIndex) + theNumber ;
            tempIndex = tempIndex -1 ;
            if(tempIndex < 0){return ;} 
            numberPanel3.setValueOfButton(inputFromButtons.get(tempIndex));
            theNumber = inputFromButtons.get(tempIndex) + theNumber ;
            tempIndex = tempIndex - 1 ;
            if(tempIndex < 0){return ;} 
            numberPanel4.setValueOfButton(inputFromButtons.get(tempIndex));
            theNumber = inputFromButtons.get(tempIndex) + theNumber ;
            tempIndex = tempIndex - 1 ;
            if(tempIndex < 0){return ;} 
            numberPanel5.setValueOfButton(inputFromButtons.get(tempIndex));
            theNumber = inputFromButtons.get(tempIndex) + theNumber ;
            tempIndex = tempIndex - 1 ;
            if(tempIndex < 0){return ;} 
            numberPanel6.setValueOfButton(inputFromButtons.get(tempIndex));
            theNumber = inputFromButtons.get(tempIndex) + theNumber ;
            tempIndex = tempIndex - 1 ;
            if(tempIndex < 0){return ;} 
            numberPanel7.setValueOfButton(inputFromButtons.get(tempIndex));
            theNumber = inputFromButtons.get(tempIndex) + theNumber ;
            tempIndex = tempIndex - 1 ;
            if(tempIndex < 0){return ;} 
            numberPanel8.setValueOfButton(inputFromButtons.get(tempIndex));
            theNumber = inputFromButtons.get(tempIndex) + theNumber ;
            tempIndex = tempIndex - 1 ;
            if(tempIndex < 0){return ;} 
            numberPanel9.setValueOfButton(inputFromButtons.get(tempIndex));
            theNumber = inputFromButtons.get(tempIndex) + theNumber ;
            tempIndex = tempIndex - 1 ;
            if(tempIndex < 0){return ;} 
            numberPanel10.setValueOfButton(inputFromButtons.get(tempIndex));
            theNumber = inputFromButtons.get(tempIndex) + theNumber ;
            
      }
     
      public double getTheNumber(){
            return Double.parseDouble(this.theNumber); 
      }
      // bura sıkıntı cıkarıyo
      /* 
    public void clearTheArrayList() {
      this.inputFromButtons.clear();
      distributionToPanels();
    }
      */
      
}
