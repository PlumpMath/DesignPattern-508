package factory;

/**
 * Created by zjy on 2017/3/30.
 */
public class testfactory {
    public static void main(String[] args){
        PizzaStore pizzaStore = new PizzaStoreNY();
        Pizza pizzaCheese=pizzaStore.orderPizza(PizzaStoreNY.PizzaNYCheese);
        pizzaCheese.prapare();
        Pizza pizzaDefault=pizzaStore.orderPizza(PizzaStoreNY.PizzaNYDefault);
        pizzaDefault.prapare();
         new PizzaStoreCG().orderPizza(PizzaStoreCG.PizzaCGCheese).prapare();

    }
}
