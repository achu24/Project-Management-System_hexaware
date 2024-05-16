package com.java.main;
import java.util.*;

import com.java.exception.EmployeeNotFoundException;
import com.java.exception.ProjectNotFoundException;
import com.java.service.*;

public class ProjectApp {
	public static void main(String[] args) throws EmployeeNotFoundException, ProjectNotFoundException {
		employeeService es = new employeeService();
		projectService ps=new projectService();
		taskService ts=new taskService();
	    Scanner sc=new Scanner(System.in);
	
        while (true) {
        	System.out.println("Welcome to the Project management system");
        	System.out.println("1. Add Employee");
        	System.out.println("2. Add Project");
        	System.out.println("3. Add Task");
        	System.out.println("4. Assign project to employee");
        	System.out.println("5. Assign task within a project to employee");
        	System.out.println("6. Delete Employee");
        	System.out.println("7. Delete Project");
        	System.out.println("8. List all projects assigned with tasks to an employee");
        	System.out.println("9. Exit");
        	System.out.println("Enter your choice: ");
        	int ch = sc.nextInt();

            if(ch==1) {
            	es.createEmployee();
            }
            else if(ch==2) {
            	ps.createProject();
            }
            else if(ch==3) {
                ts.createTask();
            }
            else if(ch==4) {
                es.assignProjectToEmployee();
            }
            else if(ch==5) {
                es.AssigntaskInProjecttoEmployee();
            }
            else if(ch==6) {
                es.deleteEmployee();
            }
            else if(ch==7) {
                ps.deleteProject();
            }
            else if(ch==8) {
                ts.getAllTasks();
            }
            else if(ch==9) {
                System.out.println("Exiting Project Management System");
                break;
            }
            else {
                System.out.println("Invalid choice. Please try again.");
        }
    }

}

}
