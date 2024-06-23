package telran.util.test;

import org.junit.jupiter.api.BeforeEach;

import telran.util.HashMap;

class HashMapTest extends AbstractMapTest {

    @Override
    @BeforeEach
    void setUp() {
        map = new HashMap<Integer, Integer>();
        super.setUp();
    }

}
