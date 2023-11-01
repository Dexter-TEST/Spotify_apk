package p.os7;
import p.yf2;
import java.lang.Object;
import java.lang.Boolean;
import p.ps7;
import p.ns7;
import io.reactivex.rxjava3.core.Single;
import p.xs7;
import io.reactivex.rxjava3.core.Completable;
import p.mb;
import p.ir0;
import p.fl0;
import com.spotify.zorro.telco.v2.proto.TelcoResponse;
import java.lang.String;
import p.co5;
import java.lang.Class;
import p.en6;
import com.spotify.base.java.logging.Logger;
import p.ss7;
import p.tk0;

public final class os7 implements yf2	// class@002182 from classes.dex
{
    public final int a;
    public final Object b;

    public void os7(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Object apply(Object p0){
       String str;
       int i;
       ns7 ons7;
       os7 tb = this.b;
       switch (this.a){
           case 0:
             p0 = tb.c;
             return p0.a.c().flatMapCompletable(new os7(2, p0)).f(mb.z);
           case 1:
             return tb.b;
           default:
             co5.l(p0, "it");
             tb.getClass();
             if ((str = p0.f()) != null) {
                if ((i = str.hashCode()) != -661069747) {
                   if (i != 0x5a6400aa) {
                      if (i == 0x5bdabf30 && str.equals("HE_FLOW")) {
                         ons7 = tb.c;
                      label_0082 :
                         if (ons7 == null || (p0 = ons7.a(p0)) == null) {
                            p0 = tk0.a;
                            co5.l(p0, "complete\(\)");
                         }
                         return p0;
                      }
                   }else if(str.equals("FOLLOW_REDIRECT")){
                      ons7 = tb.b;
                      goto label_0082 ;
                   }
                }else if(!str.equals("IP_BLOCKING")){
                   ons7 = tb.d;
                   goto label_0082 ;
                }
             }
             Object[] objArray = new Object[0];
             Logger.e(en6.n("No strategy implemented for ", str), objArray);
             ons7 = null;
             goto label_0082 ;
       }
    }
}
