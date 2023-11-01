package p.uf6;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.en6;

public final class uf6	// class@00289f from classes.dex
{
    public final String a;

    public void uf6(String p0){
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof uf6) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c("lite_7e7cf598605d47caba394c628e2735a2", "lite_7e7cf598605d47caba394c628e2735a2")) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       uf6 ta;
       int i = ((ta = this.a) == null)? 0: ta.hashCode();
       return ((i * 31) - 464174920);
    }
    public final String toString(){
       return en6.p("SignupApiWebgateConfiguration\(key=", this.a, ", creationPoint=lite_7e7cf598605d47caba394c628e2735a2\)");
    }
}
