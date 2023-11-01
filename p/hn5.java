package p.hn5;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import p.qs5;
import com.spotify.cosmos.cosmonaut.annotations.Query;
import java.lang.Class;
import p.uw5;
import p.c93;
import com.spotify.cosmos.cosmonaut.annotations.QueryMap;
import java.lang.reflect.Type;
import java.lang.reflect.ParameterizedType;
import java.util.Map;
import p.jj5;
import java.lang.IllegalArgumentException;
import p.c0;

public final class hn5	// class@001888 from classes.dex
{
    public final ArrayList a;
    public final r45 b;

    public void hn5(Method p0){
       String str1;
       Query query;
       QueryMap queryMap;
       jj5 ojj5;
       co5.o(p0, "method");
       super();
       Annotation[][] parameterAnn = p0.getParameterAnnotations();
       String str = "parameterAnnotations";
       co5.l(parameterAnn, str);
       ArrayList uArrayList = new ArrayList();
       int len = parameterAnn.length;
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       while (true) {
          str1 = "parameterAnnotation";
          if (i1 < len) {
             object oobject = parameterAnn[i1];
             int i3 = i2 + 1;
             co5.l(oobject, str1);
             c93 uoc93 = ((query = uw5.i(oobject, Query.class)) == null)? null: new c93(query, i2);
             if (uoc93 != null) {
                uArrayList.add(uoc93);
             }
             i1 = i1 + 1;
             i2 = i3;
          }else {
             break ;
          }
       }
       this.a = uArrayList;
       parameterAnn = p0.getParameterAnnotations();
       co5.l(parameterAnn, str);
       int len1 = parameterAnn.length;
       int i4 = 0;
       len = 0;
       while (true) {
          if (i4 < len1) {
             object oobject1 = parameterAnn[i4];
             i2 = len + 1;
             co5.l(oobject1, str1);
             if ((queryMap = uw5.i(oobject1, QueryMap.class)) != null) {
                object oobject2 = p0.getGenericParameterTypes()[len];
                co5.l(oobject2, "type");
                if (oobject2 instanceof ParameterizedType) {
                   Type rawType = oobject2.getRawType();
                   Type[] actualTypeAr = oobject2.getActualTypeArguments();
                   if (actualTypeAr.length == 2) {
                      co5.l(rawType, "containerType");
                      rawType = (rawType instanceof Class && Map.class.isAssignableFrom(rawType))? 1: 0;
                      if (rawType) {
                         oobject2 = actualTypeAr[i];
                         co5.l(oobject2, "types[0]");
                         actualTypeAr = (oobject2 instanceof Class && String.class.isAssignableFrom(oobject2))? 1: 0;
                         if (actualTypeAr) {
                            i = 1;
                         }
                      }
                   }
                }
                if (i) {
                   ojj5 = new jj5(new c93(queryMap, len));
                   break ;
                }else {
                   throw new IllegalArgumentException("@QueryMap argument should be Map<String, Object> or Map<String, String>".toString());
                }
             }else {
                i4 = i4 + 1;
                len = i2;
             }
          }else {
             ojj5 = c0.a;
             break ;
          }
       }
       this.b = ojj5;
       return;
    }
}
