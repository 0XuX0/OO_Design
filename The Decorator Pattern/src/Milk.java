/**
 * @ClassName Milk
 * @Description TODO
 * @Author 0XuX0
 * @Date 2020/4/20
 **/
public class Milk extends CondimentDecorator {
    Beverage beverage;
    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ". Milk";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
