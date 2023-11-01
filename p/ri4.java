package p.ri4;
import java.util.concurrent.Callable;
import p.si4;
import p.zy5;
import java.lang.Object;
import p.yi4;
import p.xy5;
import android.database.Cursor;
import p.vv7;

public final class ri4 implements Callable	// class@0024f3 from classes.dex
{
    public final int a;
    public final zy5 b;
    public final si4 c;

    public void ri4(si4 p0,zy5 p1,int p2){
       this.a = p2;
       this.c = p0;
       this.b = p1;
       super();
    }
    public final yi4 a(){
       Cursor uCursor;
       int i = 2;
       yi4 oyi4 = null;
       boolean b = false;
       ri4 tb = this.b;
       ri4 tc = this.c;
       switch (this.a){
           case 0:
             uCursor = vv7.J(tc.a, tb, b);
             if (uCursor.moveToFirst()) {
                oyi4 = new yi4();
                oyi4.a = uCursor.getLong(b);
                oyi4.b = uCursor.getLong(1);
                oyi4.c = uCursor.getLong(i);
             }
             break;
           default:
             uCursor = vv7.J(tc.a, tb, b);
             if (uCursor.moveToFirst()) {
                oyi4 = new yi4();
                oyi4.a = uCursor.getLong(b);
                oyi4.b = uCursor.getLong(1);
                oyi4.c = uCursor.getLong(i);
             }
             uCursor.close();
             return oyi4;
       }
       uCursor.close();
       return oyi4;
    }
    public final Object call(){
       switch (this.a){
           case 0:
           default:
             return this.a();
       }
       return this.a();
    }
    public final void finalize(){
       ri4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.y();
             return;
       }
       tb.y();
       return;
    }
}
