package Java_11;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.*;
import java.util.Scanner;


public class Java_11 {

	public static void main(String[] args) {
		var path1="C:\\file1\\hii.txt";
		 var path2="C:\\file1\\hello.txt";
		 int ch,price,totalPrice=0;
			boolean isTrue=true;
			Scanner sc=new Scanner(System.in);
			while(isTrue) {
				System.out.println("Enter Option (1.Insert new ,2.view purchase total ,3.Exit)");
				ch=sc.nextInt();
				switch(ch) {
				case 1:
					System.out.println("Insert price :");
					price=sc.nextInt();
					try {
						Files.writeString(Path.of(path1),Integer.toString(price)+"\n", StandardOpenOption.APPEND);
						totalPrice +=price;
						Files.writeString(Path.of(path2),Integer.toString(totalPrice)+"\n", StandardOpenOption.CREATE);
						
					}catch(IOException e){
						e.printStackTrace();
					}
					break;
				case 2:
					try {
						String data=Files.readString(Path.of(path2));
						System.out.println(data);
						
					}catch(IOException e){
						e.printStackTrace();
					}
					break;
				case 3:
					isTrue=false;
					break;

		}
			}

	}

}
