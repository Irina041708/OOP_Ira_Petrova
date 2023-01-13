package controllers;
// https://www.youtube.com/watch?v=R_yZfLdApro
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator3<T extends Number> extends JFrame {
    public Number res = 0;
    //Создаем конструктор
    public Calculator3(){
        setTitle("Калькулятор");
        //Создаем кнопки
        JPanel panel = new JPanel();
        // JButton minus = new JButton("-");
        JButton plus = new JButton("+");
        JButton multiply = new JButton("*");
        // JButton divide = new JButton("/");
        //Декларируем резултат
        JLabel result = new JLabel("result");
        //Создаем два текстовых поля для значений
        JTextField x1 = new JTextField("1");
        JTextField x2 = new JTextField("2");

        ActionListener listenerPus = new ActionListener() {
           
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int x_1 = Integer.parseInt(x1.getText());
                int x_2 = Integer.parseInt(x2.getText());
                res = x_1 + x_2;
                result.setText(String.valueOf(res));
            }
        };

        
        ActionListener listenerMultiply = new ActionListener() {
           
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int x_1 = Integer.parseInt(x1.getText());
                int x_2 = Integer.parseInt(x2.getText());
                res = x_1 * x_2;
                result.setText(String.valueOf(res));
            }
        };
        //Привязываем к кнопкам
        plus.addActionListener(listenerPus);
        multiply.addActionListener(listenerMultiply);

        //Делаем размер окна
        panel.setSize(new Dimension (500,150));
        add(panel);
        panel.add(result);
        panel.add(plus);
        panel.add(multiply);
        panel.add(x1);
        panel.add(x2);
        setPreferredSize(new Dimension (600,600));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }
}
