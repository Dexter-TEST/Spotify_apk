package p.x36;
import p.b46;
import java.lang.Object;
import android.database.sqlite.SQLiteDatabase;
import p.c46;
import java.lang.String;

public final class x36 implements b46	// class@002c00 from classes.dex
{
    public static final x36 a;

    static {
       x36.a = new x36();
    }
    public void x36(){
       super();
    }
    public final void a(SQLiteDatabase p0){
       p0.execSQL("CREATE TABLE events \(_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY \(context_id\) REFERENCES transport_contexts\(_id\) ON DELETE CASCADE\)");
       p0.execSQL("CREATE TABLE event_metadata \(_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY \(event_id\) REFERENCES events\(_id\) ON DELETE CASCADE\)");
       p0.execSQL("CREATE TABLE transport_contexts \(_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL\)");
       p0.execSQL("CREATE INDEX events_backend_id on events\(context_id\)");
       p0.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts\(backend_name, priority\)");
    }
}
