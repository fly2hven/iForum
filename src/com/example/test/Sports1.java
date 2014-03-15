package com.example.test;

import java.util.ArrayList;
import java.util.Arrays;
import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class Sports1 extends ListActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		 View header = getLayoutInflater().inflate(R.layout.headers, null);
	        TextView h = (TextView) header.findViewById(R.id.header);
	        h.setText("Basketball");
	        ListView hlv = getListView();
	        hlv.addHeaderView(header);
		
		Resources res = getResources();
		String[] name = res.getStringArray(R.array.sports1);   
        NewAdapter nadapter = new NewAdapter(this,name);  

        
       
        
        setListAdapter(nadapter);
   
        ListView list = getListView();
		list.setOnItemClickListener(new OnItemClickListener(){
	          public void onItemClick(AdapterView<?> parent, View view,
	                  int position, long id) {
	              
	        	  Intent a;
	        	  a = new Intent(getApplicationContext(),Topic.class);
	                 TextView title = (TextView) view.findViewById(R.id.nlabel);
		        	  String s = title.getText().toString();
	                 a.putExtra("title",s);
	                 startActivity(a);
	               
	             }           
	      
	   });
        

       
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
        
		getMenuInflater().inflate(R.menu.menu, menu);
		
		SearchManager searchManager = (SearchManager) getSystemService(Context.SEARCH_SERVICE);
        SearchView searchView = (SearchView) menu.findItem(R.id.search)
                .getActionView();
        searchView.setSearchableInfo(searchManager
                .getSearchableInfo(getComponentName()));
 
        return super.onCreateOptionsMenu(menu);
	
		
	}
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		switch(item.getItemId()){
		case R.id.action_cp:
		Intent i = new Intent(getApplicationContext(),Edit.class);
		startActivity(i);
		return true;
		case R.id.action_so:
			Intent in = new Intent(getApplicationContext(),LoginActivity.class);
            startActivity(in);
            finish();
            return true;
		
          default:
        	  return super.onOptionsItemSelected(item);
		   
		}
	}
  }
