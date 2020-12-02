import java.io.*;
import java.util.Scanner;

public class App extends TaskList{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        program();
    }

    public static void program(){
        String ans = askUserInput();
        TaskList List = new TaskList();
        while(!ans.equals("3")){
            if(ans.equals("1")){
                tasklist(List);
            }
            else if (ans.equals("2")){
                System.out.println("Enter the filename to load: ");
                String filename = input.nextLine();
                List = loadList(filename);
                tasklist(List);
            }
            else{
                System.out.println("WARNING: INVALID INPUT");
            }
            ans = askUserInput();
        }
    }

    public static TaskList loadList(String filename) {
        BufferedReader reader;
        TaskList List = new TaskList();
        try {
            reader = new BufferedReader(new FileReader(filename));
            int size = Integer.parseInt(reader.readLine());
            for(int i=0; i<size; i++) {
                String Title = reader.readLine();
                String Description = reader.readLine();
                String Date = reader.readLine();
                boolean Mark = Boolean.parseBoolean(reader.readLine());
                List.add(Title, Description, Date);
                if (Mark == true) {
                    List.mark(i);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return List;
    }

    public static void tasklist(TaskList List){
        String ans = askUserInput2();
        while(!ans.equals("8")){
            if(ans.equals("1")){
                List.view();
            }
            else if(ans.equals("2")){
                String Title = getTaskTitle();
                String Description = getTaskDescription();
                String Date = getTaskDate();
                List.add(Title, Description, Date);
            }
            else if(ans.equals("3")){
                List.view();
                System.out.println("Which item would you like to edit: ");
                int index = input.nextInt();
                String Title = getTaskTitle();
                String Description = getTaskDescription();
                String Date = getTaskDate();
                List.edit(index, Title, Description, Date);
            }
            else if(ans.equals("4")){
                List.view();
                System.out.println("Which item would you like to remove? ");
                int index = input.nextInt();
                List.remove(index);
            }
            else if(ans.equals("5")){
                List.view();
                System.out.println("Which item would you like to mark as completed? ");
                int index = input.nextInt();
                List.mark(index);
            }
            else if(ans.equals("6")){
                List.view();
                System.out.println("Which item would you like to unmark? ");
                int index = input.nextInt();
                List.unmark(index);
            }
            else if(ans.equals("7")){
                System.out.println("Please enter a file name : ");
                String filename = input.nextLine();

                List.save(filename);
            }
            else{
                System.out.println("WARNING: INVALID INPUT");
            }
            ans = askUserInput2();
        }
    }

    public static String getTaskDate() {
        String Date = "";
        while(true) {
            System.out.println("Date (MM-DD-YYYY): ");
            Date = input.nextLine();

            if(Date.length() == 10)
            {
                return Date;
            }
        }
    }

    public static String getTaskDescription() {
        String Description = "";
        while(true) {
            System.out.println("Description: ");
            Description = input.nextLine();

            if(Description.length() != 0)
            {
                return Description;
            }
        }
    }

    public static String getTaskTitle() {
        String Title = "";
        while(true) {
            System.out.println("Title: ");
            Title = input.nextLine();

            if(Title.length() != 0)
            {
                return Title;
            }
        }
    }

    private static boolean UserInput() {
        String continueResponse = askUserInput();
        return continueResponse.startsWith("1") || continueResponse.startsWith("2");
    }

    public static String askUserInput() {
        System.out.println("Main Menu");
        System.out.println(" 1) create new list\n 2) load a list\n 3) quit");
        return input.nextLine();
    }

    public static String askUserInput2() {
        System.out.println("List Operation Menu");
        System.out.println(" 1) view the list\n 2) add an list\n 3) edit an item\n 4) remove an item\n" +
                " 5) mark an item as complete\n 6) unmark an item as complete\n 7) save the current list\n " +
                " 8) quit to the main menu");
        return input.nextLine();
    }
}
