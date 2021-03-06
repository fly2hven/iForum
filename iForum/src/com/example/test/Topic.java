package com.example.test;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class Topic extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
	     
		
		Resources res = getResources();
		String[] name = res.getStringArray(R.array.topics);   
        NewAdapter nadapter = new NewAdapter(this,name);
        
        
        
        
        View header = getLayoutInflater().inflate(R.layout.topicheader, null);
        TextView h = (TextView) header.findViewById(R.id.headers);
		Intent i = getIntent();
		String title = i.getStringExtra("title");
		h.setText(title);
        ListView hlv = getListView();
        hlv.addHeaderView(header);
        
        
        
        

        
        
        
    setListAdapter(nadapter);
    ListView list = getListView();    
        
	list.setOnItemClickListener(new OnItemClickListener(){
          public void onItemClick(AdapterView<?> parent, View view,
                  int position, long id) {

        	  Intent a;
        	  a = new Intent(getApplicationContext(),TabNewActivity.class);
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
