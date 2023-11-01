package p.ag;
import android.content.res.Configuration;
import android.os.LocaleList;
import p.v3;
import java.lang.Object;
import p.br3;
import java.lang.String;
import p.dr3;

public abstract class ag	// class@000f7d from classes.dex
{

    public static void a(Configuration p0,Configuration p1,Configuration p2){
       LocaleList localeList = p2.g(p1);
       if (!p2.A(localeList, p2.g(p0))) {
          p2.o(p2, localeList);
          p2.locale = p1.locale;
       }
       return;
    }
    public static br3 b(Configuration p0){
       return br3.b(v3.m(v3.g(p0)));
    }
    public static void c(br3 p0){
       v3.r(v3.h(p0.a.a()));
    }
    public static void d(Configuration p0,br3 p1){
       v3.o(p0, v3.h(p1.a.a()));
    }
}
