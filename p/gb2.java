package p.gb2;
import p.ss7;
import p.c17;
import p.xs7;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.zorro.telco.v2.proto.TelcoResponse;
import io.reactivex.rxjava3.core.Completable;
import java.lang.Class;
import io.reactivex.rxjava3.core.Single;
import p.fb2;
import p.vt5;
import p.yf2;
import p.mf1;

public final class gb2 implements ss7	// class@0016d6 from classes.dex
{
    public final c17 a;
    public final xs7 b;

    public void gb2(c17 p0,xs7 p1){
       co5.o(p0, "redirectNoFollowService");
       co5.o(p1, "zorroEndpoint");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Completable a(TelcoResponse p0){
       co5.o(p0, "telcoResponse");
       String str = p0.i();
       co5.l(str, "telcoResponse.url");
       gb2 ta = this.a;
       ta.getClass();
       Single single = ta.a.a(str).flatMap(vt5.c);
       co5.l(single, "followRedirectEndpoint.r…          }\n            }");
       Completable uCompletable = single.flatMapCompletable(new mf1(13, this));
       co5.l(uCompletable, "override fun runProcedur…lowRedirectResponse\(it\) }");
       return uCompletable;
    }
}
