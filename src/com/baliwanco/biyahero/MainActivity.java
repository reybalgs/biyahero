package com.baliwanco.biyahero;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		Resources res = getResources();
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(
				res.getStringArray(R.array.main_menu_items)));
		
		Iterator<String> iterator = list.iterator();
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				MainActivity.this, R.layout.main_list_item, list);
		
		while(iterator.hasNext()) {
			Log.v("Main Activity", iterator.next());
		}
		
		//ListView main_list_view = (ListView) findViewById(R.id.main_list_view);
		// Set the adapter of the listview
		//main_list_view.setAdapter(adapter);
		setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		String item = (String) getListAdapter().getItem(position);
		if(item.equals("My Routes")) {
			// User has selected My Routes
			Log.v("MainActivity", "User selected MyRoutes");
			Intent intent = new Intent(this, MyRoutes.class);
			startActivity(intent);
		}
	}
 	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
