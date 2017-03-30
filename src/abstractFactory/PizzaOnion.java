package abstractFactory;

import java.util.ArrayList;

/**
 * Created by zjy on 2017/3/30.
 */
public class PizzaOnion extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public PizzaOnion(String s) {
        if (s.equals("NY")){
            System.out.println("creatPizzaCheeseNY"+getClass().getName());

            this.pizzaIngredientFactory = new PizzaIngredientFactoryNY();

        }else {
            System.out.println("creatPizzaCheeseCG"+getClass().getName());

            this.pizzaIngredientFactory = new PizzaIngredientFactoryCG();

        }

    }

    @Override
    public void prapare() {
        name =getClass().getName();
        dough=pizzaIngredientFactory.creatIngredientDough();
        toping =new ArrayList<Object>(){{new IngredientOnion();}};

    }
}
