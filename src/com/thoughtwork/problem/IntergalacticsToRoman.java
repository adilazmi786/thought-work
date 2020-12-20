package com.thoughtwork.problem;

import java.util.HashMap;
import java.util.Map;

public class IntergalacticsToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input = "glob prok Silver";

		ConversionCreditImpl conversionCreditImpl = new ConversionCreditImpl();

		System.out.println(conversionCreditImpl.findCreditInDecimal(input.split(" ")));

	}

}
