import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.text.NumberFormat;

public class SchaltjahrGUI extends JFrame{
    JTextField textfield_year;
    JTextField textfield_result;

    JButton button;

    public  AppWindow() {
        this.getContentPane().setLayout(null);
        this.initWindow();
        this.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent arg0) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

            }

            @Override
            public void windowActivated(WindowEvent e) {

            }

            @Override
            public void windowDeactivated(WindowEvent e) {

            }
        });

        protected void initWindow() {
            // Instanzieren
            textfield_year = new JTextField();
            textfield_result = new JTextField();

            button = new JButton("Berechne Schaltjahr.");
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    buttonBerechneSchaltjahrClicked();
                }
            });

            // Position festlegen
            textfield_year.setBounds(5, 10, 400, 25);
            textfield_result.setBounds(5, 80, 400, 25);
            button.setBounds(300, 110,100, 30);

            this.getContentPane().add(textfield_result);
            this.getContentPane().add(textfield_year);
            this.getContentPane().add(button);

            this.pack();
         }

         public int berechneSchaltjahr(int year) {
            if (year%4 == 0) {
                System.out.println("Das Jahr " + year + "ist ein Schaltjahr.");
            } else if (year%100 == 0 && year%400 == 0) {
                System.out.println("Das Jahr " + year + "ist ein Schaltjahr.");
            } else if (year%100 == 0) {
                System.out.println("Das Jahr " + year + "ist kein Schaltjahr.");
            } else {
                System.out.println("ERROR.");
            }
        }

         public void buttonBerechneSchaltjahrClicked() {
            int year = 0;
            try {
                year = Integer.parseInt(textfield_year.getText());
            } catch (NumberFormatException e) {
                year = -1;
                System.out.println("Die Zahl darf nicht negativ sein.");
            }
            // Eingabe verarbeiten
            if (year > 0) {
                // Berechne
                int year_result = this.berechneSchaltjahr();
                // Ausgabe
                NumberFormat nf = NumberFormat.getInstance();
                nf.setMaximumFractionDigits(2);
                String ausgabe = nf.format(year);
                textfield_result.setText(ausgabe);
            } else {
                textfield_result.setText("Eingabe ist nicht in Ordnung.");
            }
        }
    }
}