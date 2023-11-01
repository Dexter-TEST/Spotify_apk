package p.g33;
import p.ku2;
import p.h33;
import p.ju2;
import java.util.List;
import java.util.Collections;
import com.google.common.collect.c;
import p.ys5;
import p.zb3;
import p.i33;

public final class g33 extends ku2	// class@001690 from classes.dex
{
    public final h33 b;

    public void g33(h33 p0,ju2 p1){
       this.b = p0;
       super(p1);
    }
    public final List j(){
       List list = this.a.j();
       int i = 0;
       int i1 = (list == Collections.emptyList())? 1: 0;
       if (i1) {
          list = Collections.emptyList();
       }else {
          ys5 v = ys5.v;
          if (list == v) {
             i = 1;
          }
          if (!i) {
             v = new zb3(this.b, list);
          }
          ys5 oys5 = v;
       }
       return list;
    }
}
