import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardPanel extends JPanel implements ActionListener{

private CardDeck deck;
private JLabel icon;
private JButton next;
private JLabel broke;
private JLabel remain;
private final JLabel dates = new JLabel("Dates:", SwingConstants.CENTER);
private final JLabel rules = new JLabel("Rules:", SwingConstants.CENTER);
private JLabel dates1;
private JLabel dates2;
private JLabel dates3;
private JLabel dates4;

private JLabel rules1;
private JLabel rules2;
private JLabel rules3;
private JLabel rules4;

private JOptionPane dat;
private JOptionPane rul;

private JButton reset;

private JLabel action = new JLabel("", SwingConstants.CENTER);

public CardPanel(CardDeck d){
	deck = d;
	setPreferredSize(new Dimension(900,725));
	icon = new JLabel(deck.cardpic());
	icon.setPreferredSize(new Dimension(500, 300));
	broke = new JLabel("", SwingConstants.CENTER);
		broke.setPreferredSize(new Dimension(500, 25));
		broke.setFont(new Font("Times New Roman", Font.BOLD, 25));
	remain = new JLabel("Cards remaining: " + deck.remaining(), SwingConstants.CENTER);
		remain.setPreferredSize(new Dimension(500, 15));
		
	action.setPreferredSize(new Dimension(500, 25));
	action.setFont(new Font("Times New Roman", Font.BOLD, 25));
		
		
	rules.setFont(new Font("Times New Roman", Font.BOLD, 20));
	dates.setFont(new Font("Times New Roman", Font.BOLD, 20));
	
	dates1 = new JLabel("", SwingConstants.CENTER);
	dates2 = new JLabel("", SwingConstants.CENTER);
	dates3 = new JLabel("", SwingConstants.CENTER);
	dates4 = new JLabel("", SwingConstants.CENTER);
	
	rules1 = new JLabel("", SwingConstants.CENTER);
	rules2 = new JLabel("", SwingConstants.CENTER);
	rules3 = new JLabel("", SwingConstants.CENTER);
	rules4 = new JLabel("", SwingConstants.CENTER);
	
	
	dates.setPreferredSize(new Dimension(500, 15));
	dates1.setPreferredSize(new Dimension(500, 15));
	dates2.setPreferredSize(new Dimension(500, 15));
	dates3.setPreferredSize(new Dimension(500, 15));
	dates4.setPreferredSize(new Dimension(500, 15));
	
	rules.setPreferredSize(new Dimension(500, 15));
		
	rules1.setPreferredSize(new Dimension(500, 15));
	rules2.setPreferredSize(new Dimension(500, 15));
	rules3.setPreferredSize(new Dimension(500, 15));
	rules4.setPreferredSize(new Dimension(500, 15));

	reset = new JButton("Reset");
		reset.setPreferredSize(new Dimension (500, 30));
		reset.addActionListener(
  			new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
      				deck.reset();
						empty();
  		 			}
 				}
		);	
	
	next = new JButton("Draw");
		next.setPreferredSize(new Dimension(500,30));
			next.addActionListener(
  				new ActionListener() {
    				public void actionPerformed(ActionEvent e) {
      				deck.drawCard();
						remain.setText("Cards remaining: " + deck.remaining());	
						icon.setIcon(deck.cardpic());	
						
						if (deck.isBroken()== true){
							broke.setText("CIRCLE IS BROKEN!");
							}
						else{
						}
						if(deck.getDraw() >=0 && deck.getDraw() <= 3){
							action.setText("WATERFALL!");
							}
						else if (deck.getDraw() >=4 && deck.getDraw() <= 7){
							action.setText("Categories");
							}
						else if (deck.getDraw() >=8 && deck.getDraw() <= 11){
							action.setText("Questions");
							}					
						
						else if (deck.getDraw() >= 12 && deck.getDraw() <= 15){
							action.setText("Make a Rule");
							String da = JOptionPane.showInputDialog("What is your new rule?");
							if (rules1.getText() != ""){
								if (rules2.getText() != ""){
									if (rules3.getText() != ""){
										rules4.setText(da);
										}
									else{
										rules3.setText(da);
									}
								}
								else{
									rules2.setText(da);
									}
								}
							else{
								rules1.setText(da);
								}
							}
						
						else if (deck.getDraw() >=16 && deck.getDraw() <= 19){
							action.setText("Never Have I Ever");
							}
						
						else if (deck.getDraw() >=20 && deck.getDraw() <= 23){
							action.setText("Rhymes");
						}
						else if (deck.getDraw() >= 24 && deck.getDraw() <= 27){
							action.setText("Choose a Date");
							String da = JOptionPane.showInputDialog("Who is dating who?");
							if (dates1.getText() != ""){
								if (dates2.getText() != ""){
									if (dates3.getText() != ""){
										dates4.setText(da);
										}
									else{
										dates3.setText(da);
									}
								}
								else{
									dates2.setText(da);
									}
								}
							else{
								dates1.setText(da);
								}
							}
						else if (deck.getDraw() >=28 && deck.getDraw() <= 31){
							action.setText("Reach for Heaven");
							}
						else if (deck.getDraw() >=32 && deck.getDraw() <= 35){
							action.setText("Guys Drink");
							}
						else if (deck.getDraw() >=36 && deck.getDraw() <= 39){
							action.setText("Thumb to Table");
							}
						else if (deck.getDraw() >=40 && deck.getDraw() <= 43){
							action.setText("Girls Drink");
							}
						else if (deck.getDraw() >=44 && deck.getDraw() <= 47){
							action.setText("You Drink");
							}
						else if (deck.getDraw() >=48 && deck.getDraw() <= 51){
							action.setText("Make Someone Drink");
							}
						else{
							action.setText("");
							}
						
						
  		 			}
 				}
		);
	
	
	
		
	add(icon);
	add(next);
	add(action);
	add(remain);
	add(broke);
	add(dates);
	add(dates1);
	add(dates2);
	add(dates3);
	add(dates4);
	add(rules);
	add(rules1);
	add(rules2);
	add(rules3);
	add(rules4);
	add(reset);
	}
	
public void empty(){
	dates1.setText("");
	dates2.setText("");
	dates3.setText("");
	dates4.setText("");
	
	rules1.setText("");
	rules2.setText("");
	rules3.setText("");
	rules4.setText("");
	
	icon.setIcon(deck.cardpic());
	broke.setText("");
	remain.setText("Cards remaining: " + deck.remaining());
}
	
	
public void actionPerformed(ActionEvent e){
}
			
public static void main (String[] args){
}
}
	