package decorator.Decorators;

import decorator.Beverage;

/**
 * Created by zjy on 2017/3/30.
 */
public class Milk extends Beverage {
    Beverage beverage;
    @Override
    public double cost() {
        return beverage.cost()+0.2;
    }

    public Milk(Beverage beverage) {
        this.beverage = beverage;
        getDescription();
    }

    @Override
    public String getDescription() {
        System.out.print("milk");

        return beverage.getDescription();

    }
}
