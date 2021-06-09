package examples.override;

interface Ab {
    default int ab(){
        return 1;
    }
}
interface Ac {
    int ab();
}
abstract class Abs{
    abstract int ab();
    int ab(int a){
        return a;
    }
}
class Child2 extends Abs implements Ab,Ac{

    @Override
    public int ab() {
        return 2;
    }
}
class Child1 extends Abs implements Ab,Ac{
    @Override
    public int ab() {
        return 1;
    }
}
class Test {
    public static void main(String[] args) {
        Ab ab = new Child2();
        Ac ac =(Ac)ab;
        System.out.println(ac.ab());
        Abs abs =(Abs)((Ac) new Child1());
        Child1 child1= (Child1) abs;
        Child2 child2 =(Child2) abs;//Exception
        Abs abs1 =child2;
        System.out.println(abs1.ab());
    }
}
