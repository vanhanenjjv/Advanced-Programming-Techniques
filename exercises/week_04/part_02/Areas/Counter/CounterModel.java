package part_02.Areas.Counter;

import part_02.Infrastructure.MVP.Model;

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
