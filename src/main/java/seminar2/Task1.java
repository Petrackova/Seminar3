package seminar2;
/*Дано четное число N (>0) и символы c1 и c2.
Написать метод, который вернет строку длины N,
которая состоит из чередующихся символов c1 и c2, начиная с c1.*/
public class Task1 {
    private static String one = "c1";
    private static String two = "c2";
    public static String findString(int number) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < number; i++) {
            if ((i%2) == 0) {
                builder.append(one);
            }
            else {
                builder.append(two);
            }
        }
        return builder.toString();
    }
}
