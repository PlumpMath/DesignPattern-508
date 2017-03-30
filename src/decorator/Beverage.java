package decorator;

/**
 * Created by zjy on 2017/3/29.
 */
public abstract  class Beverage {
    String description = "default";
    Beverage beverage;

    public abstract double cost();

    public String getDescription() {
        return description;
    }
}
