package classes.moves;

import ru.ifmo.se.pokemon.*;

public class DarkPulse extends SpecialMove {
	private static Type TYPE = Type.DARK;
	private static int POWER = 80;
	private static int ACCURACY = 100;

	public DarkPulse() {
		super(TYPE, POWER, ACCURACY);
	}

	@Override
	protected void applyOppEffects(Pokemon defender) {
		Effect effect = new Effect().chance(0.2);
		effect.flinch(defender);
	}

	protected String describe() {
		return "MYTUT BEPTYXY";
	}
}
