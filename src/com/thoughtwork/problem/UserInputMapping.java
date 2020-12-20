package com.thoughtwork.problem;

import java.util.HashMap;
import java.util.Map;

public class UserInputMapping {

	Map<String, Character> getInputTestMapping() {
		Map<String, Character> inputTestMapping = new HashMap<>();

		inputTestMapping.put("glob", 'I');
		inputTestMapping.put("prok", 'V');
		inputTestMapping.put("pish", 'X');
		inputTestMapping.put("tegj", 'L');
		return inputTestMapping;
	}
}
