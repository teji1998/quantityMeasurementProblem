package quantitymeasurement;

public enum Unit {
	FEET(1.0),
	INCH(12.0);

	private final double value;

	Unit(double value) {
		this.value = value;
	}
}
