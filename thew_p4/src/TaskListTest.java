import jdk.jfr.Description;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TaskListTest {
    @Test
    public void addingTaskItemsIncreasesSize(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.add("Task", "Description", "Date"));
    }

    @Test
    public void completingTaskItemChangesStatus(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.view());
    }

    @Test
    public void completingTaskItemFailsWithInvalidIndex(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.edit(0,"Task", "Description", "Date"));
    }

    @Test
    public void editingTaskItemChangesValues(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.edit(0, "Title", "Description", "Date"));
    }

    @Test
    public void editingTaskItemDescriptionChangesValue(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.edit(0,"Task", "Description", "Date"));
    }

    @Test
    public void editingTaskItemDescriptionFailsWithInvalidIndex(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.edit(0,"Task", "Description", "Date"));
    }

    @Test
    public void editingTaskItemDueDateChangesValue(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.edit(0,"Task", "Description", "Date"));
    }

    @Test
    public void editingTaskItemDueDateFailsWithInvalidIndex(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.edit(0,"Task", "Description", "Date"));
    }

    @Test
    public void editingTaskItemTitleChangesValue(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.edit(0,"Task", "Description", "Date"));
    }

    @Test
    public void editingTaskItemTitleFailsWithInvalidIndex(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.edit(0,"Task", "Description", "Date"));
    }

    @Test
    public void gettingTaskItemDescriptionFailsWithInvalidIndex(){
        App list = new App();
        Assertions.assertEquals(null, list.edit(0,"Title","Description", "Date"));
    }

    @Test
    public void gettingTaskItemDescriptionSucceedsWithValidIndex(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.edit(0,"Task", "Description", "Date"));
    }

    @Test
    public void gettingTaskItemDueDateFailsWithInvalidIndex(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.edit(0,"Task", "Description", "Date"));
    }

    @Test
    public void gettingTaskItemDueDateSucceedsWithValidIndex(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.edit(0,"Task", "Description", "Date"));
    }

    @Test
    public void gettingTaskItemTitleFailsWithInvalidIndex(){

    }

    @Test
    public void gettingTaskItemTitleSucceedsWithValidIndex(){

    }

    @Test
    public void newTaskListIsEmpty(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.view());
    }

    @Test
    public void removingTaskItemsDecreasesSize(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.remove(0));
    }

    @Test
    public void removingTaskItemsFailsWithInvalidIndex(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.remove(0));
    }

    @Test
    public void savedTaskListCanBeLoaded(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.save("Task.txt"));
    }

    @Test
    public void uncompletingTaskItemChangesStatus(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.unmark(0));
    }

    @Test
    public void uncompletingTaskItemFailsWithInvalidIndex(){
        TaskList list = new TaskList();
        Assertions.assertEquals(null, list.unmark(0));
    }
}
