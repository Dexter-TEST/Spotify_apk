package p.v87;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class v87	// class@0029a4 from classes.dex
{
    public final int a;

    public void v87(int p0){
       super();
       this.a = p0;
    }
    public final String toString(){
       v87 ta = this.a;
       return tp2.n("Entry{picType="+((ta >> 6) & 0x03)+",dependencyLevel=", (ta & 0x3f), '}');
    }
}
