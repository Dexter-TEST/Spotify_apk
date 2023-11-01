package p.yx0;
import java.util.concurrent.Callable;
import p.ly0;
import java.lang.String;
import java.lang.Object;
import p.sr3;
import p.s32;

public final class yx0 implements Callable	// class@002e43 from classes.dex
{
    public final long a;
    public final String b;
    public final ly0 c;

    public void yx0(ly0 p0,long p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public final Object call(){
       yx0 tc = this.c;
       if (!tc.j()) {
          tc.m.c.o(this.b, this.a);
       }
       return null;
    }
}
