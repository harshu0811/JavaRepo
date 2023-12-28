package com.assign;

public class ExtractAndAdd {
	public static void main(String[] args) {
	     String input = "ELF44AND45JAVASELENIUM2023";
	     int sum = extractAndSumNumbers(input);
	     System.out.println("Sum of numbers: " + sum);
	}

	    public static int extractAndSumNumbers(String input) {
	        int sum = 0;
	        String currentNumber = "";
	        boolean flag = false;

	        for (char c : input.toCharArray()) {
	            if (Character.isDigit(c)) {
	                flag = true;
	                currentNumber +=c;
	            } else if (flag) {
	                sum += Integer.parseInt(currentNumber);
	                currentNumber = "";
	                flag = false;
	            }
	        }

	        if (flag) {
	            sum += Integer.parseInt(currentNumber);
	        }

	        return sum;
	    }
}
