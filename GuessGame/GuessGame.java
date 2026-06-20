import java.util.Random;
import java.util.Scanner;
class GuessGame{  
  static Scanner sc=new Scanner(System.in);
  static Random rand=new Random();
  static int com_guess=rand.nextInt(100);
  static int p1=0,p2=0;
  static void rules(){
   while(true){
      System.out.print("p1=");
      int my_guess=sc.nextInt();
      if(my_guess==com_guess){
        System.out.println("Congrats,p1 won the game");
        p1+=1;
        System.out.println("Totals points:\np1="+p1+"\np2="+p2);
        break;
      }
      else if(my_guess<com_guess){
       System.out.println("more");
      }
      else if(my_guess>com_guess){
       System.out.println("less");
      }
      else{
       System.out.println("invalid number");
       break; 
      }
      System.out.print("p2=");
      my_guess=sc.nextInt();
      if(my_guess==com_guess){
        System.out.println("Congrats,p2 won the game");
        p2+=1;
        System.out.println("Totals points:\np1="+p1+"\np2="+p2);
        break;
      }
      else if(my_guess<com_guess){
       System.out.println("more");
      }
      else if(my_guess>com_guess){
       System.out.println("less");
      }
      else{
       System.out.println("invalid number");
       break; 
      }

    }
   }
  static void results(){
    if(GuessGame.p1<GuessGame.p2){
         System.out.println("Totals points:\np1="+p1+"\np2="+p2+"\nWINNER IS P2");
       }
       else if(GuessGame.p1>GuessGame.p2){
         System.out.println("Totals points:\np1="+p1+"\np2="+p2+"\nWINNER IS P1");
       }
       else{
         System.out.println("Totals points:\np1="+p1+"\np2="+p2+"\nGAME IS TIE");
       }

  }
  public static void main(String[] args){
    System.out.println("Welcome to game");
    int rounds=1;
    GuessGame.rules();
    while(true)
   { 
    System.out.println("you want continue game enter yes/no");
    char ch=GuessGame.sc.next().charAt(0);
    if(ch=='y'){
       System.out.println("=====NEW ROUND=====");
       rounds+=1;
       com_guess=rand.nextInt(100);
       GuessGame.rules();
    }
    else if(ch=='n'){
       System.out.println("TOTALS ROUNDS="+rounds);
       GuessGame.results();
       System.out.println("thank you for playing this game.Have a nice day");
       break;
    }
    else{
       System.out.println("invalid! Exit from game");
       System.out.println("TOTALS ROUNDS="+rounds);
       GuessGame.results();
       break; 
        }
   }
  }
}