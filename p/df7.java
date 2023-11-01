package p.df7;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.Object;
import p.do5;
import java.lang.String;
import java.lang.StringBuilder;

public final class df7 implements GenericArrayType	// class@0001b7 from classes2.dex
{
    public final Type a;

    public void df7(Type p0){
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof GenericArrayType && do5.r(this, p0))? true: false;
       return b;
    }
    public final Type getGenericComponentType(){
       return this.a;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final String toString(){
       return do5.w0(this.a)+"[]";
    }
}
