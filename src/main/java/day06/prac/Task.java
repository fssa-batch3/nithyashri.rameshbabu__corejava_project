package day06.prac;
import java.util.ArrayList;

public class Task {
    public String taskName;
    public int priority;

    public Task(String name , int prior){
        this.taskName = name;
        this.priority = prior;
    }

    public static boolean findbyTaskName (String a ,ArrayList<Task> ab){
        boolean chk = false;
        for(Task i :ab ){
            if(a.equals(i.taskName)){
                chk = true;
            }

        }
        return chk ;
    }

    public static void main(String[]args){
        Task tsk1 = new Task("Nithya" , 3);
        Task tsk2 = new Task("Ramesh" , 4);
        Task tsk3 = new Task("Sri" , 3);
        ArrayList<Task> arr = new ArrayList<>();
        arr.add(tsk1);
        arr.add(tsk2);
        arr.add(tsk3);
        
        for(Task i : arr){ 
            System.out.print(i.taskName + "  ");
            System.out.println(i.priority);

        }
        System.out.print(findbyTaskName("Nithya",arr));





    }
}

