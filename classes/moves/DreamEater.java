package classes.moves;

import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class DreamEater extends SpecialMove {
	private static Type TYPE = Type.PSYCHIC;
	private static int POWER = 100;
	private static int ACCURACY = 100;

	public DreamEater() {
		super(TYPE, POWER, ACCURACY);
	}

	@Override
	protected void applyOppDamage(Pokemon defender, double damage) {
		if (defender.getCondition() == Status.SLEEP) 
			defender.setMod(Stat.HP, (int) damage);
	}

	protected void applySelfDamage(Pokemon attacker, double damage) {
		attacker.setMod(Stat.HP, (int)(-damage / 2));
	}

	protected String describe() {
		return "HO}I{ B CPUHY";
	}
}
