package telran.util.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.util.Map;
import telran.util.Map.Entry;
import telran.util.Set;
import telran.util.Collection;

abstract class AbstractMapTest {
    protected Map<Integer, Integer> map;
    Integer[] keys = { -20, 10, 1, 100, -5 };
    Integer[] values = { 200, 1000, 10, 1000, -50 };

    @BeforeEach
    void setUp() {
        for (int i = 0; i < keys.length; i++) {
            map.put(keys[i], values[i]);
        }
    }

    @Test
    void testPutAndGet() {
        assertEquals(10, map.put(1, 10));
        assertEquals(10, map.get(1));
    }

    @Test
    void testRemove() {
        assertEquals(1000, map.remove(100));
        assertNull(map.remove(300));
    }

    @Test
    void testKeySet() {
        Set<Integer> keys = map.keySet();
        assertTrue(keys.contains(10));
    }

    @Test
    void testEntrySet() {
        Set<Entry<Integer, Integer>> entries = map.entrySet();
        assertEquals(5, entries.size());
        assertTrue(entries.contains(new Entry<>(1, 10)));
    }

    @Test
    void testValues() {
        Collection<Integer> values = map.values();
        assertTrue(values.contains(1000));
    }

    @Test
    void testGetOrDefault() {
        assertEquals(1000, map.getOrDefault(10, 0));
        assertEquals(0, map.getOrDefault(300, 0));
    }

    @Test
    void testPutIfAbsent() {
        assertEquals(200, map.putIfAbsent(-20, 999));
        assertNull(map.putIfAbsent(300, 30));
        assertEquals(30, map.get(300));
    }
}
