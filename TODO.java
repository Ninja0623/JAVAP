import java.util.*;

class Task{
    String Title;
    boolean isComplete;

    public Task(String title){
        this.Title = title;
        this.isComplete = false;
    }

    public String toString() {
        return Title + " [" + (isComplete ? "Completed" : "Pending") + "]";
    }
}

public class TODO {
    static HashMap<Integer,Task> hm = new HashMap<>();
    static int TaskID = 1;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        
        System.out.println("Operation to be performed on your list:");
        System.out.println("1. Add a Task");
        System.out.println("2. View your Tasks");
        System.out.println("3. Update Your Task");
        System.out.println("4, Delete a Task");
        System.out.println("5. Mark your task COMPLETE");
        System.out.println("6. Exit");

        int ch = sc.nextInt();
        switch(ch){
            case 1 -> add();
            case 2 -> ViewTask();
            case 3 -> Update();
            case 4 -> Del();
            case 5 -> IsCompleted();
            default-> {System.out.println("Invalid request");
            break;
        }}

    }
    public static void add(){
        System.out.print("Enter Task : ");
        String t = sc.next();
        hm.put(TaskID,new Task(t));
        System.out.println("Task added successfully "+TaskID);
        TaskID++;
    }

    public static void ViewTask()
    {
        if(hm.isEmpty()){
            System.out.println("Your List is Empty");
        }
        for(int key : hm.keySet()){
            System.out.println(key + " . " + hm.get(key));
        }
    }

    public static void Update(){
        System.out.println("Enter task to be updated:");
        int g  =  sc.nextInt();
        if(hm.get(g)==null){
            System.out.println("Task not found");
            return;
        }
        System.out.println("Enter new Title:");
        String newTitle = sc.nextLine();
        hm.get(g).Title = newTitle;
        System.out.println("Updated Successfully");
    }

    public static void Del(){
        System.out.println("Select the task you wanna delete:");
        int key = sc.nextInt();
        if(hm.remove(key)!=null){
            System.out.println("Deleted Successfully");
        }else{
            System.out.println("Task not found");
        }
    }

    public static void IsCompleted(){
        System.out.println("Mark the task which is completed");
        int ss = sc.nextInt();
        if(hm.get(ss)!=null){
            boolean isComplete = true;
            System.out.println("Task completed Successfully");
        }else{
            System.out.println("Not Found!");
        }
        
    }



}
