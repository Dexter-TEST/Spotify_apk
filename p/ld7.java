package p.ld7;
import p.yx6;
import p.l4;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p.ef;
import android.view.View;
import java.lang.Object;
import p.md7;
import p.mr;
import java.lang.Iterable;
import p.fw;
import p.u16;
import java.lang.Class;
import java.util.Iterator;
import java.lang.StringBuilder;
import java.lang.String;
import p.b7;
import p.r16;
import p.qe3;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import p.od7;
import p.we0;
import p.n91;
import java.lang.Boolean;
import p.ac4;
import p.oo1;
import p.qg7;
import p.vy;

public final class ld7 implements yx6, l4	// class@001d34 from classes.dex
{
    public final int a;
    public int b;
    public Object c;
    public Object t;
    public Object v;
    public Object w;

    public void ld7(AppBarLayout$BaseBehavior p0,CoordinatorLayout p1,ef p2,View p3,int p4){
       this.a = 1;
       this.w = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       this.b = p4;
       super();
    }
    public void ld7(md7 p0,mr p1,Iterable p2,fw p3,int p4){
       this.a = 0;
       super();
       this.c = p0;
       this.t = p1;
       this.v = p2;
       this.w = p3;
       this.b = p4;
    }
    public final Object b(){
       md7 c;
       ld7 tc = this.c;
       ld7 tt = this.t;
       ld7 tv = this.v;
       ld7 tw = this.w;
       ld7 tb = this.b;
       if (tt.a == 2) {
          c = tc.c;
          c.getClass();
          if (tv.iterator().hasNext()) {
             c.x(new b7(11, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in "+u16.J(tv)));
          }
          tc.d.a(tw, (tb + 1));
       }else {
          md7 c1 = tc.c;
          c1.getClass();
          if (tv.iterator().hasNext()) {
             c1.b().compileStatement("DELETE FROM events WHERE _id in "+u16.J(tv)).execute();
          }
          c1 = tc.c;
          if (tt.a == 1) {
             c = c1;
             c.getClass();
             c.x(new we0((tc.g.a() + tt.b), tw));
          }
          c1.getClass();
          if (c1.x(new n91(c1, 4, tw)).booleanValue()) {
             tc.d.a(tw, 1);
          }
       }
       return null;
    }
    public final boolean d(View p0){
       this.w.B(this.c, this.t, this.v, this.b, new int[2]{0,0});
       return true;
    }
    public final String toString(){
       StringBuilder str;
       switch (this.a){
           case 2:
             str = new StringBuilder(200)+"<<\n mode: "+this.c+"\n ecLevel: "+this.t+"\n version: "+this.v+"\n maskPattern: "+this.b;
             str = (this.w == null)? str+"\n matrix: null\n": str+"\n matrix:\n"+this.w;
             break;
           default:
             return super.toString();
       }
       return str+">>\n";
    }
}
