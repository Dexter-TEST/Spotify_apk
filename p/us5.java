package p.us5;
import p.q2;
import com.google.common.collect.f;
import java.lang.Comparable;
import java.lang.Object;
import java.lang.Integer;
import p.no5;
import p.zt0;
import p.qb1;

public final class us5 extends q2	// class@002911 from classes.dex
{
    public final int b;
    public final Comparable c;
    public final f t;

    public void us5(f p0,Comparable p1,int p2){
       this.b = p2;
       if (p2 != 1) {
          this.t = p0;
          super(p1);
          this.c = p0.N();
          return;
       }else {
          this.t = p0;
          super(p1);
          this.c = p0.L();
          return;
       }
    }
    public final Integer a(Comparable p0){
       int i = 1;
       Integer integer = null;
       us5 tt = this.t;
       us5 tc = this.c;
       switch (this.b){
           case 0:
             if (tc == null || p0.compareTo(tc)) {
                i = 0;
             }
             if (!i) {
                integer = tt.x.a(p0);
             }
             break;
           default:
             if (tc == null || p0.compareTo(tc)) {
                i = 0;
             }
             if (!i) {
                integer = tt.x.b(p0);
             }
             return integer;
       }
       return integer;
    }
}
