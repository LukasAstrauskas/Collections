import hashMap.TasksHashMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class tasksHashMapTest {

    TasksHashMap<Integer, String> tHM = new TasksHashMap<Integer, String>();
    HashMap<Integer, String> map = new HashMap<>();
    HashMap<Integer, String> map2 = new HashMap<>();
    HashMap<Integer, String> map3 = new HashMap<>();
    HashMap<Integer, String> map4 = new HashMap<>();
    @BeforeEach
    void putValuesToMaps() {
        map.put(3, "Gerald");
        map.put(0, "Jenn");
        map.put(4, "Jaskir");

        map2.put(2, "Jinn");
        map2.put(1, "Villager");

        map3.put(3, "Gerald");
        map3.put(0, "Jenn");
        map3.put(4, "Jaskir");
        map3.put(2, "Jinn");
        map3.put(1, "Villager");

        map4.put(6, "Rocky");
        map4.put(7, "Greg");

    }



    @Test
    void testCountSize3() {
        assertEquals(2, tHM.countSize(map4));
    }

    @Test
    void testAddKeyValueToHashMap0() {
        String johan = tHM.addKeyValueToHashMap(1, "Johan", map);
        assertEquals("New val", johan);
    }

    @Test
    void testAddKeyValueToHashMap1() {
        String mike = tHM.addKeyValueToHashMap(0, "Mike", map);
        assertEquals("Jenn", mike);
    }

    @Test
    void testAddKeyValueToHashMap2() {
        String johan = tHM.addKeyValueToHashMap(1, "Johan", map);
        String mike = tHM.addKeyValueToHashMap(1, "Mike", map);
        assertEquals("Johan", mike);
    }

    @Test
    void testCountSize() {
        map.put(1, "Gerald");
        map.put(2, "Jenn");
        assertEquals(5, tHM.countSize(map));
    }

    @Test
    void testCountSize2() {
        assertEquals(3, tHM.countSize(map));
    }

    @Test
    void copyAll1() {
        assertEquals(map, tHM.copyAll(new HashMap<>(), map));

    }

    @Test
    void copyAll2() {
        assertEquals(map, tHM.copyAll(map, map2));
    }

    @Test
    void removeAll() {
        HashMap<Integer, String> clearMap = tHM.removeAll(map);
        assertEquals(new HashMap<>(), clearMap);
    }

    @Test
    void removeAll2() {
        HashMap<Integer, String> clearMap = tHM.removeAll(map);
        assertTrue(clearMap.isEmpty());
    }


}