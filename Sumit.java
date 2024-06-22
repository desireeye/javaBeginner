package Package2;
import Package1.*;

// if u want to import all tghe class in the pACKAGE THEN U CAN USE THE *  AND If only any //specific then write the name of the clss 

class Sumit{
public static void main(String []args){
Amit a1 =  new Amit();
a1.setData(5,6);
a1.display();
}
}

//now after compile with javac -d Sumit.java
//then run with command java Package2.Sumit
