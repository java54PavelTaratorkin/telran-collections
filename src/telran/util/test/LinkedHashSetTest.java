package telran.util.test;

import org.junit.jupiter.api.BeforeEach;

import telran.util.LinkedHashSet;

public class LinkedHashSetTest extends SetTest {
@Override
@BeforeEach
void setUp() {
	collection = new LinkedHashSet<>();
	super.setUp();
}

}
