package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private  int id;
    private static int nextId = 1;
    private String value;
    private  String name;
    private  Employer employer;
    private  Location location;
    private  PositionType positionType;
    private  CoreCompetency coreCompetency;



    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
public Job(){
    id = nextId;
    nextId ++;
}
public Job(String aName, Employer anEmployer, Location aLocation, PositionType aPositionType, CoreCompetency aCoreCompetency) {
        this();
        name = aName;
    employer = anEmployer;
    location = aLocation;
    positionType = aPositionType;
    coreCompetency = aCoreCompetency;
}

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    @Override
    public String toString(){
        if(this.getName() == null || this.getName().equals("")){
            setName("Data not found");
        }
            if (employer.getValue() == null || this.getEmployer().equals("")){
                employer.setValue("Data not found");
            }

        if (location.getValue() == null|| this.getLocation().equals("")){
            location.setValue("Data not found");
        }
        if (positionType.getValue() == null || this.getPositionType().equals("")){
            location.setValue("Data not found");
        }

       if (coreCompetency.getValue() == null|| this.getCoreCompetency().equals("")){
           coreCompetency.setValue("Data not found");
        }


       String names = this.getName();
//       String employers = employer;
//     String locations = location;
//       String positionTypes = positionType;
//      String coreCompetencies = coreCompetency;



String value = "\n" + "ID: "+ id + '\n'+'\n' + "Name: "+ names + '\n'+'\n' + "Employer: "+ this.getEmployer() + '\n'+'\n' + "Location: "+ this.getLocation() + '\n'+'\n' +"Position Type: " +this.getPositionType() + '\n'+'\n' +"Core Competency: "+ this.getCoreCompetency() + '\n';


        //String value = "\n" + "ID: "+ Job.getId() + '\n'+'\n' + "Name: "+ '\n'+'\n' + "Employer: "+  '\n'+'\n' + "Location: "+ '\n'+'\n' +"Position Type: " + '\n'+'\n' +"Core Competency: "+ '\n';

        return value;
    }

}