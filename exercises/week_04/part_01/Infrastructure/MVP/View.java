package part_01.Infrastructure.MVP;

import javax.swing.JPanel;

public abstract class View {
    protected final JPanel panel;

    public View(JPanel panel) {
        this.panel = panel;

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
