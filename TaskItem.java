public class TaskItem extends App{
    String Title = "";
    String Description = "";
    String Date = "";
    boolean Marked = false;

    public TaskItem(String T, String Des, String Dat, boolean Mar){
        Title = T;
        Description = Des;
        Date = Dat;
        Marked = Mar;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }

    public String getDate() {
        return Date;
    }
}
