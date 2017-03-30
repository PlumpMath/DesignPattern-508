package factory;

/**
 * Created by zjy on 2017/3/30.
 */
public class PizzaStoreCG extends PizzaStore{
    public static int  PizzaCGCheese=0;
    public static int PizzaCGDefault=1;


    public PizzaStoreCG() {
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
