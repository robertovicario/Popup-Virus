/**
 * @author Roberto Vicario
 */

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PopupVirus {

    public PopupVirus(int n) {
        /**
         * Launching frames simultaneously.
         */
        SwingUtilities.invokeLater(() -> {
            for (int i = 0; i < n; i++) {
                JFrame jFrame = new JFrame("POPUP #" + i);
                jFrame.setSize(400, 500);

                /**
                 * Setting location of each frame.
                 */
                int x = (int) (Math.random() * jFrame.getToolkit().getScreenSize().getWidth());
                int y = (int) (Math.random() * jFrame.getToolkit().getScreenSize().getHeight());
                jFrame.setLocation(x, y);

                jFrame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        /**
         * (!) WARNING
         * Increasing too much this number may pose a potential risk.
         */
        new PopupVirus(10);
    }

}
