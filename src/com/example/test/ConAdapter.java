package com.example.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;



public class ConAdapter extends ArrayAdapter<String>{
	Context context;
	
	String [] titles;
	public ConAdapter(Context con, String[] name){	
		super(con,R.layout.activity_contact,R.id.cnames,name);
		this.context = con;
		this.titles = name;
	}

public class MyViewHolder{
	TextView title;
	public MyViewHolder(View v){
		title = (TextView) v.findViewById(R.id.cnames);
		
	}
	

}
	
	@Override
	public View getView(int position, View convertView , ViewGroup parent){
		View row = convertView;
		MyViewHolder hold = null;
		if(row==null){
    	LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		row = inflater.inflate(R.layout.activity_contact, parent, false);
		hold = new MyViewHolder(row);
		row.setTag(hold);
		}
		else{
			hold = (MyViewHolder) row.getTag();
		}
		
		hold.title.setText(titles[position]);
		
	return row;
	}
}