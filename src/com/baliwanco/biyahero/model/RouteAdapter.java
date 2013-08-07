package com.baliwanco.biyahero.model;

import java.util.List;

import com.baliwanco.biyahero.R;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class RouteAdapter extends ArrayAdapter<Route> {
	List<Route> routes;
	private static String TAG = "RouteAdapter";
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View listView = convertView;
		if(listView == null) {
			Log.v(TAG, "ConvertView is null");
			LayoutInflater inflater = (LayoutInflater) getContext().
					getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			listView = inflater.inflate(R.layout.route_list_item, null);
		}
		else {
			Log.v(TAG, "ConvertView is not null");
			listView = convertView;
		}
		
		// Get the textviews from the layout
	    TextView routeTitle = (TextView) listView.findViewById(
	    		R.id.route_name_title);
	    TextView routeSubtitle = (TextView) listView.findViewById(
	    		R.id.route_stops_count);
	    
	    // Get the given route position
	    Route route = routes.get(position);
	    
	    Log.v(TAG, "Route name is " + route.getName());
	    Log.v(TAG, "Number of stops for route is " + route.getNumStops());
	    
	    // Set the content of the two textviews
	    routeTitle.setText(route.getName());
	    routeSubtitle.setText("Number of Stops: " + Integer.toString(
	    		route.getNumStops()));
	    
	    return listView;
	}
	
	public RouteAdapter(Context context, int resource, int textViewResourceId,
			List<Route> objects) {
		super(context, resource, textViewResourceId, objects);
		routes = objects;
		// TODO Auto-generated constructor stub
	}

	public RouteAdapter(Context context, int resource, int textViewResourceId,
			Route[] objects) {
		super(context, resource, textViewResourceId, objects);
		// TODO Auto-generated constructor stub
	}

	public RouteAdapter(Context context, int resource, int textViewResourceId) {
		super(context, resource, textViewResourceId);
		// TODO Auto-generated constructor stub
	}

	public RouteAdapter(Context context, int textViewResourceId,
			List<Route> objects) {
		super(context, textViewResourceId, objects);
		routes = objects;
		// TODO Auto-generated constructor stub
	}

	public RouteAdapter(Context context, int resource, Route[] objects) {
		super(context, resource, objects);
		// TODO Auto-generated constructor stub
	}

	public RouteAdapter(Context context, int resource) {
		super(context, resource);
		// TODO Auto-generated constructor stub
	}
	
}
