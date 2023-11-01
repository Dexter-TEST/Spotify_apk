package p.kf5;
import java.lang.Object;
import java.lang.String;
import p.ej5;
import com.google.common.collect.d;
import com.google.common.collect.g;
import java.util.Collection;
import java.lang.NullPointerException;

public abstract class kf5	// class@001c02 from classes.dex
{

    public void kf5(){
       super();
    }
    public static ej5 a(String p0){
       ej5 uoej5 = new ej5(13);
       if (p0 == null) {
          throw new NullPointerException("Null featureIdentifier");
       }
       uoej5.a = p0;
       uoej5.j("");
       uoej5.c = "";
       uoej5.d = "";
       uoej5.e = "";
       uoej5.f = "";
       uoej5.g = d.o(g.A);
       uoej5.h = "";
       return uoej5;
    }
}
