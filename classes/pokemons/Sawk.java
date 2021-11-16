package classes.pokemons;

import classes.moves.*;
import ru.ifmo.se.pokemon.*;

public class Sawk extends Pokemon {
	private static int HP = 75;
	private static int ATTACK = 125;
	private static int DEFENSE = 75;
	private static int SPECIAL_ATTACK = 30;
	private static int SPECIAL_DEFENSE = 75;
	private static int SPEED = 85;

	public Sawk(String name, int level) {
		super(name, level);
		setType(Type.FIGHTING);
		setStats(HP, ATTACK, DEFENSE, SPECIAL_ATTACK, SPECIAL_DEFENSE, SPEED);
		setMove(new Growth(), new DarkPulse(), new Acid(), new EnergyBall());
	}
}
