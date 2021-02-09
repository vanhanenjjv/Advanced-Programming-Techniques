package part_01.Infrastructure.MVP;

import java.beans.PropertyChangeListener;

import javax.swing.JFrame;

public abstract class Presenter<TModel extends Model, TView extends View> implements PropertyChangeListener {
    protected final JFrame frame;
    protected final TModel model;
    protected final TView view;

    public Presenter(JFrame frame, TModel model, TView view) {
        this.frame = frame;
        this.model = model;
        this.view = view;

        this.model.addListener(this);

        setupViewActions();
    };

    public abstract String getName();

    public void show() {
        this.frame.setTitle(getName());

        this.frame.getContentPane().removeAll();
        this.frame.getContentPane().add(this.view.getPanel());
        this.frame.pack();
    }

    public TModel getModel() {
        return this.model;
    }

    public TView getView() {
        return this.view;
    }

    protected abstract void setupViewActions();
}
