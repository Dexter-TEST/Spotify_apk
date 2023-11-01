package p.db2;
import java.util.Comparator;
import p.gg1;
import java.lang.Object;
import android.graphics.Rect;
import java.lang.Class;
import p.y3;

public final class db2 implements Comparator	// class@001314 from classes.dex
{
    public final Rect a;
    public final Rect b;
    public final boolean c;
    public final gg1 t;

    public void db2(boolean p0,gg1 p1){
       super();
       this.a = new Rect();
       this.b = new Rect();
       this.c = p0;
       this.t = p1;
    }
    public final int compare(Object p0,Object p1){
       this.t.getClass();
       db2 ta = this.a;
       p0.d(ta);
       p0 = this.b;
       p1.d(p0);
       p1 = ta.top;
       Rect top = p0.top;
       int i = -1;
       if (p1 < top) {
          return i;
       }
       if (p1 > top) {
          return 1;
       }
       p1 = ta.left;
       top = p0.left;
       db2 tc = this.c;
       if (p1 < top) {
          if (tc != null) {
             i = 1;
          }
          return i;
       }else if(p1 > top){
          if (tc == null) {
             i = 1;
          }
          return i;
       }else {
          p1 = ta.bottom;
          top = p0.bottom;
          if (p1 < top) {
             return i;
          }
          if (p1 > top) {
             return 1;
          }
          p1 = ta.right;
          p0 = p0.right;
          if (p1 < p0) {
             if (tc != null) {
                i = 1;
             }
             return i;
          }else if(p1 > p0){
             if (tc == null) {
                i = 1;
             }
             return i;
          }else {
             return 0;
          }
       }
    }
}
