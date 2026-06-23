import java.util.*;
class PostionOfPrimeNumber{
  static Boolean isprime(int n){
    if(n==0 || n==1){
      return false;
    }
    for(int i=2;i<=Math.sqrt(n);i++){
      if(n%i==0){
        return false; 
      }
    }
    return true;
  } 
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter which prime positon you want");
   int n=sc.nextInt();
   int count=0;
   for(int i=2;i<=n;i++){
    if(isprime(i)){
      count++;
    }
   }
   if(isprime(n))
   System.out.print(count);
   else
   System.out.print("Given number is not a prime number");
  }
}