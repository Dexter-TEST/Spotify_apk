package p.gd3;
import com.coremedia.iso.boxes.ItemLocationBox;
import java.lang.Object;
import java.nio.ByteBuffer;
import com.googlecode.mp4parser.AbstractFullBox;
import p.is7;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class gd3	// class@0016e8 from classes.dex
{
    public final long a;
    public final long b;
    public final long c;
    public final ItemLocationBox d;

    public void gd3(ItemLocationBox p0,long p1,long p2,long p3){
       this.d = p0;
       super();
       this.a = p1;
       this.b = p2;
       this.c = p3;
    }
    public void gd3(ItemLocationBox p0,ByteBuffer p1){
       ItemLocationBox indexSize;
       this.d = p0;
       super();
       if (p0.getVersion() == 1 && (indexSize = p0.indexSize) > null) {
          this.c = is7.w(p1, indexSize);
       }
       this.a = is7.w(p1, p0.offsetSize);
       this.b = is7.w(p1, p0.lengthSize);
       return;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || gd3.class != p0.getClass()) {
          return false;
       }
       if (this.c - p0.c) {
          return false;
       }
       if (this.b - p0.b) {
          return false;
       }
       if (this.a - p0.a) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       gd3 ta = this.a;
       gd3 tb = this.b;
       tb = this.c;
       return (((((int)(ta ^ (ta >> 32)) * 31) + (int)(tb ^ (tb >> 32))) * 31) + (int)(tb ^ (tb >> 32)));
    }
    public final String toString(){
       return tp2.o("Extent{extentOffset="+this.a+", extentLength="+this.b+", extentIndex=", this.c, '}');
    }
}
