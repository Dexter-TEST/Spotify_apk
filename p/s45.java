package p.s45;
import p.qu0;
import java.lang.reflect.Type;
import java.lang.annotation.Annotation;
import p.cy5;
import p.su0;
import java.lang.Class;
import p.do5;
import java.util.Optional;
import java.lang.reflect.ParameterizedType;
import p.i40;

public final class s45 extends qu0	// class@00032b from classes2.dex
{
    public static final s45 a;

    static {
       s45.a = new s45();
    }
    public void s45(){
       super();
    }
    public final su0 b(Type p0,Annotation[] p1,cy5 p2){
       if (do5.C(p0) != Optional.class) {
          return null;
       }
       return new i40(p2.e(do5.B(0, p0), p1));
    }
}
