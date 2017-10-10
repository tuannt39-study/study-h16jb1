package Lesson06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;
import java.util.*;
import java.util.List;

/**
 * Created by Dzung on 10/9/2016.
 */
public class Bai3 {
    private JList lsInput;
    private JButton btnCopy;
    private JTextPane txtOutput;
    private JPanel pnlContent;
    private JScrollPane pnlScroll;
    private JPanel pnlContainer;

    public Bai3() {
        JFrame frame = new JFrame();
        frame.setLocationRelativeTo(null);
        frame.setSize(350, 200);
        frame.setContentPane($$$getRootComponent$$$());
        frame.setTitle("Đổi phông chữ");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        handler();
    }

    private void handler() {
        String list[] = {"Black", "Blue", "Cyan", "Dark Gray", "Gray", "Red", "Yellow", "Orange", "Green"};
        lsInput.setListData(list);

        btnCopy.addActionListener(new ActionListener() {
            FileWriter writer;

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    List list = lsInput.getSelectedValuesList();
                    writer = new FileWriter(new File("colorList.txt"), true);
                    String line = "";
                    for (int i = 0; i < list.size(); i++) {
                        line += list.get(i) + "\n";
                    }
                    txtOutput.setText(line);
                    writer.write(line);
                } catch (IOException e1) {
                    e1.printStackTrace();
                } finally {
                    try {
                        writer.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
            }
        });
        FileReader reader;
        try {
            reader = new FileReader(new File("colorList.txt"));
            String before = "";
            while (reader.ready()) {
                before += Character.toString((char) reader.read());
            }
            txtOutput.setText(before);
            reader.close();
        } catch (IOException e) {

        }

    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        pnlContent = new JPanel();
        pnlContent.setLayout(new BorderLayout(0, 0));
        pnlContainer = new JPanel();
        pnlContainer.setLayout(new GridBagLayout());
        pnlContent.add(pnlContainer, BorderLayout.CENTER);
        pnlScroll = new JScrollPane();
        pnlScroll.setVerticalScrollBarPolicy(22);
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.VERTICAL;
        pnlContainer.add(pnlScroll, gbc);
        lsInput = new JList();
        final DefaultListModel defaultListModel1 = new DefaultListModel();
        lsInput.setModel(defaultListModel1);
        pnlScroll.setViewportView(lsInput);
        btnCopy = new JButton();
        btnCopy.setText("Copy >>>");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        pnlContainer.add(btnCopy, gbc);
        txtOutput = new JTextPane();
        txtOutput.setEditable(false);
        txtOutput.setText("Output");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        pnlContainer.add(txtOutput, gbc);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return pnlContent;
    }
}