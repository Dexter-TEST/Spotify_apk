package p.zd0;
import p.rm0;
import p.ae0;
import java.lang.String;
import java.lang.Enum;
import p.qm0;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Arrays;

public final class zd0 extends rm0	// class@002ed1 from classes.dex
{
    public final ae0 g;

    public void zd0(ae0 p0,String p1,String p2,boolean p3){
       super((long)p0.ordinal(), p1);
       this.g = p0;
       this.e = p2;
       this.f = p3;
    }
    public final boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof zd0 && (p0.g == this.g && p0.f == this.f)) {
          b = true;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{Boolean.valueOf(this.f),this.g};
       return Arrays.hashCode(objArray);
    }
}
