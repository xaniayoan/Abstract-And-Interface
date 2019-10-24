import Behaviour.BisaTerbang;
import Behaviour.TidakBisaTerbang;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Bebek");
		Bebek bebek = new Bebek();
		bebek.setBehaviourTerbang(new TidakBisaTerbang());
		bebek.bisaTerbang();
		bebek.bertelur();

		System.out.println("\nKalkun");
		Kalkun kalkun = new Kalkun();
		kalkun.setBehaviourTerbang(new BisaTerbang());
		kalkun.bisaTerbang();
		kalkun.bertelur();
	}

}
