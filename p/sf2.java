package p.sf2;
import p.rw6;
import android.content.Context;
import java.lang.String;
import p.kd3;
import java.lang.Object;
import p.co5;
import p.o26;
import p.ay6;
import p.wf2;
import p.nw6;
import p.rf2;
import p.i70;
import android.database.sqlite.SQLiteOpenHelper;

public final class sf2 implements rw6	// class@002618 from classes.dex
{
    public final Context a;
    public final String b;
    public final kd3 c;
    public final boolean t;
    public final boolean v;
    public final ay6 w;
    public boolean x;

    public void sf2(Context p0,String p1,kd3 p2,boolean p3,boolean p4){
       co5.o(p0, "context");
       co5.o(p2, "callback");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = new ay6(new o26(3, this));
    }
    public final nw6 Y(){
       return this.w.getValue().b(true);
    }
    public final void close(){
       int i = (this.w.b != i70.E)? 1: 0;
       if (i) {
          this.w.getValue().close();
       }
       return;
    }
    public final String getDatabaseName(){
       return this.b;
    }
    public final void setWriteAheadLoggingEnabled(boolean p0){
       int i = (this.w.b != i70.E)? 1: 0;
       if (i) {
          rf2 value = this.w.getValue();
          co5.o(value, "sQLiteOpenHelper");
          value.setWriteAheadLoggingEnabled(p0);
       }
       this.x = p0;
       return;
    }
}
