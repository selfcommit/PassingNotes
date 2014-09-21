package wtf.clowns.nfcreader;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class write_a_note extends Fragment implements View.OnClickListener {
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
	}
}
