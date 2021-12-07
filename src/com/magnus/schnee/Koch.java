package com.magnus.schnee;

import com.magnus.Drawer;

import javax.swing.*;
import java.awt.*;

public class Koch {
    public static void main(String[] args) {
        Point2 p1, p2;
        Flocke f;
        PointListElement pointer;

        Drawer d = new Drawer();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        d.setPreferredSize(new Dimension(1000, 450));
        frame.getContentPane().add(d, BorderLayout.CENTER);
        frame.setTitle("Kochsche Schneeflocke");

        p1 = new Point2(0.0, 0.0);
        p2 = new Point2(1000.0, 0.0);
        f = new Flocke(p1, p2);
        f.rekursivSchneiden(f.first, f.last, 5);
        pointer = f.first;
        while (pointer != null && pointer.getNext() != null) {
            d.addLine((int) pointer.getP().getX(), 400 - (int) pointer.getP().getY(),
                    (int) pointer.getNext().getP().getX(), 400 - (int) pointer.getNext().getP().getY());
            pointer = pointer.getNext();
        }

        frame.pack();
        frame.setVisible(true);
    }
}
