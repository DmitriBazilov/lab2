package classes.pokemons;

import classes.moves.*;
import ru.ifmo.se.pokemon.*;

public class Chimecho extends Chingling {
	private static int HP = 75;
	private static int ATTACK = 50;
	private static int DEFENSE = 80;
	private static int SPECIAL_ATTACK = 95;
	private static int SPECIAL_DEFENSE = 90;
	private static int SPEED = 65;

	public Chimecho(String name, int level) {
		super(name, level);
		setType(Type.PSYCHIC);
		setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED);
		setMove(new TakeDown(), new Swagger(), new Facade(), new CloseCombat());
	}
}
