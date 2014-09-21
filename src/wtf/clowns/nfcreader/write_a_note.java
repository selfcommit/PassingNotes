package wtf.clowns.nfcreader;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class write_a_note extends Fragment implements View.OnClickListener {
	private notesDBHelper db = null;
	
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		
		setRetainInstance(true);
		setHasOptionsMenu(true);
		
		db = new notesDBHelper(getActivity());
		
		Log.d(getClass().getSimpleName(), "OnActivityCreated");
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View result = inflater.inflate(R.layout.frag_write_a_note, container,
				false);

		result.findViewById(R.id.imageView1).setOnClickListener(this);

		return (result);
	}
	
	@Override
	public void onClick(View v) {
		Log.d(getClass().getSimpleName(), "Write Note Pressed");
		// ((WriteNotesActivity)getActivity());
	    Intent i = new Intent(getActivity(), WriteNotesActivity.class);
	    startActivity(i);
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
	    Log.d(getClass().getSimpleName(), "onPause()");
	    super.onPause();
	  }

	  @Override
	  public void onStop() {
	    Log.d(getClass().getSimpleName(), "onStop()");
	    super.onStop();
	  }

	  @Override
	  public void onDestroyView() {
	    Log.d(getClass().getSimpleName(), "onDestroyView()");
	    super.onDestroyView();
	  }

	  @Override
	  public void onDestroy() {
	    Log.d(getClass().getSimpleName(), "onDestroy()");
	    super.onDestroy();
	    
	    db.close();
	  }

	  @Override
	  public void onDetach() {
	    Log.d(getClass().getSimpleName(), "onDetach()");
	    super.onDetach();
	  }
}
