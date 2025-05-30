package DSAJAVA;

public class RecursionBasic{
     
     int count;

     public  void printName(int no)
     {
        if(this.count>=no)
        {
            return;
        }
        System.out.println("Sushant");
        this.count++;
         printName(no);
     }
     public static void main(String args[])
     {   
        RecursionBasic r = new RecursionBasic();
        r.printName(5);
       
     }
}