package p.lf2;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import java.lang.Object;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteCursorDriver;
import java.lang.String;
import android.database.sqlite.SQLiteQuery;
import android.database.Cursor;
import p.tw6;
import p.co5;
import p.jn5;
import android.database.sqlite.SQLiteProgram;
import android.database.sqlite.SQLiteCursor;
import p.mf2;

public final class lf2 implements SQLiteDatabase$CursorFactory	// class@001d40 from classes.dex
{
    public final int a;
    public final Object b;

    public void lf2(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Cursor newCursor(SQLiteDatabase p0,SQLiteCursorDriver p1,String p2,SQLiteQuery p3){
       lf2 tb = this.b;
       switch (this.a){
           case 0:
           default:
             co5.o(tb, "$tmp0");
             co5.i(p3);
             tb.a.b(new jn5(p3));
             return new SQLiteCursor(p1, p2, p3);
       }
       co5.o(tb, "$query");
       co5.i(p3);
       tb.b(new jn5(p3));
       return new SQLiteCursor(p1, p2, p3);
    }
}
