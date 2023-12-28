package com.assign;

import java.util.ArrayList;
import java.util.Collections;

public class Check {
	public static void main(String[] args) {
	     String input = "SADF23HKJ56DR32LOI89WQ472NBM2V1BHU78";
	     String res=extract(input);
	     String[] str=res.split(" ");
	     ArrayList al=new ArrayList<>();
	     for(int i=0;i<str.length;i++) {
	    	 al.add(Integer.parseInt(str[i]));
	     }
	     Collections.sort(al);
	     System.out.println(al);
	}

	    public static String extract(String input) {
	        String res="";
	        String temp= "";
	        boolean flag = false;

	        for (char c : input.toCharArray()) {
	            if (c>='0'&&c<='9') {
	                flag = true;
	                temp +=c;
	            } else if (flag) {
	                res+=temp+" ";
	                temp= "";
	                flag = false;
	            }
	        }

	        if (flag) {
	            res+=temp+" ";
	        }

	        return res;
	    }
	}
