package part_01.Infrastructure.MVP;

import java.beans.PropertyChangeListener;
import javax.swing.event.SwingPropertyChangeSupport;

public abstract class Model {
    protected final SwingPropertyChangeSupport propertyChangeSupport;

    public Model() {
        this.propertyChangeSupport = new SwingPropertyChangeSupport(this);
    }

    public void addListener(PropertyChangeListener listener) {
        this.propertyChangeSupport.addPropertyChangeListener(listener);
    }

    protected void raisePropertyChanged(String propertyName, Object oldValue, Object newValue) {
        this.propertyChangeSupport.firePropertyChange(propertyName, oldValue, newValue);
    }
}
