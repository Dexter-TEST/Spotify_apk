package p.l10;
import java.util.Calendar;
import java.lang.Object;
import p.xe7;
import java.lang.String;
import java.lang.StringBuilder;

public final class l10	// class@001cc0 from classes.dex
{
    public final Calendar a;

    public void l10(Calendar p0){
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof l10) {
          return false;
       }
       return xe7.u(p0.a, this.a);
    }
    public final int hashCode(){
       l10 ta;
       int i = 0;
       int i1 = ((ta = this.a) != null)? ta.hashCode(): 0;
       return (i + i1);
    }
    public final String toString(){
       return "ShowDateOfBirthPicker{date="+this.a+'}';
    }
}
