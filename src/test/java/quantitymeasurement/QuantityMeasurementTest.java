package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Objects;

@RunWith(MockitoJUnitRunner.class)
public class QuantityMeasurementTest {

	@Test
	public void givenZeroFeetAndZeroFeet_WhenComparedInEquality_ShouldReturnEquals() {
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(0.0);
		Assert.assertEquals(feet1, feet2);
	}

	@Test
	public void givenZeroFeetAndOneFeet_WhenComparedInEquality_ShouldReturnNotEquals() {
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(1.0);
		Assert.assertNotEquals(feet1, feet2);
	}

	@Test
	public void givenFeet_WhenIsNotNull_ShouldReturnTrue() {
		Feet feet1 = new Feet(1.0);
		boolean nullValueCheck = Objects.nonNull(feet1);
		Assert.assertTrue(nullValueCheck);
	}

	@Test
	public void givenFeet_WhenIsNull_ShouldReturnTrue() {
		Feet feet1 = null;
		boolean nullValueCheck = Objects.isNull(feet1);
		Assert.assertTrue(nullValueCheck);
	}

	@Test
	public void givenFeetValue_WhenCheckedForReferenceWithAnotherFeetValue_ShouldReturnNotSame() {
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(1.0);
		Assert.assertNotSame(feet1, feet2);
	}

	@Test
	public void givenFeetValue_WhenCheckedForReference_ShouldReturnSame() {
		Feet feet1 = new Feet(1.0);
		Assert.assertSame(feet1, feet1);
	}

	@Test
	public void givenFeetValue_WhenOfSameType_ShouldReturnEquals() {
		Feet feet1 = new Feet (1.0);
		Assert.assertEquals(feet1.getClass(), Feet.class);
	}

	@Test
	public void givenFeetValue_WhenOfDifferentType_ShouldReturnNotEquals() {
		Feet feet1 = new Feet (1.0);
		Assert.assertNotEquals(feet1.getClass(), Inch.class);
	}

	@Test
	public void givenTwoFeetValues_WhenAreEqual_ShouldReturnTrue() {
		Feet feet1 = new Feet(1.0);
		Feet feet2 = new Feet(1.0);
		boolean equalValue = Objects.equals(feet1, feet2);
		Assert.assertTrue(equalValue);
	}

	@Test
	public void givenTwoFeetValues_WhenAreNotEqual_ShouldReturnFalse() {
		Feet feet1 = new Feet(1.0);
		Feet feet2 = new Feet(0.0);
		boolean equalValue = Objects.equals(feet1, feet2);
		Assert.assertFalse(equalValue);
	}

	@Test
	public void givenZeroInchAndZeroInch_WhenComparedInLengths_ShouldReturnEquals() {
		Inch inch1 = new Inch(0.0);
		Inch inch2 = new Inch(0.0);
		Assert.assertEquals(inch1, inch2);
	}

	@Test
	public void givenZeroInchAndOneInch_WhenComparedInLengths_ShouldReturnNotEquals() {
		Inch inch1 = new Inch(1.0);
		Inch inch2 = new Inch(0.0);
		Assert.assertNotEquals(inch1, inch2);
	}

	@Test
	public void givenInch_WhenIsNotNull_ShouldReturnTrue() {
		Inch inch1 = new Inch(1.0);
		boolean nullValueCheck = Objects.nonNull(inch1);
		Assert.assertTrue(nullValueCheck);
	}

	@Test
	public void givenInch_WhenIsNull_ShouldReturnTrue() {
		Inch inch1 = null;
		boolean nullValueCheck = Objects.isNull(inch1);
		Assert.assertTrue(nullValueCheck);
	}


	@Test
	public void givenInchValue_WhenCheckedForReferenceWithAnotherInchValue_ShouldReturnNotSame() {
		Inch inch1 = new Inch(1.0);
		Inch inch2 = new Inch(0.0);
		Assert.assertNotSame(inch1, inch2);
	}

	@Test
	public void givenInchValue_WhenCheckedForReference_ShouldReturnSame() {
		Inch inch1 = new Inch(1.0);
		Assert.assertSame(inch1, inch1);
	}

	@Test
	public void givenInchValues_WhenAreEqual_ShouldReturnTrue() {
		Inch inch1 = new Inch(1.0);
		Inch inch2 = new Inch(1.0);
		boolean equalValue = Objects.equals(inch1, inch2);
		Assert.assertTrue(equalValue);
	}

	@Test
	public void givenTwoInchValues_WhenAreNotEqual_ShouldReturnFalse() {
		Inch inch1 = new Inch(1.0);
		Inch inch2 = new Inch(0.0);
		boolean equalValue = Objects.equals(inch1, inch2);
		Assert.assertFalse(equalValue);
	}

	@Test
	public void givenInchValue_WhenOfSameType_ShouldReturnEqual() {
		Inch inch1 = new Inch(1.0);
		Assert.assertEquals(inch1.getClass(), Inch.class);
	}

	@Test
	public void givenInchValue_WhenOfDifferentType_ShouldReturnNotEqual() {
		Inch inch1 = new Inch(1.0);
		Assert.assertNotEquals(inch1.getClass(), Feet.class);
	}
}
