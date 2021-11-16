package classes.moves;

import ru.ifmo.se.pokemon.*;

public class Tackle extends PhysicalMove {
	private static Type TYPE = Type.NORMAL;
	private static int POWER = 40;
	private static int ACCURACY = 100;

	public Tackle() {
		super(TYPE, POWER, ACCURACY);
	}

	@Override
	protected String describe() {
		return "4APALAX";
	}
}
