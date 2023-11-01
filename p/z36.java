package p.z36;
import p.b46;
import java.lang.Object;
import android.database.sqlite.SQLiteDatabase;
import p.c46;
import java.lang.String;

public final class z36 implements b46	// class@002e7f from classes.dex
{
    public static final z36 a;

    static {
       z36.a = new z36();
    }
    public void z36(){
       super();
    }
    public final void a(SQLiteDatabase p0){
       p0.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
