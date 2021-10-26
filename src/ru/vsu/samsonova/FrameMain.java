package ru.vsu.samsonova;

import javax.swing.*;

public class FrameMain extends JFrame {
    public FrameMain(){
        setTitle("Smesharic");
        setSize(1100,800);
        add(new MainPanel());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
