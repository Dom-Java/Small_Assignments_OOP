package assingment6;


public class animal {

    public static void main(String [] args){
        animal myAnimal;
        Fish myFish;
        Zebra myZebra;

        isMammal();
        mate();
        Zebra.run();
        
    }


    
    public int age;
    public String gender;
    
    public static void isMammal(){
        System.out.println("This is a public method isMammal() from class Animal");
    } 
    public static void mate(){
        System.out.println("This is a public method mate() from class Animal");
    }
    

    public class  Fish {
        
        public int sizeInFeet;

        private void canEat(){
            System.out.println("This is a private method canEat() from class Fish");
        }

    
    }

    public class Zebra {

        public Boolean is_wild;

        public static void run(){ 
            System.out.println("This is a public method run() from class Zebra");
        }
    }
    
}
