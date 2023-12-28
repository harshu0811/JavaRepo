package com.awt;
import java.awt.*;

class F extends Frame
{ 
	public static void main(String[] args)
	{
		F f=new F();
		f.setVisible(true);
		f.setSize(500,500);
		f.setBackground(Color.blue);
		f.setTitle("manikandan j");
		

	}
	public void paint(Graphics g)
	{
		Font f=new Font("arial",Font.ROMAN_BASELINE, 20);
		g.setFont(f);
		g.setColor(Color.yellow);
		g.drawString("suriya johnson is a Dabba fellow", 100, 100);
	}
	
}