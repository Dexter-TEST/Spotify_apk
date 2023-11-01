package p.rf2;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import java.lang.String;
import p.b7;
import p.kd3;
import java.lang.Object;
import p.co5;
import p.of2;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.database.DatabaseErrorHandler;
import p.tk5;
import java.util.UUID;
import java.io.File;
import p.nw6;
import android.database.sqlite.SQLiteDatabase;
import p.nf2;
import p.qf2;
import p.pf2;
import java.lang.Throwable;
import java.lang.Thread;
import p.en6;
import android.database.sqlite.SQLiteException;

public final class rf2 extends SQLiteOpenHelper	// class@0024d6 from classes.dex
{
    public final Context a;
    public final b7 b;
    public final kd3 c;
    public final boolean t;
    public boolean v;
    public final tk5 w;
    public boolean x;
    public static final int y;

    public void rf2(Context p0,String p1,b7 p2,kd3 p3,boolean p4){
       co5.o(p0, "context");
       co5.o(p3, "callback");
       super(p0, p1, null, p3.a, new of2(p3, p2));
       this.a = p0;
       this.b = p2;
       this.c = p3;
       this.t = p4;
       if (p1 == null) {
          p1 = UUID.randomUUID().toString();
          co5.l(p1, "randomUUID\(\).toString\(\)");
       }
       this.w = new tk5(p1, p0.getCacheDir(), false);
       return;
    }
    public final nw6 b(boolean p0){
       rf2 tw = this.w;
       boolean b = false;
       boolean b1 = (this.x == null && this.getDatabaseName() != null)? true: false;
       tw.a(b1);
       this.v = b;
       SQLiteDatabase sQLiteDataba = this.y(p0);
       if (this.v != null) {
          this.close();
          tw.b();
          return this.b(p0);
       }else {
          tw.b();
          return this.f(sQLiteDataba);
       }
    }
    public final void close(){
       rf2 tw = this.w;
       tw.a(tw.a);
       super.close();
       this.b.b = null;
       this.x = false;
       tw.b();
    }
    public final nf2 f(SQLiteDatabase p0){
       co5.o(p0, "sqLiteDatabase");
       return qf2.c(this.b, p0);
    }
    public final void onConfigure(SQLiteDatabase p0){
       co5.o(p0, "db");
       rf2 tc = this.c;
       if (this.v == null && tc.a != p0.getVersion()) {
          p0.setMaxSqlCacheSize(1);
       }
       tc.f(this.f(p0));
       return;
    }
    public final void onCreate(SQLiteDatabase p0){
       co5.o(p0, "sqLiteDatabase");
       this.c.g(this.f(p0));
    }
    public final void onDowngrade(SQLiteDatabase p0,int p1,int p2){
       co5.o(p0, "db");
       this.v = true;
       this.c.h(this.f(p0), p1, p2);
    }
    public final void onOpen(SQLiteDatabase p0){
       co5.o(p0, "db");
       if (this.v == null) {
          this.c.i(this.f(p0));
       }
       this.x = true;
       return;
    }
    public final void onUpgrade(SQLiteDatabase p0,int p1,int p2){
       co5.o(p0, "sqLiteDatabase");
       this.v = true;
       this.c.j(this.f(p0), p1, p2);
    }
    public final SQLiteDatabase x(boolean p0){
       SQLiteDatabase writableData;
       if (p0) {
          writableData = this.getWritableDatabase();
          co5.l(writableData, "{\n                super.…eDatabase\(\)\n            }");
       }else {
          writableData = this.getReadableDatabase();
          co5.l(writableData, "{\n                super.…eDatabase\(\)\n            }");
       }
       return writableData;
    }
    public final SQLiteDatabase y(boolean p0){
       File parentFile;
       String databaseName = this.getDatabaseName();
       rf2 tx = this.x;
       rf2 ta = this.a;
       if (databaseName != null && (tx == null && (parentFile = ta.getDatabasePath(databaseName).getParentFile()) != null)) {
          parentFile.mkdirs();
          if (!parentFile.isDirectory()) {
             parentFile.toString();
          }
       }
       return this.x(p0);
    }
}
