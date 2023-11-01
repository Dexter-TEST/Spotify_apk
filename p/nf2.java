package p.nf2;
import p.nw6;
import java.lang.String;
import android.database.sqlite.SQLiteDatabase;
import java.lang.Object;
import p.co5;
import android.database.Cursor;
import p.zh6;
import p.tw6;
import android.content.ContentValues;
import java.lang.StringBuilder;
import java.util.Set;
import java.util.Iterator;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.uw6;
import p.jn5;
import p.ir2;
import p.tf2;
import java.lang.IllegalArgumentException;
import android.database.sqlite.SQLiteClosable;
import p.mf2;
import p.lf2;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.os.CancellationSignal;
import java.util.List;
import android.database.sqlite.SQLiteStatement;

public final class nf2 implements nw6	// class@001fc7 from classes.dex
{
    public final SQLiteDatabase a;
    public static final String[] b;
    public static final String[] c;

    static {
       String[] stringArray = new String[]{""," OR ROLLBACK "," OR ABORT "," OR FAIL "," OR IGNORE "," OR REPLACE "};
       nf2.b = stringArray;
       stringArray = new String[0];
       nf2.c = stringArray;
    }
    public void nf2(SQLiteDatabase p0){
       co5.o(p0, "delegate");
       super();
       this.a = p0;
    }
    public final boolean G(){
       return this.a.inTransaction();
    }
    public final boolean M(){
       nf2 ta = this.a;
       co5.o(ta, "sQLiteDatabase");
       return ta.isWriteAheadLoggingEnabled();
    }
    public final void Q(){
       this.a.setTransactionSuccessful();
    }
    public final void R(String p0,Object[] p1){
       co5.o(p0, "sql");
       co5.o(p1, "bindArgs");
       this.a.execSQL(p0, p1);
    }
    public final void S(){
       this.a.beginTransactionNonExclusive();
    }
    public final Cursor a0(String p0){
       co5.o(p0, "query");
       return this.f0(new zh6(p0));
    }
    public final int b(String p0,int p1,ContentValues p2,String p3,Object[] p4){
       int i4;
       co5.o(p0, "table");
       co5.o(p2, "values");
       int i = 0;
       int i1 = (p2.size())? 1: 0;
       if (i1) {
          i1 = p2.size();
          int i2 = (p4 == null)? i1: p4.length + i1;
          Object[] objArray = new Object[i2];
          StringBuilder str = "UPDATE "+nf2.b[p1]+p0+" SET ";
          Iterator iterator = p2.keySet().iterator();
          while (iterator.hasNext()) {
             String str1 = iterator.next();
             String str2 = (i > 0)? ",": "";
             int i3 = i + 1;
             objArray[i] = p2.get(str1);
             str = str.append(str2).append(str1).append("=?");
             i = i3;
          }
          if (p4 != null) {
             for (i4 = i1; i4 < i2; i4++) {
                p1 = i4 - i1;
                objArray[i4] = p4[p1];
             }
          }
          if (!TextUtils.isEmpty(p3)) {
             str = str+" WHERE "+p3;
          }
          i4 = str;
          co5.l(i4, "StringBuilder\(\).apply\(builderAction\).toString\(\)");
          uw6 ouw6 = this.w(i4);
          ir2.h(ouw6, objArray);
          return ouw6.u();
       }else {
          throw new IllegalArgumentException("Empty values".toString());
       }
    }
    public final void close(){
       this.a.close();
    }
    public final String d(){
       return this.a.getPath();
    }
    public final Cursor f0(tw6 p0){
       co5.o(p0, "query");
       Cursor uCursor = this.a.rawQueryWithFactory(new lf2(1, new mf2(p0)), p0.f(), nf2.c, null);
       co5.l(uCursor, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null\)");
       return uCursor;
    }
    public final void g(){
       this.a.endTransaction();
    }
    public final void h(){
       this.a.beginTransaction();
    }
    public final Cursor i(tw6 p0,CancellationSignal p1){
       co5.o(p0, "query");
       String str = p0.f();
       co5.i(p1);
       nf2 ta = this.a;
       co5.o(ta, "sQLiteDatabase");
       co5.o(str, "sql");
       Cursor uCursor = ta.rawQueryWithFactory(new lf2(0, p0), str, nf2.c, null, p1);
       co5.l(uCursor, "sQLiteDatabase.rawQueryW…ationSignal\n            \)");
       return uCursor;
    }
    public final boolean isOpen(){
       return this.a.isOpen();
    }
    public final List n(){
       return this.a.getAttachedDbs();
    }
    public final void r(String p0){
       co5.o(p0, "sql");
       this.a.execSQL(p0);
    }
    public final void setVersion(int p0){
       this.a.setVersion(p0);
    }
    public final uw6 w(String p0){
       co5.o(p0, "sql");
       SQLiteStatement sQLiteStatem = this.a.compileStatement(p0);
       co5.l(sQLiteStatem, "delegate.compileStatement\(sql\)");
       return new tf2(sQLiteStatem);
    }
}
