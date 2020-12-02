import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TaskList {

    public ArrayList<TaskItem> List = new ArrayList<>();

    public TaskList(){

    }

    public String viewTask(){
        System.out.println("Current Tasks");
        System.out.println("-------------");

        for(int i=0; i<List.size(); i++){
            if(List.get(i).Marked){
                System.out.println(i+") *** ["+List.get(i).Date+"] "+List.get(i).Title+": "+List.get(i).Description+"\n\n");
            }

            else{
                System.out.println(i+") ["+List.get(i).Date+"] "+List.get(i).Title+": "+List.get(i).Description+"\n\n");
            }
        }
        return null;
    }

    public void viewUncompletedTasks(){
        System.out.println("Uncompleted Tasks");
        System.out.println("-----------------");

        for(int i=0; i<List.size(); i++){
            if(!List.get(i).Marked){
                System.out.println(i+") ["+List.get(i).Date+"] "+List.get(i).Title+": "+List.get(i).Description);
            }
        }
    }

    public void viewCompletedTasks(){
        System.out.println("Completed Tasks");
        System.out.println("---------------");

        for(int i=0; i<List.size(); i++){
            if(List.get(i).Marked){
                System.out.println(i+") ["+List.get(i).Date+"] "+List.get(i).Title+": "+List.get(i).Description);
            }
        }
    }

    public String addTask(String Title, String Description, String Date){
        List.add(new TaskItem(Title, Description, Date, false));
        return null;
    }

    public String editTask(int index, String newTitle, String newDes, String newDate){
        List.get(index).Title = newTitle;
        List.get(index).Description = newDes;
        List.get(index).Date = newDate;
        return null;
    }

    public String removeTask(int index){

        List.remove(index);
        return null;
    }

    public String markTask(int index){
        List.get(index).Marked = true;
        return null;
    }

    public String unmarkTask(int index){
        List.get(index).Marked = false;
        return null;
    }

    public String saveTask(String filename){
        BufferedWriter bw;

        // String filename = "";

        try {
            bw = new BufferedWriter(new FileWriter(filename));
            // actually write to the filename
            bw.write(Integer.toString(List.size()) + "\n");
            for(int i=0; i<List.size(); i++){
                bw.write(List.get(i).Title+"\n"+List.get(i).Description+"\n"+List.get(i).Date+"\n"
                        +Boolean.toString(List.get(i).Marked)+"\n");
            }
            //  Boolean.toString(variableName)
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}