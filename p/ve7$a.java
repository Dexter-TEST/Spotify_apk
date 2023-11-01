package p.ve7$a;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.Object;
import p.ve7;
import p.ya7;
import java.lang.String;
import java.lang.StringBuilder;

public final class ve7$a implements GenericArrayType	// class@0029db from classes.dex
{
    private final Type a;

    public void ve7$a(Type p0){
       super();
       this.a = ve7.a(p0);
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof GenericArrayType && ya7.d(this, p0))? true: false;
       return b;
    }
    public Type getGenericComponentType(){
       return this.a;
    }
    public int hashCode(){
       return this.a.hashCode();
    }
    public String toString(){
       return ve7.v(this.a)+"[]";
    }
}
