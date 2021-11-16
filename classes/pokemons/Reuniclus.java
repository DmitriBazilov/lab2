package classes.pokemons;

import classes.moves.*;
import ru.ifmo.se.pokemon.*;

public class Reuniclus extends Duosion {
	private static int HP = 110;
	private static int ATTACK = 65;
	private static int DEFENSE = 75;
	private static int SPECIAL_ATTACK = 125;
	private static int SPECIAL_DEFENSE = 85;
	private static int SPEED = 30;

	public Reuniclus(String name, int level) {
		super(name, level);
		setType(Type.PSYCHIC);
		setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED);
		setMove(new CalmMind(), new Rest(), new DreamEater(), new Tackle());
	}
}
