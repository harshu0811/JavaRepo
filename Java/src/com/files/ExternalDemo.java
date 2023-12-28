package com.files;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalDemo implements Externalizable {
	String s;
	int i;
	int j;

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(s);
		out.writeInt(i);
	}

	public ExternalDemo(String s, int i, int j) {
		super();
		this.s = s;
		this.i = i;
		this.j = j;
	}
	public ExternalDemo()
	{
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		s=(String)in.readObject();
		i=in.readInt();
	}

}
