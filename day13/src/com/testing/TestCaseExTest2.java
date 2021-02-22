package com.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCaseExTest2 {
TestCaseEx t=new TestCaseEx();
	@Test
	void testAdd() {
		assertEquals(23,t.add(11, 12),"Something had made wrong");
		//fail("Not yet implemented");
	}

	@Test
	void testMul() {
		assertEquals(22,t.mul(11, 2),"Something had made wrong");

		//fail("Not yet implemented");
	}

}
