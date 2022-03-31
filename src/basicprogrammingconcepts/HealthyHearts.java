
package basicprogrammingconcepts;

import java.util.Scanner;

public class HealthyHearts {

    public static void main(String[] args) {
        int maxAge = 220;
          
        int age;    
        
        int max;    
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("What is your age? ");
        age = scn.nextInt();
        
        max = maxAge - age;
        
        System.out.println("Your maximum heart rate should be " + max + " beats per minute");
        
        System.out.println("Your target HR Zone is " + (int)Math.ceil(0.5*max) + " - " + (int)Math.ceil(0.85 * max) + " per minute");
    }
}

    

