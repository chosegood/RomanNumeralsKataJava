package com.hosegood.kata.romannumerals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void testZero() {
		assertEquals("", RomanNumerals.convert(0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testNegativeNumber() {
		RomanNumerals.convert(-1);
	}

	@Test
	public void testSymbols() {
		assertEquals("I", RomanNumerals.convert(1));
		assertEquals("V", RomanNumerals.convert(5));
		assertEquals("X", RomanNumerals.convert(10));
		assertEquals("L", RomanNumerals.convert(50));
		assertEquals("C", RomanNumerals.convert(100));
		assertEquals("D", RomanNumerals.convert(500));
		assertEquals("M", RomanNumerals.convert(1000));
	}

	@Test
	public void testAdditions() {
		assertEquals("II", RomanNumerals.convert(2));
		assertEquals("III", RomanNumerals.convert(3));
		assertEquals("VI", RomanNumerals.convert(6));
		assertEquals("VII", RomanNumerals.convert(7));
		assertEquals("VIII", RomanNumerals.convert(8));
		assertEquals("XXVII", RomanNumerals.convert(27));
		assertEquals("CD", RomanNumerals.convert(400));
	}

	@Test
	public void testSubtractions() {
		assertEquals("IV", RomanNumerals.convert(4));
		assertEquals("IX", RomanNumerals.convert(9));
		assertEquals("XL", RomanNumerals.convert(40));
		assertEquals("XLIV", RomanNumerals.convert(44));
		assertEquals("XLIX", RomanNumerals.convert(49));
		assertEquals("CDXLIV", RomanNumerals.convert(444));
	}

}
