//ArrayList (Dynamic Array)
import java.util.*;
class Main 
{
    public static void main(String[] args) 
    {
       ArrayList <Integer> arr = new ArrayList<>();
       
       arr.add(1);
       arr.add(3);
       arr.add(5);
       arr.add(7);
       arr.add(9);
       
       int n= arr.size();
       
       System.out.println(arr);//[1 3 5 7 9]
       
       System.out.println(arr.get(2));//5 (index not from 0 in size but when in array element)
       
       arr.remove(arr.size()-1);
       
        System.out.print(arr);//[1 3 5 7]

        /// To make a dynamic matrix
        
       System.out.println("To make a dynamic matrix");
        ArrayList <Integer> main_mx= new ArrayList<>(); //main matrix

        ArrayList <Integer> mx_a = new ArrayList<>();
        mx_a.add(1);
        mx_a.add(3);
        mx_a.add(5);
        
        ArrayList <Integer> mx_b = new ArrayList<>();

        mx_b.add(2);
        mx_b.add(4);
        mx_b.add(6);

        main_mx.add(mx_a);
        main_mx.add(mx_b);

        System.err.println(main_mx);

    }
}