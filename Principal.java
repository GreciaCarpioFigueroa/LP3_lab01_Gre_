import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int vida, rp;
		boolean fl = false;
		vida = 0;
		Scanner sc = new Scanner(System.in);
		do {
			vida ++;
			System.out.println("Vida:"+ vida + "\t¿Cual es el numero secreto?");
			rp = sc.nextInt();
			if (rp == 1234)
				fl = true;
		}while(vida < 3 && !fl);
		if (fl == true)
			System.out.println("Adivinaste!!!");
		else
			System.out.println("ups, perdiste...");
		do {
			vida ++;
			System.out.println("Vida:"+ vida + "\t¿Cual es el numero secreto si son 3 números cansecutivos?");
			rp = sc.nextInt();
			if (rp == 567)
				fl = true;
		}while(vida < 3 && !fl);
		if (fl == true)
			System.out.println("Adivinaste!!!");
		else
			System.out.println("ups, perdiste...");
		
	}
}