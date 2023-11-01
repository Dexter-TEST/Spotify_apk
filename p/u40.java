package p.u40;
import p.ir0;
import p.v40;
import java.lang.Object;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ic;
import java.lang.Class;
import java.lang.System;
import p.eo5;
import java.lang.String;
import p.md;

public final class u40 implements ir0	// class@00283a from classes.dex
{
    public final v40 a;

    public void u40(v40 p0){
       this.a = p0;
       super();
    }
    public final void accept(Object p0){
       p0 = this.a;
       p0.d.getClass();
       p0.g = System.currentTimeMillis();
       if ((p0 = eo5.b) != null) {
          p0.g("bootstrap-network-request");
       }
       return;
    }
}
