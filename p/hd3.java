package p.hd3;
import com.coremedia.iso.boxes.ItemLocationBox;
import java.util.List;
import java.lang.Object;
import java.util.LinkedList;
import java.nio.ByteBuffer;
import p.do5;
import com.googlecode.mp4parser.AbstractFullBox;
import p.is7;
import p.gd3;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class hd3	// class@00182c from classes.dex
{
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final List e;
    public final ItemLocationBox f;

    public void hd3(ItemLocationBox p0,int p1,int p2,int p3,long p4,List p5){
       this.f = p0;
       super();
       this.e = new LinkedList();
       this.a = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
    }
    public void hd3(ItemLocationBox p0,ByteBuffer p1){
       ItemLocationBox baseOffsetSi;
       this.f = p0;
       super();
       this.e = new LinkedList();
       this.a = do5.i0(p1);
       if (p0.getVersion() == 1) {
          this.b = do5.i0(p1) & 0x0f;
       }
       this.c = do5.i0(p1);
       this.d = ((baseOffsetSi = p0.baseOffsetSize) > null)? is7.w(p1, baseOffsetSi): 0;
       int i = do5.i0(p1);
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          this.e.add(new gd3(p0, p1));
       }
       return;
    }
    public final boolean equals(Object p0){
       hd3 te;
       if (this == p0) {
          return true;
       }
       if (p0 == null || hd3.class != p0.getClass()) {
          return false;
       }
       if (this.d - p0.d) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       p0 = p0.e;
       if ((te = this.e) != null) {
          if (!te.equals(p0)) {
          label_003f :
             return false;
          }
       }else if(p0 != null){
          goto label_003f ;
       }
       return true;
    }
    public final int hashCode(){
       hd3 te;
       hd3 td = this.d;
       int i = ((((((this.a * 31) + this.b) * 31) + this.c) * 31) + (int)(td ^ (td >> 32))) * 31;
       int i1 = ((te = this.e) != null)? te.hashCode(): 0;
       return (i + i1);
    }
    public final String toString(){
       return kg4.o("Item{baseOffset="+this.d+", itemId="+this.a+", constructionMethod="+this.b+", dataReferenceIndex="+this.c+", extents=", this.e, '}');
    }
}
