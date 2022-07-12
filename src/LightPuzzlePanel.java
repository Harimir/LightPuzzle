import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LightPuzzlePanel extends JPanel {


    LightPuzzleBoard board = new LightPuzzleBoard();
    Light arrayOfLights[];

    public LightPuzzlePanel(Light arrayOfLights[]){
        this.arrayOfLights = arrayOfLights;
        board.setPreferredSize(new Dimension( 460, 460));
        board.setArrayOfLights(arrayOfLights);

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");


        buttonListener l = new buttonListener();
        button1.addActionListener(l);

        add(board);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);

    }
//TODO figure out how to make seperate buttons call seperate functions in the array and then use board.updateColor()
    class buttonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            board.updateColor();
        }
    }
}
