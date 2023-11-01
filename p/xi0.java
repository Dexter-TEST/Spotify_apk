package p.xi0;
import p.vi0;
import p.ui0;
import p.mp;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.a44;
import p.hi7;
import java.util.concurrent.Callable;
import io.reactivex.rxjava3.core.Single;
import p.ir2;
import p.bi5;
import io.reactivex.rxjava3.core.Maybe;
import java.lang.Class;
import p.k34;
import io.reactivex.rxjava3.core.MaybeSource;
import p.yf2;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import java.util.Objects;
import io.reactivex.rxjava3.core.Completable;
import java.util.Set;
import p.wi0;

public final class xi0 implements vi0	// class@002c7f from classes.dex
{
    public final ui0 a;
    public final mp b;

    public void xi0(ui0 p0,mp p1){
       co5.o(p0, "collectionService");
       co5.o(p1, "authentication");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final a44 a(){
       Maybe maybe = Single.fromCallable(new hi7(3, this)).filter(ir2.c0);
       maybe.getClass();
       k34 ok34 = new k34(maybe, ir2.I, 1);
       Single single = Single.error(new IllegalStateException("Current username is empty"));
       Objects.requireNonNull(single, "other is null");
       return new a44(ok34, 0, single);
    }
    public final Completable b(String p0,boolean p1){
       co5.o(p0, "artistUri");
       Completable uCompletable = this.a().flatMapCompletable(new wi0(co5.H(p0), p1, this, 0));
       co5.l(uCompletable, "override fun updateFavor…ld\(\)\)\n            }\n    }");
       return uCompletable;
    }
}
