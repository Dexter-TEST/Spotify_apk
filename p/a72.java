package p.a72;
import p.v62;
import p.iv6;
import java.lang.Object;
import java.lang.String;
import java.lang.NullPointerException;
import p.iw1;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicLong;
import p.vv7;
import p.x62;
import p.ya4;

public abstract class a72 extends v62	// class@000f27 from classes.dex
{

    public void a72(iv6 p0){
       super(p0);
    }
    public final void onNext(Object p0){
       if (this.d()) {
          return;
       }
       if (p0 == null) {
          this.onError(iw1.b("onNext called with a null value."));
          return;
       }else if(this.get()){
          this.a.onNext(p0);
          vv7.H(this, 1);
       }else {
          p0 = this;
          switch (p0.c){
              case 0:
              default:
                p0.onError(new ya4("create: could not emit value due to lack of requests"));
          }
       }
       return;
    }
}
