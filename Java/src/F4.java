import java.awt.*;

public class F4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame();
		f.setVisible(true);
		f.setSize(400, 500);
		f.setBackground(Color.yellow);
		f.setTitle("java batches");
		List li = new List(5, true);
		li.add("mani");
		li.add("suriya",0);
		li.add("rakesh bro");
		f.add(li);
		System.out.println(li.getSelectedItem());
	}

}
