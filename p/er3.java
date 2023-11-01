package p.er3;
import p.dr3;
import java.lang.Object;
import android.os.LocaleList;
import java.lang.String;
import p.v3;
import java.util.Locale;
import p.k11;

public final class er3 implements dr3	// class@0014e1 from classes.dex
{
    public final LocaleList a;

    public void er3(Object p0){
       super();
       this.a = p0;
    }
    public final String a(){
       return v3.m(this.a);
    }
    public final Object b(){
       return this.a;
    }
    public final boolean equals(Object p0){
       return v3.A(p0.b(), this.a);
    }
    public final Locale get(int p0){
       return k11.r(this.a, p0);
    }
    public final int hashCode(){
       return k11.b(this.a);
    }
    public final boolean isEmpty(){
       return k11.B(this.a);
    }
    public final int size(){
       return v3.b(this.a);
    }
    public final String toString(){
       return k11.n(this.a);
    }
}
