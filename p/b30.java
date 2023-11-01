package p.b30;
import java.lang.reflect.Method;
import p.qv5;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.annotation.Annotation;
import p.qs5;
import com.spotify.cosmos.cosmonaut.annotations.Body;
import java.lang.Class;
import p.uw5;
import java.lang.reflect.Type;
import com.spotify.cosmos.cosmonaut.Converter;
import p.f30;
import p.jj5;
import java.util.ArrayList;
import com.spotify.cosmos.cosmonaut.annotations.BodyPart;
import p.t75;
import p.c0;
import p.e30;
import java.util.Map;

public final class b30	// class@001043 from classes.dex
{
    public final r45 a;
    public static final byte[] b;

    static {
       byte[] uobyteArray = new byte[0];
       b30.b = uobyteArray;
    }
    public void b30(Method p0,qv5 p1){
       jj5 ojj5;
       BodyPart uBodyPart;
       co5.o(p0, "method");
       co5.o(p1, "transformers");
       super();
       Annotation[][] parameterAnn = p0.getParameterAnnotations();
       co5.l(parameterAnn, "parameterAnnotations");
       int len = parameterAnn.length;
       int i = 0;
       int i1 = 0;
       while (true) {
          String str = "parameterAnnotation";
          if (i1 < len) {
             object oobject = parameterAnn[i1];
             co5.l(oobject, str);
             if (uw5.i(oobject, Body.class) != null) {
                object oobject1 = p0.getGenericParameterTypes()[i1];
                co5.l(oobject1, "type");
                f30 uof30 = new f30(i1, p1.a(oobject1), oobject1);
                ojj5 = new jj5(uof30);
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             ArrayList uArrayList = new ArrayList(1);
             len = parameterAnn.length;
             while (i < len) {
                object oobject2 = parameterAnn[i];
                co5.l(oobject2, str);
                if ((uBodyPart = uw5.i(oobject2, BodyPart.class)) != null) {
                   uArrayList.add(new t75(uBodyPart.value(), i));
                }
                i = i + 1;
             }
             if (uArrayList.isEmpty()) {
                ojj5 = c0.a;
             }else {
                ojj5 = new jj5(new e30(uArrayList, p1.a(Map.class)));
             }
          }
       }
       this.a = ojj5;
       return;
    }
}
