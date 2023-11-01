package p.dg4;
import p.wf2;
import p.gi3;
import p.eg4;
import java.util.regex.Pattern;
import java.lang.String;
import java.lang.Object;

public final class dg4 extends gi3 implements wf2	// class@001340 from classes.dex
{
    public final int a;
    public final eg4 b;

    public void dg4(eg4 p0,int p1){
       this.a = p1;
       this.b = p0;
       super(0);
    }
    public final Pattern a(){
       eg4 j;
       Pattern pattern = null;
       dg4 tb = this.b;
       switch (this.a){
           case 0:
             if ((j = tb.j) != null) {
                pattern = Pattern.compile(j);
             }
             break;
           default:
             if ((j = tb.f) != null) {
                pattern = Pattern.compile(j, 2);
             }
             return pattern;
       }
       return pattern;
    }
    public final Object invoke(){
       switch (this.a){
           case 0:
           default:
             return this.a();
       }
       return this.a();
    }
}
