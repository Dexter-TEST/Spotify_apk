package p.cd4;
import p.qu0;
import com.squareup.moshi.Moshi;
import p.yc4;
import java.lang.reflect.Type;
import java.lang.annotation.Annotation;
import p.cy5;
import p.su0;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ty0;

public final class cd4 extends qu0	// class@0011e6 from classes.dex
{
    public final yc4 a;

    public void cd4(Moshi p0){
       super();
       this.a = yc4.c(p0);
    }
    public final su0 a(Type p0,Annotation[] p1,Annotation[] p2,cy5 p3){
       co5.o(p0, "type");
       co5.o(p2, "methodAnnotations");
       co5.o(p3, "retrofit");
       su0 osu0 = (ty0.p(p0))? this.a.a(p0, p1, p2, p3): null;
       return osu0;
    }
    public final su0 b(Type p0,Annotation[] p1,cy5 p2){
       co5.o(p0, "type");
       co5.o(p1, "annotations");
       co5.o(p2, "retrofit");
       su0 osu0 = (ty0.p(p0))? this.a.b(p0, p1, p2): null;
       return osu0;
    }
}
