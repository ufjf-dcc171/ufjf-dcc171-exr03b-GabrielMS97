package br.ufjf.dcc171;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Janela extends JFrame {

    private final JLabel etiqueta1 = new JLabel("Digite o primeiro valor");
    private final JLabel etiqueta2 = new JLabel("Digite o segundo valor");
    private final JLabel etiqueta3 = new JLabel("");
    private final JTextField texto1 = new JTextField(15);
    private final JTextField texto2 = new JTextField(15);
    private final JButton btn1 = new JButton("Soma");
    private final JButton btn2 = new JButton("Subtração");
    private final JButton btn3 = new JButton("Multiplicação");
    private final JButton btn4 = new JButton("Divisão");

    private double x, y;

    public Janela() throws HeadlessException {
        super("Calculadora");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(etiqueta1);
        add(texto1);
        add(etiqueta2);
        add(texto2);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(etiqueta3);

        btn1.addActionListener(new soma());
        btn2.addActionListener(new subtracao());
        btn3.addActionListener(new multiplicacao());
        btn4.addActionListener(new divisao());

    }

    private class divisao implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            x = Double.parseDouble(texto1.getText());
            y = Double.parseDouble(texto2.getText());
            etiqueta3.setText("Resultado da divisão: " + (x / y));
        }

    }

    private class multiplicacao implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            x = Double.parseDouble(texto1.getText());
            y = Double.parseDouble(texto2.getText());
            etiqueta3.setText("Resultado da multiplicação: " + (x * y));
        }

    }

    private class subtracao implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            x = Double.parseDouble(texto1.getText());
            y = Double.parseDouble(texto2.getText());
            etiqueta3.setText("Resultado da subtração: " + (x - y));
        }

    }

    private class soma implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            x = Double.parseDouble(texto1.getText());
            y = Double.parseDouble(texto2.getText());
            etiqueta3.setText("Resultado da soma: " + (x + y));
        }
    }
}
