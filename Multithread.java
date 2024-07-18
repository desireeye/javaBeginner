/*multithreading-- multiple process ko ek saath chalna 

there are two ways to implement multiple threading
1--using runnable interface 
2--using thread class

1a--we cannot make obj of a interface to run we have to make a class,but we can make reference variable

with the help reference variable 
 interface Demo{
int x= 6;
void f1();

}

class Box implements Demo{
public void f1(){

}

}
class Multithread{
Demo d1 = new Box();

// here we cannot call the member of the child class 
cuz the situation is like parent is telling  abt what they know they donot know there new functions


System.out.println(d1.x);
}

already created thread class is there in java
so it looks like
class Thread{
Thread(Runnable r1){//its a constructor //runnable is  basically is a interface., which can be put into a thread

}
}
*/
//1a--


class Process1 implements Runnable{
public void run(){

//in runnable interface there is a abstract fucntion which need s to be override that is run function


int i;
for (i=1;i<=10;i++){
System.out.println("Process 1 :"+i);
}}
}
class Process2 implements Runnable{
public void run(){
int i;
for (i=1;i<=10;i++){
System.out.println("Process 2 :"+i);
}}
}

class Multithread{
public static void  main(String[] args){
Process1  p1= new Process1();
Process2  p2= new Process2();
Thread t1= new Thread(p1);
Thread t2= new Thread(p2);
t1.start();
t2.start();
}
}
