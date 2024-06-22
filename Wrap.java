//important topic

//Wrapper class  are used to make java a oop language

//int Integer here int is data type and Integer is a class, 
//in Integer class ,it includes function like parseInt which is used to convert to integer,it is a static function

//int x = Integer.parseInt("123");


//next is valueOf function which is a static function and it is used to store a object to the reference variable. the refernce variable is of object type.

//Integer x=Integer.valueOf("123");

//next is a intValue which is used to store the called the class.reference variable.. it is not a static type.
 

//int y = x.intValue();

class Wrap{
 public static void main(String [] args){

	int x = Integer.parseInt("123");
	Integer x=Integer.valueOf("1011101","2");
	int y = x.intValue();
	System.out.println(y);
	System.out.println(x);

}

}