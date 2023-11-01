package p.c46;
import android.database.sqlite.SQLiteOpenHelper;
import p.x36;
import p.y36;
import p.z36;
import p.a46;
import p.b46;
import java.lang.Object;
import java.util.List;
import java.util.Arrays;
import android.content.Context;
import java.lang.String;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import android.database.Cursor;

public final class c46 extends SQLiteOpenHelper	// class@001196 from classes.dex
{
    public final int a;
    public boolean b;
    public static final List c;

    static {
       b46[] uob46Array = new b46[]{x36.a,y36.a,z36.a,a46.a};
       c46.c = Arrays.asList(uob46Array);
    }
    public void c46(int p0,Context p1,String p2){
       super(p1, p2, null, p0);
       this.b = false;
       this.a = p0;
    }
    public static void b(SQLiteDatabase p0,int p1,int p2){
       List c = c46.c;
       if (p2 > c.size()) {
          throw new IllegalArgumentException("Migration from "+p1+" to "+p2+" was requested, but cannot be performed. Only "+c.size()+" migrations are provided");
       }
       for (; p1 < p2; p1++) {
          c.get(p1).a(p0);
       }
       return;
    }
    public final void onConfigure(SQLiteDatabase p0){
       this.b = true;
       String[] stringArray = new String[0];
       p0.rawQuery("PRAGMA busy_timeout=0;", stringArray).close();
       p0.setForeignKeyConstraintsEnabled(true);
    }
    public final void onCreate(SQLiteDatabase p0){
       if (this.b == null) {
          this.onConfigure(p0);
       }
       c46.b(p0, 0, this.a);
       return;
    }
    public final void onDowngrade(SQLiteDatabase p0,int p1,int p2){
       p0.execSQL("DROP TABLE events");
       p0.execSQL("DROP TABLE event_metadata");
       p0.execSQL("DROP TABLE transport_contexts");
       p0.execSQL("DROP TABLE IF EXISTS event_payloads");
       if (this.b == null) {
          this.onConfigure(p0);
       }
       c46.b(p0, 0, p2);
       return;
    }
    public final void onOpen(SQLiteDatabase p0){
       if (this.b == null) {
          this.onConfigure(p0);
       }
       return;
    }
    public final void onUpgrade(SQLiteDatabase p0,int p1,int p2){
       if (this.b == null) {
          this.onConfigure(p0);
       }
       c46.b(p0, p1, p2);
       return;
    }
}
