package p.mj0;
import java.io.Serializable;
import p.xw0;
import java.lang.Object;
import p.il1;

public final class mj0 implements Serializable	// class@001ea5 from classes.dex
{
    public final xw0[] a;

    public void mj0(xw0[] p0){
       this.a = p0;
    }
    private final Object readResolve(){
       il1 a = il1.a;
       mj0 ta = this.a;
       int len = ta.length;
       for (int i = 0; i < len; i = i + 1) {
          a = a.T(ta[i]);
       }
       return a;
    }
}
