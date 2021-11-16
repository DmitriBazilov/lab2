package classes.moves;

import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class CloseCombat extends PhysicalMove {
	private static Type TYPE = Type.FIGHTING;
	private static int POWER = 120;
	private static int ACCURACY = 100;

	public CloseCombat() {
		super(TYPE, POWER, ACCURACY);
	}

	@Override
	protected void applySelfEffects(Pokemon attacker) {
		attacker.setMod(Stat.DEFENSE, -1);
		attacker.setMod(Stat.SPECIAL_DEFENSE, -1);
	}

	protected String describe() {
		return "BOKCUPYET";
	}
}
