package p.mg3;
import java.lang.Object;
import p.tf3;
import p.he3;
import java.lang.Class;
import p.gb6;
import java.util.Iterator;
import p.wf0;
import java.lang.UnsupportedOperationException;
import p.vf3;
import p.ka7;
import java.lang.String;
import p.p51;
import p.te4;

public abstract class mg3	// class@001e8d from classes.dex
{

    public void mg3(){
       super();
    }
    public void acceptJsonFormatVisitor(tf3 p0,he3 p1){
       p0.getClass();
    }
    public mg3 getDelegatee(){
       return null;
    }
    public Class handledType(){
       return null;
    }
    public boolean isEmpty(Object p0){
       return this.isEmpty(null, p0);
    }
    public boolean isEmpty(gb6 p0,Object p1){
       boolean b = (p1 == null)? true: false;
       return b;
    }
    public boolean isUnwrappingSerializer(){
       return false;
    }
    public Iterator properties(){
       return wf0.a;
    }
    public mg3 replaceDelegatee(mg3 p0){
       throw new UnsupportedOperationException();
    }
    public abstract void serialize(Object p0,vf3 p1,gb6 p2);
    public void serializeWithType(Object p0,vf3 p1,gb6 p2,ka7 p3){
       Class uClass;
       if ((uClass = this.handledType()) == null) {
          uClass = p0.getClass();
       }
       p0 = new Object[]{uClass.getName(),this.getClass().getName()};
       p2.g(uClass, String.format("Type id handling not implemented for type %s \(by serializer of type %s\)", p0));
       return;
    }
    public mg3 unwrappingSerializer(te4 p0){
       return this;
    }
    public boolean usesObjectId(){
       return false;
    }
    public mg3 withFilterId(Object p0){
       return this;
    }
}
