package com.hosegood.kata.romannumerals;

public class RomanNumerals {

	private enum Symbols {
		M(1000), D(500), CD(400), C(100), L(50), XL(40), X(10), IX(9), V(5), IV(
				4), I(1);
		private int arabic;

		private Symbols(int arabic) {
			this.arabic = arabic;
		}
	}

	public static String convert(int number) {
		String result = "";

		if (number < 0) {
			throw new IllegalArgumentException(
					"Unable to convert negative number[" + number + "]");
		}

		if (number == 0) {
			return "";
		}

		for (Symbols symbol : Symbols.values()) {
			while (number >= symbol.arabic) {
				return symbol.toString() + convert(number - symbol.arabic);
			}
		}

		return result;
	}
}
