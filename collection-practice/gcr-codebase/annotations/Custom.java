import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "Alice")
    public void taskOne() {}
}

public class Custom {
    public static void main(String[] args) throws Exception {
        Method m = TaskManager.class.getMethod("taskOne");
        TaskInfo info = m.getAnnotation(TaskInfo.class);
        System.out.println(info.priority() + " " + info.assignedTo());
    }
}