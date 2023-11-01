package p.p17;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class p17	// class@0021d3 from classes.dex
{
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public void p17(boolean p0,boolean p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof p17) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       p17 ta;
       p17 tb;
       int i = 1;
       if ((ta = this.a) != null) {
          ta = 1;
       }
       int i1 = ta * 31;
       if ((tb = this.b) != null) {
          tb = 1;
       }
       i1 = (i1 + tb) * 31;
       if ((tb = this.c) == null) {
          i = tb;
       }
       return (i1 + i);
    }
    public final String toString(){
       return kg4.p("TermsAndConditionsModel\(canImplicitlyAcceptTermsAndConditions="+this.a+", canImplicitlyAcceptPrivacyPolicy="+this.b+", shouldUseSpecificLicenses=", this.c, ')');
    }
}
