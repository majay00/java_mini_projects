import java.util.Scanner;
class NearestPrimeNumber{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter which number we want know nearest prime number");
  int n=sc.nextInt();
  int a=0,b=0;
  for(int i=n+1; ;i++){
   int fc=0;
   for(int j=1;j<=i;j++){
    if(i%j==0){
       fc++;
     }
   }
   if(fc==2){
     a=i;
     break;
   }
  }
  for(int i=n-1;i>=2;i--){
    int fc=0;
    for(int j=1;j<=i;j++){
      if(i%j==0){
        fc++;
      }
    }
    if(fc==2){
      b=i;
      break;
    }
  }
  if(a-n<n-b){
    System.out.print("nearest prime number of "+n+" is="+a);
  }
  else if(a-n>n-b){
   System.out.print("nearest prime number of "+n+" is"+b);
  }
  else{
   System.out.print(a+" and "+b+" both are nearest prime number for "+n);
  }
 }
}