package p.jb2;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Object;
import p.tp2;

public final class jb2	// class@001aa1 from classes.dex
{
    public final List a;
    public final char b;
    public final double c;
    public final String d;
    public final String e;

    public void jb2(ArrayList p0,char p1,double p2,String p3,String p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
    }
    public final int hashCode(){
       return (this.d.hashCode() + tp2.g(this.e, (this.b * 31), 31));
    }
}
