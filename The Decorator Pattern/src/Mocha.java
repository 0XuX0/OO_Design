/**
 * @ClassName Mocha
 * @Description TODO
 * @Author 0XuX0
 * @Date 2020/4/20
 **/
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha (Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
