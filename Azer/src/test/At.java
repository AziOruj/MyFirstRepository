package test;

 abstract class Animal {
     abstract String getName();
}
 abstract class  BigCat extends Animal {
      abstract void abc();

    public String getName() {
        return null;
    }
}
 class Lion extends BigCat {

     public String getName() {
         return "aZER";
     }
    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }

     public static void main(String[] args) {
         String a= new Lion().getName();
         System.out.println(a);
     }


     void abc() {
         System.out.println("Azer");
     }
 }