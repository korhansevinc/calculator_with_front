import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.*;

public class NumberPanel1 extends JPanel {

    private Font font ;
    private String numberToDisplay ;
    public NumberPanel1(){
        
        setBounds(10, 10, 200, 90);
        setBorder(BorderFactory.createEtchedBorder(Color.GREEN, Color.GREEN));
        setBackground(Color.WHITE);
        font = new Font(null,Font.BOLD,32);
        
    }

    protected void paintComponent(Graphics g){
        super.paintComponents(g);
        g.setColor(Color.BLACK);
        g.setFont(font);
        g.drawString(""+ numberToDisplay, 30, 30);         
       
           
    }

    public String getNumberToDisplay(){
        return numberToDisplay ;
    }
    public void setValueOfButton(String i) {
        this.numberToDisplay = i ;
    }
    
}
