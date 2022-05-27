package Lesson7;

import javax.swing.*;
import java.awt.*;

public class InterFace extends JPanel {

    private JPanel  result;
    private JLabel labelResult;

    private JPanel inBlock;
    private JLabel labelIn;

    private JPanel buttonBlock;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton buttonx;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton buttonminus;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton buttonplus;
    private JButton buttonplusminus;
    private JButton button0;
    private JButton buttontochka;
    private JButton buttonravno;
    public InterFace(){
        setBackground(Color.black);
        setLayout(new GridLayout(3,1));

        prepareResult();
        prepareInBlock();
        preparaButtonBlock();

        add(result);
        add (inBlock);
        add(buttonBlock);

    }

 public void prepareResult(){
       result = new JPanel();
       labelResult = new JLabel("-------<Hello>-------");


       result.add (labelResult) ;

 }

public void prepareInBlock(){
        inBlock = new JPanel();
        labelIn = new JLabel("Ввод чисел:-----------");
        inBlock.add (labelIn);


}

public void preparaButtonBlock(){
     buttonBlock =new JPanel();
     buttonBlock.setLayout(new GridLayout(4,4));
     button7 = new JButton("7");
     button8= new JButton("8");
     button9=new JButton("9");
     buttonx=new JButton("X");
     button4=new JButton("4");
     button5=new JButton("5");
     button6=new JButton("6");
     buttonminus=new JButton("-");
     button1=new JButton("1");
     button2=new JButton("2");
     button3=new JButton("3");
     buttonplus=new JButton("+");
     buttonplusminus=new JButton("+/-");
     button0=new JButton("0");
     buttontochka=new JButton(".");
     buttonravno=new JButton("=");

     buttonBlock.add (button7);
     buttonBlock.add(button8);
     buttonBlock.add(button9);
     buttonBlock.add(buttonx);
     buttonBlock.add(button4);
     buttonBlock.add(button5);
     buttonBlock.add(button6);
     buttonBlock.add(buttonminus);
     buttonBlock.add(button1);
     buttonBlock.add(button2);
     buttonBlock.add(button3);
     buttonBlock.add(buttonplus);
     buttonBlock.add(buttonplusminus);
     buttonBlock.add(button0);
     buttonBlock.add(buttontochka);
     buttonBlock.add(buttonravno);



    }



}
