package classes.run;

import classes.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class main {
	public static void main(String[] args) {
		Battle b = new Battle();
		Pokemon sawk = new Sawk("", 10);
		Pokemon chingling = new Chingling("", 10);
		b.addAlly(sawk);
		b.addFoe(chingling);
		b.go();

	}
}
