package p.qo;
import p.rm0;
import java.lang.String;
import p.mo;
import p.qm0;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Arrays;

public final class qo extends rm0	// class@0023e7 from classes.dex
{
    public final mo g;

    public void qo(String p0,String p1,boolean p2,mo p3){
       super((long)p3.c, p0);
       this.e = p1;
       this.g = p3;
       this.f = p2;
    }
    public final boolean equals(Object p0){
       boolean b = false;
       if (p0 instanceof qo && (p0.g == this.g && p0.f == this.f)) {
          b = true;
       }
       return b;
    }
    public final int hashCode(){
       Object[] objArray = new Object[]{this.g,Boolean.valueOf(this.f)};
       return Arrays.hashCode(objArray);
    }
}
