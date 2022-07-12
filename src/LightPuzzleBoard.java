import javax.swing.*;
import java.awt.*;

public class LightPuzzleBoard extends JComponent {

    Color on = Color.yellow;
    Color off = Color.black;
    Color background = Color.gray;
    Color lamp[] = new Color[8];


    int sides = 460;
    int lightDiameter = 50;
    int betwen = sides / 3;
    int edge = betwen / 2 - (lightDiameter / 2);

    Light arrayOfLights[];

    public void paintComponent(Graphics g, Light arrayOfLights[]){
        this.arrayOfLights = arrayOfLights;
        for (int i=0; i<arrayOfLights.length; i++){
            lamp[i] = off;
        }

        g.setColor(background);
        g.fillRect(0, 0, sides, sides);;

        // 1
        g.setColor(lamp[0]);
        g.fillOval(edge, edge, lightDiameter, lightDiameter);

        // 2
        g.setColor(lamp[1]);
        g.fillOval((edge + betwen), edge, lightDiameter, lightDiameter);

        // 3
        g.setColor(lamp[2]);
        g.fillOval((edge + betwen + betwen), edge, lightDiameter, lightDiameter);

        // 4
        g.setColor(lamp[3]);
        g.fillOval(edge, (edge + betwen), lightDiameter, lightDiameter);

        // 5
        g.setColor(lamp[4]);
        g.fillOval((edge + betwen + betwen), (edge + betwen), lightDiameter, lightDiameter);

        // 6
        g.setColor(lamp[5]);
        g.fillOval(edge, (edge + betwen + betwen), lightDiameter, lightDiameter);

        // 7
        g.setColor(lamp[6]);
        g.fillOval((edge + betwen), (edge + betwen + betwen), lightDiameter, lightDiameter);

        // 8
        g.setColor(lamp[7]);
        g.fillOval((edge + betwen + betwen), (edge + betwen + betwen), lightDiameter, lightDiameter);


    }

    public void updateColor(){
        for (int i=0; i<arrayOfLights.length; i++){
            if (arrayOfLights[i].getOnOff()){ // erstat med arrayOfLights[i]
                lamp[i] = on;
            }else{
                lamp[i] = off;
            }
        }
        repaint();
    }
}
