package seminar4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Task1 {
/*   public void prim1() {
       Long after = System.currentTimeMillis();
       ArrayList<Integer> array = new ArrayList<>();
       for (int i = 0; i < 10000; i++) {
           array.add(i);
       }
       System.out.println(array);
       Long before = System.currentTimeMillis();
        System.out.println(after-before);
   }*/
  /*  public void prim2() {
        Long after = System.currentTimeMillis();
        LinkedList<Integer> linkarray = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            linkarray.add(i);
        }
        Long before = System.currentTimeMillis();
        System.out.println(after - before);
    }*/

/**Реализовать консольное приложение, которое:
 Принимает от пользователя строку вида  text:num
 Нужно сделать “сплит” строки по : ,
 сохранить text в связный список на позицию num.
 Если введено print:num,
 выводит строку из позиции num в связном списке и удаляет её из списка.*
 */
 /*   private static LinkedList<String> strings = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);
    public void prim3() {
        System.out.println("Введите строку");
        String input = scanner.next();
        String[] data = input.split(":");
        String str = data[0];
        int index = Integer.parseInt(data[1]);
        if (str.equalsIgnoreCase("print")) {
            System.out.println(strings.get(index));
            strings.remove(index);
            strings.add(index,null);
        }
        else {
            if (index > strings.size()) {
                for (int i = 0; i < index; i++) {
                    strings.add(null);
                }
            }
            strings.add(index, str);
        }*/
    /**
     * Реализовать стэк с помощью массива.
     * Нужно реализовать методы:
     * size(), empty(), push(), peek(), pop(). **/
    private static int[] arr;
    private int top;
    private int capacity;

    public Task1() {
        int value = 3;
        this.arr = new int[value];
        value = capacity;
        top = -1;
    }
    private void addCapacity() {
        int[] copyArr = new int[arr.length + arr.length/2];
        System.arraycopy(arr,0,copyArr,0,arr.length);
        arr = copyArr;
        capacity = copyArr.length;
    }
    /*    public int getCapacity() {
            return capacity;*/
    // }
    public int size() {
        return top+1;
    }
    public boolean empty() {
        return top == -1;
    }
    //stack.add(1).add(2).add(3);
    public Task1 push(int arg) {
        if (isFull()) {
            addCapacity();
        }
        //       top += 1;
        //       arr[top] = arg;
        arr[++top] = arg;
        return this;
    }
    private boolean isFull() {
        return size() ==capacity;
    }
    public int peek() {
        if (empty()) {
            throw new RuntimeException("Стэк пуст");
        }
        else {
            return arr[top];
        }
    }
    public int pop() {
        if (empty()) {
            throw new RuntimeException("Стэк пуст");
        }
        peek();
        return arr[top--];
    }


}