package classes.moves;

import ru.ifmo.se.pokemon.*;

public class Growth extends StatusMove {
	private static Type TYPE = Type.NORMAL;
	private static int POWER = 0;
	private static int ACCURACY = 100;

	public Growth() {
		super(TYPE, POWER, ACCURACY);
	}

	@Override
	protected void applySelfEffects(Pokemon attacker) {
		attacker.setMod(Stat.ATTACK, 1);
		attacker.setMod(Stat.SPECIAL_ATTACK, 1);
	}

	protected String describe() {
		return "BAXHYL PELMENU";
	}
}
