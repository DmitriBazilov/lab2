package classes.moves;

import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class Facade extends PhysicalMove {
	private static Type TYPE = Type.NORMAL;
	private static int POWER = 70;
	private static int ACCURACY = 100;

	public Facade() {
		super(TYPE, POWER, ACCURACY);
	}

	@Override
	protected double calcBaseDamage(Pokemon attacker, Pokemon defender) {
		boolean hasNeedCond = (attacker.getCondition() == Status.BURN) ? true : false;
		hasNeedCond = (attacker.getCondition() == Status.POISON) ? true : hasNeedCond;
		hasNeedCond = (attacker.getCondition() == Status.PARALYZE) ? true : hasNeedCond;
		
		if (hasNeedCond) 
			return (0.4 * (double)attacker.getLevel() + 2.0) * this.power * 2 / 150.0;
		else
			return (0.4 * (double)attacker.getLevel() + 2.0) * this.power / 150.0;
	}

	protected String describe() {
		return "PLYUHYL";
	}
}
