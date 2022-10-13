package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when41to20then2dot236() {
        double expected = 2.236;
        Point a = new Point(4, 1);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when63to75then2dot236() {
        double expected = 2.236;
        Point a = new Point(6, 3);
        Point b = new Point(7, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to93then8dot246() {
        double expected = 8.246;
        Point a = new Point(1, 1);
        Point b = new Point(9, 3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to010then1() {
        double expected = 1;
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 1, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to111then1dot732() {
        double expected = 1.732;
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1, 1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when132to570then6() {
        double expected = 6;
        Point a = new Point(1, 3, 2);
        Point b = new Point(5, 7, 0);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}