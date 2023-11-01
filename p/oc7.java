package p.oc7;
import p.x70;
import java.lang.Object;
import java.lang.Class;
import p.vf3;
import p.gb6;
import p.wa6;
import java.lang.String;
import p.js6;
import p.p51;
import p.ka7;

public final class oc7 extends x70	// class@0020f5 from classes.dex
{

    public void oc7(){
       super(5, Object.class);
    }
    public void oc7(Class p0){
       super(5, p0);
    }
    public final void serialize(Object p0,vf3 p1,gb6 p2){
       if (p2.w(wa6.b)) {
          Object[] objArray = new Object[]{p0.getClass().getName()};
          p2.g(this.a, String.format("No serializer found for class %s and no properties discovered to create BeanSerializer \(to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS\)", objArray));
       }
       super.serialize(p0, p1, p2);
       return;
    }
    public final void serializeWithType(Object p0,vf3 p1,gb6 p2,ka7 p3){
       if (p2.w(wa6.b)) {
          Object[] objArray = new Object[]{p0.getClass().getName()};
          p2.g(this.a, String.format("No serializer found for class %s and no properties discovered to create BeanSerializer \(to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS\)", objArray));
       }
       super.serializeWithType(p0, p1, p2, p3);
       return;
    }
}
