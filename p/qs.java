package p.qs;
import p.gz0;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public final class qs extends gz0	// class@00240a from classes.dex
{
    public final int a;
    public final String b;
    public final String c;
    public final boolean d;

    public void qs(int p0,String p1,String p2,boolean p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof gz0) {
          return false;
       }
       if (this.a != p0.a || (!this.b.equals(p0.b) || (!this.c.equals(p0.c) || this.d != p0.d))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       int i = (((((this.a ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode()) * 0xf4243;
       int i1 = (this.d != null)? 1231: 1237;
       return (i ^ i1);
    }
    public final String toString(){
       return en6.q("OperatingSystem{platform="+this.a+", version="+this.b+", buildVersion="+this.c+", jailbroken=", this.d, "}");
    }
}
