package classes.moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
	private static Type TYPE = Type.PSYCHIC;
	private static int POWER = 0;
	private static int ACCURACY = 100;

	public Rest() {
		super(TYPE, POWER, ACCURACY);
	}

	@Override
	protected void applySelfEffects(Pokemon attacker) {
		attacker.restore();
		Effect effect = new Effect().turns(2).condition(Status.SLEEP);		
		attacker.addEffect(effect);
	}

	protected String describe() {
		return "HAELSYA U CPUT";
	}
}
