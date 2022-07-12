import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LightPuzzlePanel extends JPanel {

    LightPuzzleBoard board = new LightPuzzleBoard();
    public LightPuzzlePanel(){
        board.setPreferredSize(new Dimension( 460, 460));

        JButton button1 = new JButton("1");

        buttonListener l = new buttonListener();
        button1.addActionListener(l);

        add(board);
        add(button1);
    }

    class buttonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            board.changeColor();
        }
    }
}
