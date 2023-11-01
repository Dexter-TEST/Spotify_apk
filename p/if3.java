package p.if3;
import p.vn4;
import java.lang.Object;
import p.eg3;
import p.u91;
import p.ga7;
import java.lang.String;
import p.oc6;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import p.en6;
import java.lang.Class;
import p.z2;
import java.util.Collection;
import p.qo4;
import p.ts3;
import java.lang.UnsupportedOperationException;
import p.t91;
import java.lang.Boolean;
import p.te4;

public abstract class if3 implements vn4	// class@001981 from classes.dex
{

    public void if3(){
       super();
    }
    public abstract Object deserialize(eg3 p0,u91 p1);
    public Object deserialize(eg3 p0,u91 p1,Object p2){
       p1.o(this);
       return this.deserialize(p0, p1);
    }
    public Object deserializeWithType(eg3 p0,u91 p1,ga7 p2){
       return p2.a(p0, p1);
    }
    public Object deserializeWithType(eg3 p0,u91 p1,ga7 p2,Object p3){
       p1.o(this);
       return this.deserializeWithType(p0, p1, p2);
    }
    public oc6 findBackReference(String p0){
       throw new IllegalArgumentException(en6.t("Cannot handle managed/back reference \'", p0, "\': type: value deserializer of type ")+this.getClass().getName()+" does not support them");
    }
    public Object getAbsentValue(u91 p0){
       return this.getNullValue(p0);
    }
    public if3 getDelegatee(){
       return null;
    }
    public z2 getEmptyAccessPattern(){
       return z2.c;
    }
    public Object getEmptyValue(){
       return this.getNullValue();
    }
    public Object getEmptyValue(u91 p0){
       return this.getNullValue(p0);
    }
    public Collection getKnownPropertyNames(){
       return null;
    }
    public z2 getNullAccessPattern(){
       return z2.b;
    }
    public Object getNullValue(){
       return null;
    }
    public Object getNullValue(u91 p0){
       return this.getNullValue();
    }
    public qo4 getObjectIdReader(){
       return null;
    }
    public Class handledType(){
       return null;
    }
    public boolean isCachable(){
       return false;
    }
    public ts3 logicalType(){
       return null;
    }
    public if3 replaceDelegatee(if3 p0){
       throw new UnsupportedOperationException();
    }
    public Boolean supportsUpdate(t91 p0){
       return null;
    }
    public if3 unwrappingDeserializer(te4 p0){
       return this;
    }
}
