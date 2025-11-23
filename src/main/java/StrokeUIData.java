import examinationdata.BP;
import examinationdata.Diagnosis;
import examinationdata.MRI;
import examinationdata.Patient;

import java.util.ArrayList;
import java.util.List;

public class StrokeUIData {

    private List<Diagnosis> diagnoses = new ArrayList<>();// so you make a list of all diagnosis objects

    public StrokeUIData() {//you instantiate all objects that construct a diagnosis

        Patient patient1 = new Patient("Daphne Von Oram","62",
                "https://fiverr-res.cloudinary.com/t_main1,q_auto,f_auto/gigs3/410509884/original/f0ebca5e68f109a3b1069038104b7493dd2aad74.png");

        Patient patient2 = new Patient("Sebastian Compton","31",
                "https://www.shutterstock.com/image-vector/illustration-smiling-young-man-brown-600nw-2575185307.jpg");

        MRI mri1 = new MRI("2 Tesla",
                "https://images.theconversation.com/files/154051/original/image-20170124-27009-zf92r6.jpg?ixlib=rb-4.1.0&q=45&auto=format&w=754&fit=clip");

        MRI mri2 = new MRI("4 Tesla",
                "https://www.cam.ac.uk/sites/default/files/styles/content-885x432/public/news/research/news/brain-512758-1280.jpg?itok=gwceHwbD");

        BP bp1 = new BP("ST","70", "130");
        BP bp2 = new BP("VST","80", "150");

        diagnoses.add(new Diagnosis(patient1, mri1, bp1));//make diagnosis objects i guess?
        diagnoses.add(new Diagnosis(patient2, mri2, bp2));
    }

    public List<Diagnosis> getDiagnoses() {
        return diagnoses;//remember thisss
    }
}
