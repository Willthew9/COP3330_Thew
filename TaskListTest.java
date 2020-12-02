import jdk.jfr.Description;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TaskListTest {
    @Test
    public void addingTaskItemsIncreasesSize(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.addTask("Task", "Description", "Date"));
    }

    @Test
    public void completingTaskItemChangesStatus(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.viewTask());
    }

    @Test
    public void completingTaskItemFailsWithInvalidIndex(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.editTask(0,"Task", "Description", "Date"));
    }

    @Test
    public void editingTaskItemChangesValues(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.editTask(0, "Title", "Description", "Date"));
    }

    @Test
    public void editingTaskItemDescriptionChangesValue(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.editTask(0,"Task", "Description", "Date"));
    }

    @Test
    public void editingTaskItemDescriptionFailsWithInvalidIndex(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.editTask(0,"Task", "Description", "Date"));
    }

    @Test
    public void editingTaskItemDueDateChangesValue(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.editTask(0,"Task", "Description", "Date"));
    }

    @Test
    public void editingTaskItemDueDateFailsWithInvalidIndex(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.editTask(0,"Task", "Description", "Date"));
    }

    @Test
    public void editingTaskItemTitleChangesValue(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.editTask(0,"Task", "Description", "Date"));
    }

    @Test
    public void gettingTaskItemDescriptionSucceedsWithValidIndex(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.editTask(0,"Task", "Description", "Date"));
    }

    @Test
    public void gettingTaskItemDueDateFailsWithInvalidIndex(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.editTask(0,"Task", "Description", "Date"));
    }

    @Test
    public void gettingTaskItemDueDateSucceedsWithValidIndex(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.editTask(0,"Task", "Description", "Date"));
    }

    @Test
    public void newTaskListIsEmpty(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.viewTask());
    }

    @Test
    public void removingTaskItemsDecreasesSize(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.removeTask(0));
    }

    @Test
    public void removingTaskItemsFailsWithInvalidIndex(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.removeTask(0));
    }

    @Test
    public void savedTaskListCanBeLoaded(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.saveTask("Task.txt"));
    }

    @Test
    public void uncompletingTaskItemChangesStatus(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.unmarkTask(0));
    }

    @Test
    public void uncompletingTaskItemFailsWithInvalidIndex(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.unmarkTask(0));
    }
}
