package p.ug4;
import p.vg4;
import java.lang.Class;
import java.io.Serializable;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.String;
import java.lang.IllegalArgumentException;
import android.os.Bundle;
import android.os.BaseBundle;
import p.co5;
import java.lang.UnsupportedOperationException;

public class ug4 extends vg4	// class@0028a6 from classes.dex
{
    public final Class m;

    public void ug4(Class p0){
       boolean b = true;
       super(b);
       if (!Serializable.class.isAssignableFrom(p0)) {
          throw new IllegalArgumentException(p0+" does not implement Serializable.".toString());
       }
       if (!((b ^ p0.isEnum()))) {
          throw new IllegalArgumentException(p0+" is an Enum. You should use EnumType instead.".toString());
       }
       this.m = p0;
       return;
    }
    public void ug4(Class p0,int p1){
       super(false);
       if (!Serializable.class.isAssignableFrom(p0)) {
          throw new IllegalArgumentException(p0+" does not implement Serializable.".toString());
       }
       this.m = p0;
       return;
    }
    public final Object a(Bundle p0,String p1){
       return p0.get(p1);
    }
    public String b(){
       return this.m.getName();
    }
    public Object c(String p0){
       return this.e(p0);
    }
    public final void d(Bundle p0,String p1,Object p2){
       co5.o(p1, "key");
       co5.o(p2, "value");
       this.m.cast(p2);
       p0.putSerializable(p1, p2);
    }
    public Serializable e(String p0){
       co5.o(p0, "value");
       throw new UnsupportedOperationException("Serializables don\'t support default values.");
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ug4) {
          return false;
       }
       return co5.c(this.m, p0.m);
    }
    public final int hashCode(){
       return this.m.hashCode();
    }
}
