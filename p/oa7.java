package p.oa7;
import p.yt0;
import p.mg3;
import p.ka7;
import p.gb6;
import p.m00;
import java.lang.Class;
import java.lang.Object;
import p.vf3;

public final class oa7 extends mg3 implements yt0	// class@0020e3 from classes.dex
{
    public final mg3 a;

    public void oa7(ka7 p0,mg3 p1){
       super();
       this.a = p1;
    }
    public final mg3 b(gb6 p0,m00 p1){
       oa7 ta = this.a;
       mg3 omg3 = (ta instanceof yt0)? p0.v(ta, p1): ta;
       if (omg3 == ta) {
          return this;
       }else {
          return new oa7(null, omg3);
       }
    }
    public final Class handledType(){
       return Object.class;
    }
    public final void serialize(Object p0,vf3 p1,gb6 p2){
       this.a.serializeWithType(p0, p1, p2, null);
    }
    public final void serializeWithType(Object p0,vf3 p1,gb6 p2,ka7 p3){
       this.a.serializeWithType(p0, p1, p2, p3);
    }
}
