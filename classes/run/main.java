package classes.run;

import classes.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class main {
	public static void main(String[] args) {
                Battle b = new Battle();
                Pokemon sawk = new Sawk("", 10);
                Pokemon chingling = new Chingling("", 10);
                Pokemon chimecho = new Chimecho("", 10);
                Pokemon solosis = new Solosis("", 10);
                Pokemon duosion = new Duosion("", 10);
                Pokemon reuniclus = new Reuniclus("", 10);
                b.addAlly(sawk);
                b.addAlly(chimecho);
                b.addAlly(duosion);
                b.addFoe(reuniclus);
                b.addFoe(solosis);
                b.addFoe(chingling);
                b.go();
	}
}
