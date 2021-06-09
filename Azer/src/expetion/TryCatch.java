package expetion;

interface A {
    int groupID = 10;
    default boolean hjghj(Object obj) { // DOES NOT COMPILE
        return this.groupID == ((A) obj).groupID;
    }
    static void print() {
        System.out.println("A");
    }
}



//        try {
//            throw new Exception();
//        } catch (Exception e) {// first catch block
//            throw new Exception();
//        } finally {
//            System.out.println("aaa");
//        }





