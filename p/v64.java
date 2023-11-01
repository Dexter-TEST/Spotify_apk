package p.v64;
import android.content.Context;
import android.view.View;
import p.e64;
import java.lang.Object;
import p.t64;
import p.s64;
import java.lang.String;
import android.view.WindowManager;
import android.view.Display;
import android.graphics.Point;
import p.u64;
import java.lang.Math;
import android.content.res.Resources;
import p.pc0;
import p.wq6;
import android.widget.PopupWindow$OnDismissListener;
import p.b74;
import p.c74;
import p.if6;
import p.wh7;
import p.eh7;
import android.view.Gravity;
import android.util.DisplayMetrics;
import android.graphics.Rect;

public class v64	// class@00298f from classes.dex
{
    public final Context a;
    public final e64 b;
    public final boolean c;
    public final int d;
    public final int e;
    public View f;
    public int g;
    public boolean h;
    public b74 i;
    public s64 j;
    public PopupWindow$OnDismissListener k;
    public final t64 l;

    public void v64(int p0,int p1,Context p2,View p3,e64 p4,boolean p5){
       super();
       this.g = 0x800003;
       this.l = new t64(this);
       this.a = p2;
       this.b = p4;
       this.f = p3;
       this.c = p5;
       this.d = p0;
       this.e = p1;
    }
    public void v64(Context p0,e64 p1,View p2,boolean p3){
       super(0x7f030024, 0, p0, p2, p1, p3);
    }
    public final s64 a(){
       if (this.j == null) {
          v64 ta = this.a;
          Point point = new Point();
          u64.a(ta.getSystemService("window").getDefaultDisplay(), point);
          int i = (Math.min(point.x, point.y) >= ta.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width))? 1: 0;
          if (i) {
             pc0 i1 = new pc0(this.a, this.f, this.d, this.e, this.c);
          }else {
             wq6 i2 = new wq6(this.d, this.e, this.a, this.f, this.b, this.c);
          }
          i.l(this.b);
          i.r(this.l);
          i.n(this.f);
          i.j(this.i);
          i.o(this.h);
          i.p(this.g);
          this.j = i;
       }
       return this.j;
    }
    public final boolean b(){
       v64 tj;
       boolean b = ((tj = this.j) != null && tj.a())? true: false;
       return b;
    }
    public void c(){
       v64 tk;
       this.j = null;
       if ((tk = this.k) != null) {
          tk.onDismiss();
       }
       return;
    }
    public final void d(int p0,int p1,boolean p2,boolean p3){
       s64 os64 = this.a();
       os64.s(p3);
       if (p2) {
          if (((Gravity.getAbsoluteGravity(this.g, eh7.d(this.f)) & 0x07)) == 5) {
             p0 = p0 - this.f.getWidth();
          }
          os64.q(p0);
          os64.t(p1);
          int i = (int)((this.a.getResources().getDisplayMetrics().density * 48.00f) / 2.00f);
          os64.a = new Rect((p0 - i), (p1 - i), (p0 + i), (p1 + i));
       }
       os64.c();
       return;
    }
}
