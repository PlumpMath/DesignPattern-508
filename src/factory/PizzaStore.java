package factory;

/**
 * Created by zjy on 2017/3/30.
 */
public abstract  class PizzaStore {
    public  Pizza orderPizza(int s){
        return creatPizza(s );

    }

    protected abstract Pizza creatPizza(int pizzaName);
}
