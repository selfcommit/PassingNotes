package wtf.clowns.nfcreader;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;


public class WriteNotesActivity extends Activity {
	private EditText note_field;
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_write_notes);
		note_field = (EditText) findViewById(R.id.writtenNote);
	}

    public void storeNote(View v) {
    	//Call note storage
    	String noteText = note_field.getText().toString();
     	setContentView(R.layout.activity_view_note);
    	final TextView notedisplay = (TextView) findViewById(R.id.note_content);
    	notedisplay.setText(noteText);
    	
    }
}
