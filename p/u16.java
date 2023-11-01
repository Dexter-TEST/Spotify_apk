package p.u16;
import p.wv1;
import p.zx6;
import p.xl1;
import java.lang.String;
import p.ah0;
import p.et;
import p.c46;
import java.lang.Object;
import java.lang.Iterable;
import java.lang.StringBuilder;
import java.util.Iterator;
import p.ku;
import android.database.Cursor;
import p.r16;
import android.database.sqlite.SQLiteDatabase;
import p.fw;
import java.lang.Long;
import java.util.ArrayList;
import p.kk5;
import p.nk5;
import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import android.util.Base64;
import java.lang.Class;
import p.g54;
import p.od7;
import p.t16;
import android.os.SystemClock;
import p.xx6;
import java.lang.Throwable;
import android.database.sqlite.SQLiteOpenHelper;
import p.yx6;
import p.u44;

public final class u16 implements wv1, zx6	// class@002824 from classes.dex
{
    public final c46 a;
    public final ah0 b;
    public final ah0 c;
    public final et t;
    public static final xl1 v;

    static {
       u16.v = new xl1("proto");
    }
    public void u16(ah0 p0,ah0 p1,et p2,c46 p3){
       super();
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.t = p2;
    }
    public static String J(Iterable p0){
       String str = "\(";
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          str = str.append(iterator.next().a);
          if (iterator.hasNext()) {
             str = str.append(',');
          }
       }
       return str+')';
    }
    public static Object T(Cursor p0,r16 p1){
       p0.close();
       return p1.apply(p0);
    }
    public static Long f(SQLiteDatabase p0,fw p1){
       String str = "backend_name = ? and priority = ?";
       String[] stringArray = new String[]{p1.a,String.valueOf(nk5.a(p1.c))};
       ArrayList uArrayList = new ArrayList(Arrays.asList(stringArray));
       if ((p1 = p1.b) != null) {
          str = str+" and extras = ?";
          uArrayList.add(Base64.encodeToString(p1, 0));
       }
       String[] stringArray1 = new String[]{"_id"};
       String[] stringArray2 = new String[0];
       Cursor uCursor = p0.query("transport_contexts", stringArray1, str, uArrayList.toArray(stringArray2), null, null, null);
       Long longx = (!uCursor.moveToNext())? null: Long.valueOf(uCursor.getLong(0));
       uCursor.close();
       return longx;
    }
    public final SQLiteDatabase b(){
       u16 ta = this.a;
       ta.getClass();
       g54 og54 = new g54(ta);
       this.c.a();
       try{
       label_0013 :
          return og54.o();
       }catch(android.database.sqlite.SQLiteDatabaseLockedException e4){
          long l = (long)this.t.c + v2;
          if ((ta.a() - l) >= 0) {
             throw new xx6("Timed out while trying to open db.", e4);
          }
          SystemClock.sleep(50);
          goto label_0013 ;
       }
    }
    public final void close(){
       this.a.close();
    }
    public final Object x(r16 p0){
       SQLiteDatabase sQLiteDataba = this.b();
       sQLiteDataba.beginTransaction();
       sQLiteDataba.setTransactionSuccessful();
       sQLiteDataba.endTransaction();
       return p0.apply(sQLiteDataba);
    }
    public final Object y(yx6 p0){
       SQLiteDatabase sQLiteDataba = this.b();
       u44 ou44 = new u44(14, sQLiteDataba);
       this.c.a();
       try{
       label_0013 :
          ou44.o();
          sQLiteDataba.setTransactionSuccessful();
          sQLiteDataba.endTransaction();
          return p0.b();
       }catch(android.database.sqlite.SQLiteDatabaseLockedException e5){
          long l = (long)this.t.c + v3;
          if ((v2.a() - l) >= 0) {
             throw new xx6("Timed out while trying to acquire the lock.", e5);
          }
          SystemClock.sleep(50);
          goto label_0013 ;
       }
    }
}
