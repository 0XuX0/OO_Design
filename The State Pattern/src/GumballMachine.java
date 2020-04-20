/**
 * @ClassName GumballMachine
 * @Description TODO
 * @Author 0XuX0
 * @Date 2020/4/19
 **/
public class GumballMachine {
    State soldOutSate;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutSate;
    int count = 0;

    public GumballMachine(int numberGumballs) {
        soldOutSate = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    public static void printInfo(GumballMachine gumballMachine) {
        System.out.println("GumballMachine's state is : " + gumballMachine.state);
        System.out.println("GumballMachine's gumball count is : " + gumballMachine.count);
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
    }

    void setState(State state) {
        this.state = state;
    }

    void releaseBall() {
        System.out.println("A gumball comes rolling out the slot ...");
        if (count != 0) {
            count = count - 1;
        }
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getSoldOutSate() {
        return soldOutSate;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }
}
