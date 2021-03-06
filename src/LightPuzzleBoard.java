import javax.swing.*;
import java.awt.*;

public class LightPuzzleBoard extends JComponent {

    Color on = Color.yellow;
    Color off = Color.black;
    Color background = Color.gray;

    int sides = 460;
    int lightDiameter = 50;
    int betwen = sides / 3;
    int edge = betwen / 2 - (lightDiameter / 2);

    public void paintComponent(Graphics g){
        g.setColor(background);
        g.fillRect(0, 0, sides, sides);

        g.setColor(off);

        // 1
        g.fillOval(edge, edge, lightDiameter, lightDiameter);

        // 2
        g.fillOval((edge + betwen), edge, lightDiameter, lightDiameter);

        // 3
        g.fillOval((edge + betwen + betwen), edge, lightDiameter, lightDiameter);

        // 4
        g.fillOval(edge, (edge + betwen), lightDiameter, lightDiameter);

        // 5
        g.fillOval((edge + betwen + betwen), (edge + betwen), lightDiameter, lightDiameter);

        // 6
        g.fillOval(edge, (edge + betwen + betwen), lightDiameter, lightDiameter);

        // 7
        g.fillOval((edge + betwen), (edge + betwen + betwen), lightDiameter, lightDiameter);

        // 8
        g.fillOval((edge + betwen + betwen), (edge + betwen + betwen), lightDiameter, lightDiameter);


    }
}
