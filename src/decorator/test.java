package decorator;

import decorator.Decorators.Milk;
import decorator.Decorators.Suger;

/**
 * Created by zjy on 2017/3/30.
 */
public class test {
    public static void main(String[] args){
        Beverage beverage= new Milk(new Suger(new Coffe()));
        System.out.println(beverage.cost());
    }
}
