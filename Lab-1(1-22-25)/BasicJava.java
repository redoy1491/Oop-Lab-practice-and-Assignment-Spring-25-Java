import java.util.*;

public class BasicJava {
  
  static void Sum(int[] arr){
    int sum=0;
    for(int i=0; i<arr.length; i++){
        sum+=arr[i];
      }
      System.out.println("Sum : "+sum);
      System.out.println("Avg : "+sum/arr.length);
  }
  static void even(int[] arr){
    System.out.print("Even Number : ");
    for(int i=0; i<arr.length; i++){
      if(arr[i]%2==0)
      System.out.print(arr[i]+" ");
    }
  }
  
  static void odd(int[] arr){
    System.out.print("\nOdd Number : ");
    for(int i=0; i<arr.length; i++){
      if(arr[i]%2!=0)
      System.out.print(arr[i]+" ");
    }
  }
  static void print_multiplication_table(int a){
    System.out.println("Multiplication Table : ");
    for(int i=1; i<=10; i++){
      System.out.println(i+"x"+a+"="+(a*i));
    }
  }
  
  static void sum_of_100(){
    int sum=0;
    for(int i=1; i<=100; i++){
      sum+=i;
    }
    System.out.println("\nSum of 1 to 100 : "+sum);
  }
  static void  find_the_largest_Number(int a,int b,int c){
    if(a>b && a>c)
    System.out.println("Largest Number : "+a);
    else if(b>a && b>c)
    System.out.println("Largest Number : "+b);
    else
    System.out.println("Largest Number : "+c);
  }
   static void prime_number(int a){
     int flag=0;
     for(int i=2; i<a/2; i++){
       if(a%i==0)
       flag=1;
     }
     if(flag==0)
     System.out.println(a+" is prime Number");
     else 
     System.out.println(a+" is not prime Number");
   }
  
    public static void main(String[] args) {
      int[] arr = {5,7,8,11,17,40};
      Sum(arr);
      even(arr);
      odd(arr);
      sum_of_100();
      print_multiplication_table(25);
      find_the_largest_Number(7,11,2);
      prime_number(12);
  }
  
}