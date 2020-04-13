package rocks.zipcode;
import org.junit.Test;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static java.util.stream.Collectors.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class ArrayListTest {
@Test
    public void newEmptyArrayListIsEmpty(){
List<String> list = new ArrayList<>();
    assertTrue(list.isEmpty());}

@Test
    public void checkListSizeAndContainsAllNumbersInStream(){
    Collection<Integer> number
        = IntStream.range(0, 10).boxed().collect(toSet());

    List<Integer> list = new ArrayList<>(number);
    assertEquals(10, list.size());
    assertTrue(number.containsAll(list));
}
@Test
    public void checkItemIsAddedAtSpecifiedIndex(){
    List<Long> list = new ArrayList<>();
    list.add(1L);
    list.add(2L);
    list.add(1, 3L);
    assertThat(Arrays.asList(1L, 3L, 2L), equalTo(list));
}
@Test
    public void addSeveralItemsAtOnceCheckOrder(){
    List<Long> list = new ArrayList<>(Arrays.asList(1L, 2L, 3L));
    LongStream.range(4, 10).boxed()
        .collect(collectingAndThen(toCollection(ArrayList::new), ys -> list.addAll(0, ys)));
    assertThat(Arrays.asList(4L, 5L, 6L, 7L, 8L, 9L, 1L, 2L, 3L), equalTo(list));
}
@Test
    public void useListIteratorToReverseList(){
    List<Integer> list = new ArrayList<>(
    IntStream.range(0, 10).boxed().collect(toCollection(ArrayList::new))
    );
    ListIterator<Integer> it = list.listIterator(list.size());
    List<Integer> result = new ArrayList<>(list.size());
    while (it.hasPrevious()) {
        result.add(it.previous());
    }

    Collections.reverse(list);
    assertThat(result, equalTo(list));
}
@Test
    public void weirdBaeldungTestIsWeird(){
    List<String> list = LongStream.range(0, 16)
        .boxed()
        .map(Long::toHexString)
        .collect(toCollection(ArrayList::new));
    List<String> stringsToSearch = new ArrayList<>(list);
    stringsToSearch.addAll(list);

    assertEquals(10, stringsToSearch.indexOf("a"));
    assertEquals(26, stringsToSearch.lastIndexOf("a"));

    Set<String> matchingStrings = new HashSet<>(Arrays.asList("a", "c", "9"));
    List<String> result = stringsToSearch
        .stream()
        .filter(matchingStrings::contains)
        .collect(toCollection(ArrayList::new));

    assertEquals(6, result.size());
}
//    https://www.baeldung.com/java-arraylist
}
