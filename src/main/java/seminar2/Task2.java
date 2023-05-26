package seminar2;

import java.io.FileWriter;
import java.io.IOException;

/* Напишите метод, который составить строку из 100 повторений слова ТEST и метод
который запишет этот метод с исключениями
 */
public class Task2 {

    public static void write(){
        String str = createString();
        System.out.println(str.length());
        try (FileWriter writer = new FileWriter("work.txt");) {
            writer.write(str);
        } catch (IOException e) {
            throw new ErrorExeption(e.getMessage());
        }
    }
    private static String createString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <= 100 ; i++) {
            builder.append("\nTEST");
        }
        return builder.toString();
    }
}
