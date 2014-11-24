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
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class SendNoteActivity extends Activity implements OnClickListener {
		  private NfcAdapter adapter=null;

		  @Override
		  public void onCreate(Bundle savedInstanceState) {
		    super.onCreate(savedInstanceState);
		    adapter=NfcAdapter.getDefaultAdapter(this);

		    if (!adapter.isNdefPushEnabled()) {
		      Toast.makeText(this, R.string.sorry, Toast.LENGTH_LONG).show();
		      finish();
		    }
		    else {
		      Intent i=new Intent(Intent.ACTION_GET_CONTENT);
		      
		      i.setType("*/*");
		      startActivityForResult(i, 0);
		    }
		  }

		  @Override
		  protected void onActivityResult(int requestCode, int resultCode,
		                                  Intent data) {
		    if (requestCode==0 && resultCode==RESULT_OK) {
		      adapter.setBeamPushUris(new Uri[] {data.getData()}, this);
		      
		      Button btn=new Button(this);
		      
		      btn.setText(R.string.over);
		      btn.setOnClickListener(this);
		      setContentView(btn);
		    }
		  }

		  @Override
		  public void onClick(View v) {
		    finish();
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
