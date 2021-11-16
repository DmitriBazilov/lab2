package classes.pokemons;

import classes.moves.*;
import ru.ifmo.se.pokemon.*;

public class Duosion extends Solosis {
	private static int HP = 65;
	private static int ATTACK = 40;
	private static int DEFENSE = 50;
	private static int SPECIAL_ATTACK = 125;
	private static int SPECIAL_DEFENSE = 60;
	private static int SPEED = 30;

	public Duosion(String name, int level) {
		super(name, level);
		setType(Type.PSYCHIC);
		setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED);
		setMove(new CalmMind(), new Rest(), new DreamEater());
	}
}
