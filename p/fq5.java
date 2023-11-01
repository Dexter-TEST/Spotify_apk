package p.fq5;
import p.dv6;
import p.xl7;
import java.lang.Object;
import p.eq5;
import p.jw3;
import p.x54;
import p.y54;
import p.dq5;
import android.graphics.Bitmap;
import java.util.Map;
import p.ry7;

public final class fq5 implements dv6	// class@00161b from classes.dex
{
    public final xl7 a;
    public final eq5 b;

    public void fq5(int p0,xl7 p1){
       super();
       this.a = p1;
       this.b = new eq5(p0, this);
    }
    public final void a(int p0){
       fq5 tb;
       if (p0 >= 40) {
          this.b.i(-1);
       }else if(10 <= p0 && p0 < 20){
          p0 = 1;
       }else {
          tb = 0;
       }
       if (p0) {
          tb = this.b;
          _monitor_enter(tb);
          _monitor_exit(tb);
          tb.i((tb.b / 2));
       }
       return;
    }
    public final y54 b(x54 p0){
       dq5 uodq5;
       y54 oy54 = ((uodq5 = this.b.b(p0)) != null)? new y54(uodq5.a, uodq5.b): null;
       return oy54;
    }
    public final void c(x54 p0,Bitmap p1,Map p2){
       int i = ry7.v(p1);
       fq5 tb = this.b;
       _monitor_enter(tb);
       _monitor_exit(tb);
       if (i <= tb.c) {
          this.b.c(p0, new dq5(p1, p2, i));
       }else {
          this.b.d(p0);
          this.a.c(p0, p1, p2, i);
       }
       return;
    }
}
