package p.o55;
import p.tf0;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class o55 implements tf0	// class@0020b3 from classes.dex
{
    public final Class a;

    public void o55(Class p0){
       co5.o(p0, "jClass");
       super();
       this.a = p0;
    }
    public final Class a(){
       return this.a;
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof o55 && co5.c(this.a, p0.a))? true: false;
       return b;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final String toString(){
       return this.a.toString()+" \(Kotlin reflection is not available\)";
    }
}
