package src;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConvertFrame extends JFrame
{
    private JPanel firstJPanel, secondJPanel, thirdJPanel, resultPanel;
    private JLabel label1, label2, label3, label4;
    private JTextField inputJTextField;
    private JLabel resultJLabel;
    private ButtonGroup radioButtonGroup1, radioButtonGroup2;
    private JRadioButton fahrenheitJRadioButton1, fahrenheitJRadioButton2;
    private JRadioButton celciusJRadioButton1, celciusJRadioButton2;
    private JRadioButton kelvinJRadioButton1, kelvinJRadioButton2;

    // constructor for setting GUI up
    public ConvertFrame() {


        // input Radio button
        fahrenheitJRadioButton1 = new JRadioButton("Fahrenheit", true);
        celciusJRadioButton1 = new JRadioButton("Celcius", false);
        kelvinJRadioButton1 = new JRadioButton("Kelvin", false);


        // output Radio buttons
        fahrenheitJRadioButton2 = new JRadioButton("Fahrenheit", false);
        celciusJRadioButton2 = new JRadioButton("Celcius", true);
        kelvinJRadioButton2 = new JRadioButton("Kelvin", false);

        // adding buttons to appropriate button groups
        radioButtonGroup1 = new ButtonGroup();
        radioButtonGroup1.add(fahrenheitJRadioButton1);
        radioButtonGroup1.add(celciusJRadioButton1);
        radioButtonGroup1.add(kelvinJRadioButton1);

        radioButtonGroup2 = new ButtonGroup();
        radioButtonGroup2.add(fahrenheitJRadioButton2);
        radioButtonGroup2.add(celciusJRadioButton2);
        radioButtonGroup2.add(kelvinJRadioButton2);

        // create labels
        label1 = new JLabel("Convert from:");
        label2 = new JLabel("Enter Numeric Temperature:");
        label3 = new JLabel("Convert to:");
        label4 = new JLabel("Comparable Temperature is:");
        resultJLabel = new JLabel();

        //#1 set first JPanel
        firstJPanel = new JPanel();
        firstJPanel.setLayout(new GridLayout(1,1));
        firstJPanel.add(fahrenheitJRadioButton1);
        firstJPanel.add(celciusJRadioButton1);
        firstJPanel.add(kelvinJRadioButton1);

        //#2 set second JPanel
        secondJPanel = new JPanel();
        // create JTextField for getting input number
        inputJTextField = new JTextField(10);
        secondJPanel.add(inputJTextField);


        // #3 set third JPanel
        thirdJPanel = new JPanel();
        thirdJPanel.setLayout(new GridLayout(1, 1));
        thirdJPanel.add(fahrenheitJRadioButton2);
        thirdJPanel.add(celciusJRadioButton2);
        thirdJPanel.add(kelvinJRadioButton2);

        // #4 set result JPanel
        resultPanel= new JPanel();
        resultPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        resultPanel.add(resultJLabel);


        inputJTextField.addActionListener(

                new ActionListener()
                {
                    // perform calculations
                    public void actionPerformed(ActionEvent event)
                    {
                        double input, result = 0;

                        input = Double.parseDouble(((JTextField)event.getSource()).getText());

                        // F to Cel
                        if (fahrenheitJRadioButton1.isSelected() && celciusJRadioButton2.isSelected())
                            result = (input-32)*5/9;
                            // F to Kel
                        else if (fahrenheitJRadioButton1.isSelected() && kelvinJRadioButton2.isSelected())
                            result = ((input-32)*5/9) + 273.15;
                            // Cel to F
                        else if (celciusJRadioButton1.isSelected() && fahrenheitJRadioButton2.isSelected())
                            result = (input*9/5) + 32;
                            // Cel to Kel
                        else if (celciusJRadioButton1.isSelected() && kelvinJRadioButton2.isSelected())
                            result = input + 273.15;
                            // Kel to F
                        else if (kelvinJRadioButton1.isSelected() && fahrenheitJRadioButton2.isSelected())
                            result = ((input - 273.15)*9/5+32);
                            // Kel to Cel
                        else if (kelvinJRadioButton1.isSelected() && celciusJRadioButton2.isSelected())
                            result = (input - 273.15);
                        else
                            result = input;

                        resultJLabel.setText(String.valueOf(result));


                    }
                }
        );

        //GUI components
        setLayout(new GridLayout(8, 1));
        add(label1);
        add(firstJPanel);
        add(label2);
        add(inputJTextField);
        add(label3);
        add(thirdJPanel);
        add(label4);
        add(resultPanel);
    }

}