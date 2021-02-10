package day11ass.src;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class FileEx {

	public static void main(String[] args) throws IOException {
		try (// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the path");
			String path = s.next();
			File e = new File("H:");
			System.out.println("Enter number of students");
			int n = s.nextInt();
//String dir=s.next();
			System.out.println("Enter student department  to create a directory");
			String dir = s.next();
			for (int i = 0; i < n; i++) {
				switch (dir) {
				case "CSE":
					e.mkdir();
					System.out.println("Enter student name to create a file");
					String filename = s.next();
					// String name=s.next();

					FileOutputStream f = new FileOutputStream(filename + ".txt");
					ObjectOutputStream oos = new ObjectOutputStream(f);
					System.out.println("Enter student name : ");
					String name = s.next();
					System.out.println("Enter student id: ");
					int id = s.nextInt();
					oos.writeBytes(name);
					oos.write(id);
					oos.close();
					f.close();
					break;
				case "ECE":
					e.mkdir();
					System.out.println("Enter student name to create a file");
					String filename1 = s.next();
					FileOutputStream f1 = new FileOutputStream(filename1+".txt");
					ObjectOutputStream oos1=new ObjectOutputStream(f1);
					System.out.println("Enter student name : ");
					String name1=s.next();
					System.out.println("Enter student id: ");
					int id1=s.nextInt();
					oos1.writeBytes(name1);
					oos1.write(id1);
					oos1.close();
					f1.close();
					break;
				case "EEE":
					e.mkdir();
					System.out.println("Enter student name to create a file");
					String filename2 = s.next();
					FileOutputStream f2 = new FileOutputStream(filename2+".txt");
					ObjectOutputStream oos2=new ObjectOutputStream(f2);
					
					System.out.println("Enter student name : ");
					String name2 = s.next();
					System.out.println("Enter student id: ");
					int id2 = s.nextInt();
					oos2.writeBytes(name2);
					oos2.write(id2);
					oos2.close();
					f2.close();
					break;
				case "MECH":
					e.mkdir();
					System.out.println("Enter student name to create a file");
					String filename3= s.next();
					FileOutputStream x = new FileOutputStream(filename3+".txt");
					ObjectOutputStream oos3=new ObjectOutputStream(x);
					
					System.out.println("Enter student name : ");
					String name3 = s.next();
					System.out.println("Enter student id: ");
					int id3 = s.nextInt();
					oos3.writeBytes(name3);
					oos3.write(id3);
					oos3.close();
					x.close();
					break;
				default:System.out.println("No other branch is not available");
				break;


				}
				
				System.out.println("Data entered in to the file successfully");
				
			}
		}

	}
}
