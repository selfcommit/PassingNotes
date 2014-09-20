package wtf.clowns.nfcreader;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import 	android.content.Context;

public class notesDBHelper extends SQLiteOpenHelper {

	private static final int DATABASE_VERSION =1;
	private static final String DATABASE_NAME = "notesdb";
	private static final String DICTIONARY_TABLE_NAME = "notes";
	private static final String KEY_WORD = "title";
	private static final String KEY_DEFINITION = "body";
	private static final String DICTIONARY_TABLE_CREATE = 
			"CREATE TABLE " + DICTIONARY_TABLE_NAME + " (" +
					KEY_WORD + "TEXT, " + 
					KEY_DEFINITION + " TEXT);";
	
	notesDBHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(DICTIONARY_TABLE_CREATE);
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion ) {
		throw new RuntimeException("This Shouldn't Happen - Check DB versions");
	}
	
}
