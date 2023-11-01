package p.xp7;
import android.os.Build$VERSION;
import p.up7;
import p.vp7;
import java.lang.Object;
import android.view.WindowInsets;
import p.tp7;
import p.sp7;
import p.rp7;
import p.aa3;
import java.lang.Math;
import android.view.View;
import java.lang.Class;
import p.wh7;
import p.gh7;
import p.kh7;
import p.jh7;
import p.yo4;
import p.qp7;

public final class xp7	// class@002cc4 from classes.dex
{
    public final vp7 a;
    public static final xp7 b;

    static {
       xp7.b = (Build$VERSION.SDK_INT >= 30)? up7.q: vp7.b;
    }
    public void xp7(){
       super();
       this.a = new vp7(this);
    }
    public void xp7(WindowInsets p0){
       int sDK_INT;
       super();
       if ((sDK_INT = Build$VERSION.SDK_INT) >= 30) {
          this.a = new up7(this, p0);
       }else if(sDK_INT >= 29){
          this.a = new tp7(this, p0);
       }else if(sDK_INT >= 28){
          this.a = new sp7(this, p0);
       }else {
          this.a = new rp7(this, p0);
       }
       return;
    }
    public static aa3 e(aa3 p0,int p1,int p2,int p3,int p4){
       int i = Math.max(0, (p0.a - p1));
       int i1 = Math.max(0, (p0.b - p2));
       int i2 = Math.max(0, (p0.c - p3));
       int i3 = Math.max(0, (p0.d - p4));
       if (i == p1 && (i1 == p2 && (i2 == p3 && i3 == p4))) {
          return p0;
       }
       return aa3.a(i, i1, i2, i3);
    }
    public static xp7 g(WindowInsets p0,View p1){
       p0.getClass();
       xp7 oxp7 = new xp7(p0);
       if (p1 != null && gh7.b(p1)) {
          xp7 oxp71 = (Build$VERSION.SDK_INT >= 23)? kh7.a(p1): jh7.j(p1);
          xp7 a = oxp7.a;
          a.p(oxp71);
          a.d(p1.getRootView());
       }
       return oxp7;
    }
    public final int a(){
       return this.a.j().d;
    }
    public final int b(){
       return this.a.j().a;
    }
    public final int c(){
       return this.a.j().c;
    }
    public final int d(){
       return this.a.j().b;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof xp7) {
          return false;
       }
       return yo4.a(this.a, p0.a);
    }
    public final WindowInsets f(){
       xp7 ta = this.a;
       qp7 c = (ta instanceof qp7)? ta.c: null;
       return c;
    }
    public final int hashCode(){
       xp7 ta;
       int i = ((ta = this.a) == null)? 0: ta.hashCode();
       return i;
    }
}
