package p.hg1;
import com.coremedia.iso.boxes.EditListBox;
import java.nio.ByteBuffer;
import java.lang.Object;
import com.googlecode.mp4parser.AbstractFullBox;
import p.do5;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;

public final class hg1	// class@001845 from classes.dex
{
    public final EditListBox a;
    public final long b;
    public final long c;
    public final double d;

    public void hg1(EditListBox p0,ByteBuffer p1){
       super();
       if (p0.getVersion() == 1) {
          this.b = do5.l0(p1);
          this.c = p1.getLong();
          this.d = do5.b0(p1);
       }else {
          this.b = do5.k0(p1);
          this.c = (long)p1.getInt();
          this.d = do5.b0(p1);
       }
       this.a = p0;
       return;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || hg1.class != p0.getClass()) {
          return false;
       }
       if (this.c - p0.c) {
          return false;
       }
       if (this.b - p0.b) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       hg1 tb = this.b;
       hg1 tc = this.c;
       return (((int)(tb ^ (tb >> 32)) * 31) + (int)(tc ^ (tc >> 32)));
    }
    public final String toString(){
       return "Entry{segmentDuration="+this.b+", mediaTime="+this.c+", mediaRate="+this.d+'}';
    }
}
