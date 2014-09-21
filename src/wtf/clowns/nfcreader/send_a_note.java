package wtf.clowns.nfcreader;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class send_a_note extends Fragment implements View.OnClickListener {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View result = inflater.inflate(R.layout.frag_send_a_note, container,
				false);

		result.findViewById(R.id.imageView3).setOnClickListener(this);

		return (result);
	}

	@Override
	public void onClick(View v) {
		Log.d(getClass().getSimpleName(), "Send a Note Pressed");
		// ((WriteNotesActivity)getActivity());
	}
}