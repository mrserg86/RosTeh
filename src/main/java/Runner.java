// Подсчитать количество всех элементов списка/массива и вернуть ассоциативных массив, где ключ – элемент списка,
// значение – количество этих элементов в списке. Порядок не имеет значения.
// Пример: [1, 3, 4, 5, 1, 5, 4] -> {1 : 2, 3 : 1, 4 : 2, 5 : 2}

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {

        Map<Integer,Long> map = List.of(1,3,4,5,1,5,4).stream().
                collect((Collectors.groupingBy(Function.identity(),Collectors.counting())));

        map.forEach((k,v)->System.out.println(k + ":" + v));

    }

}
