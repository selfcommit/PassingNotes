package wtf.clowns.nfcreader;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.content.Intent;
import android.util.Log;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Log.d(getClass().getSimpleName(), "onCreate()");
    }
    
    @Override
    public void onRestart() {
    	super.onRestart();
    	
    	Log.d(getClass().getSimpleName(), "onRestart()");
    	
    }
    
    @Override
    public void onStart() {
    	super.onStart();
    	
    	Log.d(getClass().getSimpleName(), "onStart()");
    }
    
    @Override
    public void onResume() {
    	super.onResume();
    	
    	Log.d(getClass().getSimpleName(), "onResume()");
    }
    
    @Override
    public void onPause() {
    	
    	Log.d(getClass().getSimpleName(),"onPause()");
    	
    	super.onPause();
    }
    
    @Override
    public void onStop() {
    	
    	Log.d(getClass().getSimpleName(), "onStop()");
    	
    	super.onStop();
    }
    
    @Override
    public void onDestroy() {
    	
    	Log.d(getClass().getSimpleName(), "onDestroy()");
    	
    	super.onDestroy();
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	getMenuInflater().inflate(R.menu.options, menu);
    	
    	return(super.onCreateOptionsMenu(menu));
    }
   
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	Intent i = new Intent();
    	
    	switch (item.getItemId()) {
    	case android.R.id.home:
    		return(true);
    		
    	case R.id.about:
    		i = new Intent(this, HelpMenuActivity.class);
    		startActivity(i);
    		
    		return(true);
    		
    	case R.id.help:
    		i = new Intent(this, HelpMenuActivity.class);
    		startActivity(i);
    		
    		return(true);    		
    	}
    	
    	return(super.onOptionsItemSelected(item));
    	
    }
    
    //@Override
    //public void onBackPressed()
    //{
    //	super.onBackPressed();
    //	startActivity(new Intent(MainActivity.this, MainActivity.class));
    //	finish();
    //}
    
    public void writeNote(View v) {
    	//do something
    	startActivity(new Intent(this, WriteNotesActivity.class));
    	
    }
    
    public void viewNotes(View v) {
    	startActivity(new Intent(this, ViewNotesActivity.class));
    }
    
    public void sendNote(View v) {
    	startActivity(new Intent(this, SendNoteActivity.class));
    }
    
}


