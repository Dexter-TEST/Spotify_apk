package p.jf0;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class jf0	// class@001ac2 from classes.dex
{
    public final int a;
    public final int b;
    public final int c;
    public static final jf0 d;
    public static final jf0 e;
    public static final jf0 f;
    public static final jf0 g;

    static {
       jf0.d = new jf0(0, 0, 0);
       jf0.e = new jf0(1, 2, 2);
       jf0.f = new jf0(2, 2, 1);
       jf0.g = new jf0(3, 1, 1);
    }
    public void jf0(int p0,int p1,int p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final String toString(){
       return tp2.n("ChromaFormat{\nid="+this.a+",\n subWidth="+this.b+",\n subHeight=", this.c, '}');
    }
}
