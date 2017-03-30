package observer;

import java.util.ArrayList;

/**
 * Created by zjy on 2017/3/28.
 */
public class Data implements Subject {
    ArrayList<Observer> observers;

    int data;
    public void setData(int data) {
        this.data = data;
        dataChange();

    }
    public void dataChange() {
        notifyObservers();

    }

    public Data() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void delectObserver(Observer observer) {
        int index= observers.indexOf(observer);
        observers.remove(index);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer:observers){
            observer.update(data);
        }
    }

}
