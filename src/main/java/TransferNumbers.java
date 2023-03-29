import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TransferNumbers {      //Создаем класс

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();    //Создаю Лист
        for (int i = 0; i < 20; i++) {             // С помощью цикла проходимся и заносим числа от 1 до 9 рандомно 20 чисел
            int random = (int) (Math.random() * 9) + 1;
            list.add(random);
        }

        Set<Integer> set = new HashSet<>();        //Создаю хэшсет для сортировки в порядке возрастания и для уникальных чисел
        List<Integer> duplicates = new ArrayList<>();  // Создаю новый лист чтобы запихнуть туда остальные числа
        for (int number : list) {                      // Проходимся по циклу чтобы вывести не попавшие числа  в сет
            if (!set.add(number)) {
                duplicates.add(number);                // Переносим не плпавшие числа в дубликаты
            }
        }

        System.out.println("Original list: " + list);
        System.out.println("Set of unique numbers: " + set);
        System.out.println("List of duplicates: " + duplicates); // вывод не уникальных чисел
        System.out.println( duplicates.size() );
    }
}





