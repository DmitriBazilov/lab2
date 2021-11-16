package classes.moves;

import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class Swagger extends StatusMove {
	private static Type TYPE = Type.NORMAL;
	private static int POWER = 0;
	private static int ACCURACY = 85;

	public Swagger() {
		super(TYPE, POWER, ACCURACY);
	}

	@Override
	protected void applyOppEffects(Pokemon defender) {
		defender.confuse();
		defender.setMod(Stat.ATTACK, 2);
	}

	protected String describe() {
		return "PblGHYL";
	}
}
