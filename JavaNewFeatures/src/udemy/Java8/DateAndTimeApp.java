package udemy.Java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateAndTimeApp {
	
	final static DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

	public static void main(String[] args) {
		beforJava8();
		afterJava8();

	}

	private static void beforJava8() {
		Date currDate = new Date();
		
		System.out.println("Aktuelles Datum vor Java 8: " + currDate);
		
	}

	private static void afterJava8() {
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDT = LocalDateTime.now();
		
		System.out.println("Aktuelles Datum nach Java 8: " + localDate);
		System.out.println("Aktuelle Zeit nach Java 8: " + localTime);
		System.out.println("Aktuelle Datum und Zeit nach Java 8: " + localDT);
		
		System.out.println("Aktuelles Jahr nach Java 8: "+ localDate.getYear());
		System.out.println("Aktueller Monat nach Java 8: "+ localDate.getMonth());
		System.out.println("Aktueller Wochentag nach Java 8: "+ localDate.getDayOfWeek());
		System.out.println("Aktueller Tag im Monat nach Java 8: "+ localDate.getDayOfMonth());
		System.out.println("Aktueller Tag im Jahr nach Java 8: "+ localDate.getDayOfYear());
		System.out.println("---------------------------------");
		System.out.println("Aktuelle Sekunde nach Java 8: " + localTime.getSecond());
		System.out.println("Aktuelle Minute nach Java 8: " + localTime.getMinute());
		System.out.println("Aktuelle Stunde nach Java 8: " + localTime.getHour());
		
		LocalDate heiligAbend = LocalDate.of(localDate.getYear(), Month.DECEMBER, 24);
		LocalTime feierAbend = LocalTime.of(18, 00, 00);
		LocalDateTime bescherung = LocalDateTime.of(heiligAbend, feierAbend);
		
		if(localDate.isBefore(heiligAbend)) {
			System.out.println("Heilig Abend kommt noch");
		}else {
			System.out.println("Heilig Abend war schon");
		}
		
		if(localDate.isAfter(heiligAbend)) {
			System.out.println("Heilig Abend war schon");
		}else {
			System.out.println("Heilig Abend kommt noch");
		}
		
		if(localDate.isEqual(heiligAbend)) {
			System.out.println("Heute ist heilig Abend");
		}else {
			System.out.println("Heute ist nicht heilig Abend.");
		}
		
		LocalDate ersterFeiertag = heiligAbend.plusDays(1);
		System.out.println("Erster Weihnachtsfeiertag ist am "+ ersterFeiertag);
		
		String zweiterFeiertag = DTF.format(bescherung.plusDays(2));
		System.out.println("Zweiter Weihnachtsfeiertag mit DateTimeFormater: " + zweiterFeiertag);
		
		LocalDateTime ldt = LocalDateTime.parse(zweiterFeiertag,DTF);
		System.out.println("Zweiter Weihnachtsfeiertag wieder zu LocalDateTime geparst: " + ldt);
		
		
	}

}
