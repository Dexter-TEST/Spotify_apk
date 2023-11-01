package p.ed3;
import p.ss7;
import p.c17;
import p.xs7;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.zorro.telco.v2.proto.TelcoResponse;
import io.reactivex.rxjava3.core.Completable;
import java.lang.Class;
import p.fb2;
import p.jk0;

public final class ed3 implements ss7	// class@001465 from classes.dex
{
    public final c17 a;
    public final xs7 b;

    public void ed3(c17 p0,xs7 p1){
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
       ed3 ta = this.a;
       ta.getClass();
       Completable uCompletable = ta.a.b(str, str1);
       str1 = p0.g();
       co5.l(str1, "telcoResponse.callbackUrl");
       String str2 = p0.h();
       co5.l(str2, "telcoResponse.sessionId");
       return uCompletable.c(this.b.b(str1, str2));
    }
}
