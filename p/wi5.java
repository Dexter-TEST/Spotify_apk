package p.wi5;
import p.vi5;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Set;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.y95;
import p.zv6;
import io.reactivex.rxjava3.core.Single;

public final class wi5 implements vi5	// class@002b43 from classes.dex
{
    public final Set a;
    public final Single b;

    public void wi5(Scheduler p0,Set p1){
       co5.o(p0, "ioScheduler");
       co5.o(p1, "preloads");
       super();
       this.a = p1;
       Single single = Single.defer(new y95(1, this)).subscribeOn(p0).cache();
       co5.l(single, "defer\(::firstPreloadedDa…ler\)\n            .cache\(\)");
       this.b = single;
    }
    public final Single a(){
       return this.b;
    }
}
