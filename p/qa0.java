package p.qa0;
import p.sa0;
import java.lang.String;
import java.lang.Object;
import p.xe7;
import java.lang.StringBuilder;
import p.hr7;

public final class qa0 extends sa0	// class@00235f from classes.dex
{
    public final String a;

    public void qa0(String p0){
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof qa0) {
          return false;
       }
       return xe7.u(p0.a, this.a);
    }
    public final int hashCode(){
       qa0 ta;
       int i = 0;
       int i1 = ((ta = this.a) != null)? ta.hashCode(): 0;
       return (i + i1);
    }
    public final String toString(){
       return hr7.a("SetPhoneNumber{phoneNumber=", this.a, '}');
    }
}
