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
    public void testSettingJobId(){
    Job testJob1 = new Job();
    Job testJob2 = new Job();
           assertNotEquals(testJob1,testJob2);
}


    @Test
    public void testJobConstructorSetsAllFields(){
    Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
assertTrue("Employer is an instance of the Employer class", testJob.getEmployer() instanceof Employer);
        assertTrue("Location is an instance of the Location class", testJob.getLocation() instanceof Location);
        assertTrue("Position type is an instance of the PositionType class", testJob.getPositionType() instanceof PositionType);
        assertTrue("name is an instance of the Job class", testJob.getName() instanceof String);
        assertTrue("Employer is an instance of the Employer class", testJob.getEmployer() instanceof Employer);
        assertEquals("Expect name to equal 'Product tester'.", testJob.getName(),"Product tester" );
        assertEquals("Expect employer to equal 'ACME'.", testJob.getEmployer().getValue(), "ACME");
        assertEquals("Expect location to equal 'Desert'.", testJob.getLocation().getValue(), "Desert");
        assertEquals("Expect position type to equal 'Quality control'.", testJob.getPositionType().getValue(), "Quality control");
        assertEquals("Expect core competency to equal 'Persistence'.", testJob.getCoreCompetency().getValue(), "Persistence");
}

    @Test
    public void testJobsForEquality() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        System.out.println(testJob1.equals(testJob2));
}
}
