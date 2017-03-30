package abstractFactory;



/**
 * Created by zjy on 2017/3/30.
 */
public class testabstractFactory {
    public static void main(String[] args){
        new abstractFactory.PizzaStoreNY().orderPizza(abstractFactory.PizzaStoreNY.PizzaNYCheese).prapare();
        new abstractFactory.PizzaStoreCG().orderPizza(PizzaStoreCG.PizzaCGCheese).prapare();
        new abstractFactory.PizzaStoreNY().orderPizza(PizzaStoreNY.PizzaNYOnion).prapare();
        new abstractFactory.PizzaStoreCG().orderPizza(PizzaStoreCG.PizzaCGDOnion).prapare();


    }
}
