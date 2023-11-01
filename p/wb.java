package p.wb;
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
import p.vb;
import p.yd7;

public final class wb implements JsonAdapter$a	// class@002b07 from classes.dex
{

    public void wb(){
       super();
    }
    public final JsonAdapter a(Type p0,Set p1,Moshi p2){
       co5.o(p0, "type");
       co5.o(p1, "annotations");
       co5.o(p2, "moshi");
       Class uClass = ya7.g(p0);
       if (!uClass.isAnnotationPresent(vb.class) && !yd7.class.isAssignableFrom(uClass)) {
          return null;
       }
       return p2.i(this, p0, p1).serializeNulls();
    }
}
