import java.util.*;
class RangePrimeNumber{
  static Boolean isprime(int a){
    if(a==0 || a==1){
     return false;
    }
    for(int i=2;i<=Math.sqrt(a);i++){
      if(a%i==0){
       return false;
      }
    }
   return true;
  }
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.print("Enter the Start Number");
   int start=sc.nextInt();
   System.out.print("Enter the End Number");
   int end=sc.nextInt();
   int count=0;
   for(int i=start;i<=end;i++){
     if(isprime(i)){
      System.out.print(i+" ");
      count++;
     }
   }
   if(count==0){
     System.out.print("There is no prime between the given range.");
   }
 }
}
