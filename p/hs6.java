package p.hs6;
import com.fasterxml.jackson.databind.deser.std.m;
import java.lang.Class;
import p.eg3;
import p.u91;
import java.lang.Object;
import p.if3;
import p.ga7;
import p.el;
import p.z2;
import p.t91;
import java.lang.Boolean;

public abstract class hs6 extends m	// class@0018b4 from classes.dex
{

    public void hs6(Class p0){
       super(p0);
    }
    public Object deserialize(eg3 p0,u91 p1,Object p2){
       p1.o(this);
       return this.deserialize(p0, p1);
    }
    public Object deserializeWithType(eg3 p0,u91 p1,ga7 p2){
       p2.getClass();
       switch (0){
           case 0:
             p0 = p2.b(p0, p1);
             break;
           default:
             p0 = p2.b(p0, p1);
       }
       return p0;
    }
    public final z2 getEmptyAccessPattern(){
       return z2.b;
    }
    public z2 getNullAccessPattern(){
       return z2.a;
    }
    public final Boolean supportsUpdate(t91 p0){
       return Boolean.FALSE;
    }
}
