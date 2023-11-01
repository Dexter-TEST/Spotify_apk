package p.yo5;
import java.util.Set;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;

public final class yo5	// class@002dfb from classes.dex
{
    public final boolean a;
    public final Set b;
    public final long c;
    public final String d;

    public void yo5(boolean p0,Set p1,long p2,String p3){
       co5.o(p3, "configurationAssignmentId");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public static yo5 a(yo5 p0,Set p1,int p2){
       yo5 b;
       yo5 "configurationAssignmentId";
       int i;
       yo5 oyo5 = ((p2 & 0x01))? p0.a: false;
       if ((p2 & 0x02)) {
          b = p0.b;
       }
       yo5 oyo51 = b;
       yo5 c = ((p2 & 0x04))? p0.c: 0;
       yo5 oyo52 = c;
       p0 = ((p2 & 0x08))? p0.d: 0;
       yo5 oyo53 = p0;
       co5.o(oyo51, "policyGroupIds");
       co5.o(oyo53, "configurationAssignmentId");
       "configurationAssignmentId" = new yo5(oyo5, oyo51, oyo52, oyo53);
       return "configurationAssignmentId";
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof yo5) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (this.c - p0.c) {
          return false;
       }
       if (!co5.c(this.d, p0.d)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       yo5 ta;
       if ((ta = this.a) != null) {
          ta = 1;
       }
       yo5 tc = this.c;
       return (this.d.hashCode() + ((((this.b.hashCode() + (ta * 31)) * 31) + (int)(tc ^ (tc >> 32))) * 31));
    }
    public final String toString(){
       return hr7.a("RawConfigurationMetadata\(isDefault="+this.a+", policyGroupIds="+this.b+", timestamp="+this.c+", configurationAssignmentId=", this.d, ')');
    }
}
