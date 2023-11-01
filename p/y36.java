package p.y36;
import p.b46;
import java.lang.Object;
import android.database.sqlite.SQLiteDatabase;
import p.c46;
import java.lang.String;

public final class y36 implements b46	// class@002d41 from classes.dex
{
    public static final y36 a;

    static {
       y36.a = new y36();
    }
    public void y36(){
       super();
    }
    public final void a(SQLiteDatabase p0){
       p0.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
       p0.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts\(backend_name, priority, extras\)");
       p0.execSQL("DROP INDEX contexts_backend_priority");
    }
}
