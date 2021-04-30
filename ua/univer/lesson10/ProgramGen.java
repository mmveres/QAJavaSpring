package ua.univer.lesson10;

import java.util.ArrayList;

class TwoTuple<A,B>{
    public final A first;
    public final B second;
    public TwoTuple(A first, B second){
        this.first = first;
        this.second = second;
    }
}


public class ProgramGen {
    public static void main(String[] args) {
        TwoTuple<Integer, Integer > tt = new TwoTuple<>(1,2);
        System.out.println(tt.first.getClass().getName());
        System.out.println(tt.second.getClass().getName());



        ArrayList listObj = new ArrayList();
        listObj.add("A");
        listObj.add(111);
        String value1 = (String)listObj.get(0);
        int value2 = (Integer)listObj.get(1);

        ArrayList<String> listStr = new ArrayList<>();
        listStr.add("A");
       // listStr.add(111);

        String str11 = listStr.get(0);
    }
}
