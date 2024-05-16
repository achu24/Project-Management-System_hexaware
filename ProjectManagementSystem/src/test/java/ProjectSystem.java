import static org.junit.jupiter.api.Assertions.*;

import com.java.dao.ProjectRepositoryImpl;
import com.java.model.Employee;
import com.java.model.Task;
import com.java.service.employeeService;

import org.junit.jupiter.api.Test;

class ProjectSystem {

	@Test
	void test() {
		ProjectRepositoryImpl pri =new ProjectRepositoryImpl();
		Employee e=new Employee();
		e.setId(48);
		e.setName("Testing");
		e.setDesignation(" Testing");
		e.setGender("Male");
		e.setSalary(30000.0);
		e.setProject_id(12);
		
		boolean result=pri.createEmployee(e);
		assertTrue(result, "Successful");
	}
	@Test
	void testCreateTask() {
		ProjectRepositoryImpl pri=new ProjectRepositoryImpl();
        Task t = new Task();
        t.setTask_id(28);
        t.setTask_name("Testing");
        t.setProject_id(12);
        t.setEmployee_id(23);
        t.setStatus("started");

        boolean result =pri.createTask(t);
        assertTrue(result, "Task created");
    }

}

	