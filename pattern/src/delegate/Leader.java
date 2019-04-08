package delegate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leader {

    private Map<String, IEmployee> employeeMap;

    public Leader() {
        employeeMap = new HashMap<String, IEmployee>(){{
            put("设计", new Employee("员工A"));
            put("测试", new Employee("员工B"));
            put("需求", new Employee("员工C"));
        }};
    }

    public void task(String command) {
        IEmployee employee = employeeMap.get(command);
        if (employee == null) {
            System.out.println("没有找到合适的员工处理");
        } else {
            employee.doing(command);
        }
    }

}
