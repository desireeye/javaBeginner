/*//abstract class with program and interface--some class cannot be have obj if it have abstract keyword in front of it , now we can make obj of its child class

//we can also make the function abstract as well but it can have body or coding in it

//if a function is abstract  then  the whole class have to be compulsory abstract, now one more problem that the child class will always become the abstract due the member function inherited from he parent is abstract and now child have to be abstract 

/// now to void the problem the method of over riding come in paly the we can make a  new function with same name and we know on calling new one will be executed

//do the abstract parent class have constructor-- yes they do have , and how does it work ,-- it work by child class having the constructor with super keyword which will make the parent constructor work

//now what the reason to make abstract class

*/

abstract class Demo{
int x,y;
void f1(){
x=5;
y=2;
}
abstract void f2();
Demo(){
System.out.println("parent constructor");
}
}


class Demo1 extends Demo{
int z;
void f2(){
z=3;
System.out.println(z);
}
Demo1(){
//super();
System.out.println("child constructor");

}

}

class Abs{
public static void main(String[] args){
Demo1 d1 = new Demo1();
d1.f2();
}
}