package example1;

public class Main {

	public static void main(String[] args) {
		ElPapa juanPablo2= ElPapa.getInstance();
		juanPablo2.setNombre("Juan Pablo II");
		ElPapa benedictoXVI=ElPapa.getInstance();
		benedictoXVI.setNombre("Benedicto XVI");
		System.out.println(juanPablo2.getNombre());
		System.out.println(benedictoXVI.getNombre());
	}

}
