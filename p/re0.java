package p.re0;
import p.g0;
import p.se0;
import java.util.zip.Checksum;
import java.lang.Class;
import java.lang.Object;
import p.fo2;
import p.do2;
import p.eo2;

public final class re0 extends g0	// class@0024cb from classes.dex
{
    public final Checksum E;
    public final se0 F;

    public void re0(se0 p0,Checksum p1){
       this.F = p0;
       super();
       p1.getClass();
       this.E = p1;
    }
    public final fo2 B(){
       long value = this.E.getValue();
       if (this.F.b == 32) {
          return new do2((int)value);
       }
       return new eo2(value);
    }
    public final void Y(byte[] p0,int p1){
       this.E.update(p0, 0, p1);
    }
}
