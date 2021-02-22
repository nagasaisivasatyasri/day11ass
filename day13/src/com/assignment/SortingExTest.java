package com.assignment;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

class SortingExTest {
	ArrayList list=new ArrayList();
	SortingEx e=new SortingEx();
	
	list.add(2);
	list.add(53);
	list.add(30);
	list.add(8);

	@Test
	
	void testMin() {
		assertEquals(8,e.min(list),"It is not the minimum ");
	}

	@Test
	void testMax() {
		assertEquals(53, e.max(list),"It is not the maximum ");

	}

	@Test
	void testSort() {
		List l1=new ArrayList();
		l1.add(34);
		l1.add(45);
		l1.add(34);
		l1.add(2);

		Collections.sort(l1);
		assertEquals(l1,((List<Integer>) e).sort(list),"Its not correct order");
	
	}
}
