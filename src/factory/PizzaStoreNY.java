package factory;

/**
 * Created by zjy on 2017/3/30.
 */
public class PizzaStoreNY extends PizzaStore {
    public static int  PizzaNYCheese=0;
    public static int PizzaNYDefault=1;


    public PizzaStoreNY() {
    }

    @Override
    public Pizza creatPizza(int s) {
        switch (s){
            case 0:return new PizzaNYCheese();
            case 1:return new PizzaNYDefault();
            default:return new PizzaNYDefault();
        }

    }


}
