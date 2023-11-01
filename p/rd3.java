package p.rd3;
import p.ab2;
import java.lang.Iterable;
import java.util.Iterator;
import java.util.List;
import java.lang.Math;
import java.lang.Class;
import java.lang.Object;
import p.ap5;
import p.qd3;
import p.ud3;

public final class rd3 extends ab2	// class@0024c5 from classes.dex
{
    public final int b;
    public final Iterable c;
    public final int t;

    public void rd3(Iterable p0,int p1,int p2){
       this.b = p2;
       this.c = p0;
       this.t = p1;
       super();
    }
    public final Iterator iterator(){
       Iterator iterator;
       rd3 tt = this.t;
       rd3 tc = this.c;
       boolean b = true;
       int i = 0;
       switch (this.b){
           case 0:
             if (tc instanceof List) {
                iterator = tc.subList(Math.min(tc.size(), tt), tc.size()).iterator();
             }else {
                iterator = tc.iterator();
                iterator.getClass();
                if (tt < null) {
                   b = false;
                }
                ap5.d("numberToAdvance must be nonnegative", b);
                for (; i < tt && iterator.hasNext(); i = i + 1) {
                   iterator.next();
                }
                iterator = new qd3(iterator);
             }
             break;
           default:
             iterator = tc.iterator();
             iterator.getClass();
             if (tt < null) {
                b = false;
             }
             ap5.d("limit is negative", b);
             return new ud3(tt, iterator);
       }
       return iterator;
    }
}
