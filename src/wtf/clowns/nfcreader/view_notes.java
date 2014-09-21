package wtf.clowns.nfcreader;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class view_notes extends Fragment implements View.OnClickListener {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View result = inflater.inflate(R.layout.frag_view_notes, container,
				false);

		result.findViewById(R.id.imageView2).setOnClickListener(this);

		return (result);
	}

	@Override
	public void onClick(View v) {
		Log.d(getClass().getSimpleName(), "View Notes Pressed");
	    Intent i = new Intent(getActivity(), ViewNotesActivity.class);
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

	  }

	  @Override
	  public void onDetach() {
	    Log.d(getClass().getSimpleName(), "onDetach()");
	    super.onDetach();
	  }
}
