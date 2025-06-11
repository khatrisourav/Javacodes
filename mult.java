class one extends Thread {
public void run () {

for ( int i = 0;i<10;i++)
{

System.out.println("Thread one "+ i );
try {Thread.sleep(500);
}
catch (InterruptedException e) {
            e.printStackTrace();
        }


}
}


}

class two  extends Thread {


public void run(){

for ( int i = 10;i<20;i++)
{

System.out.println("Thread two  "+ i );
try {
Thread.sleep(100);
}
catch (InterruptedException e) {
            e.printStackTrace();
        }


}
}
}







public class mult {


 public static void main (String [] args ){
 
 
 one t1 = new one();
 two t2 = new two();
 
 t1.start();
 t2.start();
 
 
 }
}

