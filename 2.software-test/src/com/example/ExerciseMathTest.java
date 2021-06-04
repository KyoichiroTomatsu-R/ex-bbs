package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ExerciseMathTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testFactorial01() {
		try {
			int ans = ExerciseMath.factorial(-1);
			fail("TC1:��O���������Ȃ���΂Ȃ�܂���");
		} catch (Exception e) {
			assertEquals("�n���ꂽ�l������������܂���", e.getMessage(), "TC1:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�");
		}
	}
	@Test
	void testFactorial02() {
		try {
			int ans = ExerciseMath.factorial(0);
			fail("TC2:��O���������Ȃ���΂Ȃ�܂���");
		} catch (Exception e) {
			assertEquals("�n���ꂽ�l������������܂���", e.getMessage(), "TC2:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�");
		}
	}
	@Test
	void testFactorial03() {
		assertEquals(1, ExerciseMath.factorial(1), "TC3:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�");
	}
	@Test
	void testFactorial04() {
		assertEquals(2, ExerciseMath.factorial(2), "TC4:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�");
	}
	@Test
	void testFactorial05() {
		assertEquals(6, ExerciseMath.factorial(3), "TC5:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�");
	}
	@Test
	void testFactorial06() {
		assertEquals(24, ExerciseMath.factorial(4), "TC6:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�");
	}
	@Test
	void testFactorial07() {
		assertEquals(39916800, ExerciseMath.factorial(11), "TC7:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�");
	}
	@Test
	void testFactorial08() {
		assertEquals(479001600, ExerciseMath.factorial(12), "TC8:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�");
	}
	
	
	@Test
	void testFactorial09() {
		try {
			int ans = ExerciseMath.factorial(13);
			fail("TC9:��O���������Ȃ���΂Ȃ�܂���");
		} catch (Exception e) {
			assertEquals("�n���ꂽ�l������������܂���", e.getMessage(), "TC9:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�");
		}
	}
	@Test
	void testFactorial10() {
		try {
			int ans = ExerciseMath.factorial(14);
			fail("TC10:��O���������Ȃ���΂Ȃ�܂���");
		} catch (Exception e) {
			assertEquals("�n���ꂽ�l������������܂���", e.getMessage(), "TC10:���Ғl�Ǝ��ۂ̌��ʂ��قȂ�܂�");
		}
	}
}
