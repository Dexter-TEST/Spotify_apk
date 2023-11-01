package p.ot2;
import p.rt2;
import java.util.HashMap;
import java.lang.Object;
import java.util.Map;
import p.m73;
import p.tt2;
import p.cu2;
import java.lang.String;

public final class ot2 implements rt2	// class@002186 from classes.dex
{
    public final m73 b;
    public final rt2 c;

    public void ot2(HashMap p0){
       super();
       this.b = m73.b(p0);
       this.c = rt2.a;
    }
    public final void a(tt2 p0,cu2 p1){
       rt2 ort2;
       if ((ort2 = this.b.get(p0.name())) != null) {
          ort2.a(p0, p1);
       }else {
          this.c.a(p0, p1);
       }
       return;
    }
}
