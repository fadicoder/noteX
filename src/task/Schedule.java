package task;
import java.util.SortedSet;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class Schedule{
    
    ArrayList<TaskSet> taskSets;
    ArrayList<Task> tasks;

    public Schedule(){
        taskSets = new ArrayList<>();
        tasks = new ArrayList<>();
    }
    
    public void add(Task template, TaskPeriod period){
        TaskSet taskSet = new TaskSet(template, period);
        for(Task task : taskSet.getTasks()){
            add(task);
        }
        taskSets.add(taskSet);

    }

    private void add(Task task){
        int i = 0;
        for(i = 0; i < tasks.size(); i++){
            if (tasks.get(i).isAfter(task)){
                break;
            }
        }
        tasks.add(i, task);
    }

    public void fillTasksSchedule(LocalDateTime fromTime, LocalDateTime toTime){
        clearTasksSchedule();
        for(Task task : tasks){
            task.addToSchedule(schedule, fromTime, toTime);
        }
    }

    public void clearTasksSchedule(){
        schedule.clear();
    }

    public void save(){
        return;
    }

    public String toString(){
        String verbose = "";
        for(Task task : schedule){
            verbose += task.toString();
        }
        return verbose;
    }
}
