package part_02.Areas.Student;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.NumberFormatter;

import java.awt.GridBagLayout;
import java.text.NumberFormat;
import java.awt.GridBagConstraints;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
// import java.awt.GridBagConstraints;
import javax.swing.JLabel;

import part_02.Infrastructure.MVP.View;

public class StudentView extends View {
    public JTextField name;
    public JTextField studentNumber;
    public JFormattedTextField credits;
    public JLabel summary;
    public JButton counter;

    @Override
    protected void createComponents() {
        name = new JTextField();
        name.setBorder(BorderFactory.createTitledBorder("Name"));

        studentNumber = new JTextField();
        studentNumber.setBorder(BorderFactory.createTitledBorder("Student Number"));

        NumberFormat format = NumberFormat.getInstance();
        format.setGroupingUsed(false);
        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(0);
        formatter.setMaximum(Integer.MAX_VALUE);
        formatter.setAllowsInvalid(false);
        formatter.setCommitsOnValidEdit(true);

        credits = new JFormattedTextField(formatter);
        credits.setBorder(BorderFactory.createTitledBorder("Credits"));

        summary = new JLabel();
    }
    
    @Override
    protected void configurePanel(JPanel panel) {
        panel.setLayout(new GridBagLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));

        var constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.BOTH;
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.weightx = 1;

        panel.add(name, constraints);
        panel.add(studentNumber, constraints);
        panel.add(credits, constraints);
        panel.add(summary, constraints);
    }
}
