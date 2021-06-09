package examples.override;
interface B {
    void test1();
    default void test2(){
        System.out.println("Interface test2 ");
    }
}
 abstract class A {
   abstract void test1();
   void test2(){
       System.out.println("Abstract test2 ");
   }
}
class Child extends A implements B{

    @Override
    public void test1() {

    }

    @Override
    public void test2() {

    }
}
