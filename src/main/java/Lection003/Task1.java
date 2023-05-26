package Lection003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    public void prim() {
        Object o = 1;
        System.out.println(o.getClass().getName());
        Object a = 1.2;
        System.out.println(a.getClass().getName());
        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.2, 2.2));
        System.out.println(Sum(1, 2.2));
    }

    static Object Sum(Object a, Object b) {
        if ( a instanceof Double && b instanceof Double) {
            return (Object) ((Double) a + (Double) b);
        }
        else if ( a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        }
        else return 0;
    }
    public void prim1() {
        int[] a = new int[] {0,9};
        int[] b = new int[3];
        System.arraycopy(a,0,b,0,a.length);
        for ( int i : a) {
            System.out.printf("%d",i);
        }
        for (int j : b) {
            System.out.printf("%d",j);
        }
    }
    public void prim2() {
        int[] a = new int[] {0,9};
        for (int i : a) {
            System.out.printf("%d",i);
        }
        int item = 1;
        int length = a.length;
        int[] temp = new int[length + 1];
        System.arraycopy(a,0,temp,0,length);
        temp[length] = item;
        for ( int j : a) {
            System.out.printf("%d",j);
        }
    }
    public void prim3() {
        //    ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList list = new ArrayList();
        list.add(2890);
        list.add("string");

        for (Object o : list) {
            System.out.println(o);
        }
    }
    public void prim4() {
        int day = 29;
        int mouth = 9;
        int yers = 1990;
        Integer[] date = {day, mouth, yers};
        List<Integer> d = Arrays.asList(date);
        System.out.println(d);

    }

    public void prim5() {
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder yers = new StringBuilder("1990");
        StringBuilder[] date = new StringBuilder[]{day, month, yers};
        List<StringBuilder> d = Arrays.asList(date);
        System.out.println(d);
        date[1] = new StringBuilder("09");
        System.out.println(d);
    }
    public void prim6() {
        Character value = null;
        //       List<Character> list1 = List.of('s','e','r','g','e','y');
        List<Character> list1 = new ArrayList<Character>();
        list1.add('S');
        list1.add('e');
        list1.add('g');
        System.out.println(list1);
        list1.remove(1);
        System.out.println(list1);
        List<Character> list2 = List.copyOf(list1);
    }
    public void prim7() {
        List<Integer> list = List.of(1,12,123,1234,12345);
        for ( int item : list) {
            System.out.println(item);
        }
        Iterator<Integer> col = list.iterator();
        System.out.println();

        while(col.hasNext()) {
            System.out.println(col.next());
//           col.next();
            //          col.remove();
        }
    }
}