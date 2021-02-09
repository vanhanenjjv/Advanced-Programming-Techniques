package part_01.Counter;

import part_01.Infrastructure.MVP.Model;

public class CounterModel extends Model {
    private int value;   

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        int oldValue = this.value;
        this.value = value;

        raisePropertyChanged("value", oldValue, value);
    }
}
