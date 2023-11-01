package p.fo6;
import p.wf2;
import p.gi3;
import p.go6;
import java.lang.String;
import p.co6;
import android.content.SharedPreferences;
import java.lang.Object;

public final class fo6 extends gi3 implements wf2	// class@00160a from classes.dex
{
    public final int a;
    public final go6 b;
    public final String c;
    public final String t;

    public void fo6(go6 p0,String p1,String p2,int p3){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       super(0);
    }
    public final String a(){
       fo6 tt = this.t;
       fo6 tc = this.c;
       fo6 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return tb.e.h().getString(tc, tt);
       }
       return tb.e.h().getString(tc, tt);
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
