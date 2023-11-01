package p.h33;
import p.i33;
import java.lang.Object;
import p.ju2;
import java.util.List;
import java.util.Collections;
import com.google.common.collect.c;
import p.ys5;
import p.g33;

public final class h33 implements i33	// class@0017d2 from classes.dex
{
    public final i33 a;

    public void h33(i33 p0){
       this.a = p0;
       super();
    }
    public final ju2 a(ju2 p0){
       ju2 oju2 = this.a.a(p0);
       List list = p0.j();
       int i = 1;
       int i1 = (list == Collections.emptyList())? 1: 0;
       if (!i1) {
          if (list != ys5.v) {
             i = 0;
          }
          if (!i) {
             return new g33(this, oju2);
          }
       }
       return oju2;
    }
}
