package p.va5;
import p.i17;
import p.hr0;
import java.lang.Object;
import p.rc5;
import p.yg6;

public final class va5 implements i17	// class@0029b5 from classes.dex
{
    public final int a;
    public final hr0 b;

    public void va5(hr0 p0){
       this.a = 0;
       this.b = p0;
       super();
    }
    public void va5(hr0 p0,int p1){
       this.a = 1;
       this.b = p0;
       super();
    }
    public final void a(){
    }
    public final void b(){
       va5 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.accept(new yg6());
             return;
       }
       tb.accept(new rc5());
       return;
    }
    public final void c(){
    }
}
