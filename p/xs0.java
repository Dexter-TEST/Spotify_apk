package p.xs0;
import p.ap5;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;

public final class xs0 extends ap5	// class@002cd7 from classes.dex
{
    public final String G;

    public void xs0(String p0){
       this.G = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof xs0) {
          return false;
       }
       if (!co5.c(this.G, p0.G)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.G.hashCode();
    }
    public final String toString(){
       return hr7.a("Text\(title=", this.G, ')');
    }
}
