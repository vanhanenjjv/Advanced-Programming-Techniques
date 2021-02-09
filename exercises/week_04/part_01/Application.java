package part_01;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import part_01.Counter.CounterModel;
import part_01.Counter.CounterPresenter;
import part_01.Counter.CounterView;

public class Application {
    public static void main(String[] args) {        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();        
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                var counter = new CounterPresenter(
                    frame,
                    new CounterModel(), 
                    new CounterView());

                counter.show();

                frame.setVisible(false);
            }
        });
    }
}
