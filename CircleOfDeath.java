import java.util.*;
import javax.swing.*;
import java.awt.*;

public class CircleOfDeath{

	private static CardDeck d;
	private static CardPanel primary;
	
public static void main(String[] args){
		JFrame table = new JFrame("Circle of Death");
		table.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		d = new CardDeck();
		primary = new CardPanel(d);
		table.getContentPane().add(primary);
		table.pack();
		table.setVisible(true);
		
	}
}
