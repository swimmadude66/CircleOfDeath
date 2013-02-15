import java.util.*;
import javax.swing.*;

public class CardDeck {
private int cards;
private Random rnd = new Random();
private ImageIcon ac = new javax.swing.ImageIcon(getClass().getResource("Images/1.png"));
private ImageIcon as = new javax.swing.ImageIcon(getClass().getResource("Images/2.png"));
private ImageIcon ah = new javax.swing.ImageIcon(getClass().getResource("Images/3.png"));
private ImageIcon ad = new javax.swing.ImageIcon(getClass().getResource("Images/4.png"));
private ImageIcon kc = new javax.swing.ImageIcon(getClass().getResource("Images/5.png"));
private ImageIcon ks = new javax.swing.ImageIcon(getClass().getResource("Images/6.png"));
private ImageIcon kh = new javax.swing.ImageIcon(getClass().getResource("Images/7.png"));
private ImageIcon kd = new javax.swing.ImageIcon(getClass().getResource("Images/8.png"));
private ImageIcon qc = new javax.swing.ImageIcon(getClass().getResource("Images/9.png"));
private ImageIcon qs = new javax.swing.ImageIcon(getClass().getResource("Images/10.png"));
private ImageIcon qh = new javax.swing.ImageIcon(getClass().getResource("Images/11.png"));
private ImageIcon qd = new javax.swing.ImageIcon(getClass().getResource("Images/12.png"));
private ImageIcon jc = new javax.swing.ImageIcon(getClass().getResource("Images/13.png"));
private ImageIcon js = new javax.swing.ImageIcon(getClass().getResource("Images/14.png"));
private ImageIcon jh = new javax.swing.ImageIcon(getClass().getResource("Images/15.png"));
private ImageIcon jd = new javax.swing.ImageIcon(getClass().getResource("Images/16.png"));
private ImageIcon tc = new javax.swing.ImageIcon(getClass().getResource("Images/17.png"));
private ImageIcon ts = new javax.swing.ImageIcon(getClass().getResource("Images/18.png"));
private ImageIcon th = new javax.swing.ImageIcon(getClass().getResource("Images/19.png"));
private ImageIcon td = new javax.swing.ImageIcon(getClass().getResource("Images/20.png"));
private ImageIcon nc = new javax.swing.ImageIcon(getClass().getResource("Images/21.png"));
private ImageIcon ns = new javax.swing.ImageIcon(getClass().getResource("Images/22.png"));
private ImageIcon nh = new javax.swing.ImageIcon(getClass().getResource("Images/23.png"));
private ImageIcon nd = new javax.swing.ImageIcon(getClass().getResource("Images/24.png"));
private ImageIcon ec = new javax.swing.ImageIcon(getClass().getResource("Images/25.png"));
private ImageIcon es = new javax.swing.ImageIcon(getClass().getResource("Images/26.png"));
private ImageIcon eh = new javax.swing.ImageIcon(getClass().getResource("Images/27.png"));
private ImageIcon ed = new javax.swing.ImageIcon(getClass().getResource("Images/28.png"));
private ImageIcon sec = new javax.swing.ImageIcon(getClass().getResource("Images/29.png"));
private ImageIcon ses = new javax.swing.ImageIcon(getClass().getResource("Images/30.png"));
private ImageIcon seh = new javax.swing.ImageIcon(getClass().getResource("Images/31.png"));
private ImageIcon sed = new javax.swing.ImageIcon(getClass().getResource("Images/32.png"));
private ImageIcon sic = new javax.swing.ImageIcon(getClass().getResource("Images/33.png"));
private ImageIcon sis = new javax.swing.ImageIcon(getClass().getResource("Images/34.png"));
private ImageIcon sih = new javax.swing.ImageIcon(getClass().getResource("Images/35.png"));
private ImageIcon sid = new javax.swing.ImageIcon(getClass().getResource("Images/36.png"));
private ImageIcon fic = new javax.swing.ImageIcon(getClass().getResource("Images/37.png"));
private ImageIcon fis = new javax.swing.ImageIcon(getClass().getResource("Images/38.png"));
private ImageIcon fih = new javax.swing.ImageIcon(getClass().getResource("Images/39.png"));
private ImageIcon fid = new javax.swing.ImageIcon(getClass().getResource("Images/40.png"));
private ImageIcon foc = new javax.swing.ImageIcon(getClass().getResource("Images/41.png"));
private ImageIcon fos = new javax.swing.ImageIcon(getClass().getResource("Images/42.png"));
private ImageIcon foh = new javax.swing.ImageIcon(getClass().getResource("Images/43.png"));
private ImageIcon fod = new javax.swing.ImageIcon(getClass().getResource("Images/44.png"));
private ImageIcon thc = new javax.swing.ImageIcon(getClass().getResource("Images/45.png"));
private ImageIcon ths = new javax.swing.ImageIcon(getClass().getResource("Images/46.png"));
private ImageIcon thh = new javax.swing.ImageIcon(getClass().getResource("Images/47.png"));
private ImageIcon thd = new javax.swing.ImageIcon(getClass().getResource("Images/48.png"));
private ImageIcon twc = new javax.swing.ImageIcon(getClass().getResource("Images/49.png"));
private ImageIcon tws = new javax.swing.ImageIcon(getClass().getResource("Images/50.png"));
private ImageIcon twh = new javax.swing.ImageIcon(getClass().getResource("Images/51.png"));
private ImageIcon twd = new javax.swing.ImageIcon(getClass().getResource("Images/52.png"));
private ImageIcon back = new javax.swing.ImageIcon(getClass().getResource("Images/b1fv.png"));

private List<Integer> used = new ArrayList<Integer>();

private int draw;
private int broken = rnd.nextInt(32) +20;
private int b = used.size();
public CardDeck(){
	cards = 52;
	draw = 53;
	
	}
	
public int getLength(){
return(cards);
}

public int drawCard(){
	int a = rnd.nextInt(cards);
	b = used.size();
	
	if (b != 52){
		if (used.contains(a)== false){
			draw = a;
			used.add(a);
			}
		else{
			a = drawCard();
		}
	}
	else{
		draw = 53;
		}
return(draw);
}


public int getDraw(){
	return(draw);
	}


public boolean isBroken(){
	if (b == broken){
		return (true);
		}
	else{
		return(false);
	}
}

public String remaining(){
	int c = 51- b;
	String d = "" + c;
	return d;
	}
	


public ImageIcon cardpic(){
	if (draw == 0){
	return(ac);
		}
	else if (draw == 1){
	return(as);
	}
	else if (draw == 2){
	return(ah);
	}
	else if (draw == 3){
	return(ad);
	}
	else if (draw == 4){
	return(kc);
	}
	else if (draw == 5){
	return(ks);
	}
	else if (draw == 6){
	return(kh);
	}
	else if (draw == 7){
	return(kd);
	}
	else if (draw == 8){
	return(qc);
	}
	else if (draw == 9){
	return(qs);
	}
	else if (draw == 10){
	return(qh);
	}	
	else if (draw == 11){
	return(qd);
	}
	else if (draw == 12){
	return(jc);
	}
	else if (draw == 13){
	return(js);
	}
	else if (draw == 14){
	return(jh);
	}
	else if (draw == 15){
	return(jd);
	}
	else if (draw == 16){
	return(tc);
	}
	else if (draw == 17){
	return(ts);
	}
	else if (draw == 18){
	return(th);
	}
	else if (draw == 19){
	return(td);
	}
	else if (draw == 20){
	return(nc);
	}
	else if (draw == 21){
	return(ns);
	}
	else if (draw == 22){
	return(nh);
	}
	else if (draw == 23){
	return(nd);
	}
	else if (draw == 24){
	return(ec);
	}
	else if (draw == 25){
	return(es);
	}
	else if (draw == 26){
	return(eh);
	}
	else if (draw == 27){
	return(ed);
	}
	else if (draw == 28){
	return(sec);
	}
	else if (draw == 29){
	return(ses);
	}
	else if (draw == 30){
	return(seh);
	}
	else if (draw == 31){
	return(sed);
	}
	else if (draw == 32){
	return(sic);
	}
	else if (draw == 33){
	return(sis);
	}
	else if (draw == 34){
	return(sih);
	}
	else if (draw == 35){
	return(sid);
	}
	else if (draw == 36){
	return(fic);
	}
	else if (draw == 37){
	return(fis);
	}
	else if (draw == 38){
	return(fih);
	}
	else if (draw == 39){
	return(fid);
	}
	else if (draw == 40){
	return(foc);
	}
	else if (draw == 41){
	return(fos);
	}
	else if (draw == 42){
	return(foh);
	}
	else if (draw == 43){
	return(fod);
	}
	else if (draw == 44){
	return(thc);
	}
	else if (draw == 45){
	return(ths);
	}
	else if (draw == 46){
	return(thh);
	}
	else if (draw == 47){
	return(thd);
	}
	else if (draw == 48){
	return(twc);
	}
	else if (draw == 49){
	return(tws);
	}
	else if (draw == 50){
	return(twh);
	}
	else if (draw == 51){
	return(twd);
	}
	else{
	return(back);
	}
}	

public void reset(){
	used.clear();
	b = used.size();
	draw = 53;
	broken = rnd.nextInt(20) +20;	
	}
	

public static void main(String[] args){
	}
}