package rocks.zipcode;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class HashMapTest {
    public class MyKey {
        private int id;

        @Override
        public int hashCode() {
            return id;
        }
    public MyKey(int id) {
        this.id = id;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    }

@Test
    public void HashMapPutTest(){
//    public void whenHashCodeIsCalledOnPut_thenCorrect() {
        MyKey key = new MyKey(1);
        Map<MyKey, String> map = new HashMap<>();
        map.put(key, "val");
    }

    @Test
    public void givenNullKeyAndVal_whenAccepts_thenCorrect(){
        Map<String, String> map = new HashMap<>();
        map.put(null, null);
    }

    @Test
    public void whenContainsDistinguishesNullValues_thenCorrect() {
        Map<String, String> map = new HashMap<>();

        String val1 = map.get("key");
        boolean valPresent = map.containsKey("key");

        assertNull(val1);
        assertFalse(valPresent);

        map.put("key", null);
        String val = map.get("key");
        valPresent = map.containsKey("key");

        assertNull(val);
        assertTrue(valPresent);
    }

    @Test
    public void givenNullVal_whenRetrieves_thenCorrect() {
        Map<String, String> map = new HashMap<>();
        map.put("key", null);

        String val=map.get("key");

        assertNull(val);
    }
    @Test
    public void givenExistingKey_whenPutReturnsPrevValue_thenCorrect() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "val1");

        String rtnVal = map.put("key1", "val2");

        assertEquals("val1", rtnVal);
    }



    @Test
    public void givenNewKey_whenPutReturnsNull_thenCorrect() {
        Map<String, String> map = new HashMap<>();

        String rtnVal = map.put("key1", "val1");

        assertNull(rtnVal);
    }
    @Test
    public void givenNullVal_whenPutReturnsNull_thenCorrect() {
        Map<String, String> map = new HashMap<>();

        String rtnVal = map.put("key1", null);

        assertNull(rtnVal);
    }
    @Test
    public void givenUnmappedKey_whenGetReturnsNull_thenCorrect() {
        Map<String, String> map = new HashMap<>();

        String rtnVal = map.get("key1");

        assertNull(rtnVal);
    }

    @Test
    public void whenHashCodeIsCalledOnGet_thenCorrect() {
        MyKey key = new MyKey(1);
        Map<MyKey, String> map = new HashMap<>();
        map.put(key, "val");
        map.get(key);
    }

    @Test
    public void whenGetWorks_thenCorrect() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "val");

        String val = map.get("key");

        assertEquals("val", val);
    }
//setUp(){}
    //put()
    //get()
    //compute()
    //merge()
    //putIfAbsent
    //getOrDefault()
    //forEach()
}
