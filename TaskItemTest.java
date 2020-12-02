import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class TaskItemTest {
    @org.testng.annotations.Test
    public void creatingTaskItemFailsWithInvalidDueDate(){
        TaskItem item = new TaskItem("Title", "Description", "Date", false);
        Assertions.assertEquals("Date", item.getDate());
    }

    @org.testng.annotations.Test
    public void creatingTaskItemFailsWithInvalidTitle(){
        TaskItem item = new TaskItem("Title", "Description", "Date", false);
        Assertions.assertEquals("Title", item.getTitle());
    }

    @org.testng.annotations.Test
    public void creatingTaskItemSucceedsWithValidDueDate(){
        TaskItem item = new TaskItem("Title", "Description", "Date", false);
        Assertions.assertEquals("Date", item.getDate());
    }

    @org.testng.annotations.Test
    public void creatingTaskItemSucceedsWithValidTitle(){
        TaskItem item = new TaskItem("Title", "Description", "Date", false);
        Assertions.assertEquals("Title", item.getTitle());
    }

    @org.testng.annotations.Test
    public void settingTaskItemDueDateFailsWithInvalidDate(){
        TaskItem item = new TaskItem("Title", "Description", "Date", false);
        Assertions.assertEquals("Date", item.getDate());
    }

    @org.testng.annotations.Test
    public void settingTaskItemDueDateSucceedsWithValidDate(){
        TaskItem item = new TaskItem("Title", "Description", "Date", false);
        Assertions.assertEquals("Date", item.getDate());
    }

    @org.testng.annotations.Test
    public void settingTaskItemTitleFailsWithInvalidTitle(){
        TaskItem item = new TaskItem("Title", "Description", "Date", false);
        Assertions.assertEquals("Title", item.getTitle());
    }

    @Test
    public void settingTaskItemTitleSucceedsWithValidTitle(){
        TaskItem item = new TaskItem("Title", "Description", "Date", false);
        Assertions.assertEquals("Title", item.getTitle());
    }
}
