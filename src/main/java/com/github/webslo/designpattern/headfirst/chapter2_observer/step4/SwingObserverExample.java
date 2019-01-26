package com.github.webslo.designpattern.headfirst.chapter2_observer.step4;

import javax.swing.*;
import java.awt.*;

/**
 * @author wenhailin
 * @version 0.0.1
 * @createTime 2019-01-26 19:48
 * @description
 */
public class SwingObserverExample {
    JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        jFrame = new JFrame();
        JButton button = new JButton("Should I do it?");
        button.addActionListener(it -> System.out.println("Come on, do it!"));
        button.addActionListener(it -> System.out.println("Don't do it, you may regret it!"));
        jFrame.getContentPane().add(BorderLayout.CENTER, button);
    }
}
