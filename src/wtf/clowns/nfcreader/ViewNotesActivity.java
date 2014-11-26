package wtf.clowns.nfcreader;

import java.io.File;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.content.Context;
import android.content.Intent;

public class ViewNotesActivity extends Activity{
	
	ListView notesList;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_notes);
		

		
		//Grab object from layout XML
		notesList = (ListView) findViewById(R.id.Noteslist);
		File ExternalStorage;
		
		ExternalStorage = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
		
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
				
				setContentView(R.layout.activity_view_note);
		    	final TextView notedisplay = (TextView) findViewById(R.id.note_content);
		    	
		    	String noteText = Externalfiles[itemPosition];
		    	File datafile = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), noteText);
		    	Uri data = Uri.fromFile(datafile);
		    	Intent intent = getIntent();
		    	intent.setData(data);
		    	notedisplay.setText(noteText);
				
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
