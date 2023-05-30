package seminar4;

import java.util.*;

public class Task2 {
    private static final Deque<String> strings = new ArrayDeque<>(); // Stack

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        while (true) {
            String in = prompt();
            if (in.equalsIgnoreCase("q")) System.exit(0);

            if (in.equalsIgnoreCase("print")) {
                System.out.println(strings);
            }

            else if (in.equalsIgnoreCase("revert")) {
                strings.pop();
                System.out.println(strings);
            } else {
                strings.push(in);
            }
        }
    }

    private static String prompt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
}