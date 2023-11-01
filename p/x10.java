package p.x10;
import p.xc2;
import p.c15;
import p.g70;
import p.nn6;
import p.e70;

public final class x10 extends xc2	// class@002be7 from classes.dex
{
    public final int b;
    public Object c;

    public void x10(c15 p0,g70 p1){
       this.b = 1;
       this.c = p0;
       super(p1);
    }
    public void x10(g70 p0){
       this.b = 0;
       super(p0);
    }
    public final long o(e70 p0,long p1){
       switch (this.b){
           case 0:
           default:
             try{
                return super.o(p0, p1);
             }catch(java.io.IOException e2){
                p1.t = e2;
                throw e2;
             }
       }
       try{
          return super.o(p0, p1);
       }catch(java.lang.Exception e2){
          this.c = e2;
          throw e2;
       }
    }
}
