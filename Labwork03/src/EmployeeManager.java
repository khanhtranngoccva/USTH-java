import java.nio.file.Files;
import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;

class Employee {
    private int id;
    private String fullName;
    private String department;
    private int basicSalary;
    private int extraSalary;

    public Employee(int id, String fullName, String department, int basicSalary, int extraSalary) {
        this.id = id;
        this.fullName = fullName;
        this.department = department;
        this.basicSalary = basicSalary;
        this.extraSalary = extraSalary;
    }

    public JSONObject toJSONObject() {
        JSONObject out = new JSONObject();
        out.put("id", id);
        out.put("fullName", fullName);
        out.put("department", department);
        out.put("basicSalary", basicSalary);
        out.put("extraSalary", extraSalary);
        return out;
    }

    public int getIncome() {
        return (int) (this.basicSalary + this.extraSalary * 2.5);
    }

    public void display() {
        System.out.println("Employee No.: " + this.id);
        System.out.println("Full name: " + this.fullName);
        System.out.println("Department: " + this.department);
        System.out.println("Total income: " + this.getIncome());
        System.out.println();
    }
}

public class EmployeeManager {
    ArrayList<Employee> employees;

    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Input your command: > ");
            String input = in.nextLine();
            if (input.equals("a")) {
                manager.addEmployee();
            } else if (input.equals("s")) {
                manager.save();
            } else if (input.equals("d")) {
                manager.display();
            } else {
                break;
            }
        }
    }

    public EmployeeManager() {
        this.load();
    }

    private void load() {
        JSONArray employeeJSON = new JSONArray();
        ArrayList<Employee> employees = new ArrayList<>();
        try {
            String rawEmployeeJSON = Files.readString(Path.of("./employees.txt"));
            employeeJSON = (JSONArray) new JSONParser().parse(rawEmployeeJSON);
        } catch (Exception ignored) {

        }
        for (Object _employee : employeeJSON) {
            JSONObject employee = (JSONObject) _employee;
            employees.add(new Employee(
                    new Long((long) employee.get("id")).intValue(),
                    (String) employee.get("fullName"),
                    (String) employee.get("department"),
                    new Long((long) employee.get("basicSalary")).intValue(),
                    new Long((long) employee.get("extraSalary")).intValue()));
        }
        this.employees = employees;
    }

    private void save() {
        try {
            JSONArray employeesJSON = new JSONArray();
            for (Employee employee : this.employees) {
                employeesJSON.add(employee.toJSONObject());
            }
            PrintWriter out = new PrintWriter(new FileWriter("./employees.txt"));
            out.print(employeesJSON.toJSONString());
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void display() {
        for (Employee employee : this.employees) {
            employee.display();
        }
    }

    private void addEmployee() {
        Scanner in = new Scanner(System.in);
        int id;
        String fullName;
        String department;
        int basicSalary;
        int extraSalary;
        System.out.print("ID: ");
        id = in.nextInt();
        in.nextLine();
        System.out.print("Full name: ");
        fullName = in.nextLine();
        System.out.print("Department: ");
        department = in.nextLine();
        System.out.print("Basic salary: ");
        basicSalary = in.nextInt();
        in.nextLine();
        System.out.print("Extra salary: ");
        extraSalary = in.nextInt();
        in.nextLine();
        this.employees.add(new Employee(id, fullName, department, basicSalary, extraSalary));
    }
}