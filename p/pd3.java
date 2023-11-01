package p.pd3;
import p.ab2;
import java.lang.Iterable;
import java.lang.Object;
import java.util.Iterator;
import p.ci5;
import java.lang.Class;
import p.sd3;
import p.jg2;
import p.td3;

public final class pd3 extends ab2	// class@00223d from classes.dex
{
    public final int b;
    public final Iterable c;
    public final Object t;

    public void pd3(Iterable p0,Object p1,int p2){
       this.b = p2;
       this.c = p0;
       this.t = p1;
       super();
    }
    public final Iterator iterator(){
       pd3 tt = this.t;
       pd3 tc = this.c;
       switch (this.b){
           case 0:
           default:
             tt.getClass();
             return new td3(tc.iterator(), tt);
       }
       ci5 uoci5 = tc.iterator();
       uoci5.getClass();
       tt.getClass();
       return new sd3(uoci5, tt);
    }
}
