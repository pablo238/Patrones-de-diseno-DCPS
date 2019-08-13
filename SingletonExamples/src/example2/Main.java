package example2;

public class Main {

	public static void main(String[] args) {
		Sistema objeto1= Sistema.getInstance();
		Sistema objeto2= Sistema.getInstance();
		System.out.println(objeto1.getHora());
		System.out.println(objeto2.getHora());
		objeto2.setHora("10:30");
		System.out.println(objeto1.getHora());
		System.out.println(objeto2.getHora());
	}

}
