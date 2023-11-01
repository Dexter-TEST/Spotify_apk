package p.j92;
import io.reactivex.rxjava3.core.Flowable;
import p.iv6;
import p.zn0;
import p.i92;
import p.kv6;

public final class j92 extends Flowable	// class@001a8e from classes.dex
{
    public final int b;
    public final int c;

    public void j92(int p0){
       super();
       this.b = 1;
       this.c = 1 + p0;
    }
    public final void u(iv6 p0){
       j92 tc = this.c;
       j92 tb = this.b;
       if (p0 instanceof zn0) {
          p0.onSubscribe(new i92(p0, tb, tc, 0));
       }else {
          p0.onSubscribe(new i92(p0, tb, tc, 1));
       }
       return;
    }
}
