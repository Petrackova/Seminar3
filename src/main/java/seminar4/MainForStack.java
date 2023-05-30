package seminar4;

public class MainForStack {
    public static void main(String[] args) {
        Task1 stak = new Task1();
        stak.push(4);
//        stak.push(4).push(2).push(8).push(1).push(12);
        //       System.out.println(stak.size());
        //       System.out.println(stak.getCapacity());
        //       System.out.println(stak.peek());
        //      System.out.println(stak.size());
        System.out.println(stak.pop());
        System.out.println(stak.size());
        System.out.println(stak.pop());


    }
}
