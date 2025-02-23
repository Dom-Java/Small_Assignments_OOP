import java.util.*;
import java.io.*;
public class matrix_assignment {

    public static void main (String [] args) throws FileNotFoundException {
        
        List<String> listOfStrings
            = new ArrayList<String>();
       
        
        Scanner scnr = new Scanner(new FileReader("numlist.txt"))
                         .useDelimiter(",\\s*");
        Scanner scnr2 = new Scanner(new FileReader("numlist2.txt"))
                         .useDelimiter(",\\s*");
        String str;
       
        
        while (scnr.hasNext()) {
            str = scnr.next();
           
            
            listOfStrings.add(str);
        }

        while (scnr2.hasNext()) {
            str = scnr2.next();
           
            
            listOfStrings.add(str);
        }
       
        
        Integer[] array
            = listOfStrings.toArray(new Integer[0]);
       
        
        for (Integer eachInteger : array) {
            System.out.println(eachInteger);
        }
        

        
        try{ 
            
            FileWriter writer = new FileWriter("matrix3.txt");
            writer.write(array);
            writer.flush();
            writer.close();
            
          }
      
          catch(IOException e) {
              e.printStackTrace();
          }

        
    
    }


   
}

