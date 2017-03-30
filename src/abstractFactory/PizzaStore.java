package abstractFactory;

import abstractFactory.Pizza;

/**
 * Created by zjy on 2017/3/30.
 */
public abstract  class PizzaStore {
    public abstractFactory.Pizza orderPizza(int s){
        return creatPizza(s );

    }

    protected abstract Pizza creatPizza(int pizzaName);
}
