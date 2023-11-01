package p.nt6;
import p.yf2;
import android.content.Context;
import java.lang.Object;
import p.r45;
import p.jr3;
import p.n34;
import java.util.concurrent.Callable;
import p.co5;
import java.lang.String;
import java.util.Objects;
import p.c34;
import io.reactivex.rxjava3.core.MaybeSource;
import p.bi5;
import p.vn6;
import java.util.HashMap;
import p.po2;
import p.oo2;
import java.nio.charset.Charset;
import p.w51;
import p.m74;
import java.lang.CharSequence;
import p.fo2;
import android.content.SharedPreferences;
import java.util.Map;
import p.go6;
import p.un6;
import p.co6;
import p.ws6;
import p.kf7;
import java.lang.IllegalArgumentException;
import p.pd5;
import android.content.IntentFilter;
import p.t60;
import java.lang.Boolean;
import p.ab0;
import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.TimeUnit;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Maybe;

public final class nt6 implements yf2	// class@002048 from classes.dex
{
    public final int a;
    public final Context b;

    public void nt6(Context p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       SharedPreferences sharedPrefer;
       go6 p0;
       int i = 1;
       switch (this.a){
           case 0:
             nt6 tb = this.b;
             vn6 ovn6 = new vn6();
             co5.o(tb, "context");
             co5.o(p0, "username");
             int i1 = (p0.length() > 0)? 1: 0;
             if (i1) {
                String str = "user-";
                HashMap a = vn6.a;
                _monitor_enter(a);
                if ((sharedPrefer = a.get(p0)) == null) {
                   Context applicationC = tb.getApplicationContext();
                   co5.l(applicationC, "context.applicationContext");
                   String str1 = oo2.a.b().K(p0, Charset.defaultCharset()).B().toString();
                   co5.l(str1, "sha1\(\).hashString\(userna…aultCharset\(\)\).toString\(\)");
                   sharedPrefer = applicationC.getSharedPreferences(str.concat(str1), 0);
                   co5.l(sharedPrefer, "context.getSharedPrefere…me, Context.MODE_PRIVATE\)");
                   a.put(p0, sharedPrefer);
                }
                p0 = new go6(new un6(sharedPrefer, i), ovn6.a(tb), null, false, vn6.b);
                _monitor_exit(a);
                return p0;
             }else {
                throw new IllegalArgumentException("Username cannot be empty".toString());
             }
             break;
           case 1:
           default:
             nt6 tb1 = this.b;
             co5.o(tb1, "context");
             t60 ot60 = new t60(tb1, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), Boolean.TRUE);
             p0 = ot60.filter(new ab0(5));
             return p0.map(new ab0(22)).timeout(5, TimeUnit.MINUTES, s36.b).onErrorResumeWith(Observable.empty()).firstElement();
       }
       ir2 k = co5.k;
       Objects.requireNonNull(k, "predicate is null");
       return new c34(new n34(new jr3(p0, 3, this.b)), k, i);
    }
}
