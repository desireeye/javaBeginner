//package creation in java ,and import it 
//javac -d . Amit.java it is used to create pakage in the directory,also .. used to create //package in root 
// to run a file under a package need to command prompt:- java Package1(this package name).Amit(File name)  or (cd Package1) then java Amit

package Package1;
 public class Amit{ 
 private int x ;
 private int y;
 public void setData(int p,int q){
x=p;
y=q;
}
 public void display(){
System.out.println(x);
System.out.println(y);
}
}