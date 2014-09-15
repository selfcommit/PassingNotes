package wtf.clowns.nfcreader;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.content.Intent;
import android.widget.EditText;
import android.widget.TextView;


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
    
    public void writeNote(View button1) {
    	//do something
    	setContentView(R.layout.activity_write_notes);
    	
    }
    
    public void storeNote(View writtenNote) {
    	//Call note storage
    	EditText et = (EditText) findViewById(R.id.writtenNote);
    	String noteText = et.getText().toString();
    	setContentView(R.layout.activity_note_storage);
    	final TextView notedisplay = (TextView) findViewById(R.id.note_content);
    	notedisplay.setText(noteText);
    	
    }
}


