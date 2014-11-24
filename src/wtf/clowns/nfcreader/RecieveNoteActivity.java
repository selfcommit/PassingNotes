package wtf.clowns.nfcreader;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

public class RecieveNoteActivity extends Activity {
	
	private File mParentPath;
	
	private Intent mIntent;
	
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_notes);
        
        Log.d(getClass().getSimpleName(), "onCreate()");
    }
	
	private void handleViewIntent() {
		
		mIntent = getIntent();
		String action = mIntent.getAction();
		
		if (TextUtils.equals(action, Intent.ACTION_VIEW)) {
            // Get the URI from the Intent
            Uri beamUri = mIntent.getData();
            /*
             * Test for the type of URI, by getting its scheme value
             */
            if (TextUtils.equals(beamUri.getScheme(), "file")) {
                mParentPath = handleFileUri(beamUri);
            }
        }
		
	}
	
	public File handleFileUri(Uri beamUri) {
        // Get the path part of the URI
        String fileName = beamUri.getPath();
        // Create a File object for this filename
        File copiedFile = new File(fileName);
        // Get a string containing the file's parent directory
        //return copiedFile.getParent();
        return copiedFile;
    }
	
}
