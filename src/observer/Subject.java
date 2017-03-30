package observer;

/**
 * Created by zjy on 2017/3/28.
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void delectObserver(Observer observer);
    public void notifyObservers();

}
