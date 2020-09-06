package quantitymeasurement;

public enum Unit {
	FEET(12.0),
	INCH(1.0),
	YARD(36.0),
	CENTIMETER(0.4),
	GALLON(3.78),
	LITRE(1.0),
	MILLILITRE(0.001),
	GRAM(0.001),
	KILOGRAM(1.0),
	TONNE(1000.0),
	FAHRENHEIT(212),
	CELSIUS( 100);

	public final double convertingToBaseUnit;


	Unit( double convertingToBaseUnit) {
		this.convertingToBaseUnit = convertingToBaseUnit;
	}

	public double convertingToBaseUnit(double value) {
		return value * convertingToBaseUnit;

	}
}
