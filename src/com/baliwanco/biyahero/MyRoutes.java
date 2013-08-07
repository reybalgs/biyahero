package com.baliwanco.biyahero;

import java.util.ArrayList;

import com.baliwanco.biyahero.model.Route;
import com.baliwanco.biyahero.model.RouteAdapter;
import com.baliwanco.biyahero.model.Stop;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.support.v4.app.NavUtils;

public class MyRoutes extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_routes);
		// Show the Up button in the action bar.
		setupActionBar();
		
		// Get the ListView
		ListView list = (ListView) findViewById(R.id.routes_list_view);
		
		// Create some dummy values
		ArrayList<Route> routes_list = new ArrayList<Route>();
		routes_list = createDummyRoutes();
		
		// Create the adapter
		RouteAdapter adapter = new RouteAdapter(MyRoutes.this,
				R.layout.route_list_item, routes_list);
		
		list.setAdapter(adapter);
	}
	
	public ArrayList<Route> createDummyRoutes() {
		ArrayList<Route> routes = new ArrayList<Route>();
		ArrayList<Stop> stops = new ArrayList<Stop>();
		
		// Create the dummy stops
		Stop stop1 = new Stop("Stop 1", "Some stop", "Bus");
		Stop stop2 = new Stop("Stop 2", "Some other stop", "Bus");
		stops.add(stop1);
		stops.add(stop2);
		
		for(int i = 0; i < 3; i++) {
			Route route = new Route("Route " + (i + 1), 10.00 + (i + 1), stops);
			routes.add(route);
		}
		return routes;
	}

	/**
	 * Set up the {@link android.app.ActionBar}.
	 */
	private void setupActionBar() {

		getActionBar().setDisplayHomeAsUpEnabled(true);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.my_routes, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
