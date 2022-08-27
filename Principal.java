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
			System.out.println("Vida:"+ vida + "\t¿Cual es el numero secreto si son 4 números cansecutivos?");
			rp = sc.nextInt();
			if (rp == 5678)
				fl = true;
		}while(vida < 3 && !fl);
		if (fl == true)
			System.out.println("Adivinaste!!!");
		else
			System.out.println("ups, perdiste...");
		do {
			vida ++;
			System.out.println("Vida:"+ vida + "\t¿Cual es el numero secreto si son 4 números cansecutivos y empieza con 5?");
			rp = sc.nextInt();
			if (rp == 5678)
				fl = true;
		}while(vida < 3 && !fl);
		if (fl == true)
			System.out.println("Adivinaste!!!, un poco tarde pero bien");
		else
			System.out.println("Perdiste... con pista y todo...");
		
	}
}