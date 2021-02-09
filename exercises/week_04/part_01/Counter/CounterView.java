package part_01.Counter;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.text.StyleConstants.ColorConstants;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;

import part_01.Infrastructure.MVP.View;

public class CounterView extends View {
    public JButton increment;
    public JButton decrement;
    public JLabel  value;

    public CounterView() { 
        super(new JPanel(new GridBagLayout()));     
    }

    @Override
    protected void createComponents() {
        increment = new JButton("Increment");

        decrement = new JButton("Decrement");

        value = new JLabel("0", SwingConstants.CENTER);
        value.setOpaque(true);
        value.setBackground(new Color(242, 242, 231));
        value.setBorder(BorderFactory.createTitledBorder("Value"));
    }

    @Override
    protected void configurePanel(JPanel panel) {
        panel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        panel.setPreferredSize(new Dimension(400, 300));

        var constraints = new GridBagConstraints();
        constraints.fill   = GridBagConstraints.BOTH;
        constraints.insets = new Insets(2, 2, 2, 2);
   
        constraints.gridwidth = GridBagConstraints.REMAINDER;
        constraints.weighty = 0.3;

        panel.add(value, constraints);

        constraints.gridwidth = GridBagConstraints.RELATIVE;
        constraints.weightx = 1;
        constraints.weighty = 0.7;

        panel.add(increment, constraints);
        panel.add(decrement, constraints);
    }

    @Override
    public JPanel getPanel() {
        return this.panel;
    };
}
