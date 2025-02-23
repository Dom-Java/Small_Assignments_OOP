package sorting;
import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class bubble_sort {
    
    public static void main (String[]args) {
       Scanner scnr = new Scanner(System.in);
       
        }
        
        
    }
    public class RandomArray {
        int arraylength = 101;
        int i;
        Random rand = new Random();
        int random_num = rand.nextInt(100);
        int[] createRandomArray = new int[arraylength];
        for (i = 0; i < arraylength; ++i) {
            createRandomArray[i] = random_num;
            random_num = rand.nextInt(100);
            System.out.println(createRandomArray[i]);
        }
        
    }

    public class filewriting {
        File newFile = new File("arrayToFile.txt");
        public static void writeArrayToFile(String newFile,int[] Array2) {
            int i;
            Random rand = new Random();
            int random_num = rand.nextInt(100);
            
            Array2 = new int[7];
            Array2[i] = random_num;
    
            for (i = 0; i < 7; ++i) {
                Array2[i] = random_num;
                random_num = rand.nextInt(100);
                System.out.println(Array2[i]);
            
            
                try{
                    BufferedWriter written = new BufferedWriter(new FileWriter(newFile));
                    written.write(Array2[i]);
                    written.close();
                }

                catch (IOException e) {
                    e.printStackTrace();
                }
                
    }
}

    public class fileReading {
        
        try {
        List<Integer> listOfNumbers = new ArrayList<Integer>();
        BufferedReader Buffer = new BufferedReader(new FileReader("numlist.txt"));
        Integer next_num = Buffer.readLine();
        while (next_num != null); {
            next_num = bf.readLine();
        }
        Buffer.close();
        int[] array = listOfNumbers.toArray(new int[0]);
        }
        catch (IOException e) {
        }
    }

}
}
}
    public class Bubble {
        int i;
        int[] Array3 = new int[5];
        Array3[0] = 7;
        Array3[1] = 3;
        Array3[2] = 8;
        Array3[3] = 52;
        Array3[4] = 9;

        for ( i = 0; i < Array3.length(); ++i) {
            if (Array3[i] < Array3[i+1]) {
                System.out.println(Array3[i+1]);
                System.out.print(Array3[i]);
            }
        }
        
    }
    




