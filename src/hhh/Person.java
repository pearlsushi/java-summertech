package hhh;

public class Person {
	String personality;
	String gender;
	int teethnum = 32;
	double heightin;
	double hightcm;
	public static void main(String[] args) {
		Person Hiro = new Person(123,"built differently", "male");
		Hiro.personality = "built differently";
		System.out.println(Hiro.teethnum);
		
		Person Pearl = new Person(123,"uwu","female");
		Pearl.personality = "uwu";
		
		Person p = Pearl;
		Pearl.intocm(1);
		System.out.println(p.intocm());
		
	}
	public Person(double heightin, String personality, String gender) {
		this.personality = personality;
		this.heightin = heightin;
		this.gender = gender;
		
	}
	public double intocm(double heightin) { //2.54
		return heightin*2.54;
	}
	public double intocm() { //2.54
		return heightin*2.54;
	}

}
