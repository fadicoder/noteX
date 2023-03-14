package task;
import java.time.Period;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class TaskPeriod {

    private Period taskPeriod;
    private LocalDateTime fromTime;
    private LocalDateTime toTime;

    public TaskPeriod(LocalDateTime fromTime, LocalDateTime toTime, Period taskPeriod){
        this.taskPeriod = taskPeriod;
        this.fromTime = fromTime;
        this.toTime = toTime;
    }
    
    protected void fillTasksSet(ArrayList<Task> tasksList, Task temp){
        LocalDateTime taskTime = fromTime;
        
        if(taskPeriod == null){
            tasksList.add(temp.createTask(taskTime));
            return;
        }
        
        while(taskTime.isBefore(toTime)){
            tasksList.add(temp.createTask(taskTime));
            taskTime = taskTime.plus(taskPeriod);
        }
    }

    protected Period getTaskPeriod(){
        return taskPeriod;
    }
}
