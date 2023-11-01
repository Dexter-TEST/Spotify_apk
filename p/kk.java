package p.kk;
import java.util.AbstractSet;
import java.util.Map;
import p.zl6;
import java.lang.Object;
import java.util.AbstractCollection;
import java.util.Map$Entry;
import java.lang.Comparable;
import java.util.Iterator;
import p.nk;
import p.pk;
import p.dm6;
import p.wh6;

public class kk extends AbstractSet	// class@001c32 from classes.dex
{
    public final int a;
    public final Map b;

    public void kk(int p0,Map p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public void kk(zl6 p0){
       this.a = 1;
       super(1, p0);
    }
    public final boolean add(Object p0){
       boolean b;
       switch (this.a){
           case 1:
             if (!this.contains(p0)) {
                this.b.m(p0.getKey(), p0.getValue());
                b = true;
             }else {
                b = false;
             }
             break;
           default:
             return super.add(p0);
       }
       return b;
    }
    public final void clear(){
       switch (this.a){
           case 1:
           default:
             super.clear();
             return;
       }
       this.b.c();
       return;
    }
    public final boolean contains(Object p0){
       boolean b;
       switch (this.a){
           case 1:
             Object obj = this.b.g(p0.getKey());
             p0 = p0.getValue();
             b = (obj != p0 && (obj == null && obj.equals(p0)))? false: true;
             break;
           default:
             return super.contains(p0);
       }
       return b;
    }
    public Iterator iterator(){
       kk tb = this.b;
       switch (this.a){
           case 0:
           default:
             return new dm6(tb);
       }
       return new nk(tb);
    }
    public final boolean remove(Object p0){
       boolean b;
       switch (this.a){
           case 1:
             if (this.contains(p0)) {
                this.b.n(p0.getKey());
                b = true;
             }else {
                b = false;
             }
             break;
           default:
             return super.remove(p0);
       }
       return b;
    }
    public final int size(){
       kk tb = this.b;
       switch (this.a){
           case 0:
           default:
             return tb.p();
       }
       return tb.c;
    }
}
