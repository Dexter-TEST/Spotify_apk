package p.fd4;
import com.squareup.moshi.JsonAdapter$a;
import java.lang.Object;
import java.lang.reflect.Type;
import java.util.Set;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.JsonAdapter;
import java.lang.String;
import p.co5;
import java.lang.Class;
import p.ya7;
import com.spotify.playerlimited.player.moshi.MoshiRootName;
import java.lang.annotation.Annotation;
import java.lang.Throwable;
import com.spotify.base.java.logging.Logger;
import com.spotify.playerlimited.player.moshi.MoshiRootNameAdapter;

public final class fd4 implements JsonAdapter$a	// class@0015a8 from classes.dex
{

    public void fd4(){
       super();
    }
    public final JsonAdapter a(Type p0,Set p1,Moshi p2){
       int i;
       MoshiRootName annotation;
       co5.o(p0, "type");
       co5.o(p1, "annotations");
       co5.o(p2, "moshi");
       try{
          i = 0;
          annotation = ya7.g(p0).getAnnotation(MoshiRootName.class);
       }catch(java.lang.NoClassDefFoundError e1){
          Object[] objArray = new Object[]{p0};
          Logger.c(e1, "Error reading annotation for %s", objArray);
          annotation = i;
       }
       if (annotation == null) {
          return i;
       }
       JsonAdapter jsonAdapter = p2.i(this, p0, p1);
       co5.l(jsonAdapter, "delegate");
       return new MoshiRootNameAdapter(jsonAdapter, annotation.value()).nullSafe();
    }
}
