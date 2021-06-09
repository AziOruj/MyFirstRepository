package expetion;

import java.io.IOException;

public class Parent {
    public  void abc() throws Throwable{

    }
}
class Child extends Parent{

    public static void main(String[] args) {
        Object a =null;
        a.toString();
        System.out.println();
    }


}
 class DoSomething {
 static String a;
class  Abc extends IOException{

   public void abc() throws Throwable{
       throw new IOException() ;
   }
}

 public static void main(String[] args) {
     try {
         System.out.println(a.toString());

     }catch (NullPointerException e){
         System.out.println("a");
         throw e;
     }

 }
 }