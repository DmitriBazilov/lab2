package classes.moves;

import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove {
	private static Type TYPE = Type.GRASS;
	private static int POWER = 90;
	private static int ACCURACY = 100;

	public EnergyBall() {
		super(TYPE, POWER, ACCURACY);
	}

	@Override
	protected void applyOppEffects(Pokemon defender) {
		Effect effect = new Effect().chance(0.1).turns(-1).stat(Stat.SPECIAL_DEFENSE, -1);
		defender.addEffect(effect);
	}

	protected String describe() {
		return "RASENGAN";
	}
}
