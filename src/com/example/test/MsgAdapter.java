package com.example.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.test.Adapter.MyViewHolder;

public class MsgAdapter extends ArrayAdapter<String>{
	Context context;
	String [] msgs;
	String [] titles;
	public MsgAdapter(Context con, String[] name, String[] msg){	
		super(con,R.layout.activity_inbosent,R.id.inames,name);
		this.context = con;
		this.msgs = msg;
		this.titles = name;
	}

public class MyViewHolder{
	TextView msg;
	TextView title;
	public MyViewHolder(View v){
		msg = (TextView) v.findViewById(R.id.itextView2);
		title = (TextView) v.findViewById(R.id.inames);
		
	}
	

}
	
	@Override
	public View getView(int position, View convertView , ViewGroup parent){
		View row = convertView;
		MyViewHolder hold = null;
		if(row==null){
    	LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		row = inflater.inflate(R.layout.activity_inbosent, parent, false);
		hold = new MyViewHolder(row);
		row.setTag(hold);
		}
		else{
			hold = (MyViewHolder) row.getTag();
		}
		
		hold.msg.setText(msgs[position]);
		hold.title.setText(titles[position]);
		
	return row;
	}
}
