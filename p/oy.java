package p.oy;
import p.ny;
import com.spotify.legacyglue.recyclerview.RecyclerViewFastScroller;
import java.lang.Object;
import android.graphics.Rect;
import java.util.List;
import p.ph3;
import java.lang.Math;

public final class oy implements ny	// class@0021b9 from classes.dex
{
    public float a;
    public final Object b;
    public Object c;
    public Object t;

    public void oy(RecyclerViewFastScroller p0){
       this.t = p0;
       super();
       this.b = new Rect();
       this.c = new Rect();
    }
    public void oy(List p0){
       super();
       this.t = null;
       this.a = 0xbf800000;
       this.b = p0;
       this.c = this.a(0);
    }
    public final ph3 a(float p0){
       ph3 oph31;
       oy tb = this.b;
       ph3 oph3 = tb.get((tb.size() - 1));
       if ((oph3.b() - p0) >= 0) {
          return oph3;
       }
       int i = tb.size() - 2;
       while (true) {
          int i1 = 0;
          if (i < 1) {
             return tb.get(i1);
          }
          oph31 = tb.get(i);
          if (this.c != oph31) {
             if ((oph31.b() - p0) >= 0 && (p0 - oph31.a()) < 0) {
                i1 = 1;
             }
             if (i1) {
                break ;
             }
          }
          i = i - 1;
       }
       return oph31;
    }
    public final void b(float p0){
       this.a = p0;
       float f = 0;
       if ((p0 - f) < 0) {
          this.a = f;
       }
       if ((0x3f800000 - this.a) > 0) {
          this.a = 0x3f800000;
       }
       this.c();
       return;
    }
    public final void c(){
       this.c.offsetTo(0, Math.round(((float)(this.b.height() - this.t.c) * this.a)));
    }
    public final float g(){
       oy tb = this.b;
       oy ooy = tb;
       return ooy.get((tb.size() - 1)).a();
    }
    public final boolean h(float p0){
       oy tc = this.c;
       if (this.t == tc && !(p0 - this.a)) {
          return true;
       }
       this.t = tc;
       this.a = p0;
       return false;
    }
    public final float i(){
       return this.b.get(0).b();
    }
    public final boolean isEmpty(){
       return false;
    }
    public final ph3 j(){
       return this.c;
    }
    public final boolean m(float p0){
       oy tc = this.c;
       tc = ((tc.b() - p0) >= 0 && (p0 - tc.a()) < 0)? 1: 0;
       if (tc) {
          return (this.c.c() ^ 1);
       }else {
          this.c = this.a(p0);
          return 1;
       }
    }
}
