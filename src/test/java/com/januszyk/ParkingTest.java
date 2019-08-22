package com.januszyk;

import com.januszyk.categories.Important;
import com.januszyk.categories.TimeConsuming;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class ParkingTest {

    @Test
    public void shouldBeBusy() {
        Parking parking = new Parking();
        parking.park(new Car());

        Assert.assertTrue(parking.isBusy());
    }

    @Test
    public void shouldBeNotBusy() {
        Parking parking = new Parking();

        Assert.assertFalse(parking.isBusy());
    }

    @Test(expected = IllegalStateException.class)
    @Category(Important.class)
    public void shouldThrowExceptionWhenParkedTwoTimes() {
        Parking parking = new Parking();

        parking.park(new Car());
        parking.park(new Car());
    }

    @Test
    public void shouldReturnParkedCar() {
        Parking parking = new Parking();
        Car car = new Car();

        parking.park(car);

        Assert.assertEquals(car, parking.unpark());
    }

    @Test
    @Category(TimeConsuming.class)
    public void longParkingTest() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Test
    @Category(TimeConsuming.class)
    public void longParkingTest2() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Test
    @Category(TimeConsuming.class)
    public void longParkingTest3() throws InterruptedException {
        Thread.sleep(1000);
    }
}
