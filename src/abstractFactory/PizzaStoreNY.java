package abstractFactory;



/**
 * Created by zjy on 2017/3/30.
 */
public class PizzaStoreNY extends PizzaStore {
    public static int  PizzaNYCheese=0;
    public static int PizzaNYOnion=1;


    public PizzaStoreNY() {
    }

    @Override
    public Pizza creatPizza(int s) {
        switch (s){
            case 0:return new PizzaCheese("NY");
            case 1:return new PizzaOnion("NY");
            default:return new PizzaOnion("NY");
        }

    }


}
