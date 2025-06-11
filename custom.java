 class Myprintstream {

public  void MyPrintln ( String message){
System.out.println(message);

}
}



 class Mysystem {
public static final Myprintstream Myout = new Myprintstream();


}








public class custom {
public static void main (String [] args){
Mysystem.Myout.MyPrintln("hello g");

}
}
