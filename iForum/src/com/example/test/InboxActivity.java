package com.example.test;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class InboxActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
			
			Resources res = getResources();
			String[] name = res.getStringArray(R.array.names); 
			String[] msg = res.getStringArray(R.array.messages);
	        MsgAdapter madapter = new MsgAdapter(this,name,msg);  
	        
	        View header = getLayoutInflater().inflate(R.layout.headers, null);
	        TextView h = (TextView) header.findViewById(R.id.header);
	        h.setText("Inbox");
	        ListView hlv = getListView();
	        hlv.addHeaderView(header);
	        
	        setListAdapter(madapter);
	        ListView list = getListView();
	    	registerForContextMenu(list);
	       
	}
	@Override
	public void onCreateContextMenu(ContextMenu menu, View v,
			ContextMenuInfo menuInfo) {
		// TODO Auto-generated method stub
	    super.onCreateContextMenu(menu, v, menuInfo);
	    menu.setHeaderTitle("Select Action"); 
        menu.add(0, v.getId(), 0, "Reply"); 
        menu.add(0, v.getId(), 0, "View Profile");
	}
	
	@Override 
    public boolean onContextItemSelected(MenuItem item)
    { 


                AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo)item.getMenuInfo();
               
       
                   int IndexSelected = info.position ;             
                        if(item.getTitle()=="Reply")
                        {
                           Intent i = new Intent(getApplicationContext(),MessageActivity.class);
                            startActivity(i);
                        } 
                        else if(item.getTitle()=="View Profile")
                        {
                           Intent i = new Intent(getApplicationContext(),UserActivity.class);
                           startActivity(i);                                                      } 
                        else
                        {
                            return false;
                        } 
                        return true; 
               
                           
      }  

}
