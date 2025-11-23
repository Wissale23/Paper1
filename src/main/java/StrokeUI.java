import UIData.DisplayDataBP;
import UIData.DisplayDataPatient;
import UIData.DisplayImage;
import examinationdata.Diagnosis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

public class StrokeUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Stroke UI");
        frame.setSize(1000, 1000);

        StrokeUIData Data1 = new StrokeUIData();
        List<Diagnosis> diagnoses = Data1.getDiagnoses();
        frame.setLayout(new GridLayout(diagnoses.size(), 4));

        for (Diagnosis d : diagnoses) {

            frame.add(new DisplayImage(d.getPatientURL()));
            frame.add(new DisplayDataPatient(d));
            frame.add(new DisplayImage(d.getMRIURL()));
            frame.add(new DisplayDataBP(d));
        }

        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
}
