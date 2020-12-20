package com.thoughtwork.problem;

import java.util.HashMap;
import java.util.Map;

public class ConversionCreditImpl implements Conversion {

	public Double findCreditInDecimal(String[] inputString) {
		// TODO Auto-generated method stub
		RomanDecimalMapping romanDecimalMapping = new RomanDecimalMapping();
		Map<Character, Integer> romanToDecimalMapping = romanDecimalMapping.getRomanToDecimalMapping();

		UserInputMapping userInputMapping = new UserInputMapping();

		Map<String, Character> testInputMapping = userInputMapping.getInputTestMapping();

		CommodityMapping commodityMappingObj = new CommodityMapping();
		Map<String, Double> commodityMapping = commodityMappingObj.getCommodityMapping();

		// TODO Auto-generated method stub
		double updatedCredit = 0;
		for (int i = 0; i < inputString.length; i = i + 2) {
			if (inputString.length == 1 && testInputMapping.containsKey(inputString[i])) {

				System.out.println(testInputMapping.get(romanToDecimalMapping.get(inputString[i])));
				break;
			} else {
				if (i != inputString.length - 1 && testInputMapping.containsKey(inputString[i])
						&& testInputMapping.containsKey(inputString[i + 1])) {
					if (romanToDecimalMapping.get(testInputMapping.get(inputString[i])) >= romanToDecimalMapping
							.get(testInputMapping.get(inputString[i + 1]))) {
						updatedCredit = updatedCredit + romanToDecimalMapping.get(testInputMapping.get(inputString[i]))
								+ romanToDecimalMapping.get(testInputMapping.get(inputString[i + 1]));

					} else {
						updatedCredit = updatedCredit
								+ romanToDecimalMapping.get(testInputMapping.get(inputString[i + 1]))
								- romanToDecimalMapping.get(testInputMapping.get(inputString[i]));
					}
				}
			}
			if (commodityMapping.containsKey(inputString[i])) {
				updatedCredit = updatedCredit * commodityMapping.get(inputString[i]);
			}
		}
		return updatedCredit;
	}

}
