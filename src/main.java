

import java.util.Scanner;
import controller.CommandCreator;
import controller.Command;
import task.Schedule;

public class main {
    public static void main(String[] args){

        // Scanner scanner = new Scanner(System.in);

        Schedule schedule = new Schedule();

        Command command = CommandCreator.createCommand(args);
        command.execute(schedule);
        
        /*
        while(!Command.isExitCommand()){

            args = scanner.next().split(" ");
            Command command = CommandCreator.createCommand(args);
            command.execute();

        }
        */
    }
}
