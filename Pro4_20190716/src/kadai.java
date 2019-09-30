import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class kadai extends JFrame implements ActionListener{
	private JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17;
	private JLabel imglabel;
	private int s = 20,ten = 0,yaku = 0;
	public kadai(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1200,900);
		this.getContentPane().setLayout(new GridLayout(2,1));
		JPanel header = new JPanel();
		this.getContentPane().add(header);
		header.setBackground(Color.BLUE);
		imglabel = new JLabel(new ImageIcon("./unsei.png"));
		header.add(imglabel);
		JPanel footer = new JPanel();
		this.getContentPane().add(footer);
		footer.setLayout(new GridLayout(4,5));
		button1 = new JButton("1,9,字　暗刻");
		button2 = new JButton("2~8 暗刻");
		button3 = new JButton("1,9,字　明刻");
		button4 = new JButton("2~8　明刻");
		button5 = new JButton("1,9,字　暗槓");
		button6 = new JButton("2~8　暗槓");
		button7 = new JButton("1,9,字　明槓");
		button8 = new JButton("2~8　明槓");
		button9 = new JButton("役アリ雀頭");
		button10 = new JButton("メンゼンロン");
		button11 = new JButton("ツモ,ペンチャン,カンチャン,単騎");
		button12 = new JButton("七対子");
		button13 = new JButton("1");
		button14= new JButton("2");
		button15 = new JButton("3");
		button16 = new JButton("子");
		button17 = new JButton("親");
		footer.add(getContentPane().add(button1));
		footer.add(getContentPane().add(button2));
		footer.add(getContentPane().add(button3));
		footer.add(getContentPane().add(button4));
		footer.add(getContentPane().add(button5));
		footer.add(getContentPane().add(button6));
		footer.add(getContentPane().add(button7));
		footer.add(getContentPane().add(button8));
		footer.add(getContentPane().add(button9));
		footer.add(getContentPane().add(button10));
		footer.add(getContentPane().add(button11));
		footer.add(getContentPane().add(button12));
		footer.add(getContentPane().add(button13));
		footer.add(getContentPane().add(button14));
		footer.add(getContentPane().add(button15));
		footer.add(getContentPane().add(button16));
		footer.add(getContentPane().add(button17));
		this.button1.addActionListener(this);
		this.button2.addActionListener(this);
		this.button3.addActionListener(this);
		this.button4.addActionListener(this);
		this.button5.addActionListener(this);
		this.button6.addActionListener(this);
		this.button7.addActionListener(this);
		this.button8.addActionListener(this);
		this.button9.addActionListener(this);
		this.button10.addActionListener(this);
		this.button11.addActionListener(this);
		this.button12.addActionListener(this);
		this.button13.addActionListener(this);
		this.button14.addActionListener(this);
		this.button15.addActionListener(this);
		this.button16.addActionListener(this);
		this.button17.addActionListener(this);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button1) {
			s += 8;
		}else if(e.getSource() == button2){
			s += 4;
		}else if(e.getSource() == button3){
			s += 4;
		}else if(e.getSource() == button4){
			s += 2;
		}else if(e.getSource() == button5){
			s += 32;
		}else if(e.getSource() == button6){
			s += 16;
		}else if(e.getSource() == button7){
			s += 16;
		}else if(e.getSource() == button8){
			s += 8;
		}else if(e.getSource() == button9){
			s += 2;
		}else if(e.getSource() == button10){
			s += 10;
		}else if(e.getSource() == button11){
			s += 2;
		}else if(e.getSource() == button12){
			s += 5;
		}else if(e.getSource() == button13){
			yaku = 1;
		}else if(e.getSource() == button14){
			yaku = 2;
		}else if(e.getSource() == button15){
			yaku = 3;
		}else if(e.getSource() == button16){
			if(s <= 30) {
				if(yaku == 1) {
					ten = 1000;
				}else if(yaku == 2) {
					ten = 2000;
				}else if(yaku == 3) {
					ten = 3900;
				}
			}else if(s <= 40) {
				if(yaku == 1) {
					ten = 1300;
				}else if(yaku == 2) {
					ten = 2600;
				}else if(yaku == 3) {
					ten = 5200;
				}
			}else if(s <= 50) {
				if(yaku == 1) {
					ten = 1600;
				}else if(yaku == 2) {
					ten = 3200;
				}else if(yaku == 3) {
					ten = 6400;
				}
			}else {
				if(yaku == 1) {
					ten = 2000;
				}else if(yaku == 2) {
					ten = 3900;
				}else if(yaku == 3) {
					ten = 8000;
				}
			}
			System.out.println(ten);
			s = 20;
		}else if(e.getSource() == button17){
			if(s <= 30) {
				if(yaku == 1) {
					ten = 1500;
				}else if(yaku == 2) {
					ten = 2900;
				}else if(yaku == 3) {
					ten = 5800;
				}
			}else if(s <= 40) {
				if(yaku == 1) {
					ten = 2000;
				}else if(yaku == 2) {
					ten = 3900;
				}else if(yaku == 3) {
					ten = 7700;
				}
			}else if(s <= 50) {
				if(yaku == 1) {
					ten = 2400;
				}else if(yaku == 2) {
					ten = 4800;
				}else if(yaku == 3) {
					ten = 9600;
				}
			}else {
				if(yaku == 1) {
					ten = 2900;
				}else if(yaku == 2) {
					ten = 5800;
				}else if(yaku == 3) {
					ten = 12000;
				}
			}
			System.out.println(ten);
			s = 20;
		}


	}

}
