package test;

public abstract class Camel {

    abstract String amelmethod();

    public abstract void swim();

    public static void main(String[] args) {
      final Camel camel = new Camel() {
          @Override
          String amelmethod() {
              return "Azer";
          }

          @Override
          public void swim() {
              System.out.println("Salam");
          }
      };
        System.out.println(camel.amelmethod());
    }
}





