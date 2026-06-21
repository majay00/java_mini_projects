import java.util.Scanner;
class Spotify{
  static Scanner sc=new Scanner(System.in);
  String user_id=sc.next();
  String password=sc.next();
  String userid;
  String pas;
  void moblie(){
    while(true){
     System.out.println("Enter lock for unlocking mobile (HINT:-password 1)");
     int key=sc.nextInt();
     if(key==1){
       System.out.print("phone unlocked");
       break; 
     }
     
    }
  }
  static void app(String apps){
     if(apps.equals("PlayStore")){
       System.out.println("PlayStore Opened");
       System.out.println("Error 404");
       System.out.println("Server issue try other apps");
       app(sc.next());
     }
     else if(apps.equals("Chrome")){
       System.out.println("---------Chrome Opened---------");
       System.out.println("Error 404"); 
       System.out.println("Server issue try other apps");
       app(sc.next());
     }
     else if(apps.equals("Phonepe")){
       System.out.println("---------Phonepe Opened---------");
       System.out.println("Error 404");
       System.out.println("Server issue try other apps");
       app(sc.next());
     }
     else if(apps.equals("Spotify")){
       System.out.println("---------Spotify Opened-----------");
     }
     else if(apps.equals("Linkedin")){
       System.out.println("---------Linkedin Opened---------");
       System.out.println("Error 404");
       System.out.println("Server issue try other apps");
       app(sc.next());
     }
     else if(apps.equals("Youtube")){
       System.out.println("---------Youtube Opened---------");
       System.out.println("Error 404");
       System.out.println("Server issue try other apps");
       app(sc.next());
     }
     else{
       System.out.println("NOT FOUND");
     }
  }
  void authorize(int n){
   if(n==1){
     System.out.println("USER="+user_id);
     System.out.println("PASSWORD="+password);
     System.out.println("-------SIGN Completed-------");
   }
   else if(n==2){
     System.out.println("ENETR USERID && PASSWORD");
     userid=sc.next();
     pas=sc.next();
     if(user_id.equals(userid) && password.equals(pas)){
     System.out.println("USER="+user_id);
     System.out.println("PASSWORD="+password);
     System.out.println("-------LOGIN Completed-------");
   }
  }
  }
  String s1="Endhuko pichi pichi";
  String s2="kissik";
  String s3="yela yela";
  String s4="pilla raa";
  String s5="jorse";
  String s6="A vachi b pai";
  String s7="gundu sudhi";
  String s8="rana kumbha";
  String s9="massa massa";
  String s10="sarkaru raa";
  String s11="aaya sher";
  String s12="billa";
  void myplaylist(){
   System.out.println("List of my playlist songs");
   System.out.println("1."+s1);
   System.out.println("2."+s11);
   System.out.println("3."+s6);
   System.out.println("4."+s8);
   System.out.println("5."+s4);
   System.out.println("6."+s2);
  }
  void mass(){
    System.out.println("List of mass songs");
    System.out.println("1."+s8);
    System.out.println("2."+s9);
    System.out.println("3."+s10);
    System.out.println("4."+s11);
  }
  void melody(){
    System.out.println("List of melody songs ");
    System.out.println("1."+s1);
    System.out.println("2."+s3);
    System.out.println("3."+s7);
  }
  void floder(int n){
    if(n==1){
      myplaylist();
    }
    else if(n==2){
      mass();
    }
    else if(n==3){
      melody();   
    }
    else if(n==4){
     System.out.println("Enter which song you want");
     String song=sc.nextLine();
     String[] songs={s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12};
     int count=0;
     for(int i=0;i<songs.length;i++){
        if(song.equals(songs[i])){
          System.out.println("song Found="+songs[i]);
          count++;
        }
     }
     if(count==0){
        System.out.print("Not found");
     }
   }
  }
 Spotify(){
   moblie();
   System.out.println("1.Playstore");
   System.out.println("2.Chrome");
   System.out.println("3.Phonepe");
   System.out.println("4.Spotify");
   System.out.println("5.Linkedin");
   System.out.println("6.Youtube");
   System.out.println("Enter which app to open");
   String a=sc.next();
   app(a);
   System.out.println("SIGNING   enter 1");
   System.out.println("LOGIN enter 2");
   System.out.println("ENTER 1 OR 2");
   int q=sc.nextInt();
   authorize(q);
   System.out.println("Myplaylist  enter 1");
   System.out.println("Mass playlist enter 2");
   System.out.println("Melody playlist enter 3");
   System.out.println("Search opition eneter 4");
   System.out.println("Enter which folder song you want");
   int n=sc.nextInt();
   sc.nextLine();
   floder(n);
}
 public static void main(String[] args){
  new Spotify();
 }
}