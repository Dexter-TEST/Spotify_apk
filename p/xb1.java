package p.xb1;
import java.io.Closeable;
import p.dc1;
import java.lang.String;
import java.util.ArrayList;
import java.lang.Object;
import p.co5;
import java.util.Iterator;
import java.util.List;
import p.nn6;
import p.we7;

public final class xb1 implements Closeable	// class@0003ba from classes2.dex
{
    public final String a;
    public final long b;
    public final List c;
    public final dc1 t;

    public void xb1(dc1 p0,String p1,long p2,ArrayList p3,long[] p4){
       co5.o(p0, "this$0");
       co5.o(p1, "key");
       co5.o(p4, "lengths");
       this.t = p0;
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
    }
    public final void close(){
       Iterator iterator = this.c.iterator();
       while (iterator.hasNext()) {
          we7.d(iterator.next());
       }
       return;
    }
}
