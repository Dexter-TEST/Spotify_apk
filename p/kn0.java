package p.kn0;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class kn0	// class@001c45 from classes.dex
{
    public final int a;
    public final int b;

    public void kn0(int p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final String toString(){
       return tp2.n("Entry{count="+this.a+", offset=", this.b, '}');
    }
}
