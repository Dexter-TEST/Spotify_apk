package p.np2;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.cosmos.cosmonaut.annotations.Headers;
import java.lang.Class;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.lang.CharSequence;
import p.av6;
import java.util.Map;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import p.ml1;
import java.util.ArrayList;
import p.qs5;
import com.spotify.cosmos.cosmonaut.annotations.Header;
import p.uw5;
import p.c93;
import com.spotify.cosmos.cosmonaut.annotations.HeaderMap;

public final class np2	// class@002021 from classes.dex
{
    public final Map a;
    public final ArrayList b;
    public final ArrayList c;

    public void np2(Method p0){
       LinkedHashMap linkedHashMa;
       int len;
       int i1;
       object oobject;
       int i2;
       String str;
       Header header;
       HeaderMap headerMap;
       co5.o(p0, "method");
       super();
       Headers annotation = p0.getAnnotation(Headers.class);
       int i = 0;
       if (annotation != null) {
          String[] stringArray = annotation.value();
          linkedHashMa = new LinkedHashMap();
          len = stringArray.length;
          i1 = 0;
          while (true) {
             if (i1 < len) {
                oobject = stringArray[i1];
                i2 = av6.m0(oobject, ':', i, i, 6);
                str = "\"";
                if (i2 != -1 && i2) {
                   int i3 = 1;
                   int i4 = oobject.length() - i3;
                   if (i2 != i4) {
                      String str1 = oobject.substring(i, i2);
                      co5.l(str1, "this as java.lang.String…ing\(startIndex, endIndex\)");
                      i2 = i2 + 1;
                      String str2 = oobject.substring(i2);
                      co5.l(str2, "this as java.lang.String\).substring\(startIndex\)");
                      str2 = av6.K0(str2).toString();
                      if (str2.length()) {
                         i3 = 0;
                      }
                      if (!i3) {
                         linkedHashMa.put(str1, str2);
                         i1 = i1 + 1;
                      }else {
                         throw new IllegalArgumentException(str.concat(str1)+"\" valuer is empty");
                      }
                   }
                }
                break ;
             }
          }
          throw new IllegalArgumentException(str.concat(oobject)+"\" is not in the form \"Name: Value\"");
       }else {
          linkedHashMa = ml1.a;
       }
       this.a = linkedHashMa;
       Annotation[][] parameterAnn = p0.getParameterAnnotations();
       String str3 = "parameterAnnotations";
       co5.l(parameterAnn, str3);
       ArrayList uArrayList = new ArrayList();
       i1 = parameterAnn.length;
       int i5 = 0;
       i2 = 0;
       while (true) {
          c93 uoc93 = null;
          str = "parameterAnnotation";
          if (i5 < i1) {
             object oobject1 = parameterAnn[i5];
             int i6 = i2 + 1;
             co5.l(oobject1, str);
             if ((header = uw5.i(oobject1, Header.class)) != null) {
                uoc93 = new c93(header, i2);
             }
             if (uoc93 != null) {
                uArrayList.add(uoc93);
             }
             i5 = i5 + 1;
             i2 = i6;
          }else {
             break ;
          }
       }
       this.b = uArrayList;
       Annotation[][] parameterAnn1 = p0.getParameterAnnotations();
       co5.l(parameterAnn1, str3);
       ArrayList uArrayList1 = new ArrayList();
       int len1 = parameterAnn1.length;
       len = 0;
       while (i < len1) {
          object oobject2 = parameterAnn1[i];
          i5 = len + 1;
          co5.l(oobject2, str);
          c93 uoc931 = ((headerMap = uw5.i(oobject2, HeaderMap.class)) == null)? uoc93: new c93(headerMap, len);
          if (uoc931 != null) {
             uArrayList1.add(uoc931);
          }
          i = i + 1;
          len = i5;
       }
       this.c = uArrayList1;
       return;
    }
}
