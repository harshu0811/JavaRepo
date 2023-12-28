package com.awt;

import java.awt.*;

public class F2 {
	public static void main(String[] args)
	{
		Frame f=new Frame();
		f.setVisible(true);
		f.setSize(500,500);
		f.setBackground(Color.blue);
		f.setTitle("manikandan j");
		Label l=new Label("email");
		f.add(l);
		TextField tf=new TextField();
		tf.setText("johnson");
		f.add(tf);
	}	
}
