package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class QuantityMeasurementTest {

	@Test
	public void givenZeroFeetAndZeroFeet_WhenComparedInLengths_ShouldReturnEquals(){
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(0.0);
		Assert.assertEquals(feet1, feet2);
	}

	@Test
	public void givenZeroFeetAndOneFeet_WhenComparedInLengths_ShouldReturnNotEquals(){
		Feet feet1 = new Feet(0.0);
		Feet feet2 = new Feet(1.0);
		Assert.assertNotEquals(feet1, feet2);
	}
}
