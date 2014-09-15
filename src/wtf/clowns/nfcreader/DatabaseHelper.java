package wtf.clowns.nfcreader;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
	private static final String DATABASE_NAME="nfcnotes.db";
	private static final int SCHEMA_VERSION=1;
	private static DatabaseHelper singleton=null;
	
	synchronized static DatabaseHelper getInstance(Context ctxt) {
		if (singleton == null) {
			singleton = new DatabaseHelper(ctxt.getApplicationContext());
			
		}
		return(singleton);
	}

	private DatabaseHelper(Context ctxt) {
		super(ctxt, DATABASE_NAME, null, SCHEMA_VERSION);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("CREATE TABLE notes (position INTEGER PRIMARY KEY, prose TEXT);");
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		throw new RuntimeException("This should not be called");
	}
	
}
