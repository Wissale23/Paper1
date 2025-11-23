package examinationdata;


public class Diagnosis {
    private Patient patient1;
    private MRI mri1;
    private BP bp1;


    public Diagnosis(Patient patient1,MRI mri1,BP bp1) {
        this.patient1 = new Patient(patient1.getName(),patient1.getAge(),patient1.getPatientURL());
        this.mri1 = new MRI(mri1.getMFS(),mri1.getMRIURL());
        this.bp1 = new BP(bp1.getDuration(),bp1.getDiastolic(),bp1.getSystolic());
    }

    public String getName(){
        return patient1.getName();
    }

    public String getAge(){
        return patient1.getAge();
    }

    public String getDuration(){
        return bp1.getDuration();
    }

    public String getMFS(){
        return mri1.getMFS();
    }

    public String getPatientURL(){
        return patient1.getPatientURL();
    }

    public String getMRIURL(){
        return mri1.getMRIURL();
    }

    public String getDiastolic(){
        return bp1.getDiastolic();
    }
    public String getSystolic(){
        return bp1.getSystolic();
    }
}
