package observer;

/**
 * Created by zjy on 2017/3/28.
 */
public class ObserverObject implements Observer {
    int data;
    Subject subject;
    @Override
    public void update(int data) {
        this.data=data;
        System.out.println(this+"**data:"+data);
    }

    public ObserverObject(Subject subject) {
        this.subject =subject;
        subject.registerObserver(this);
    }
}
