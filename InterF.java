/*
// to implement multiple inheritance interface is used , multiple inheritance stands for multiple parents a feature to one child

//interface--we can not make a obj of interface

//it has variable which are by default public ,static , final

//and function are public ,abstract with no body ,but if we make a function is static we can make its body

//it can be accessed using child class

// if we want to extend the interface we use extend keyword but if we want to implement the interface in the class we use implements keyword place of extends

//in interface there is no constructor as constructor work is generally to assign value but in interface variable are by default final , so there is no need dof constructor.
*/

interface i1{
int x =6;
void f1();
static void f2(){
System.out.println(x);
}
}

interface i2 extends i1{
int x=9;
int y =2;
void f3();

static void f2(){
System.out.println(x);
}

//static function do not inherit we have to rewrite them,but static variable do inherit and also override

}
class c1 implements i2{
public void f1(){}
public  void f3(){}

static void f2(){
System.out.println(x);
}
}

 class InterF{
public static void main(String[] args)
{
i2.f2();
c1 C1 = new c1();
System.out.println(C1.y);
c1.f2();
i1.f2();


}
}