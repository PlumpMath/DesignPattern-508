package decorator.Decorators;

import decorator.Beverage;

/**
 * Created by zjy on 2017/3/29.
 */
public class Suger extends Beverage{
    Beverage decorator;

    @Override
    public String getDescription() {
        System.out.println("suger");

        return decorator.getDescription();
    }

    public Suger(Beverage decorator) {
        this.decorator = decorator;
    }

    @Override
    public double cost() {

        return decorator.cost()+0.1;
    }
}
