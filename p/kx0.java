package p.kx0;
import com.spotify.clientfoundations.cosmos.cosmos.Lifetime;
import java.lang.Object;
import p.g54;
import java.util.concurrent.ConcurrentLinkedQueue;
import p.jx0;
import p.xt5;
import java.lang.IllegalStateException;
import java.lang.String;

public final class kx0 implements Lifetime	// class@001c9b from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void kx0(Object p0,int p1,Object p2){
       this.a = p1;
       this.b = p0;
       this.c = p2;
       super();
    }
    public final void release(){
       kx0 tc = this.c;
       kx0 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.c = true;
             if (tc == null) {
                throw new IllegalStateException("Required value was null.".toString());
             }
             tc.release();
             return;
       }
       tb.a.remove(tc);
       return;
    }
}
