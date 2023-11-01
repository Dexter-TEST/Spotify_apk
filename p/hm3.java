package p.hm3;
import java.io.Serializable;
import java.util.RandomAccess;
import java.util.AbstractList;
import java.lang.Object;
import android.widget.Button;
import p.ap5;

public final class hm3 extends AbstractList implements Serializable, RandomAccess	// class@00187d from classes.dex
{
    public final Object a;
    public final Object[] b;

    public void hm3(Object[] p0,Button p1){
       super();
       this.a = p1;
       this.b = p0;
    }
    public final Object get(int p0){
       hm3 ta;
       ap5.f(p0, this.size());
       if (!p0) {
          ta = this.a;
       }else {
          p0--;
          ta = this.b[p0];
       }
       return ta;
    }
    public final int size(){
       int i;
       long l = (long)this.b.length + (long)1;
       if ((l - 0x7fffffff) > 0) {
          i = Integer.MAX_VALUE;
       }else if((l - -2147483648) < 0){
          i = Integer.MIN_VALUE;
       }else {
          i = (int)l;
       }
       return i;
    }
}
