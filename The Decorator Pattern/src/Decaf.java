/**
 * @ClassName Decaf
 * @Description TODO
 * @Author 0XuX0
 * @Date 2020/4/20
 **/
public class Decaf extends Beverage {
    public Decaf () {
        description = "Decaf Coffee";
    }
    @Override
    public double cost() {
        return 1.05;
    }
}
