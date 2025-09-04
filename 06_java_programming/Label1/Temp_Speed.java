package Java_Practices.Label1;

import java.util.Scanner;

public class Temp_Speed {

    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature) 
               + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature (in Fahrenheit): ");
        double temp = sc.nextDouble();
        System.out.print("Enter wind speed (in miles per hour): ");
        double windSpeed = sc.nextDouble();

        Temp_Speed ts = new Temp_Speed();
        double windChill = ts.calculateWindChill(temp, windSpeed);

        System.out.println("The Wind Chill Temperature is: " + windChill);

        sc.close();
    }
}
