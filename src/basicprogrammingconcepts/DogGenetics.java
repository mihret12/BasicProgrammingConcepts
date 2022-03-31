
package basicprogrammingconcepts;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    
    public static void main(String []args){
  
Scanner sc = new Scanner(System.in);
System.out.println("What is your dog's name?");
// Entering name of dog
String name = sc.nextLine();
  
System.out.println("Well then, I have this highly reliable report on " + name + "'s prestigious background right here.");
  
System.out.println("\n\nSir " + name + " is\n\n");
  
//Generating random numbers
Random ran = new Random();
int sum = 0;
int breed1 = 0;
int breed2 = 0;
int breed3 = 0;
int breed4 = 0;
int breed5 = 0;
while(sum != 100)
{
breed1 = ran.nextInt(100);
  
 breed2 = ran.nextInt(100-breed1);
  
 breed3= ran.nextInt(100-breed2);

breed4 = ran.nextInt(100-breed3);
  
breed5 = ran.nextInt(100-breed4);
sum = breed1 + breed2 +breed3 + breed4 + breed5;
}
  
System.out.println(breed1 + "% St. Bernard");
System.out.println(breed2 + "% Chihuahua");
System.out.println(breed3+ "% Dramatic RedNosed Asian Pug");
System.out.println(breed4+ "% Common Cur");
System.out.println(breed5+ "% King Doberman");
  
System.out.println("\n\nWow, that's QUITE the dog!");
  
}
}
    

