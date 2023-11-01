package p.nm;
import p.rt2;
import p.sm;
import java.lang.Object;
import p.tt2;
import p.cu2;
import java.lang.Class;
import p.au2;
import java.lang.String;
import p.an5;

public final class nm implements rt2	// class@00200c from classes.dex
{
    public final int b;
    public final sm c;

    public void nm(sm p0,int p1){
       this.b = p1;
       this.c = p0;
       super();
    }
    public final void a(tt2 p0,cu2 p1){
       String str;
       nm tc = this.c;
       switch (this.b){
           case 0:
             break;
           default:
             tc.v.onNext(p0);
             return;
       }
       tc.getClass();
       if ((str = p0.b().q("uri")) != null) {
          tc.w.onNext(str);
       }
       return;
    }
}
