package abstractFactory;


import abstractFactory.*;

/**
 * Created by zjy on 2017/3/30.
 */
public class PizzaStoreCG extends PizzaStore {
    public static int  PizzaCGCheese=0;
    public static int PizzaCGDOnion=1;


    public PizzaStoreCG() {
    }

    @Override
    public Pizza creatPizza(int s) {
        switch (s){

            case 0:return new PizzaCheese("CG");
            case 1:return new PizzaOnion("CG");
            default:return new PizzaOnion("CG");
        }

    }
}
