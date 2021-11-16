package classes.pokemons;

import classes.moves.*;
import ru.ifmo.se.pokemon.*;

public class Chingling extends Pokemon {
	private static int HP = 45;
	private static int ATTACK = 30;
	private static int DEFENSE = 50;
	private static int SPECIAL_ATTACK = 65;
	private static int SPECIAL_DEFENSE = 50;
	private static int SPEED = 45;

	public Chingling(String name, int level) {
		super(name, level);
		setType(Type.PSYCHIC);
		setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED);
		setMove(new Swagger(), new Facade(), new TakeDown());
	} 
}
