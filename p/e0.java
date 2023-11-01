package p.e0;
import p.r2;
import java.lang.String;
import p.yy6;
import p.uj;
import java.util.Map;
import java.util.Collections;
import p.gs2;
import java.lang.Integer;
import p.xj0;
import android.util.Log;
import p.xl0;
import p.tp2;
import p.mp2;
import p.xe7;
import java.lang.Throwable;
import java.lang.RuntimeException;

public abstract class e0 extends r2	// class@0013f6 from classes.dex
{
    public final String v;

    public void e0(String p0,String p1,yy6 p2,int p3){
       super(p0, p1, p2, p3);
       this.v = "17.2.1";
    }
    public final boolean c(uj p0){
       xl0 oxl0;
       gs2 ogs2 = this.a(Collections.emptyMap());
       uj a = p0.a;
       ogs2.b("X-CRASHLYTICS-ORG-ID", a);
       ogs2.b("X-CRASHLYTICS-GOOGLE-APP-ID", p0.b);
       ogs2.b("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
       ogs2.b("X-CRASHLYTICS-API-CLIENT-VERSION", this.v);
       ogs2.c("org_id", a);
       ogs2.c("app[identifier]", p0.c);
       ogs2.c("app[name]", p0.g);
       ogs2.c("app[display_version]", p0.d);
       ogs2.c("app[build_version]", p0.e);
       ogs2.c("app[source]", Integer.toString(p0.h));
       ogs2.c("app[minimum_sdk_version]", p0.i);
       ogs2.c("app[built_sdk_version]", "0");
       p0 = p0.f;
       if (!xj0.C0(p0)) {
          ogs2.c("app[instance_identifier]", p0);
       }
       String str = "FirebaseCrashlytics";
       int i = 3;
       try{
          Log.isLoggable(str, i);
          oxl0 = ogs2.a();
          "POST".equalsIgnoreCase(tp2.w(ogs2.a));
          oxl0.t.a("X-REQUEST-ID");
          Log.isLoggable(str, i);
          Log.isLoggable(str, i);
          boolean b = (!xe7.Q(oxl0.b))? true: false;
          return b;
       }catch(java.io.IOException e0){
          Log.e(xe7.Q(oxl0.b), "HTTP request failed.", e0);
          throw new RuntimeException(e0);
       }
    }
}
