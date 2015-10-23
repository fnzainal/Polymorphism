package belajar;

/*
 * Polymorphism
 * @writer Zainal Fahrudin
 * Pondok Programmer,  22 Oct 2015
 */
public class Profile {
	public static void main(String[] args){
		//inisiasi classs PrintData
		PrintData data = new PrintData();
		
		System.out.print("Print Nama : ");
		//memanggil method Print() dari kelas PrintData dg parameter String
		data.Print("Zainal Fahrudin");
		
		System.out.print("Print tahun : ");
		//memanggil method Print() dari kelas PrintData dg parameter int
		data.Print(1997);
		
		System.out.print("Print Rate : ");
		//memanggil method Print() dari kelas PrintData dg parameter double
		data.Print(3.4);
		
		System.out.print("Print Grade : ");
		//memanggil method Print() dari kelas PrintData dg parameter char
		data.Print('A');
	}
}
