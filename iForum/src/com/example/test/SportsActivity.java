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
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class SportsActivity extends ListActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		 
		
		
		Resources res = getResources();
		String[] name = res.getStringArray(R.array.sports);   
        Adapter adapter = new Adapter(this,name); 
        
        

     
        setListAdapter(adapter);
        
        ListView list = getListView();
		list.setOnItemClickListener(new OnItemClickListener(){
	          public void onItemClick(AdapterView<?> parent, View view,
	                  int position, long id) {
	                   

	        	  Intent a;
	              switch(position){

	             case 0:
	                 a = new Intent(getApplicationContext(),Sports1.class);
	                 startActivity(a);
	                 break;
	              case 1:
	                a  = new Intent(getApplicationContext(),Sports2.class);
	                startActivity(a);
	                break;
	             case 2:
	                a = new Intent(getApplicationContext(),Sports3.class);
	                startActivity(a);
	                break;
	             case 3:
		            a = new Intent(getApplicationContext(),Sports4.class);
		                startActivity(a);
		                break;
	             }           
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
