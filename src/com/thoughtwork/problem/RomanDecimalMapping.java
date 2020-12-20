package com.thoughtwork.problem;

import java.util.HashMap;
import java.util.Map;

public class RomanDecimalMapping {
	Map<Character, Integer> getRomanToDecimalMapping() {
		Map<Character, Integer> romanToDecimalMapping = new HashMap<>();

		romanToDecimalMapping.put('I', 1);
		romanToDecimalMapping.put('V', 5);
		romanToDecimalMapping.put('X', 10);
		romanToDecimalMapping.put('L', 50);
		romanToDecimalMapping.put('C', 100);
		romanToDecimalMapping.put('D', 500);
		romanToDecimalMapping.put('M', 1000);
		return romanToDecimalMapping;
	}
}
