import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName GumballMachineTestDrive
 * @Description TODO
 * @Author 0XuX0
 * @Date 2020/4/19
 **/
public class GumballMachineTestDrive {
    public static void main(String[] args) {
//        GumballMachineOld gumballMachine = new GumballMachineOld(5);
//
//        GumballMachineOld.printInfo(gumballMachine);
//
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        GumballMachineOld.printInfo(gumballMachine);
//
//        gumballMachine.insertQuarter();
//        gumballMachine.ejectQuarter();
//        gumballMachine.turnCrank();
//
//        GumballMachineOld.printInfo(gumballMachine);
//
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.ejectQuarter();
//
//        GumballMachineOld.printInfo(gumballMachine);
//
//        gumballMachine.insertQuarter();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        GumballMachineOld.printInfo(gumballMachine);
//###########################################################
        GumballMachine gumballMachine = new GumballMachine(5);

        GumballMachine.printInfo(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        GumballMachine.printInfo(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        GumballMachine.printInfo(gumballMachine);
    }
}
