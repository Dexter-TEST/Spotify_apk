package p.dp2;
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
import p.q9;
import p.yf2;

public final class dp2 implements ss7	// class@00138d from classes.dex
{
    public final c17 a;
    public final xs7 b;

    public void dp2(c17 p0,xs7 p1){
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
       String str1 = p0.h();
       co5.l(str1, "telcoResponse.sessionId");
       dp2 ta = this.a;
       ta.getClass();
       Single single = ta.a.c(str, str1);
       Completable uCompletable = single.flatMapCompletable(new q9(this, 5, p0));
       co5.l(uCompletable, "override fun runProcedur…ers, telcoResponse\)\n    }");
       return uCompletable;
    }
}
