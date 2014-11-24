package wtf.clowns.nfcreader;

import java.io.File;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentFilter.MalformedMimeTypeException;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class SendNoteActivity extends Activity{
	ListView notesList;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_send_notes);
		
		//Grab object from layout XML
		notesList = (ListView) findViewById(R.id.Noteslist);
		final File ExternalStorage;
		
		ExternalStorage = getExternalFilesDir(null);
	
		//String[] testlist = new String[] {"First Note", "Second Note", "Third Note"};
		final String[] Externalfiles = ExternalStorage.list(); 
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1,Externalfiles);
		
		notesList.setAdapter(adapter);
		
		//notesList Click Listener		
		notesList.setOnItemClickListener(new OnItemClickListener() {
			
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id){
				
				int itemPosition = position;
				
				String itemValue = (String) notesList.getItemAtPosition(position);
				
				//setContentView(R.layout.activity_view_note);
		    	final TextView notedisplay = (TextView) findViewById(R.id.note_content);
		    	
		    	String noteText = Externalfiles[itemPosition];
		    	
		    	File FiletoSend = getExternalFilesDir(noteText);
		    	
		    	//Toast.makeText(getApplicationContext(),
				//"Position :" + itemPosition +" Listitem :" + itemValue, Toast.LENGTH_LONG)
				//.show();
				
			}
		});
		
		
		
	
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
