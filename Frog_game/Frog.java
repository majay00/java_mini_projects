import java.util.Scanner;
class Frog{
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Length of wall");
   int a=sc.nextInt();
   int jump=0,drop=0,count=0;
   if(a==0){
    System.out.println(count);
   }
   else{
   for(int i=0;i<=a;i++){
     jump=drop+3;
     drop=jump-2;
     count++;
     if(a==jump){
       break;
     }
   } 
  System.out.print(count);
 }
 }
}