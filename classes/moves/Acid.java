package classes.moves;

import ru.ifmo.se.pokemon.*;

public class Acid extends SpecialMove {
	private static Type TYPE = Type.POISON;
	private static int POWER = 40;
	private static int ACCURACY = 100;

	public Acid() {
		super(TYPE, POWER, ACCURACY);
	}

	@Override
	protected void applyOppEffects(Pokemon defender) {
		Effect effect = new Effect().chance(0.1).turns(-1).stat(Stat.SPECIAL_DEFENSE, -1);
		defender.addEffect(effect);
	}

	protected String describe() {
		return "KUNYL BANKY C ZELENKOI";
	}
}
