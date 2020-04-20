/**
 * @ClassName Beverage
 * @Description TODO
 * @Author 0XuX0
 * @Date 2020/4/20
 **/
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract  double cost();
}
