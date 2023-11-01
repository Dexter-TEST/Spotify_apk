package p.k70;
import p.qu0;
import java.lang.reflect.Type;
import java.lang.annotation.Annotation;
import p.cy5;
import p.su0;
import p.fv5;
import java.lang.Class;
import p.do5;
import p.az5;
import p.fx5;
import p.pu6;
import p.h70;
import p.fv1;
import java.lang.Void;
import p.j70;
import p.jc7;
import p.gg1;

public final class k70 extends qu0	// class@000274 from classes2.dex
{
    public boolean a;

    public void k70(){
       super();
       this.a = true;
    }
    public final su0 a(Type p0,Annotation[] p1,Annotation[] p2,cy5 p3){
       if (fv5.class.isAssignableFrom(do5.C(p0))) {
          return az5.b;
       }
       return null;
    }
    public final su0 b(Type p0,Annotation[] p1,cy5 p2){
       if (p0 == fx5.class) {
          h70 a = (do5.J(p1, pu6.class))? h70.a: fv1.b;
          return a;
       }else if(p0 == Void.class){
          return j70.a;
       }else if(this.a != null && p0 == jc7.class){
          return gg1.b;
       }
    }
}
