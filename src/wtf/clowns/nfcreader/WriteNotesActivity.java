package wtf.clowns.nfcreader;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class WriteNotesActivity extends Activity {
	private notesDBHelper db = null;
	private EditText note_field;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_write_notes);
		note_field = (EditText) findViewById(R.id.writtenNote);
		db = new notesDBHelper(this);
		
	}

    public void storeNote(View v) {
    	//Call note storage
    	String noteText = note_field.getText().toString();
     	setContentView(R.layout.activity_view_note);
    	final TextView notedisplay = (TextView) findViewById(R.id.note_content);
    	String query = String.format("INSERT INTO notes (title, notetext) VALUES ('%s', '%s')", noteText, noteText);
    	db.getWritableDatabase().rawQuery(query, null);
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
