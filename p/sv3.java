package p.sv3;
import java.lang.Object;
import p.tb1;
import java.util.HashSet;
import java.lang.String;
import p.js3;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.util.List;
import p.ni3;

public final class sv3	// class@0026a7 from classes.dex
{
    public final tb1 a;
    public final HashSet b;
    public Map c;
    public Map d;
    public Map e;
    public jo6 f;
    public qv3 g;
    public List h;
    public Rect i;
    public float j;
    public float k;
    public float l;
    public boolean m;
    public int n;

    public void sv3(){
       super();
       this.a = new tb1();
       this.b = new HashSet();
       this.n = 0;
    }
    public final void a(String p0){
       js3.a(p0);
       this.b.add(p0);
    }
    public final float b(){
       return (float)(long)(((this.k - this.j) / this.l) * 1000.00f);
    }
    public final String toString(){
       String str = "LottieComposition:\n";
       Iterator iterator = this.h.iterator();
       while (iterator.hasNext()) {
          str = str.append(iterator.next().a("\t"));
       }
       return str;
    }
}
