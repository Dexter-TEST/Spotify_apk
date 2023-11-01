package p.mb3;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;

public final class mb3 implements Serializable	// class@001e60 from classes.dex
{
    public final String a;

    public void mb3(String p0){
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof mb3) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final String toString(){
       return hr7.a("InteractionId\(value=", this.a, ')');
    }
}
