package org.philips.swcoe.qualityGatesDemo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DemoQualityGatesTest {

    @Test
    public void testHappyCase() {
        String expectedName = "Hello World";
        DemoQualityGates app = new DemoQualityGates(expectedName);
        Assert.assertNotNull(app.getName());
        Assert.assertEquals(expectedName, app.getName());
    }

}