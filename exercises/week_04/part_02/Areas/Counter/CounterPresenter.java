package part_02.Areas.Counter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;

import javax.swing.JFrame;

import part_02.Infrastructure.MVP.Presenter;

public class CounterPresenter extends Presenter<CounterModel, CounterView> {
    public CounterPresenter(JFrame frame, CounterModel model, CounterView view) {
        super(frame, model, view);
    }

    @Override
    public String getName() {
        return "Counter";
    }

    @Override
    protected void setupViewActions() {
        this.view.increment.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                model.setValue(model.getValue() + 1);
            }
        });

        this.view.decrement.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                model.setValue(model.getValue() - 1);
            }
        });
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        var propertyName = event.getPropertyName();
        var newValue = event.getNewValue();

        switch (propertyName.toLowerCase()) {
            case "value": {
                this.view.value.setText(Integer.toString((Integer)newValue));
                break;
            }
        }
    }
    
}
