package JavaComponents;

import java.awt.*;
import java.awt.event.*;

class FrameDemo {
    static class MyWindowAdapter extends WindowAdapter{
        public void windowClosing(WindowEvent we){
                                                        System.exit(0);
                                                                        }
    }
    static class Main {
        public static void main(String[] args) {
            Frame f = new Frame("My Frame");
            f.setLayout(new FlowLayout());
            Label l = new Label("Hello World!");
            f.add(l);
            Button b = new Button("Ok");
            f.add(b);
            f.setSize(400, 400);
            f.addWindowListener(new MyWindowAdapter());
            f.setVisible(true);
        }
    }
}

