package p.pr;
import p.oy6;
import p.r45;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class pr	// class@0022bc from classes.dex
{
    public final r45 a;
    public final r45 b;
    public final r45 c;
    public final r45 d;
    public static final pr e;

    static {
       pr.e = new oy6(13).h();
    }
    public void pr(r45 p0,r45 p1,r45 p2,r45 p3){
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
       if (!p0 instanceof pr) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || (!this.c.equals(p0.c) || !this.d.equals(p0.d)))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       return (((((((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b.hashCode()) * 0xf4243) ^ this.c.hashCode()) * 0xf4243) ^ this.d.hashCode());
    }
    public final String toString(){
       return "CommandOptions{overrideRestrictions="+this.a+", onlyForLocalDevice="+this.b+", systemInitiated="+this.c+", onlyForPlaybackId="+this.d+"}";
    }
}
