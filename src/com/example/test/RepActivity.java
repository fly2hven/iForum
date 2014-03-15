package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.res.Resources;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class RepActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
			
			Resources res = getResources();
			String[] name = res.getStringArray(R.array.names);   
	        RepAdapter radapter = new RepAdapter(this,name);  
	        View header = getLayoutInflater().inflate(R.layout.activity_header2, null);
	        ListView hlv = getListView();
	        hlv.addHeaderView(header);
	        setListAdapter(radapter);
	        
	       
	}

}
