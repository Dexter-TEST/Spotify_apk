package p.f5;
import android.view.View$OnClickListener;
import p.zr5;
import java.lang.Object;
import p.p67;
import p.o5;
import android.content.Context;
import android.view.View;
import java.lang.CharSequence;
import p.y76;
import java.lang.Integer;
import p.b86;
import p.ng2;
import p.hf6;
import p.de5;
import p.ff6;
import p.kx;
import p.xk;
import p.wk;
import p.vz6;
import p.je5;
import p.zf2;
import p.mm6;
import p.rz;
import android.view.MenuItem;
import android.view.Window$Callback;
import p.b6;
import p.jb0;
import p.la0;
import p.up0;
import p.o11;
import java.lang.Class;
import java.lang.String;
import p.co5;
import p.ib0;
import p.gb0;

public final class f5 implements View$OnClickListener	// class@001565 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void f5(int p0,zr5 p1,Object p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void f5(Object p0,int p1,Object p2){
       this.a = p1;
       this.c = p0;
       this.b = p2;
       super();
    }
    public void f5(p67 p0){
       this.a = 1;
       this.c = p0;
       super();
       this.b = new o5(p0.a.getContext(), p0.h);
    }
    public final void onClick(View p0){
       p67 k;
       vz6 u;
       wk w;
       xk w1;
       kx w2;
       ff6 w3;
       hf6 w4;
       y76 x;
       o11 v;
       f5 tc = this.c;
       f5 tb = this.b;
       switch (this.a){
           case 0:
             tb.a();
             return;
           case 1:
             if ((k = tc.k) != null && tc.l != null) {
                k.onMenuItemSelected(0, tb);
             }
             return;
             break;
           case 2:
             tb.onClick(p0);
             tc.a(1);
             return;
           case 3:
             if ((u = tb.u) != null) {
                u.invoke(tc);
             }
             return;
             break;
           case 4:
             if ((w = tb.w) != null) {
                w.b(tc, Integer.valueOf(tb.d()));
             }
             return;
             break;
           case 5:
             tb.u.performHapticFeedback(1);
             if ((w1 = tb.w) != null) {
                w1.b(tc, Integer.valueOf(tb.d()));
             }
             return;
             break;
           case 6:
             tb.u.performHapticFeedback(1);
             if ((w2 = tb.w) != null) {
                w2.b(tc, Integer.valueOf(tb.d()));
             }
             return;
             break;
           case 7:
             if ((w3 = tb.w) != null) {
                w3.b(tc, Integer.valueOf(tb.d()));
             }
             return;
             break;
           case 8:
             tb.u.performHapticFeedback(1);
             if ((w4 = tb.w) != null) {
                w4.b(tc, Integer.valueOf(tb.d()));
             }
             return;
             break;
           case 9:
             if ((x = tb.x) != null) {
                x.b(Integer.valueOf(tb.d()), tc);
             }
             return;
             break;
           default:
             if (tb.d() != -1) {
                up0 b = tb.v.b;
                b.getClass();
                co5.o(tc, "callingCode");
                if ((v = b.v) != null) {
                   v.C(tc);
                }
             }
             return;
       }
    }
}
