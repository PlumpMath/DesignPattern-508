package test;

/**
 * Created by zjy on 2017/3/30.
 */
public class testAll {
    public static void main(String[] args ){

        sup s= new sub();
        s.pt();

    }
}


class sub extends sup{
    int i=3;
    public void pt(){
        super.i =1;
        System.out.println("sub+"+super.i);


    }
}
class sup {
     protected int i =0;
     public void pt(){
        System.out.println("sup"+i);


    }



}
