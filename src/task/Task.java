package task;
import java.time.LocalDateTime;

public class Task{

    LocalDateTime fromTime;
    LocalDateTime toTime;
    String name;
    
    protected Task(String name, LocalDateTime from, LocalDateTime to){
        this.name = name;
        this.fromTime = from;
        this.toTime = to;
    }
    
    protected Task createTask(LocalDateTime from){
        return new Task(new String(name), from, LocalDateTime.from(toTime));
    }

    protected void setName(String name){
        this.name = name;
    }

    protected void setToTime(LocalDateTime toTime){
        this.toTime = toTime;
    }

    protected void setfromTime(LocalDateTime fromTime){
        this.fromTime = fromTime;
    }

    public String toString(){
        return "TASK";
    }

    protected boolean isAfter(Task task){
        return fromTime.isAfter(task.fromTime);
    }
}