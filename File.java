
class File1{
static void fun1(){
System.out.println("A1");

}
static void fun2(){
System.out.println("B2");

}
}
class File{
static void fun1(){
System.out.println("A");
}
static void fun2(){
System.out.println("B");

}
public static void main(String[] args ){
System.out.println("C");
fun1();
fun2();
fun1();
fun2();
File1.fun1();//function with static 
File1.fun2();
}
}