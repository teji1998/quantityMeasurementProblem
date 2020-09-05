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
	public void given36InchAndOneYard_WhenCompared_ShouldReturnTrue() {
		unitConverter1 = new UnitConverter(36, Unit.INCH);
		unitConverter2 = new UnitConverter(1.0, Unit.YARD);
		boolean compareCheck = unitConverter1.compare(unitConverter2);
		Assert.assertTrue(compareCheck);
	}
}

