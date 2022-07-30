public class Athlete {
   String name;
   String lastname;
   int dateOfBrith;
   static int regestrationNumber = 0;
   public Athlete (String maryam, String babanejadSarabi, int i) {
       //String nameOfAthlete = null;
     name = nameOfAthlete;
       //String lastnameOfAthlete =null;
       lastname = lastnameOfAthlete;
       //int dateOfBrithAthlete = 0 ;
       dateOfBrith = dateOfBrithAthlete;
       regestrationNumber++;
   }
       public void ShowAtheletinfo(){
           System.out.println("your name is :" + name);
           System.out.println("your lastname is :" + lastname);
           System.out.println("your date Of Brith is :" + dateOfBrith );
           System.out.println("your regestration is : " + regestrationNumber );
       }
       public static int ShowAtheletinfo(){
       return regestrationNumber;
       }
   }



