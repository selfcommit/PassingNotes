package wtf.clowns.nfcreader;

import android.app.Activity;
import android.os.Bundle;
import android.view.*;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void someMethod(View button1) {
    	//do something
    	setContentView(R.layout.activity_next);
    	
    }
}
