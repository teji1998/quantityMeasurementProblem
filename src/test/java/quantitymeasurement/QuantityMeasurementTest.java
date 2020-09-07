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
	UnitConverter quantity1;
	UnitConverter quantity2;

	@Test
	public void givenZeroFeetAndZeroFeet_WhenComparedInEquality_ShouldReturnEquals() {
		quantity1 = new UnitConverter(0.0, Unit.FEET);
		quantity2 = new UnitConverter(0.0, Unit.FEET);
		Assert.assertEquals(quantity1, quantity2);
	}

	@Test
	public void givenZeroFeetAndOneFeet_WhenComparedInEquality_ShouldReturnNotEquals() {
		quantity1 = new UnitConverter(0.0, Unit.FEET);
		quantity2 = new UnitConverter(1.0, Unit.FEET);
		Assert.assertNotEquals(quantity1, quantity2);
	}

	@Test
	public void givenFeet_WhenIsNotNull_ShouldReturnTrue() {
		quantity1 = new UnitConverter(1.0, Unit.FEET);
		boolean nullValueCheck = Objects.nonNull(quantity1);
		Assert.assertTrue(nullValueCheck);
	}

	@Test
	public void givenFeet_WhenIsNull_ShouldReturnTrue() {
		quantity1 = null;
		boolean nullValueCheck = Objects.isNull(quantity1);
		Assert.assertTrue(nullValueCheck);
	}

	@Test
	public void givenFeetValue_WhenCheckedForReferenceWithAnotherFeetValue_ShouldReturnNotSame() {
		quantity1 = new UnitConverter(0.0,Unit.FEET);
		quantity2 = new UnitConverter(1.0, Unit.FEET);
		Assert.assertNotSame(quantity1, quantity2);
	}

	@Test
	public void givenFeetValue_WhenCheckedForReference_ShouldReturnSame() {
		quantity1 = new UnitConverter(1.0,Unit.FEET);
		Assert.assertSame(quantity1, quantity1);
	}

	@Test
	public void givenFeetValue_WhenOfSameType_ShouldReturnEquals() {
		quantity1 = new UnitConverter (1.0,Unit.FEET);
		Assert.assertEquals(quantity1.getClass(), UnitConverter.class);
	}

	@Test
	public void givenTwoFeetValues_WhenAreEqual_ShouldReturnTrue() {
		quantity1 = new UnitConverter(1.0, Unit.FEET);
		quantity2 = new UnitConverter(1.0, Unit.FEET);
		boolean equalValue = Objects.equals(quantity1, quantity2);
		Assert.assertTrue(equalValue);
	}

	@Test
	public void givenTwoFeetValues_WhenAreNotEqual_ShouldReturnFalse() {
		quantity1 = new UnitConverter(1.0, Unit.FEET);
		quantity2 = new UnitConverter(0.0, Unit.FEET);
		boolean equalValue = Objects.equals(quantity1, quantity2);
		Assert.assertFalse(equalValue);
	}

	@Test
	public void givenZeroInchAndZeroInch_WhenComparedInLengths_ShouldReturnEquals() {
		quantity1 = new UnitConverter(0.0, Unit.INCH);
		quantity2 = new UnitConverter(0.0, Unit.INCH);
		Assert.assertEquals(quantity1, quantity2);
	}

	@Test
	public void givenZeroInchAndOneInch_WhenComparedInLengths_ShouldReturnNotEquals() {
		quantity1 = new UnitConverter(1.0, Unit.INCH);
		quantity2 = new UnitConverter(0.0, Unit.INCH);
		Assert.assertNotEquals(quantity1, quantity2);
	}

	@Test
	public void givenInch_WhenIsNotNull_ShouldReturnTrue() {
		quantity1 = new UnitConverter(1.0, Unit.INCH);
		boolean nullValueCheck = Objects.nonNull(quantity1);
		Assert.assertTrue(nullValueCheck);
	}

	@Test
	public void givenInch_WhenIsNull_ShouldReturnTrue() {
		quantity1 = null;
		boolean nullValueCheck = Objects.isNull(quantity1);
		Assert.assertTrue(nullValueCheck);
	}


	@Test
	public void givenInchValue_WhenCheckedForReferenceWithAnotherInchValue_ShouldReturnNotSame() {
		quantity1 = new UnitConverter(1.0, Unit.INCH);
		quantity2 = new UnitConverter(0.0, Unit.INCH);
		Assert.assertNotSame(quantity1, quantity2);
	}

	@Test
	public void givenInchValue_WhenCheckedForReference_ShouldReturnSame() {
		quantity1 = new UnitConverter(1.0, Unit.INCH);
		Assert.assertSame(quantity1, quantity1);
	}

	@Test
	public void givenInchValues_WhenAreEqual_ShouldReturnTrue() {
		quantity1 = new UnitConverter(1.0, Unit.INCH);
		quantity2 = new UnitConverter(1.0, Unit.INCH);
		boolean equalValue = Objects.equals(quantity1, quantity2);
		Assert.assertTrue(equalValue);
	}

	@Test
	public void givenTwoInchValues_WhenAreNotEqual_ShouldReturnFalse() {
		quantity1 = new UnitConverter(1.0, Unit.INCH);
		quantity2 = new UnitConverter(0.0, Unit.INCH);
		boolean equalValue = Objects.equals(quantity1, quantity2);
		Assert.assertFalse(equalValue);
	}

	@Test
	public void givenInchValue_WhenOfSameType_ShouldReturnEqual() {
		quantity1 = new UnitConverter(1.0,Unit.INCH);
		Assert.assertEquals(quantity1.getClass(), UnitConverter.class);
	}

	@Test
	public void givenOneFeetAndTwelveInch_WhenCompared_ShouldReturnTrue() {
		quantity1 = new UnitConverter(1.0, Unit.FEET);
		quantity2 = new UnitConverter(12.0, Unit.INCH);
		boolean compareCheck = quantity1.compare(quantity2);
		Assert.assertTrue(compareCheck);
	}

	@Test
	public void givenThreeFeetAndOneYard_WhenCompared_ShouldReturnEqual() {
		quantity1 = new UnitConverter(3.0, Unit.FEET);
		quantity2 = new UnitConverter(1.0, Unit.YARD);
		boolean compareCheck = quantity1.compare(quantity2);
		Assert.assertTrue(compareCheck);
	}

	@Test
	public void givenOneFeetAndOneYard_WhenCompared_ShouldReturnFalse() {
		quantity1 = new UnitConverter(1.0, Unit.FEET);
		quantity2 = new UnitConverter(1.0, Unit.YARD);
		boolean compareCheck = quantity1.compare(quantity2);
		Assert.assertFalse(compareCheck);
	}

	@Test
	public void givenOneInchAndOneYard_WhenCompared_ShouldReturnFalse() {
		quantity1 = new UnitConverter(1.0, Unit.INCH);
		quantity2 = new UnitConverter(1.0, Unit.YARD);
		boolean compareCheck = quantity1.compare(quantity2);
		Assert.assertFalse(compareCheck);
	}

	@Test
	public void givenThirtySixInchAndOneYard_WhenCompared_ShouldReturnTrue() {
		quantity1 = new UnitConverter(36, Unit.INCH);
		quantity2 = new UnitConverter(1.0, Unit.YARD);
		boolean compareCheck = quantity1.compare(quantity2);
		Assert.assertTrue(compareCheck);
	}

	@Test
	public void givenOneYardAndThirtySixInch_WhenCompared_ShouldReturnTrue() {
		quantity1 = new UnitConverter(1.0, Unit.YARD);
		quantity2 = new UnitConverter(36, Unit.INCH);
		boolean compareCheck = quantity1.compare(quantity2);
		Assert.assertTrue(compareCheck);
	}

	@Test
	public void givenOneYardAndThreeFeet_WhenCompared_ShouldReturnTrue() {
		quantity1 = new UnitConverter(1.0, Unit.YARD);
		quantity2 = new UnitConverter(3, Unit.FEET);
		boolean compareCheck = quantity1.compare(quantity2);
		Assert.assertTrue(compareCheck);
	}

	@Test
	public void givenTwoInchAndFiveCentimeter_WhenCompared_ShouldReturnTrue() {
		quantity1 = new UnitConverter(2.0, Unit.INCH);
		quantity2 = new UnitConverter(5, Unit.CENTIMETER);
		boolean compareCheck = quantity1.compare(quantity2);
		Assert.assertTrue(compareCheck);
	}

	@Test
	public void givenOneFeetAndTwoInch_WhenAddedInInches_ShouldReturnFourteenInch() {
		quantity1 = new UnitConverter(1.0, Unit.FEET);
		quantity2 = new UnitConverter(2.0, Unit.INCH);
		double result = quantity1.add(quantity2);
		Assert.assertEquals(14.0, result, 0.0);
	}

	@Test
	public void givenOneFeetAndOneFeet_WhenAddedInInches_ShouldReturnTwentyFourInch() {
		quantity1 = new UnitConverter(1.0, Unit.FEET);
		quantity2 = new UnitConverter(1.0, Unit.FEET);
		double result = quantity1.add(quantity2);
		Assert.assertEquals(24.0, result, 0.0);
	}

	@Test
	public void givenTwoInchAndTwoPointFiveCentimeter_WhenAddedInInches_ShouldReturnThreeInch() {
		quantity1 = new UnitConverter(2.0, Unit.INCH);
		quantity2 = new UnitConverter(2.5, Unit.CENTIMETER);
		double result = quantity1.add(quantity2);
		Assert.assertEquals(3.0, result, 0.0);
	}

	@Test
	public void givenOneGallonAndThreePointSevenEightLitre_WhenCompared_ShouldReturnTrue() {
		quantity1 = new UnitConverter(1.0, Unit.GALLON);
		quantity2 = new UnitConverter(3.78, Unit.LITRE);
		boolean compareLength = quantity1.compare(quantity2);
		Assert.assertTrue(compareLength);
	}

	@Test
	public void givenOneLitreAndThousandMilliLitre_WhenCompared_ShouldReturnTrue() {
		quantity1 = new UnitConverter(1.0, Unit.LITRE);
		quantity2 = new UnitConverter(1000.0, Unit.MILLILITRE);
		boolean compareLength = quantity1.compare(quantity2);
		Assert.assertTrue(compareLength);
	}

	@Test
	public void givenOneGallonAndThreePointSevenEightLitres_WhenAddedInLitres_ShouldReturnSevenPointFiveSevenLitres() {
		quantity1 = new UnitConverter(1.0, Unit.GALLON);
		quantity2 = new UnitConverter(3.78, Unit.LITRE);
		double result = quantity1.add(quantity2);
		Assert.assertEquals(7.57, result, 0.1);
	}

	@Test
	public void givenOneLitreAndThousandMillilitres_WhenAddedInLitres_ShouldReturnTwoLitres() {
		quantity1 = new UnitConverter(1.0, Unit.LITRE);
		quantity2 = new UnitConverter(1000.0, Unit.MILLILITRE);
		double result = quantity1.add(quantity2);
		Assert.assertEquals(2, result, 0.1);
	}

	@Test
	public void givenOneKiloGramAndThousandGrams_WhenCompared_ShouldReturnTrue() {
		quantity1 = new UnitConverter(1.0, Unit.KILOGRAM);
		quantity2 = new UnitConverter(1000.0, Unit.GRAM);
		boolean compareCheck = quantity1.compare(quantity2);
		Assert.assertTrue(compareCheck);
	}

	@Test
	public void givenOneTonneAndThousandKilogram_WhenCompared_ShouldReturnTrue() {
		quantity1 = new UnitConverter(1.0, Unit.TONNE);
		quantity2 = new UnitConverter(1000.0, Unit.KILOGRAM);
		boolean compareCheck = quantity1.compare(quantity2);
		Assert.assertTrue(compareCheck);
	}

	@Test
	public void givenOneTonneAndThousandGrams_WhenAddedInKilograms_ShouldReturnOneThousandAndOneKilograms() {
		quantity1 = new UnitConverter(1.0, Unit.TONNE);
		quantity2 = new UnitConverter(1000.0, Unit.GRAM);
		double result = quantity1.add(quantity2);
		Assert.assertEquals(1001, result, 0.0);
	}

	@Test
	public void givenTwoHundredAndTwelveFahrenheit_WhenConvertedToHundredDegreeCelsius_ShouldReturnEqual() {
		double degreeCelsius = quantity1.convertingTheTemperature(212, Unit.CELSIUS);
		Assert.assertEquals(100.0, degreeCelsius, 0.0);
	}

	@Test
	public void givenHundredDegreeCelsius_WhenConvertedToTwoHundredAndTwelveFahrenheit_ShouldReturnEqual() {
		double degreeFahrenheit = quantity1.convertingTheTemperature(100, Unit.FAHRENHEIT);
		Assert.assertEquals(212, degreeFahrenheit, 0.0);
	}
}

