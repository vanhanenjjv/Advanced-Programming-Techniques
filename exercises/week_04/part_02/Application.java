package part_02;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import part_02.Areas.Student.StudentModel;
import part_02.Areas.Student.StudentPresenter;
import part_02.Areas.Student.StudentView;

public class Application {
    public static void main(String[] args) {        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame();        
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setPreferredSize(new Dimension(400, 400));

                var student = new StudentPresenter(frame, new StudentModel(), new StudentView());

                student.show();

                frame.setVisible(true);
            }
        });
    }
}
