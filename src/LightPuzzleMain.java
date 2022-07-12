import javax.swing.*;

public class LightPuzzleMain {
    public static void main(String[] args) {
        Light arrayOfLights[] = new Light[8];
        int moves = 0;
        Light first = new Light();
        Light nekst = new Light();
        Light last = new Light();
        first.setLeft(last);
        first.setRight(nekst);
        nekst.setLeft(first);

        for (int i=0; i<arrayOfLights.length; i++){
            arrayOfLights[i] = nekst;
            nekst = new Light();
            nekst.setLeft(arrayOfLights[i]);
            arrayOfLights[i].setRight(nekst);
        }
        last.setRight(first);
        arrayOfLights[0].setLeft(arrayOfLights[(arrayOfLights.length-1)]);


        JFrame frame = new JFrame();
        JPanel board = new LightPuzzlePanel();

        frame.add(board);
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
