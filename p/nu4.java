package p.nu4;
import p.yf2;
import java.lang.Object;
import p.rn6;
import p.tn6;
import java.lang.Boolean;
import com.spotify.messaging.inappmessagingsdk.networking.a;
import p.a97;
import com.google.common.collect.c;
import io.reactivex.rxjava3.core.Observable;
import p.l94;

public final class nu4 implements yf2	// class@00204f from classes.dex
{
    public final int a;
    public final boolean b;
    public final Object c;

    public void nu4(int p0,Object p1,boolean p2){
       this.a = p0;
       this.c = p1;
       this.b = p2;
       super();
    }
    public final Object apply(Object p0){
       nu4 tb = this.b;
       nu4 tc = this.c;
       switch (this.a){
           case 0:
           default:
             return tc.d(tb, p0.F, p0.G).map(new l94(21)).onErrorReturn(new l94(22));
       }
       return Boolean.valueOf(p0.d(tc, tb));
    }
}
