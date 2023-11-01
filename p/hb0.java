package p.hb0;
import p.ir0;
import p.o11;
import java.lang.Object;
import java.util.List;
import java.lang.String;
import p.co5;
import p.ib0;
import p.gb0;
import java.lang.Class;
import p.db0;
import java.util.Iterator;
import p.la0;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Throwable;
import p.jl;

public final class hb0 implements ir0	// class@001817 from classes.dex
{
    public final int a;
    public final o11 b;

    public void hb0(o11 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       o11 v;
       int i;
       hb0 tb = this.b;
       String str = "p0";
       switch (this.a){
           case 0:
             break;
           default:
             co5.o(p0, str);
             tb.getClass();
             jl.f("Failed to deserialize calling codes. This shouldn\'t happen.", p0);
             tb.onCancel();
             return;
       }
       co5.o(p0, str);
       if ((v = tb.v) != null) {
          gb0 j = v.J;
          j.getClass();
          j.y = p0;
          j.w();
       }
       if ((v = tb.w) != null) {
          p0 = p0.iterator();
          i = 0;
          while (true) {
             if (p0.hasNext()) {
                if (co5.c(p0.next().a, v)) {
                   break ;
                }else {
                   i = i + 1;
                }
             }
          }
          if (i >= 0 && (p0 = tb.v) != null) {
             p0.K.D0(i);
          }
          return;
       }
       i = -1;
    }
}
