package p.zb3;
import java.util.AbstractList;
import p.i33;
import java.util.List;
import p.xb3;
import p.yb3;
import java.lang.Object;
import p.ju2;

public final class zb3 extends AbstractList	// class@002ec2 from classes.dex
{
    public final int a;
    public final List b;
    public final Object c;

    public void zb3(i33 p0,List p1){
       this.a = 1;
       this.c = p0;
       this.b = p1;
       super();
    }
    public void zb3(xb3 p0,yb3 p1){
       this.a = 0;
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object get(int p0){
       zb3 tb = this.b;
       zb3 tc = this.c;
       switch (this.a){
           case 0:
           default:
             return tc.a(tb.get(p0));
       }
       return tc.a(tb.get(p0));
    }
    public final int size(){
       zb3 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return tb.size();
       }
       return tb.size();
    }
}
