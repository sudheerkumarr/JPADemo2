package com.example;

import java.util.regex.Pattern;

public class Test {

	public static void main(String[] args) {
		boolean b = Pattern.matches("[0-9]{1,2}||1[0-9]{2}||2[0-2][0-9]||22[0-5]{1}", "230");
		System.out.println(b);

	}

}
