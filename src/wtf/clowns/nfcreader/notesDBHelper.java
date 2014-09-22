package wtf.clowns.nfcreader;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import 	android.content.Context;

public class notesDBHelper extends SQLiteOpenHelper {
	
	private static final String DATABASE_NAME = "notes.db";
	private static final int DATABASE_VERSION = 1;
	static final String TITLE = "title";
	static final String NOTE_TEXT = "notetext";
	static final String TABLE = "notes";
		
	notesDBHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
		
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE notes (_id INTEGER PRIMARY KEY AUTOINCREMENT, title TEXT, notetext TEXT);");
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion ) {
		throw new RuntimeException("This Shouldn't Happen - Check DB versions");
	}
	
}
