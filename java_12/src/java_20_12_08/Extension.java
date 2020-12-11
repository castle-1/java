package java_20_12_08;

import java.util.Scanner;

public class Extension {

	private String extension = " ";
	private char[] nameArry;

	public void input() {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력 : ");
		this.extension = sc.next();

		nameArry = new char[getExtension().length()];
		for (int i = 0; i < nameArry.length; i++) {
			nameArry[i] = getExtension().charAt(i);

		}

		sc.close();

	}

	public void printextension() {

		System.out.print("파일 이름 : ");
		for (int i = 0; i < nameArry.length; i++) {

			
			if (nameArry[i] == '.') {
				System.out.println();
				System.out.print("확장자 : ");
				System.out.print(nameArry[i]);
			}else {
				System.out.print(nameArry[i]);
			}
			
		}

	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public Extension() {

	}

	public char[] getNameArry() {
		return nameArry;
	}

	public void setNameArry(char[] nameArry) {
		this.nameArry = nameArry;
	}

}
