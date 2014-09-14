package wtf.clowns.nfcreader;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;
import android.content.Intent;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   
    @Override
    public void onBackPressed()
    {
    	super.onBackPressed();
    	startActivity(new Intent(MainActivity.this, MainActivity.class));
    	finish();
    }
    
    public void someMethod(View button1) {
    	//do something
    	setContentView(R.layout.activity_next);
    	
    }
}
