package p.lg0;
import p.og0;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;

public final class lg0 extends og0	// class@001d47 from classes.dex
{
    public final String c;

    public void lg0(String p0){
       co5.o(p0, "policyValue");
       super("/remote-config/device-brand");
       this.c = p0;
    }
    public final String b(){
       return this.c;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof lg0) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.c.hashCode();
    }
    public final String toString(){
       return hr7.a("DeviceBrand\(policyValue=", this.c, ')');
    }
}
