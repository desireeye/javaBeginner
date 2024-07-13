//inheritance using constructor
//inheritance type of 3 types
//single-jab ek class ki help se ek dusri class bna di jaye,
//multilevel-a class and b extends a and c etends b ,
//hierarchial-sam class, vivo extnds sam and oppo extends sam
//multiple inhertance can be achieved using interface,are static , final, public by default
//hybrid mix two types
/*
class Nokia1{  //parents /super /base class as it gives its feature to other class
int mic;
int speaker;
int radio;
void setData(){

}
void display(){

}

}

class Nokia2 extends Nokia1{//child class
int sensor;
int music;
void f1(){}
void f2(){}
}

class Inherit{
public static void main(String[] args){
Nokia1 n1= new Nokia1();
Nokia2 n2 = new Nokia2();
n1.f();
n
}
}*/




class Nokia1{  //parents /super /base class as it gives its feature to other class
int x,y;

void f1(){
System.out.println("Parent function 1  got executed ");
}
void f2(){
System.out.println("Parent function 2 got executed ");

}

}

class Nokia2 extends Nokia1{//child class
int z;
void f3(){
System.out.println("child function 1 got executed ");

}

class Inherit{
public static void main(String[] args){
Nokia2 n1= new Nokia2();
n1.f1();
n1.f2();
n1.f3();
}
}
