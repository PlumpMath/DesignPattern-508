package observer;

import java.util.Observable;

/**
 * Created by zjy on 2017/3/28.
 */
public class Test {
    public static void main(String[] args){
        Data data = new Data();
        ObserverObject observerObject1 = new ObserverObject(data);
        ObserverObject observerObject2 = new ObserverObject(data);
        data.setData(1);
        data.delectObserver(observerObject2);
        data.setData(2);
        data.registerObserver(observerObject2);
        data.setData(3);


    }
}
