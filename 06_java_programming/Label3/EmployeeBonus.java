package Java_Practices.Label3;

import java.util.Random;

public class EmployeeBonus {
    
    public static int[][] generateEmployeeData(int n) {
        Random rand = new Random();
        int[][] data = new int[n][2]; // [salary, yearsOfService]
        
        for (int i = 0; i < n; i++) {
            int salary = 10000 + rand.nextInt(90000); // 5-digit salary
            int years = 1 + rand.nextInt(15); // service between 1–15 years
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }
    
    public static double[][] calculateBonus(int[][] employeeData) {
        double[][] newData = new double[employeeData.length][2]; // [newSalary, bonus]
        
        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int years = employeeData[i][1];
            
            double bonus = (years > 5) ? oldSalary * 0.05 : oldSalary * 0.02;
            double newSalary = oldSalary + bonus;
            
            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }
        return newData;
    }
    
    public static void displayResult(int[][] oldData, double[][] newData) {
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        
        System.out.printf("%-10s %-12s %-12s %-12s %-12s\n", "EmpID", "OldSalary", "YearsServ", "Bonus", "NewSalary");
        System.out.println("--------------------------------------------------------------");
        
        for (int i = 0; i < oldData.length; i++) {
            int oldSalary = oldData[i][0];
            int years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];
            
            totalOld += oldSalary;
            totalNew += newSalary;
            totalBonus += bonus;
            
            System.out.printf("%-10d %-12d %-12d %-12.2f %-12.2f\n", 
                              (i+1), oldSalary, years, bonus, newSalary);
        }
        
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-10s %-12.2f %-12s %-12.2f %-12.2f\n", 
                          "TOTAL", totalOld, "-", totalBonus, totalNew);
    }
    
    public static void main(String[] args) {
        int n = 10; // 10 employees
        int[][] employeeData = generateEmployeeData(n);
        double[][] newData = calculateBonus(employeeData);
        displayResult(employeeData, newData);
    }
}
