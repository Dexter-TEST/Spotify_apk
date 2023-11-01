package p.tg4;
import p.vg4;
import java.lang.Class;
import java.io.Serializable;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.IllegalArgumentException;
import android.os.Bundle;
import android.os.BaseBundle;
import p.co5;
import java.lang.UnsupportedOperationException;

public final class tg4 extends vg4	// class@002767 from classes.dex
{
    public final Class m;

    public void tg4(Class p0){
       String str = "[L";
       super(true);
       if (!Serializable.class.isAssignableFrom(p0)) {
          throw new IllegalArgumentException(p0+" does not implement Serializable.".toString());
       }
       try{
          this.m = Class.forName(str+p0.getName()+';');
          return;
       }catch(java.lang.ClassNotFoundException e3){
          throw new RuntimeException(e3);
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
       throw new UnsupportedOperationException("Arrays don\'t support default values.");
    }
    public final void d(Bundle p0,String p1,Object p2){
       co5.o(p1, "key");
       this.m.cast(p2);
       p0.putSerializable(p1, p2);
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 != null && co5.c(tg4.class, p0.getClass())) {
          return co5.c(this.m, p0.m);
       }
       return false;
    }
    public final int hashCode(){
       return this.m.hashCode();
    }
}
