package p.ei7;
import p.ng2;
import p.px5;
import android.view.ViewGroup;
import p.au0;
import java.lang.Object;
import p.ma6;
import p.jc7;
import p.dx0;
import p.eb3;
import java.lang.IllegalStateException;
import java.lang.String;
import android.view.View;
import p.co5;
import p.di7;

public final class ei7 extends px5 implements ng2	// class@001495 from classes.dex
{
    public ViewGroup c;
    public View t;
    public int v;
    public int w;
    public int x;
    public Object y;
    public final ViewGroup z;

    public void ei7(ViewGroup p0,au0 p1){
       this.z = p0;
       super(p1);
    }
    public final Object b(Object p0,Object p1){
       return this.c(p0, p1).f(jc7.a);
    }
    public final au0 c(Object p0,au0 p1){
       ei7 uoei7 = new ei7(this.z, p1);
       uoei7.y = p0;
       return uoei7;
    }
    public final Object f(Object p0){
       ei7 tx;
       ei7 tv;
       ei7 tc;
       ei7 ty;
       int i;
       au0 uoau0;
       dx0 uodx0;
       int i1;
       int i2;
       ei7 uoei7;
       int i3;
       View view;
       dx0 a = dx0.a;
       if ((tx = this.x) != null) {
          if (tx != 1) {
             if (tx == 2) {
                tx = this.w;
                tv = this.v;
                tc = this.c;
                ty = this.y;
                eb3.G(p0);
                i = this;
                p0 = a;
             label_00a0 :
                uoau0 = i;
                a = p0;
                p0 = ty;
                ty = tx;
                uodx0 = a;
             label_00ad :
                i1 = tv + 1;
                i2 = i1;
                tv = tc;
                tc = ty;
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             i3 = this.w;
             tv = this.v;
             view = this.t;
             ty = this.c;
             uoei7 = this.y;
             eb3.G(p0);
             i = this;
             p0 = a;
          label_0075 :
             if (view instanceof ViewGroup) {
                co5.o(view, "<this>");
                i.y = uoei7;
                i.c = ty;
                i.t = null;
                i.v = i1;
                i.w = i3;
                i.x = 2;
                if (uoei7.b(new di7(3, new ei7(view, null)), i) == a) {
                   return a;
                }else {
                   tc = ty;
                   ty = uoei7;
                   goto label_00a0 ;
                }
             }else {
                tc = ty;
                ty = i3;
                uodx0 = a;
                a = p0;
                p0 = uoei7;
                uoau0 = i;
                goto label_00ad ;
             }
          }
       }else {
          eb3.G(p0);
          p0 = this.y;
          tx = this.z;
          uoau0 = this;
          int i4 = tx.getChildCount();
          i2 = 0;
          tv = tx;
          uodx0 = a;
       }
       if (i2 < tc) {
          View childAt = tv.getChildAt(i2);
          co5.l(childAt, "getChildAt\(index\)");
          uoau0.y = p0;
          uoau0.c = tv;
          uoau0.t = childAt;
          uoau0.v = i2;
          uoau0.w = tc;
          uoau0.x = 1;
          p0.b = childAt;
          p0.a = 3;
          p0.t = uoau0;
          if (a == uodx0) {
             return uodx0;
          }else {
             uoei7 = p0;
             p0 = a;
             a = uodx0;
             i3 = tc;
             view = childAt;
             i = uoau0;
             ty = tv;
             i1 = i2;
             goto label_0075 ;
          }
       }else {
          return jc7.a;
       }
    }
}
