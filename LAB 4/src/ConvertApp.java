import javax.swing.JFrame;

public class ConvertApp{

    public static void main(String[] args) {
            //creates main box panel for everything to go in
            JFrame frame = new ConvertFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("INSY 4305 Temperature Converter");
            frame.setSize(500, 300); // set frame size
            frame.setVisible(true);
        }
    }

