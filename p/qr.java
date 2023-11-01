package p.qr;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.en6;

public final class qr	// class@002401 from classes.dex
{
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public void qr(boolean p0,boolean p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof qr) {
          return false;
       }
       if (this.a != p0.a || (this.b != p0.b || this.c != p0.c)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       int i = 1231;
       int i1 = (this.a != null)? 1231: 1237;
       int i2 = 0xf4243;
       i1 = (i1 ^ i2) * i2;
       int i3 = (this.b != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i2;
       if (this.c == null) {
          i = 1237;
       }
       return (i1 ^ i);
    }
    public final String toString(){
       return en6.q("Model{online="+this.a+", permanentlyOffline="+this.b+", forcedOffline=", this.c, "}");
    }
}
