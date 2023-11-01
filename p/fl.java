package p.fl;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class fl	// class@0015f1 from classes.dex
{
    public final int a;
    public static final fl b;

    static {
       fl.b = new fl(255);
    }
    public void fl(int p0){
       super();
       this.a = p0;
    }
    public final String toString(){
       return tp2.n("AspectRatio{value=", this.a, '}');
    }
}
