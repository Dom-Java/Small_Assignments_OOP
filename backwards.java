

import java.util.Scanner; //imports the java utility package (sanner class).

public class backwards { //The class where my program is housed.
    public static void main (String [] args) { //The main method.
     Scanner scanner = new Scanner(System.in); //defines the scanner variable.
     String Scanned_number = scanner.nextLine(); //A variable which reads the next string input into the command line.
     int init; //The initial variable.
     init = Scanned_number.length(); //makes the initial varibale = to the length of the String that is input.
     while (init < 200) { //makes sure that init will work with the length of any word.
        init -= 1; //This line of code insures that init will start prinitng at the last charcter of the string.
        System.out.print(Scanned_number.charAt(init)); //passes init as an argument in Scanned_number.charAt(). It ensures that the last character in the string will be read first.
        if (init == 0) { //tells the program to stop looping if the character index of the string is == to 0 (the first character).
            break; //stops the while loop
        }
     }
     try{ //runs the code below and check for errors.

     
     Scanned_number.charAt(init - 1); //prevents index 0 from printing twice.
     System.out.print(Scanned_number); //print the backwards word.
     }
     catch (Exception e){ //this is error handling. normally an error would be thrown saying that -1 is not in the length of he string. This ensures that the error mesage will not show up. This provides a cleaner terminal.

     }

    }

}
