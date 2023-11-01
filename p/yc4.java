package p.yc4;
import p.qu0;
import com.squareup.moshi.Moshi;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.annotation.Annotation;
import java.util.Set;
import java.lang.Class;
import p.ig3;
import java.util.LinkedHashSet;
import java.lang.Object;
import java.util.Collections;
import java.lang.reflect.Type;
import p.cy5;
import p.su0;
import com.squareup.moshi.JsonAdapter;
import p.dd4;
import p.ed4;

public final class yc4 extends qu0	// class@0003d8 from classes2.dex
{
    public final Moshi a;

    public void yc4(Moshi p0){
       super();
       this.a = p0;
    }
    public static yc4 c(Moshi p0){
       if (p0 != null) {
          return new yc4(p0);
       }
       throw new NullPointerException("moshi == null");
    }
    public static Set d(Annotation[] p0){
       int len = p0.length;
       Set set = null;
       int i = 0;
       while (i < len) {
          object oobject = p0[i];
          if (oobject.annotationType().isAnnotationPresent(ig3.class)) {
             if (set == null) {
                set = new LinkedHashSet();
             }
             set.add(oobject);
          }
          i = i + 1;
       }
       Set set1 = (set != null)? Collections.unmodifiableSet(set): Collections.emptySet();
       return set1;
    }
    public final su0 a(Type p0,Annotation[] p1,Annotation[] p2,cy5 p3){
       return new dd4(this.a.e(p0, yc4.d(p1)));
    }
    public final su0 b(Type p0,Annotation[] p1,cy5 p2){
       return new ed4(this.a.e(p0, yc4.d(p1)));
    }
}
