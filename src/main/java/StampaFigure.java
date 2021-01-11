import java.awt.*;
import javax.swing.*;

public class StampaFigure extends JFrame
{
    private int Raggio;
    
    StampaFigure(int Raggio)
    {
        this.Raggio = Raggio;
    }
    
    public void Grafica()
    {
         StampaFigure Contenitore = new StampaFigure(0);
         JFrame Finestra = new JFrame("Stampa Figure");
         
         Finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         Finestra.setVisible(true);
         Finestra.setSize(400, 400);
         Finestra.setLocationRelativeTo(null);
         Contenitore.Disegna(null);
         Finestra.add(Contenitore);
    }
    
    public void Disegna(Graphics Grafica)
    {
       Grafica.setColor(Color.BLACK);
       Grafica.drawOval(100, 100, 100, 100);
    }

 }
