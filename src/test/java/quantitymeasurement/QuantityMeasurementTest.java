package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Objects;

@RunWith(MockitoJUnitRunner.class)
public class QuantityMeasurementTest {

	@Test
	public void givenZeroFeetAndZeroFeet_WhenComparedInLengths_ShouldReturnEquals() {
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(0.0);
		Assert.assertEquals(feet1, feet2);
	}

	@Test
	public void givenZeroFeetAndOneFeet_WhenComparedInLengths_ShouldReturnNotEquals() {
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

}
