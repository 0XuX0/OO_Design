/**
 * @ClassName NoQuarterState
 * @Description TODO
 * @Author 0XuX0
 * @Date 2020/4/19
 **/
public class NoQuarterState implements State {
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there's no quarte");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }
}
