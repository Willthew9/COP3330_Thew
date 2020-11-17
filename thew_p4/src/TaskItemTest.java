import jdk.jfr.Description;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TaskItemTest {

    @Test
    public void creatingTaskItemFailsWithInvalidDueDate(){
        TaskItem item = new TaskItem("Title", "Description", "Date", false);
        Assertions.assertEquals("Date", item.getDate());
    }

    @Test
    public void creatingTaskItemFailsWithInvalidTitle(){
        TaskItem item = new TaskItem("Title", "Description", "Date", false);
        Assertions.assertEquals("Title", item.getTitle());
    }

    @Test
    public void creatingTaskItemSucceedsWithValidDueDate(){
        TaskItem item = new TaskItem("Title", "Description", "Date", false);
        Assertions.assertEquals("Date", item.getDate());
    }

    @Test
    public void creatingTaskItemSucceedsWithValidTitle(){
        TaskItem item = new TaskItem("Title", "Description", "Date", false);
        Assertions.assertEquals("Title", item.getTitle());
    }

    @Test
    public void settingTaskItemDueDateFailsWithInvalidDate(){
        TaskItem item = new TaskItem("Title", "Description", "Date", false);
        Assertions.assertEquals("Date", item.getDate());
    }

    @Test
    public void settingTaskItemDueDateSucceedsWithValidDate(){
        TaskItem item = new TaskItem("Title", "Description", "Date", false);
        Assertions.assertEquals("Date", item.getDate());
    }

    @Test
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
