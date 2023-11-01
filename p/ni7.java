package p.ni7;
import p.ng2;
import p.px5;
import android.view.View;
import p.au0;
import java.lang.Object;
import p.ma6;
import p.jc7;
import p.dx0;
import p.eb3;
import java.lang.IllegalStateException;
import java.lang.String;
import android.view.ViewGroup;
import p.co5;
import p.ei7;
import p.di7;

public final class ni7 extends px5 implements ng2	// class@001fe7 from classes.dex
{
    public int c;
    public Object t;
    public final View v;

    public void ni7(View p0,au0 p1){
       this.v = p0;
       super(p1);
    }
    public final Object b(Object p0,Object p1){
       return this.c(p0, p1).f(jc7.a);
    }
    public final au0 c(Object p0,au0 p1){
       ni7 oni7 = new ni7(this.v, p1);
       oni7.t = p0;
       return oni7;
    }
    public final Object f(Object p0){
       dx0 a = dx0.a;
       ni7 tc = this.c;
       ni7 tv = this.v;
       int i = 1;
       if (tc != null) {
          if (tc != i) {
             if (tc == 2) {
                eb3.G(p0);
             }else {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
             }
          }else {
             tc = this.t;
             eb3.G(p0);
             if (tv instanceof ViewGroup) {
                co5.o(tv, "<this>");
                this.t = 0;
                this.c = 2;
                if (tc.b(new di7(3, new ei7(tv, null)), this) == a) {
                   return a;
                }
             }
          }
          return jc7.a;
       }else {
          eb3.G(p0);
          p0 = this.t;
          this.t = p0;
          this.c = i;
          p0.b = tv;
          p0.a = 3;
          p0.t = this;
          return a;
       }
    }
}
