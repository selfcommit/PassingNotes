package wtf.clowns.nfcreader;

import android.app.Fragment;
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
		// ((WriteNotesActivity)getActivity());
	}
}