package p.zc4;
import java.util.Set;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Moshi$a;
import p.wb;
import com.squareup.moshi.JsonAdapter$a;
import java.util.Iterator;
import java.lang.Object;
import java.lang.String;
import p.co5;

public abstract class zc4	// class@002ecc from classes.dex
{

    public static final Moshi a(Set p0){
       Moshi$a uoa = new Moshi$a();
       uoa.a(new wb());
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (iterator.hasNext()) {
             Object obj = iterator.next();
             if (obj instanceof JsonAdapter$a) {
                uoa.a(obj);
             }else {
                uoa.b(obj);
             }
          }
       }
       Moshi moshi = uoa.d();
       co5.l(moshi, "builder.build\(\)");
       return moshi;
    }
}
