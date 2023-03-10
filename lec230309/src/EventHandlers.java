import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.beans.EventHandler;

public class EventHandlers extends JFrame {

    JButton myButton = new JButton("IMABUTTON");

    EventHandlers(){
        setVisible(true);
        setSize(100, 100);
        setLayout(new GridLayout(1, 1));
        add(myButton);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //myButton.addActionListener(EventHandler.create(ActionListener.class, this, "dispose"));
        EventHandler.create(ActionListener.class, myButton, "nextFocusableComponent", "source");

    }

    public static void main(String[] args) {
        EventHandlers eventHandlers = new EventHandlers();
    }
}
