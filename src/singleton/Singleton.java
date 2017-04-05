package singleton;

/**
 * Created by zjy on 2017/4/5.
 * 双重加锁,首先检查是否创建,如果未检查,进行同步.
 */
public class Singleton {
    //当 uniqueInstance 被初始化时,多个线程可以正确处理uniqueInstance实例
    private volatile static Singleton uniqueInstance;

    public static Singleton getInstance(){
        if (uniqueInstance ==null){
            //只有第一次彻底执行这段代码
            synchronized (Singleton.class){
                if (uniqueInstance ==null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return  uniqueInstance;
    }

}
