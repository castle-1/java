package java_20_12_08;

import java.util.Scanner;

public class Name {

	private String name =" ";
	private char[] nameArry;

	public void input() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("입력 : ");
		this.name = sc.nextLine();
		
		nameArry = new char[getName().length()];
		for (int i = 0; i < nameArry.length; i++) {
			nameArry[i] = getName().charAt(i);
		}
		sc.close();
	}



	public void printName() {

		System.out.print("first name : ");
		for (int i = 0; i < nameArry.length; i++) {
			
			System.out.print(nameArry[i]);
			
			if(nameArry[i] == ' ') {
				System.out.println();
				System.out.print("second name : ");
				System.out.print(nameArry[i]);
			}
			
		}
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Name(String name) {

		this.name = name;
	}

	public Name() {

	
	}
	public char[] getNameArry() {
		return nameArry;
	}

	public void setNameArry(char[] nameArry) {
		this.nameArry = nameArry;
	}

}
