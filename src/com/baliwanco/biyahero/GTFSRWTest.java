package com.baliwanco.biyahero;

import java.io.File;
import java.io.IOException;

import org.onebusaway.gtfs.model.Agency;
import org.onebusaway.gtfs.model.Route;
import org.onebusaway.gtfs.serialization.GtfsWriter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class GTFSRWTest extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gtfsrwtest);
		
		// Create a GTFS Writer
		GtfsWriter writer = new GtfsWriter();
		String filename = new String("test");
		writer.setOutputLocation(new File(getFilesDir(), filename));
		
		Agency agency = new Agency();
		agency.setName("Baliwan Co.");
		
		writer.handleEntity(agency);
		
		Route route = new Route();
		route.setShortName("A");
		route.setLongName("The Road of Death!");
		route.setAgency(agency);
		
		writer.handleEntity(route);
		
		try {
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gtfsrwtest, menu);
		return true;
	}

}
