package com.nt.test;

import java.util.Date;

import com.nt.beans.Utility;

public class Test {

	public static void main(String[] args) {
		
		Utility utility = new Utility();
		Date sysDate = utility.getSysDate();
		System.out.println(sysDate);
	}
}
