class Arti{
int x=1;//instance(object) member variable
int y;//instance(object) member variable
void fun1()//instance(object) member function
{
System.out.println("fun1");

}
void fun2()//instance(object) member function//non static function are called instance/object member variable 

{
System.out.println("fun2");//non static function are called instance/object member variable 

}

}
class Obj1{
public static void main(String[] args){
System.out.println("A");
//we have to create object of class for non static function
Arti a1=new Arti();
Arti a2 = new Arti();
int a =a1.x;
a1.fun1();
System.out.println(a);
System.out.println(a1.y);

int b =a2.x;
a2.fun1();
System.out.println(b+5);
System.out.println(a2.y+b);


}
}