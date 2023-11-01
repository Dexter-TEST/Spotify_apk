package p.sg4;
import p.vg4;
import java.lang.Class;
import android.os.Parcelable;
import java.io.Serializable;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.String;
import java.lang.IllegalArgumentException;
import android.os.Bundle;
import android.os.BaseBundle;
import p.co5;
import java.lang.UnsupportedOperationException;

public final class sg4 extends vg4	// class@002623 from classes.dex
{
    public final Class m;

    public void sg4(Class p0){
       boolean b = true;
       super(b);
       if (!Parcelable.class.isAssignableFrom(p0) && !Serializable.class.isAssignableFrom(p0)) {
          b = false;
       }
       if (b) {
          this.m = p0;
          return;
       }else {
          throw new IllegalArgumentException(p0+" does not implement Parcelable or Serializable.".toString());
       }
    }
    public final Object a(Bundle p0,String p1){
       return p0.get(p1);
    }
    public final String b(){
       return this.m.getName();
    }
    public final Object c(String p0){
       co5.o(p0, "value");
       throw new UnsupportedOperationException("Parcelables don\'t support default values.");
    }
    public final void d(Bundle p0,String p1,Object p2){
       co5.o(p1, "key");
       this.m.cast(p2);
       if (p2 != null && !p2 instanceof Parcelable) {
          if (p2 instanceof Serializable) {
             p0.putSerializable(p1, p2);
          }
       }else {
          p0.putParcelable(p1, p2);
       }
       return;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 != null && co5.c(sg4.class, p0.getClass())) {
          return co5.c(this.m, p0.m);
       }
       return false;
    }
    public final int hashCode(){
       return this.m.hashCode();
    }
}
