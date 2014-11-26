package wtf.clowns.nfcreader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class WriteNotesActivity extends Activity {

	private EditText note_field, name_field;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_write_notes);
		note_field = (EditText) findViewById(R.id.writtenNote);
		name_field = (EditText) findViewById(R.id.noteNameEditText);
		
	}


    public void storeNote(View v) {
    	//Call note storage
    	String noteText = note_field.getText().toString();

    	String filename = name_field.getText().toString();
    	String content = noteText;
    	File ExternalStorage = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), filename);
    	ExternalStorage.setReadable(true,false);
    	FileOutputStream outputStream = null;
		try {
			outputStream = new FileOutputStream(ExternalStorage);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

    	
    	//Store a Note
    	//http://developer.android.com/training/basics/data-storage/files.html#WriteInternalStorage
    	try{
    		//outputStream = openFileOutput (filename, Context.MODE_WORLD_READABLE);
    		outputStream.write(content.getBytes());
    		outputStream.close();
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	sendBroadcast(new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, 
    			Uri.parse("file://" + Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS))));
	
     	setContentView(R.layout.activity_view_note);
    	final TextView notedisplay = (TextView) findViewById(R.id.note_content);
    	notedisplay.setText(noteText);
    	
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
}
