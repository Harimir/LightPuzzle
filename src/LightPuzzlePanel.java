import javax.swing.*;
import java.awt.*;

public class LightPuzzlePanel extends JPanel {

    LightPuzzleBoard board = new LightPuzzleBoard();
    public LightPuzzlePanel(){
        board.setPreferredSize(new Dimension( 460, 460));
        add(board);

        JButton button1 = new JButton("1");
        add(button1);
    }
}
