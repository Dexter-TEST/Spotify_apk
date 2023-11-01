package p.gq5;
import p.gl6;
import android.view.View;
import java.lang.Object;
import p.tp5;
import p.fl6;
import p.b17;
import p.wb0;
import p.au0;
import p.ye7;
import android.view.ViewTreeObserver;
import p.lk7;
import android.view.ViewTreeObserver$OnPreDrawListener;
import p.ch4;
import p.zf2;
import p.co5;

public final class gq5 implements gl6	// class@00175d from classes.dex
{
    public final View a;
    public final boolean b;

    public void gq5(View p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Object a(tp5 p0){
       fl6 uofl6;
       if ((uofl6 = b17.o(this)) != null) {
       }else {
          wb0 uofl61 = new wb0(1, ye7.E(p0));
          uofl61.p();
          ViewTreeObserver viewTreeObse = this.a.getViewTreeObserver();
          lk7 olk7 = new lk7(this, viewTreeObse, uofl61);
          viewTreeObse.addOnPreDrawListener(olk7);
          uofl61.r(new ch4(this, viewTreeObse, olk7, 1));
          uofl6 = uofl61.o();
       }
       return uofl6;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof gq5 || (!co5.c(this.a, p0.a) || this.b != p0.b)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       int i = this.a.hashCode() * 31;
       int i1 = (this.b != null)? 1231: 1237;
       return (i + i1);
    }
}
