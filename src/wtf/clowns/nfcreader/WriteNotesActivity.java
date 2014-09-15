package wtf.clowns.nfcreader;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class WriteNotesActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_write_notes);
	}

    public void storeNote(View v) {
    	//Call note storage
    	EditText et = (EditText) findViewById(R.id.writtenNote);
    	String noteText = et.getText().toString();
    	setContentView(R.layout.activity_note_storage);
    	final TextView notedisplay = (TextView) findViewById(R.id.note_content);
    	notedisplay.setText(noteText);
    	
    }
}
