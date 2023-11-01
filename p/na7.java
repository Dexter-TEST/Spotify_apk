package p.na7;
import java.io.Serializable;
import p.if3;
import p.ga7;
import p.eg3;
import p.u91;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.String;
import java.util.Collection;
import java.lang.Class;
import p.ts3;
import p.t91;
import java.lang.Boolean;

public final class na7 extends if3 implements Serializable	// class@001f9f from classes.dex
{
    public final if3 a;

    public void na7(ga7 p0,if3 p1){
       super();
       this.a = p1;
    }
    public final Object deserialize(eg3 p0,u91 p1){
       return this.a.deserializeWithType(p0, p1, null);
    }
    public final Object deserialize(eg3 p0,u91 p1,Object p2){
       return this.a.deserialize(p0, p1, p2);
    }
    public final Object deserializeWithType(eg3 p0,u91 p1,ga7 p2){
       throw new IllegalStateException("Type-wrapped deserializer\'s deserializeWithType should never get called");
    }
    public final if3 getDelegatee(){
       return this.a.getDelegatee();
    }
    public final Object getEmptyValue(u91 p0){
       return this.a.getEmptyValue(p0);
    }
    public final Collection getKnownPropertyNames(){
       return this.a.getKnownPropertyNames();
    }
    public final Object getNullValue(u91 p0){
       return this.a.getNullValue(p0);
    }
    public final Class handledType(){
       return this.a.handledType();
    }
    public final ts3 logicalType(){
       return this.a.logicalType();
    }
    public final Boolean supportsUpdate(t91 p0){
       return this.a.supportsUpdate(p0);
    }
}
