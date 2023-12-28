package com.awt;
import java.awt.*;

public class F3 {
	public static void main(String[] args) {
		Frame f=new Frame();
		f.setVisible(true);
		f.setSize(500,400);
		f.setBackground(Color.pink);
		f.setName("java batches");
		Choice ch=new Choice();
		ch.add("harshavardhan");
		ch.add("manikandan");
		ch.add("suriya johnson");
		ch.add("rakesh");
		ch.remove("manikandan");
		f.add(ch);
		ch.insert("mani", 3);
		System.out.println(ch.getSelectedItem());
		System.out.println(ch.getSelectedIndex());
	}
}
