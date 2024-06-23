package telran.util.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.util.TreeMap;

class TreeMapTest extends AbstractMapTest {
	TreeMap<Integer, Integer> treeMap;
	
    @Override
    @BeforeEach
    void setUp() {
        treeMap = new TreeMap<Integer, Integer>();
        map = treeMap;
        super.setUp();
    }

    @Test
    void testFirstKey() {
        assertEquals(-20, treeMap.firstKey());
    }

    @Test
    void testLastKey() {
        assertEquals(100, treeMap.lastKey());
    }

    @Test
    void testFloorKey() {
        assertEquals(10, treeMap.floorKey(15));
        assertNull(treeMap.floorKey(-100));
    }

    @Test
    void testCeilingKey() {
        assertEquals(100, treeMap.ceilingKey(99));
        assertNull(treeMap.ceilingKey(101));
    }
}
