package Seminar3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.List;

//Заполнить список десятью случайными числами.
//Отсортировать список методом sort() и вывести его на экран
public class Task1 {
    public void prim1() {
        ArrayList <Integer> array = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            array.add(random.nextInt(11));
        }
        System.out.println(array);
        Collections.sort(array);
        System.out.println(array);
    }
//Заполнить список названиями планет
// Солнечной системы в произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его повторений в списке.
    public void prim2() {
        ArrayList <String> planets = new ArrayList<>();
        planets.add("Земля");
        planets.add("Юпитер");
        planets.add("Земля");
        planets.add("Нептун");
        planets.add("Марс");
        planets.add("Марс");
        ArrayList <String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < planets.size(); i++) {
            if (!result.contains(planets.get(i))) {
                result.add(planets.get(i));
                int count = 0;
                for (int j = 0; j < planets.size(); j++) {
                    if (planets.get(i).equals(planets.get(j))){
                        count ++;
                    }
                }
                sb.append(planets.get(i)).append(" : ").append(count).append(" ");
            }
        }
        System.out.println(sb);
    }
    //Создать список типа ArrayList<String>.
    //Поместить в него как строки, так и целые числа.
    //Пройти по списку, найти и удалить целые числа.
    public void prim3() {
        ArrayList planets = new ArrayList<String>();
 //       ArrayList list = new ArrayList();
        planets.add(1);
        planets.add("Hello");
        planets.add(1.5);
        System.out.println(planets);
        for (int i = 0; i < planets.size(); i++) {
            if ( planets.get(i) instanceof Number) {
                planets.remove(planets.get(i));
            }
        }
        System.out.println(planets);
    }
    //Каталог товаров книжного магазина
    // сохранен в виде двумерного списка List<ArrayList<String>> так,
    // что на 0-й позиции каждого внутреннего списка содержится название жанра,
    // а на остальных позициях - названия книг.
    // Напишите метод для заполнения данной структуры.
    public void prim4() {
        List<List<String>> library = new ArrayList<>();
        List <String> books1 = List.of("проза","Война и мир","Преступление и наказание");
        List <String> books2 = List.of("поэзия","Евгений Онегин","Руслан и Людмила");
        library.add(books1);
        library.add(books2);
        System.out.println(library);
    }

}
