package classes.moves;

import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class TakeDown extends PhysicalMove {
	private static Type TYPE = Type.NORMAL;
	private static int POWER = 90;
	private static int ACCURACY = 85;
	
	public TakeDown() {
		super(TYPE, POWER, ACCURACY);
	}
	
	@Override
	protected void applySelfDamage(Pokemon attacker, double damage) {
		attacker.setMod(Stat.HP, (int) Math.round(damage / 4));
	}

	protected String describe() {
		return "EEEELL PRIMOOO";
	}
}
