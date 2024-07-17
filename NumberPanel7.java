import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.*;

public class NumberPanel7 extends JPanel {

    private Font font ;
    private String numberToDisplay;
    public NumberPanel7(){
        
        setBounds(50, 50, 200, 90);
        setBorder(BorderFactory.createEtchedBorder(Color.BLACK, Color.BLACK));
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
    public void setValueOfButton(String string) {
        this.numberToDisplay = string ;
    }

}
