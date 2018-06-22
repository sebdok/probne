package pl.sda.exempel.swing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class AppBootSraper {

    private static DefaultTableModel tablemodel = new DefaultTableModel();

    static void start() {
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                JFrame jFrame = new JFrame();
                LayoutManager layout = new GridLayout(2, 0);
                jFrame.setTitle("Moj projekt");
                jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

                addTable(jFrame);
                addButon(jFrame);

                jFrame.setSize(360, 250);
                jFrame.pack();
                jFrame.setVisible(true);


                private void addTable (JFrame jFrame){
                    tablemodel.addColumn("First column");
                    tablemodel.addColumn("Second column");
                    tablemodel.addColumn("Numbers");

                    JTable table = new JTable(tablemodel);
                    JScrollPane scrollPane = new JScrollPane(table);
                    jFrame.add(scrollPane);
                }


                private void addButon (JFrame jFrame){
                    JPanel buttonPanel = new JPanel();
                    buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
                    JButton button = new JButton("Read People");

                    button.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            new Thread(AppBootSraper::readFiile).start();
                        }

                    });
                    buttonPanel.add(button);
                }
            }

        });

    }

    private static void readFiile() {

        try {
            Thread.sleep(5000);

            List<String> people = Files.readAllLines(Paths.get("C:", "Users", "Z40A", "Desktop",
                    "SDA", "people.txt"));
            people.forEach(AppBootSraper::readPersonLine);


        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void readPersonLine(String personLine) {
        Person person = parsePerson(personLine);

    }

    private static Person parsePerson(String personLine) {

    }

}
