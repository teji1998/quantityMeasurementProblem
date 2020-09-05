package quantitymeasurement;

public enum Unit {
	FEET(12.0),
	INCH(1.0),
	YARD(36),
	CENTIMETER(0.4);

	public final double convertingToBaseUnit;

	Unit(double convertingToBaseUnit) {
		this.convertingToBaseUnit = convertingToBaseUnit;
	}

	public boolean addition() {
		return true;
	}

	public double convertingToBaseUnit(double value) {
		return value * convertingToBaseUnit;
	}
}
