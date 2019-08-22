package com.januszyk;

import com.januszyk.categories.Important;
import com.januszyk.categories.TimeConsuming;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CarTest {

    @Test
    @Category(Important.class)
    public void shouldStartEngine() {
        Car car = new Car();
        car.startEngine();

        assertTrue(car.isStarted());
    }

    @Test
    public void shouldStopEngine() {
        Car car = new Car();

        car.startEngine();
        car.stopEngine();

        assertFalse(car.isStarted());
    }

    @Test
    @Category(TimeConsuming.class)
    public void longCarTest() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Test
    @Category(TimeConsuming.class)
    public void longCarTest2() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Test
    @Category(TimeConsuming.class)
    public void longCarTest3() throws InterruptedException {
        Thread.sleep(1000);
    }
}
