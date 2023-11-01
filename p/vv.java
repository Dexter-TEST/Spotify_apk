package p.vv;
import p.aq6;
import java.lang.String;
import java.util.Set;
import p.r45;
import java.lang.Object;
import java.util.Collection;
import java.util.HashSet;
import p.ad6;
import java.lang.StringBuilder;
import p.en6;

public final class vv	// class@002a76 from classes.dex
{
    public final aq6 a;
    public final String b;
    public final Set c;
    public final Set d;
    public final r45 e;
    public final r45 f;
    public final r45 g;
    public final r45 h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public void vv(aq6 p0,String p1,Set p2,Set p3,r45 p4,r45 p5,r45 p6,r45 p7,boolean p8,boolean p9,boolean p10,boolean p11){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
       this.k = p10;
       this.l = p11;
    }
    public final vv a(Collection p0){
       HashSet hashSet = new HashSet(this.c);
       hashSet.addAll(p0);
       ad6 uoad6 = new ad6(this);
       uoad6.c = hashSet;
       return uoad6.b();
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof vv) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || (!this.c.equals(p0.c) || (!this.d.equals(p0.d) || (!this.e.equals(p0.e) || (!this.f.equals(p0.f) || (!this.g.equals(p0.g) || (!this.h.equals(p0.h) || (this.i != p0.i || (this.j != p0.j || (this.k != p0.k || this.l != p0.l))))))))))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       int i = 0xf4243;
       int i1 = (((((((((((((((this.a.hashCode() ^ i) * i) ^ this.b.hashCode()) * i) ^ this.c.hashCode()) * i) ^ this.d.hashCode()) * i) ^ this.e.hashCode()) * i) ^ this.f.hashCode()) * i) ^ this.g.hashCode()) * i) ^ this.h.hashCode()) * i;
       int i2 = 1231;
       int i3 = (this.i != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.j != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       i3 = (this.k != null)? 1231: 1237;
       i1 = (i1 ^ i3) * i;
       if (this.l == null) {
          i2 = 1237;
       }
       return (i1 ^ i2);
    }
    public final String toString(){
       return en6.q("SyncModel{contextUri="+this.a+", clientId="+this.b+", requestedMetadata="+this.c+", loadedMetadata="+this.d+", playerContext="+this.e+", playlist="+this.f+", show="+this.g+", episode="+this.h+", playerContextCompared="+this.i+", networkFailure="+this.j+", metadataFailure="+this.k+", done=", this.l, "}");
    }
}
