import javax.swing.*;

public class LightPuzzleMain {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel board = new LightPuzzlePanel();

        frame.add(board);
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
