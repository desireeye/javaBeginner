//private member access lecture

class Demo {
private int y;
private static int x;

//for non static function

void fun1(){
x= 22;
y=5;
}
void fun2(){
System.out.println(y);

}
void fun3(){
x=45;
}

//for static function 
static void fun4(){
x= 5;
System.out.println(x+4);
}

}
class Jasmine{
public static void main(String[] args){
Demo d1= new Demo();
Demo d2 = new Demo();

d1.fun1();
d1.fun3();
d1.fun2();
d2.fun2();
Demo.fun4();
}
}