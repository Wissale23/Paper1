package UIData;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;


public class DisplayImage extends JPanel {

    public DisplayImage(String url){ // String[] urls then you do for loop for everything, 
        JLabel label= new JLabel(); //A JLabel is a Swing component that can display text or images. JLabel will have to have rows that = number of urls
        URL imageURL = null;

        try {
            imageURL = new URL(url);
            //System.out.println("Image width: " + icon.getIconWidth() + ", height: " + icon.getIconHeight());
        }
        catch (MalformedURLException e){
            System.out.println(e.getMessage());
        }

        ImageIcon icon = new ImageIcon(imageURL); //ImageIcon is a Swing object that can store and display images in components like JLabel.
        label.setIcon(icon);
        add(label);

    }
}

for (String url : mri1.getMRIURLs()) { // mri1.getMRIURLs.size() returns number of urls
    System.out.println(url);
}
