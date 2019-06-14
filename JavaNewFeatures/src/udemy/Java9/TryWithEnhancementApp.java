package udemy.Java9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithEnhancementApp {
	
	public static void main(String[] args) {
		beforJava9();
		afterJava9();

	}

	private static void beforJava9() {
		try(BufferedReader bur = new BufferedReader(new FileReader(new File("resource/haus.txt")))){
			for(String x = bur.readLine(); x!= null; x = bur.readLine()) {
				System.out.println(x);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void afterJava9() {
		BufferedReader bur;
		try {
			bur = new BufferedReader(new FileReader(new File("resource/haus.txt")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			bur = null;
		}
		final BufferedReader bus = bur;
		try(bus){
			for(String x = bur.readLine(); x!= null; x = bur.readLine()) {
				System.out.println(x);
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}

}
