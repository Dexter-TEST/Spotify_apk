package p.cw5;
import p.ca7;
import java.lang.Class;
import p.fa7;
import p.he3;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;

public final class cw5 extends ca7	// class@00128f from classes.dex
{
    public he3 A;

    public void cw5(Class p0,fa7 p1){
       super(p0, p1, null, null, 0, null, null, false);
    }
    public final StringBuilder e(StringBuilder p0){
       cw5 tA;
       if ((tA = this.A) != null) {
          p0 = tA.e(p0);
       }
       return p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       return false;
    }
    public final StringBuilder f(StringBuilder p0){
       cw5 tA;
       if ((tA = this.A) != null) {
          return tA.e(p0);
       }
       return p0+"?";
    }
    public final boolean j(){
       return false;
    }
    public final he3 m(Class p0,fa7 p1,he3 p2,he3[] p3){
       return null;
    }
    public final he3 n(){
       return this;
    }
    public final String toString(){
       cw5 tA;
       StringBuilder str = new StringBuilder(40)+"[recursive type; ";
       str = ((tA = this.A) == null)? str+"UNRESOLVED": str+tA.a.getName();
       return str;
    }
}
