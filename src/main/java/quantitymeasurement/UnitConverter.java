package quantitymeasurement;

import java.util.Objects;

public class UnitConverter {
	private final double value;
	private final Unit unit;

	public UnitConverter(double value, Unit unit) {
		this.value = value;
		this.unit = unit;
	}
	public boolean compare(UnitConverter thatUnit) {
		return Double.compare(this.unit.convertingToBaseUnit(this.value),
				  thatUnit.unit.convertingToBaseUnit(thatUnit.value)) == 0;
	}

	public double add(UnitConverter thatUnit) {
		return this.unit.convertingToBaseUnit(this.value) + thatUnit.unit.convertingToBaseUnit(thatUnit.value);
	}

	public static double convertingTheTemperature(double temperature, Unit temperatureCheck) {
		if (temperatureCheck == Unit.CELSIUS)
			return (temperature - 32) / 1.8;
		return (temperature * 1.8) + 32;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		UnitConverter that = (UnitConverter) o;
		return Double.compare(that.value, value) == 0 &&
				  unit == that.unit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(value,unit);
	}
}
