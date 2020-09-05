package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Objects;

@RunWith(MockitoJUnitRunner.class)
public class QuantityMeasurementTest {

	@Mock
	UnitConverter unitConverter1;
	UnitConverter unitConverter2;

	@Test
	public void givenZeroFeetAndZeroFeet_WhenComparedInEquality_ShouldReturnEquals() {
		unitConverter1 = new UnitConverter(0.0, Unit.FEET);
		unitConverter2 = new UnitConverter(0.0, Unit.FEET);
		Assert.assertEquals(unitConverter1, unitConverter2);
	}

	@Test
	public void givenZeroFeetAndOneFeet_WhenComparedInEquality_ShouldReturnNotEquals() {
		unitConverter1 = new UnitConverter(0.0, Unit.FEET);
		unitConverter2 = new UnitConverter(1.0, Unit.FEET);
		Assert.assertNotEquals(unitConverter1, unitConverter2);
	}

	@Test
	public void givenFeet_WhenIsNotNull_ShouldReturnTrue() {
		unitConverter1 = new UnitConverter(1.0, Unit.FEET);
		boolean nullValueCheck = Objects.nonNull(unitConverter1);
		Assert.assertTrue(nullValueCheck);
	}

	@Test
	public void givenFeet_WhenIsNull_ShouldReturnTrue() {
		unitConverter1 = null;
		boolean nullValueCheck = Objects.isNull(unitConverter1);
		Assert.assertTrue(nullValueCheck);
	}

	@Test
	public void givenFeetValue_WhenCheckedForReferenceWithAnotherFeetValue_ShouldReturnNotSame() {
		unitConverter1 = new UnitConverter(0.0,Unit.FEET);
		unitConverter2 = new UnitConverter(1.0, Unit.FEET);
		Assert.assertNotSame(unitConverter1, unitConverter2);
	}

	@Test
	public void givenFeetValue_WhenCheckedForReference_ShouldReturnSame() {
		unitConverter1 = new UnitConverter(1.0,Unit.FEET);
		Assert.assertSame(unitConverter1, unitConverter1);
	}

	@Test
	public void givenFeetValue_WhenOfSameType_ShouldReturnEquals() {
		unitConverter1 = new UnitConverter (1.0,Unit.FEET);
		Assert.assertEquals(unitConverter1.getClass(), UnitConverter.class);
	}

	@Test
	public void givenTwoFeetValues_WhenAreEqual_ShouldReturnTrue() {
		unitConverter1 = new UnitConverter(1.0, Unit.FEET);
		unitConverter2 = new UnitConverter(1.0, Unit.FEET);
		boolean equalValue = Objects.equals(unitConverter1, unitConverter2);
		Assert.assertTrue(equalValue);
	}

	@Test
	public void givenTwoFeetValues_WhenAreNotEqual_ShouldReturnFalse() {
		unitConverter1 = new UnitConverter(1.0, Unit.FEET);
		unitConverter1 = new UnitConverter(0.0, Unit.FEET);
		boolean equalValue = Objects.equals(unitConverter1, unitConverter2);
		Assert.assertFalse(equalValue);
	}

	@Test
	public void givenZeroInchAndZeroInch_WhenComparedInLengths_ShouldReturnEquals() {
		unitConverter1 = new UnitConverter(0.0, Unit.INCH);
		unitConverter2 = new UnitConverter(0.0, Unit.INCH);
		Assert.assertEquals(unitConverter1, unitConverter2);
	}

	@Test
	public void givenZeroInchAndOneInch_WhenComparedInLengths_ShouldReturnNotEquals() {
		unitConverter1 = new UnitConverter(1.0, Unit.INCH);
		unitConverter2 = new UnitConverter(0.0, Unit.INCH);
		Assert.assertNotEquals(unitConverter1, unitConverter2);
	}

	@Test
	public void givenInch_WhenIsNotNull_ShouldReturnTrue() {
		unitConverter1 = new UnitConverter(1.0, Unit.INCH);
		boolean nullValueCheck = Objects.nonNull(unitConverter1);
		Assert.assertTrue(nullValueCheck);
	}

	@Test
	public void givenInch_WhenIsNull_ShouldReturnTrue() {
		unitConverter1 = null;
		boolean nullValueCheck = Objects.isNull(unitConverter1);
		Assert.assertTrue(nullValueCheck);
	}


	@Test
	public void givenInchValue_WhenCheckedForReferenceWithAnotherInchValue_ShouldReturnNotSame() {
		unitConverter1 = new UnitConverter(1.0, Unit.INCH);
		unitConverter2 = new UnitConverter(0.0, Unit.INCH);
		Assert.assertNotSame(unitConverter1, unitConverter2);
	}

	@Test
	public void givenInchValue_WhenCheckedForReference_ShouldReturnSame() {
		unitConverter1 = new UnitConverter(1.0, Unit.INCH);
		Assert.assertSame(unitConverter1, unitConverter1);
	}

	@Test
	public void givenInchValues_WhenAreEqual_ShouldReturnTrue() {
		unitConverter1 = new UnitConverter(1.0, Unit.INCH);
		unitConverter2 = new UnitConverter(1.0, Unit.INCH);
		boolean equalValue = Objects.equals(unitConverter1, unitConverter2);
		Assert.assertTrue(equalValue);
	}

	@Test
	public void givenTwoInchValues_WhenAreNotEqual_ShouldReturnFalse() {
		unitConverter1 = new UnitConverter(1.0, Unit.INCH);
		unitConverter2 = new UnitConverter(0.0, Unit.INCH);
		boolean equalValue = Objects.equals(unitConverter1, unitConverter2);
		Assert.assertFalse(equalValue);
	}

	@Test
	public void givenInchValue_WhenOfSameType_ShouldReturnEqual() {
		unitConverter1 = new UnitConverter(1.0,Unit.INCH);
		Assert.assertEquals(unitConverter1.getClass(), UnitConverter.class);
	}

	@Test
	public void givenOneFeetAndTwelveInch_WhenCompared_ShouldReturnTrue() {
		unitConverter1 = new UnitConverter(1.0, Unit.FEET);
		unitConverter2 = new UnitConverter(12.0, Unit.INCH);
		boolean compareCheck = unitConverter1.compare(unitConverter2);
		Assert.assertTrue(compareCheck);
	}

	@Test
	public void givenThreeFeetAndOneYard_WhenCompared_ShouldReturnEqual() {
		unitConverter1 = new UnitConverter(3.0, Unit.FEET);
		unitConverter2 = new UnitConverter(1.0, Unit.YARD);
		boolean compareCheck = unitConverter1.compare(unitConverter2);
		Assert.assertTrue(compareCheck);
	}

	@Test
	public void givenOneFeetAndOneYard_WhenCompared_ShouldReturnFalse() {
		unitConverter1 = new UnitConverter(1.0, Unit.FEET);
		unitConverter2 = new UnitConverter(1.0, Unit.YARD);
		boolean compareCheck = unitConverter1.compare(unitConverter2);
		Assert.assertFalse(compareCheck);
	}

	@Test
	public void givenOneInchAndOneYard_WhenCompared_ShouldReturnFalse() {
		unitConverter1 = new UnitConverter(1.0, Unit.INCH);
		unitConverter2 = new UnitConverter(1.0, Unit.YARD);
		boolean compareCheck = unitConverter1.compare(unitConverter2);
		Assert.assertFalse(compareCheck);
	}

	@Test
	public void givenThirtySixInchAndOneYard_WhenCompared_ShouldReturnTrue() {
		unitConverter1 = new UnitConverter(36, Unit.INCH);
		unitConverter2 = new UnitConverter(1.0, Unit.YARD);
		boolean compareCheck = unitConverter1.compare(unitConverter2);
		Assert.assertTrue(compareCheck);
	}

	@Test
	public void givenOneYardAndThirtySixInch_WhenCompared_ShouldReturnTrue() {
		unitConverter1 = new UnitConverter(1.0, Unit.YARD);
		unitConverter2 = new UnitConverter(36, Unit.INCH);
		boolean compareCheck = unitConverter1.compare(unitConverter2);
		Assert.assertTrue(compareCheck);
	}

	@Test
	public void givenOneYardAndThreeFeet_WhenCompared_ShouldReturnTrue() {
		unitConverter1 = new UnitConverter(1.0, Unit.YARD);
		unitConverter2 = new UnitConverter(3, Unit.FEET);
		boolean compareCheck = unitConverter1.compare(unitConverter2);
		Assert.assertTrue(compareCheck);
	}

	@Test
	public void givenTwoInchAndFiveCentimeter_WhenCompared_ShouldReturnTrue() {
		unitConverter1 = new UnitConverter(2.0, Unit.INCH);
		unitConverter2 = new UnitConverter(5, Unit.CENTIMETER);
		boolean compareCheck = unitConverter1.compare(unitConverter2);
		Assert.assertTrue(compareCheck);
	}

	@Test
	public void givenOneFeetAndTwoInch_WhenAddedInInches_ShouldReturnFourteenInch() {
		unitConverter1 = new UnitConverter(1.0, Unit.FEET);
		unitConverter2 = new UnitConverter(2.0, Unit.INCH);
		double result = unitConverter1.add(unitConverter2);
		Assert.assertEquals(14.0, result, 0.0);
	}

	@Test
	public void givenOneFeetAndOneFeet_WhenAddedInInches_ShouldReturnTwentyFourInch() {
		unitConverter1 = new UnitConverter(1.0, Unit.FEET);
		unitConverter2 = new UnitConverter(1.0, Unit.FEET);
		double result = unitConverter1.add(unitConverter2);
		Assert.assertEquals(24.0, result, 0.0);
	}

	@Test
	public void givenTwoInchAndTwoPointFiveCentimeter_WhenAddedInInches_ShouldReturnThreeInch() {
		unitConverter1 = new UnitConverter(2.0, Unit.INCH);
		unitConverter2 = new UnitConverter(2.5, Unit.CENTIMETER);
		double result = unitConverter1.add(unitConverter2);
		Assert.assertEquals(3.0, result, 0.0);
	}

	@Test
	public void givenOneGallonAndThreePointSevenEightLitre_WhenCompared_ShouldReturnTrue() {
		unitConverter1 = new UnitConverter(1.0, Unit.GALLON);
		unitConverter2 = new UnitConverter(3.78, Unit.LITRE);
		boolean compareLength = unitConverter1.compare(unitConverter2);
		Assert.assertTrue(compareLength);
	}

	@Test
	public void givenOneLitreAndThousandMilliLitre_WhenCompared_ShouldReturnTrue() {
		unitConverter1 = new UnitConverter(1.0, Unit.LITRE);
		unitConverter2 = new UnitConverter(1000.0, Unit.MILLILITRE);
		boolean compareLength = unitConverter1.compare(unitConverter2);
		Assert.assertTrue(compareLength);
	}

	@Test
	public void givenOneGallonAndThreePointSevenEightLitres_WhenAddedInLitres_ShouldReturnSevenPointFiveSevenLitres() {
		unitConverter1 = new UnitConverter(1.0, Unit.GALLON);
		unitConverter2 = new UnitConverter(3.78, Unit.LITRE);
		double result = unitConverter1.add(unitConverter2);
		Assert.assertEquals(7.57, result, 0.1);
	}

	@Test
	public void givenOneLitreAndThousandMillilitres_WhenAddedInLitres_ShouldReturnTwoLitres() {
		unitConverter1 = new UnitConverter(1.0, Unit.LITRE);
		unitConverter2 = new UnitConverter(1000.0, Unit.MILLILITRE);
		double result = unitConverter1.add(unitConverter2);
		Assert.assertEquals(2, result, 0.1);
	}

	@Test
	public void givenOneKiloGramAndThousandGrams_WhenCompared_ShouldReturnTrue() {
		unitConverter1 = new UnitConverter(1.0, Unit.KILOGRAM);
		unitConverter2 = new UnitConverter(1000.0, Unit.GRAM);
		boolean compareCheck = unitConverter1.compare(unitConverter2);
		Assert.assertTrue(compareCheck);
	}

	@Test
	public void givenOneTonneAndThousandKilogram_WhenCompared_ShouldReturnTrue() {
		unitConverter1 = new UnitConverter(1.0, Unit.TONNE);
		unitConverter2 = new UnitConverter(1000.0, Unit.KILOGRAM);
		boolean compareCheck = unitConverter1.compare(unitConverter2);
		Assert.assertTrue(compareCheck);
	}

	@Test
	public void givenOneTonneAndThousandGrams_WhenAddedInKilograms_ShouldReturnOneThousandAndOneKilograms() {
		unitConverter1 = new UnitConverter(1.0, Unit.TONNE);
		unitConverter2 = new UnitConverter(1000.0, Unit.GRAM);
		double result = unitConverter1.add(unitConverter2);
		Assert.assertEquals(1001, result, 0.0);
	}

	@Test
	public void givenTwoHundredAndTwelveFahrenheitAndHundredCelsius_WhenConvertedForEquality_ShouldReturnEqual() {
		double degreeCelsius = unitConverter1.convertingTheTemperature(212, Unit.CELSIUS);
		double degreeFahrenheit = unitConverter2.convertingTheTemperature(100, Unit.FAHRENHEIT);
		Assert.assertEquals(100.0, degreeCelsius, 0.0);
		Assert.assertEquals(212.0, degreeFahrenheit, 0.0);
	}
}

