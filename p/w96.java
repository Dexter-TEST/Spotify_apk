package p.w96;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class w96	// class@002af2 from classes.dex
{
    public byte a;
    public int b;
    public long c;
    public byte d;
    public byte e;
    public int f;

    public void w96(){
       super();
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null || w96.class != p0.getClass()) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (this.f != p0.f) {
          return false;
       }
       if (this.e != p0.e) {
          return false;
       }
       if (this.d != p0.d) {
          return false;
       }
       if (this.c - p0.c) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       w96 tc = this.c;
       return ((((((((((this.a * 31) + this.b) * 31) + (int)(tc ^ (tc >> 32))) * 31) + this.d) * 31) + this.e) * 31) + this.f);
    }
    public final String toString(){
       return tp2.n("Entry{referenceType="+this.a+", referencedSize="+this.b+", subsegmentDuration="+this.c+", startsWithSap="+this.d+", sapType="+this.e+", sapDeltaTime=", this.f, '}');
    }
}
