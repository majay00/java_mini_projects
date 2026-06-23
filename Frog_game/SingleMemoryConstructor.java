import java.util.Scanner;
class SingleMemoryConstructor{
 SingleMemoryConstructor(byte b){ 
   System.out.println("1st constructor and its parameter value "+b);
 }
 SingleMemoryConstructor(short sh){ 
   this(1);
   System.out.println("2nd constructor and its parameter value "+sh);
 }
 SingleMemoryConstructor(int a){ 
   this(45);
   System.out.println("3rd constructor and its parameter value "+a);
 }
 SingleMemoryConstructor(long l){
    this(8976);
   System.out.println("4th constructor and its parameter value "+l);
 }
 SingleMemoryConstructor(float f){ 
   this(6301917182);
   System.out.println("5th constructor and its parameter value "+f);
 }
 SingleMemoryConstructor(double d){ 
   this(3.90f);
   System.out.println("6th constructor and its parameter value "+d);
 }
 SingleMemoryConstructor(char ch){ 
   this(23.00009);
   System.out.println("7th constructor and its parameter value "+ch);
 }
 SingleMemoryConstructor(boolean bool){ 
   this('m');
   System.out.println("8th constructor and its parameter value "+bool);
 }
 public static void main(String[] args){
   new SingleMemoryConstructor(true);
 }
}
