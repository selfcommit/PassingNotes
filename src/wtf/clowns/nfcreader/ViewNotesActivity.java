package wtf.clowns.nfcreader;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;


public class ViewNotesActivity extends Activity{
	private notesDBHelper db = null;
	ListView notesList;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_view_notes);
		
		//Grab object form layout XML
		notesList = (ListView) findViewById(R.id.Noteslist);
		String[] testlist = new String[] {"First Note", "Second Note", "Third Note"};
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1,testlist);
		
		notesList.setAdapter(adapter);
		
		db = new notesDBHelper(this);
		//String query = String.format("INSERT INTO notes (title, notetext) VALUES ('%s', '%s')", noteText, noteText);
    	
		//db.getWritableDatabase().rawQuery(query, null);
		
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
