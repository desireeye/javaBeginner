//this is used to avoid the situation of same name conflicting , here with help of this keyword  this.x will point towards the x , not the variable
//this is a reference variable which is present in every object ke function m hota h,it refer to the curren tobject

class Example
{
private int x;
private y;
void f1(int x,int y){
this.x= x;
this.y= y;
}
void displpay(){
System.out.println(x);
System.out.println(y);

}
class Example1{
int x,y;
void f3(int x, int y){
super.x=x;  //this super keyword refer to the parents class's x
this.y=y; // this this refer to the current x
}
}
}
class ThisK{
public static void main(String[] args){
Example e1 = new Example();
e1.f1(5,6);
e1.display();
Example2 e2 = new Example2();
e2.x;
}
}