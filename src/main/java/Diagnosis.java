import examinationdata.BP;
import examinationdata.MRI;
import examinationdata.Patient;

public class Diagnosis {
    private Patient patient1;
    private MRI mri1;
    private BP bp1;


    public Diagnosis() {
        patient1 = new Patient("Dalphne Von Oram","62","https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg");
        mri1 = new MRI("2 Tesla");
        bp1 = new BP("ST");
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









}
