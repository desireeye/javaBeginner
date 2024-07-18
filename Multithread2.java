//2a--using thread class

class Process1 extends Thread{
public void run(){

//in runnable interface there is a abstract fucntion which need s to be override that is run function


int i;
for (i=1;i<=10;i++){
System.out.println("Process 1 :"+i);
}}
}
class Process2 extends Thread{
public void run(){
int i;
for (i=1;i<=10;i++){
System.out.println("Process 2 :"+i);
}}
}

class Multithread2{
public static void  main(String[] args){
Process1  p1= new Process1();
Process2  p2= new Process2();
p1.start();
p2.start();

}
}