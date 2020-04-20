/**
 * @ClassName Espresso
 * @Description TODO
 * @Author 0XuX0
 * @Date 2020/4/20
 **/
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
