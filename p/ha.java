package p.ha;
import p.ma;
import p.je5;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class ha extends ma	// class@001816 from classes.dex
{
    public final je5 a;

    public void ha(je5 p0){
       co5.o(p0, "pickerTag");
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ha) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final String toString(){
       return "OnTagClicked\(pickerTag="+this.a+')';
    }
}
