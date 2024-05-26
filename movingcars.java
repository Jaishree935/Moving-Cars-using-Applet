import java.awt.*;
import java.applet.*;
/*<applet code="movingcars" width=1000 height=1000>
</applet>
*/
public class movingcars extends Applet
{
     int j=0;
       public void paint(Graphics g)
     {
             g.setColor(Color.blue);
             g.fillRect(0,0,2000,2000);
             g.setColor(Color.yellow);
            g.fillRect(150+j,150,100,50);
            g.setColor(Color.red);
            g.fillOval(160+j,200,20,20);
            g.fillOval(220+j,200,20,20); 
           g.setColor(Color.white);
           g.fillRect(700-j,300,100,50); 
           g.setColor(Color.black);
           g.fillOval(710-j,350,20,20);
           g.fillOval(760-j,350,20,20);
          for(int i=0;i<20;i++)
         {       
                   j++;
                    repaint();  //For redrawn...It internally calls the update()- by default it clear all the thing and it call the paint() method...
             try
              { 
                     Thread.sleep(100);
               }
            catch(Exception e){

               }
         }
}
}