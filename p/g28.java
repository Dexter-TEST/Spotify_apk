package p.g28;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.IllegalStateException;

public final class g28	// class@00168b from classes.dex
{
    public final int a;
    public final boolean b;

    public void g28(int p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public static g28 a(){
       byte b;
       int i = 1;
       if ((b = (byte)((byte)i | 0x02)) == 3) {
          return new g28(i, false);
       }
       StringBuilder str = "";
       if (!((b & 0x01))) {
          str = str+" appUpdateType";
       }
       if (!((b & 0x02))) {
          str = str+" allowAssetPackDeletion";
       }
       throw new IllegalStateException("Missing required properties:".concat(str.toString()));
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (p0 instanceof g28 && (this.a == p0.a && this.b == p0.b)) {
          return true;
       }
       return false;
    }
    public final int hashCode(){
       int i = (this.a ^ 0xf4243) * 0xf4243;
       int i1 = (1 != this.b)? 1237: 1231;
       return (i ^ i1);
    }
    public final String toString(){
       return new StringBuilder(73)+"AppUpdateOptions{appUpdateType="+this.a+", allowAssetPackDeletion="+this.b+"}";
    }
}
