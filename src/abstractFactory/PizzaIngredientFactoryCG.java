package abstractFactory;

import java.util.ArrayList;

/**
 * Created by zjy on 2017/3/30.
 */
public class PizzaIngredientFactoryCG implements PizzaIngredientFactory{


    @Override
    public Object creatIngredientDough() {
        return new IngredientDoughThick();
    }



}
