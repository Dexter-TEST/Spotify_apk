package p.p95;
import java.lang.reflect.Method;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import p.qs5;
import com.spotify.cosmos.cosmonaut.annotations.Path;
import java.lang.Class;
import p.uw5;
import p.c93;
import com.spotify.cosmos.cosmonaut.annotations.GET;
import com.spotify.cosmos.cosmonaut.annotations.POST;
import com.spotify.cosmos.cosmonaut.annotations.SUB;
import com.spotify.cosmos.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.cosmonaut.annotations.PUT;
import java.lang.IllegalArgumentException;
import p.uf0;
import p.ye7;
import p.ah3;

public final class p95	// class@00221a from classes.dex
{
    public final ArrayList a;
    public final String b;

    public void p95(Method p0){
       Path path;
       String str;
       co5.o(p0, "method");
       super();
       Annotation[][] parameterAnn = p0.getParameterAnnotations();
       co5.l(parameterAnn, "parameterAnnotations");
       ArrayList uArrayList = new ArrayList();
       int len = parameterAnn.length;
       int i = 0;
       int i1 = 0;
       while (i < len) {
          object oobject = parameterAnn[i];
          int i2 = i1 + 1;
          co5.l(oobject, "parameterAnnotation");
          c93 uoc93 = ((path = uw5.i(oobject, Path.class)) == null)? null: new c93(path, i1);
          if (uoc93 != null) {
             uArrayList.add(uoc93);
          }
          i = i + 1;
          i1 = i2;
       }
       this.a = uArrayList;
       Annotation uAnnotation = uw5.h(p0);
       if (uAnnotation instanceof GET) {
          str = uAnnotation.value();
       }else if(uAnnotation instanceof POST){
          str = uAnnotation.value();
       }else if(uAnnotation instanceof SUB){
          str = uAnnotation.value();
       }else if(uAnnotation instanceof DELETE){
          str = uAnnotation.value();
       }else if(uAnnotation instanceof PUT){
          str = uAnnotation.value();
       }else {
          throw new IllegalArgumentException(ye7.z(ye7.y(uAnnotation)).toString());
       }
       this.b = str;
       return;
    }
}
