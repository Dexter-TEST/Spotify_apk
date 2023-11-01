package p.k60;
import android.content.DialogInterface$OnDismissListener;
import p.m60;
import p.l60;
import p.ob2;
import java.lang.Object;
import android.content.DialogInterface;
import java.lang.String;
import p.t50;
import java.lang.Class;
import p.mb6;

public final class k60 implements DialogInterface$OnDismissListener	// class@001bb0 from classes.dex
{
    public final l60 a;
    public final ob2 b;
    public final m60 c;

    public void k60(m60 p0,l60 p1,ob2 p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public final void onDismiss(DialogInterface p0){
       k60 ta;
       k60 tc = this.c;
       tc.a = false;
       tc.g = null;
       if ((ta = this.a) != null) {
          k60 tb = this.b;
          if (tc.b != null) {
             ta.getClass();
             if (mb6.r(tb.t)) {
                ta.c();
             }
          }else {
             ta.getClass();
             if (mb6.r(tb.t)) {
                ta.c();
             }
          }
       }
       return;
    }
}
