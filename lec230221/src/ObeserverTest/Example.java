package ObeserverTest;

import java.util.Observable;
import java.util.Observer;

class ValueObservable extends Observable {
    private int value;

    public ValueObservable(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        if (this.value != value) {
            this.value = value;
            setChanged();
            notifyObservers(this.value);
        }
    }

    public int getValue() {
        return value;
    }
}

class ValueObserver implements Observer {
    private ValueObservable observable;

    public ValueObserver(ValueObservable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Value changed to: " + arg);
    }
}

public class Example {
    public static void main(String[] args) {
        ValueObservable observable = new ValueObservable(0);
        ValueObserver observer = new ValueObserver(observable);

        observable.setValue(1);
        observable.setValue(2);
        observable.setValue(2);
        observable.setValue(3);
    }
}