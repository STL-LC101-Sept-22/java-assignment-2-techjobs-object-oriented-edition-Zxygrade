package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;


import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId() {
        Job testJob1 = new Job();
        Job testJob2 = new Job();
        assertNotEquals(testJob1.getId(), testJob2.getId());
    }


    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue("Employer is an instance of the Employer class", testJob3.getEmployer() instanceof Employer);
        assertTrue("Location is an instance of the Location class", testJob3.getLocation() instanceof Location);
        assertTrue("Position type is an instance of the PositionType class", testJob3.getPositionType() instanceof PositionType);
        assertTrue("name is an instance of the Job class", testJob3.getName() instanceof String);
        assertTrue("Employer is an instance of the Employer class", testJob3.getEmployer() instanceof Employer);
        assertEquals("Expect name to equal 'Product tester'.", testJob3.getName(), "Product tester");
        assertEquals("Expect employer to equal 'ACME'.", testJob3.getEmployer().getValue(), "ACME");
        assertEquals("Expect location to equal 'Desert'.", testJob3.getLocation().getValue(), "Desert");
        assertEquals("Expect position type to equal 'Quality control'.", testJob3.getPositionType().getValue(), "Quality control");
        assertEquals("Expect core competency to equal 'Persistence'.", testJob3.getCoreCompetency().getValue(), "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        System.out.println(testJob1.equals(testJob2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {

        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        System.out.println(testJob1.toString());
        assertEquals('\n', testJob1.toString().charAt(0));
        assertEquals('\n', testJob1.toString().charAt(testJob1.toString().length() - 1));


    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        System.out.println(testJob1.toString());
        assertEquals('\n'+"ID: 4" +'\n'+
                '\n'+ "Name: Product tester" +'\n'+
                '\n'+"Employer: ACME" +'\n'+
                '\n'+ "Location: Desert" +'\n'+
                '\n'+"Position Type: Quality control" +'\n'+
                '\n'+"Core Competency: Persistence"+'\n', testJob1.toString());

    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location(null), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        System.out.println(testJob1);

assertEquals('\n'+"ID: 3" +'\n'+
        '\n'+ "Name: Product tester" +'\n'+
        '\n'+"Employer: ACME" +'\n'+
        '\n'+ "Location: Data not found" +'\n'+
        '\n'+"Position Type: Quality control" +'\n'+
        '\n'+"Core Competency: Persistence"+'\n',testJob1.toString());
    }
}
