package examinationdata;

public class Patient {
    private String firstName;
    private String patientURL;
    private String age;

    public Patient(String firstName, String age, String patientURL) {
        this.firstName = firstName;
        this.age = age;
        this.patientURL = patientURL;
    }

    public String getName(){
        return firstName;
    }

    public String getAge(){
        return age;
    }

    public String getPatientURL(){
        return patientURL;
    }

}
