package com.dnpass.java.Samples.Day6.Exceptions;

	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;

	public class FileNotFoundExceptionDemo {

		public static void main(String[] args) throws FileNotFoundException {
			// TODO Auto-generated method stub
			try {
			FileReader fd = new FileReader("C:\\Users\\kushul\\Desktop\\java.txt");
			BufferedReader bf = new BufferedReader(fd);
			String line = bf.readLine();
			while(line != null)
			{
			  System.out.println(line);
			  line = bf.readLine();
			}
			}
			catch(FileNotFoundException e) {
			System.out.println("File doesnot exists. "+e);
		}
			catch(IOException e) {
			System.out.println("File is empty.");
		}


			finally{
				System.out.println("Thank you");
			}
		}

}
