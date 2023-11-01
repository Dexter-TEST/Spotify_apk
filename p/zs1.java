package p.zs1;
import p.vt1;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.Class;
import java.lang.Object;
import p.wk4;
import p.j33;
import java.lang.String;
import java.lang.StringBuilder;

public final class zs1 extends vt1	// class@002f56 from classes.dex
{
    public final MediaMetadataCompat a;

    public void zs1(MediaMetadataCompat p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(wk4 p0,wk4 p1,wk4 p2,wk4 p3,wk4 p4,j33 p5){
       return p4.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof zs1) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "MetadataChanged{metadata="+this.a+'}';
    }
}
