
abstract class Base {

    public int i, j;

    public int Addition(int No1, int No2) {
        return No1 + No2;
    }

    public abstract int Sub(int No1, int No2);
}

class Derived extends Base {

    public int x;

    public int Sub(int No1, int No2) {
        return No1 - No2;
    }

    public int Mul(int No1, int No2) {
        return No1 * No2;
    }

}

class AbstractDemo {
    public static void main(String[] A) {

        Base dobj= new Derived();
        int ret;

        ret=dobj.Addition(11, 10);
        System.out.println(ret);

        ret=dobj.Sub(11, 10);
        System.out.println(ret);

        ret=dobj.Mul(11, 10);
        System.out.println(ret);


    }
}
