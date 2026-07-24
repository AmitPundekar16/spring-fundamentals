package com.amit.jdbc_basics;

import com.amit.jdbc_basics.models.Employee;
import com.amit.jdbc_basics.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
public class Start {

    Scanner sc = new Scanner(System.in);
    ApplicationContext apk;
    private int choice;
    @Autowired
    Employee emp;

    @Autowired
    EmployeService empser;
    Boolean running=true;
    public void start(ApplicationContext apk)
    {
        this.apk=apk;
        while (running) {
            System.out.println("\nSelect the option");
            System.out.println("1. Add Data");
            System.out.println("2. Fetch Data");
            System.out.println("3. Select Data of Specific Employee");
            System.out.println("4. Delete Specific Record");
            System.out.println("5. Delete All Records");
            System.out.println("6. Exit");

            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer after nextInt()

            switch (choice) {
                case 1:
                    addStudent(sc);
                    empser.saveEmployee(emp);
                    break;
                case 2:
                    List<Employee> em=empser.fetchData();
                    System.out.println(em);
                    break;
                case 3:
                    fetchSpecificStudent(sc);
                    break;
                case 4:
                   // deleteSpecificStudent(sc);
                    break;
                case 5:
                   // deleteAllStudents();
                    break;
                case 6:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
        sc.close();


    }

    private void fetchSpecificStudent(Scanner sc) {
        System.out.println("Enter Employee id");
        int id=sc.nextInt();

       Employee em= empser.fetchSpecific(id);
        if (em == null) {
            System.out.println("No data");
        } else {
            System.out.println(em);
        }

    }


    void addStudent(Scanner sc)
    {
        System.out.println("Enter Employee id");
        emp.setId(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter Employee Name");
        emp.setName(sc.nextLine());
        sc.nextLine();

        System.out.println("Enter Employee Department");
        emp.setDepartment(sc.nextLine());
        sc.nextLine();


        System.out.println("Enter Employee Salary");
        emp.setSalary(sc.nextInt());
        sc.nextLine();

        System.out.println("Enter Employee email");
        emp.setEmail(sc.nextLine());

    }


}


