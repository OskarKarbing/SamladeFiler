import java.lang.reflect.Array;

import java.util.ArrayList;

public class Main2  {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Technician> tekniker = new ArrayList<>();


        Employee e = new Employee("Daweeb");
        Technician t = new Technician("Åke", 5);
        printAnything(t);
        printAnything(e);
        printAnything(e);
        printArrayList(employees);
        printAnyEmployeeName(e);
    }
    public static <T extends Employee> void printAnything(T o){
        System.out.println(o.name);
    }
    public static <T extends Employee> void printAnyEmployeeName(T o){
        System.out.println(o.name);
    }
    public static void printArrayList(ArrayList<? super Employee> employees){
      employees.add(new Employee("Monke"));

    }






}
