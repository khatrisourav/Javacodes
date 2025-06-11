public class gabageja {

int x ;
String name ;

gabageja(int x , String name ){

this.x=x;
this.name=name;
}


public static void main (String [] args){

gabageja one = new  gabageja(23,"Sourav");
System.out.println("hey"+one.x);
one = null;
System.out.println("hey"+one.x);

}


}
