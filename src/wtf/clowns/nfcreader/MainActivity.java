package wtf.clowns.nfcreader;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.content.Intent;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	getMenuInflater().inflate(R.menu.options, menu);
    	
    	return(super.onCreateOptionsMenu(menu));
    }
   
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	switch (item.getItemId()) {
    	case android.R.id.home:
    		return(true);
    		
    	case R.id.about:
    		return(true);
    		
    	case R.id.help:
    		return(true);    		
    	}
    	
    	return(super.onOptionsItemSelected(item));
    	
    }
    @Override
    public void onBackPressed()
    {
    	super.onBackPressed();
    	startActivity(new Intent(MainActivity.this, MainActivity.class));
    	finish();
    }
    
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


