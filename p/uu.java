package p.uu;
import p.zq7;
import java.lang.Boolean;
import p.r45;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class uu	// class@002926 from classes.dex
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final r45 d;
    public static final uu e;

    static {
       zq7 ozq7 = new zq7(12);
       Boolean fALSE = Boolean.FALSE;
       ozq7.a = fALSE;
       ozq7.b = fALSE;
       ozq7.c = fALSE;
       uu.e = ozq7.h();
    }
    public void uu(boolean p0,boolean p1,boolean p2,r45 p3){
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
       if (!p0 instanceof uu) {
          return false;
       }
       if (this.a != p0.a || (this.b != p0.b || (this.c != p0.c || !this.d.equals(p0.d)))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       int i = 1231;
       int i1 = (this.a != null)? 1231: 1237;
       i1 = (i1 ^ 0xf4243) * 0xf4243;
       int i2 = (this.b != null)? 1231: 1237;
       i1 = (i1 ^ i2) * 0xf4243;
       if (this.c == null) {
          i = 1237;
       }
       return (((i1 ^ i) * 0xf4243) ^ this.d.hashCode());
    }
    public final String toString(){
       return "PlayerOptions{shufflingContext="+this.a+", repeatingContext="+this.b+", repeatingTrack="+this.c+", playbackSpeed="+this.d+"}";
    }
}
