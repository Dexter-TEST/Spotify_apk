package p.k;
import java.lang.reflect.GenericArrayType;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.Object;
import p.mi;
import java.lang.String;
import java.lang.StringBuilder;

public final class k implements GenericArrayType, Serializable	// class@001bd2 from classes.dex
{
    public final Type a;

    public void k(Type p0){
       super();
       this.a = mi.e(p0);
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof GenericArrayType && mi.o(this, p0))? true: false;
       return b;
    }
    public final Type getGenericComponentType(){
       return this.a;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final String toString(){
       return mi.P(this.a)+"[]";
    }
}
