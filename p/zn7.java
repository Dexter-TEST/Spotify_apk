package p.zn7;
import p.ry7;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.StringBuilder;
import p.hr7;

public final class zn7 extends ry7	// class@002f32 from classes.dex
{
    public final String M;

    public void zn7(String p0){
       super();
       p0.getClass();
       this.M = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof zn7) {
          return false;
       }
       return p0.M.equals(this.M);
    }
    public final int hashCode(){
       return (this.M.hashCode() + 0);
    }
    public final String toString(){
       return hr7.a("ShowError{error=", this.M, '}');
    }
}
