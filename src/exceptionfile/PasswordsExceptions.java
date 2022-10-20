package exceptionfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PasswordsExceptions {

	public static void main(String[] args) throws NoNumberException {

//		 Verify that the password contains all of the following criteria:
		String filename = "C:\\Users\\jemel\\OneDrive\\Documents\\Passwords.txt";
		File file = new File(filename);
		String[] password = new String[6];

		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
//			read the file

			for (int i = 0; i < password.length; i++) {
				password[i] = br.readLine();
			}
			

		} catch (FileNotFoundException e) {
			System.out.println("ERROR: Cannot find file.");
		} catch (IOException e) {
			System.out.println("ERROR: Could not read file.");
		}
		

	}

}
