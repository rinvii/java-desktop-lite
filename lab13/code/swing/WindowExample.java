import java.awt.*; // import OS agnostic swing libraries
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

// Driver
public class WindowExample extends JFrame{
	static Image img;
	JButton buttonHappy, buttonSad, buttonOK, buttonNOT;

	public static void main(String[] args){
		WindowExample w = new WindowExample();
		w.make();
	}

	public void make(){
		JFrame frame = new JFrame();
		JLabel label = new JLabel("You are a CS376 rockstar!");
		buttonHappy = new JButton(new HappyAction());
     	buttonSad = new JButton(new SadAction()); 
        buttonOK = new JButton("OK");
        buttonNOT = new JButton("Not OK");
     	ImageIcon imgHappy = new ImageIcon("images/smiley.png");
        JLabel imgLabelHappy = new JLabel(imgHappy);
        JScrollPane scrollPaneHappy = new JScrollPane(imgLabelHappy);
        ImageIcon imgSad = new ImageIcon("images/frowny.png");
        JLabel imgLabelSad = new JLabel(imgSad);
        JScrollPane scrollPaneSad = new JScrollPane(imgLabelSad);

        buttonOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                scrollPaneHappy.setVisible(false);
                scrollPaneSad.setVisible(true);
            }
        });

        buttonNOT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                scrollPaneSad.setVisible(false);
                scrollPaneHappy.setVisible(true);
            }
        });
		label.setBounds(20, 50, 220, 80);
    	buttonHappy.setBounds(20, 150, 100, 50);
		buttonSad.setBounds(20, 200, 100, 50);
        buttonOK.setBounds(20,250, 100, 50);
        buttonNOT.setBounds(20,300, 100, 50);
        scrollPaneHappy.setBounds(150, 150, 550, 550);
        scrollPaneSad.setBounds(150, 150, 550, 550);

		frame.setTitle("CS376: Example Window");
    	frame.setSize(800,800);

        frame.setVisible(true);

    	frame.add(label);
        frame.add(scrollPaneHappy);
        frame.add(scrollPaneSad);
		frame.add(buttonHappy);
  		frame.add(buttonSad);
        frame.add(buttonOK);
        frame.add(buttonNOT);

     	frame.setLayout(null);
   	}
}

class HappyAction extends AbstractAction{   
    HappyAction(){
    	super("Good");
	}

    @Override
    public void actionPerformed(ActionEvent arg0) {
        System.out.println("Good");
    }
}

class SadAction extends AbstractAction{   
    SadAction(){
    	super("Sad");
	}

    @Override
    public void actionPerformed(ActionEvent arg0) {
        System.out.println("Noooot Good");
    }
}
