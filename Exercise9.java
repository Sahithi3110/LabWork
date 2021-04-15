package com.cg.lab3;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Exercise9 {

	public static void main(String[] args) {
		LocalDate dateBefore = LocalDate.of(1998, Month.SEPTEMBER, 10);
		LocalDate date=LocalDate.now();
		long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, date);
		long noOfMonthsBetween=ChronoUnit.MONTHS.between(dateBefore, date);
		long noOfYearsBetween=ChronoUnit.YEARS.between(dateBefore, date);
		System.out.println("Days: "+noOfDaysBetween+" Months: "+noOfMonthsBetween+" Years: "+noOfYearsBetween);		

	}

}
