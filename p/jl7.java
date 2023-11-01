package p.jl7;
import java.lang.Object;
import java.lang.Float;
import java.lang.String;
import java.lang.StringBuilder;

public final class jl7	// class@001aff from classes.dex
{
    public final float a;

    public void jl7(float p0){
       this.a = p0;
    }
    public final boolean equals(Object p0){
       boolean b = false;
       if (!p0 instanceof jl7) {
       }else if(Float.compare(this.a, p0.a)){
          b = true;
       }
       return b;
    }
    public final int hashCode(){
       return Float.floatToIntBits(this.a);
    }
    public final String toString(){
       return "ViewVisibilityRatio\(ratio="+this.a+')';
    }
}
