package p.ma3;
import java.lang.String;
import p.rn6;
import android.content.Context;
import p.tn6;
import java.lang.Object;
import p.s53;
import p.n34;
import java.util.concurrent.Callable;
import p.s36;
import java.util.Objects;
import p.t34;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.Scheduler;
import p.up0;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.core.Single;
import p.k12;
import p.yf2;
import p.mx6;
import p.a44;

public final class ma3	// class@001e57 from classes.dex
{
    public final a44 a;
    public final tn6 b;
    public static final rn6 c;

    static {
       ma3.c = rn6.a("install_referrer_referrer");
    }
    public void ma3(Context p0,tn6 p1){
       super();
       this.b = p1;
       Scheduler c = s36.c;
       Objects.requireNonNull(c, "scheduler is null");
       t34 ot34 = new t34(new n34(new s53(9, this)), c, 1);
       Single single = Single.create(new up0(1, p0)).subscribeOn(c);
       single = single.map(new k12(22)).map(new k12(23)).flatMap(new mx6(17, this)).onErrorReturn(new k12(24));
       Objects.requireNonNull(single, "other is null");
       this.a = new a44(ot34, 0, single);
    }
}
