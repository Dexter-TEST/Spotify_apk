package p.al3;
import java.util.AbstractSet;
import p.dl3;
import java.lang.Object;
import java.util.Map$Entry;
import p.cl3;
import java.util.Iterator;
import p.zk3;
import java.lang.Class;

public final class al3 extends AbstractSet	// class@000fa5 from classes.dex
{
    public final int a;
    public final dl3 b;

    public void al3(dl3 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void clear(){
       al3 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.clear();
             return;
       }
       tb.clear();
       return;
    }
    public final boolean contains(Object p0){
       al3 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             return tb.containsKey(p0);
       }
       boolean b = (p0 instanceof Map$Entry && tb.b(p0) != null)? true: false;
       return b;
    }
    public final Iterator iterator(){
       switch (this.a){
           case 0:
           default:
             return new zk3(this, 0);
       }
       return new zk3(this);
    }
    public final boolean remove(Object p0){
       boolean b = false;
       al3 tb = this.b;
       switch (this.a){
           case 0:
             if (p0 instanceof Map$Entry && (p0 = tb.b(p0)) != null) {
                tb.d(p0, true);
                b = true;
             }
             break;
           default:
             tb.getClass();
             p0 = (p0 != null)? tb.a(p0, b): null;
       }
       return b;
    }
    public final int size(){
       al3 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return tb.c;
       }
       return tb.c;
    }
}
