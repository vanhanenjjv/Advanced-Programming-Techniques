package part_02.Areas.Student;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;

import javax.swing.JFrame;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import part_02.Infrastructure.Events.SimpleDocumentListener;
import part_02.Infrastructure.MVP.Presenter;

public class StudentPresenter extends Presenter<StudentModel, StudentView> {
    public StudentPresenter(JFrame frame, StudentModel model, StudentView view) {
        super(frame, model, view);
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        var propertyName = event.getPropertyName();

        switch (propertyName) {
            case "name", "studentNumber", "credits" -> 
                view.summary.setText(
                    "%s, %s (%d op)".formatted(
                        model.getName(),
                        model.getStudentNumber(),
                        model.getCredits()
                    ));
        }
    }

    @Override
    public String getName() {
        return "Student";
    }

    @Override
    protected void setupViewActions() {
        view.name.getDocument().addDocumentListener(new SimpleDocumentListener() {
            @Override
            public void updated(DocumentEvent event) {
                model.setName(view.name.getText());
            }
        });

        view.studentNumber.getDocument().addDocumentListener(new SimpleDocumentListener() {
            @Override
            public void updated(DocumentEvent event) {
                model.setStudentNumber(view.studentNumber.getText());
            }
        });

        view.credits.getDocument().addDocumentListener(new SimpleDocumentListener() {
            @Override
            public void updated(DocumentEvent event) {
                var text = view.credits.getText().replaceAll("\\s+", "");

                if (text.isEmpty()) {
                    model.setCredits(0);
                } else {
                    var credits = Integer.parseInt(text);
                    model.setCredits(credits);
                }

            }
        });
    }
    
}
