package part_02.Infrastructure.MVP;

import javax.swing.JPanel;

public abstract class View {
    protected final JPanel panel;

    public View() {
        this.panel = new JPanel();

        createComponents();
        configurePanel(panel);
    }

    protected void createComponents() {
    }

    protected void configurePanel(JPanel panel) {
    }

    public JPanel getPanel() {
        return this.panel;
    }
}
