package Lesson7;

import javax.swing.*;
import java.awt.*;

public class CalcWindow extends JFrame {



        private int windowsWeght = 450;
        private int windowsHeght = 350;
        private int windowX = 200;
        private int windowY = 150;
        private InterFace face;

        public CalcWindow () {
            prepareWindow();

            face = new InterFace();
            add(face);


            setVisible(true);


        }

    private void prepareWindow() {
        setLocation(windowX, windowY);
        setSize(windowsHeght, windowsWeght);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculation");
        setResizable(false);
    }
}



