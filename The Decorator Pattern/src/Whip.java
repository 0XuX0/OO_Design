/**
 * @ClassName Whip
 * @Description TODO
 * @Author 0XuX0
 * @Date 2020/4/20
 **/
public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
