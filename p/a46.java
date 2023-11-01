package p.a46;
import p.b46;
import java.lang.Object;
import android.database.sqlite.SQLiteDatabase;
import p.c46;
import java.lang.String;

public final class a46 implements b46	// class@000f11 from classes.dex
{
    public static final a46 a;

    static {
       a46.a = new a46();
    }
    public void a46(){
       super();
    }
    public final void a(SQLiteDatabase p0){
       p0.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
       p0.execSQL("DROP TABLE IF EXISTS event_payloads");
       p0.execSQL("CREATE TABLE event_payloads \(sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY \(event_id\) REFERENCES events\(_id\) ON DELETE CASCADE,PRIMARY KEY \(sequence_num, event_id\)\)");
    }
}
