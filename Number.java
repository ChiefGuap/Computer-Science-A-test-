import java.util.ArrayList;

// Write a Class Number
public class Number {
    // instance variables
    int squirrelNumber;
    String squirrel; 
    int dayNumber; 

   

    // Number has a zero Argument constructor
    // It initializes a random number between 3 and 36, ie the number of squirrels in class
    public Number() {
       int squirrelNumber(int 3, int 36){
       int range = (36-3) + 1;     
       return (int)(Math.random() * 34) + 3;
}
    }

    // It contains a getter for the Random Number
    public int getsquirrelNumber() {
      return squirrelNumber; 
    }

    // It contains a getter for Index, or the order it was initialized
    public int dayNumber() {
      return dayNumber; 
    }
    

    // Write a tester method
    public static void main(String[] args) {

        // Create an ArrayList of Type Number, my ArrayList is called squirrels
    ArrayList<Integer> squirrelNumbers = new ArrayList<Integer>();
    squirrelNumbers.add(squirrelNumber);
    squirrelNumbers.add(squirrelNumber);
    squirrelNumbers.add(squirrelNumber);
    squirrelNumbers.add(squirrelNumber);
    for (int i : msquirrelNumbers) {
      System.out.println(i);
        
        // Initialize 10 squirrels of class type Number
        // Insert Number instance into ArrayList Squirrel in least to greatest order by random number, mine required nested loops
        

        // Print a formatted message with number of Squirrels and Index by which they were created, use enhanced for loop
        
    }

}


