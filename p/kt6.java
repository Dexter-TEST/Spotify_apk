package p.kt6;
import p.mm0;
import java.lang.String;
import p.tv;
import java.lang.Object;
import p.io2;
import java.lang.Integer;
import java.lang.Boolean;
import java.util.Arrays;

public final class kt6 extends mm0	// class@001c7f from classes.dex
{
    public final String d;
    public final String e;
    public final String f;
    public boolean g;
    public boolean h;
    public String i;
    public final tv j;

    public void kt6(long p0,int p1,String p2,String p3,String p4,String p5,tv p6,boolean p7){
       super(p1, p0);
       this.d = p2;
       this.e = p3;
       this.f = p4;
       this.i = p5;
       this.j = p6;
       tv f = p6.f;
       this.g = f;
       this.h = p7;
       boolean b = (f == null && p7)? true: false;
       this.c = b;
       this.i = p5;
       return;
    }
    public final boolean b(Object p0){
       if (!p0 instanceof kt6) {
          return super.equals(p0);
       }
       kt6 okt6 = p0;
       boolean b = (super.equals(p0) && (io2.j(this.d, okt6.d) && (io2.j(this.e, okt6.e) && io2.j(this.f, okt6.f))))? true: false;
       return b;
    }
    public final int c(){
       Object[] objArray = new Object[]{Integer.valueOf(super.hashCode()),this.d,this.e,Boolean.valueOf(this.g)};
       return Arrays.hashCode(objArray);
    }
    public final boolean equals(Object p0){
       return this.b(p0);
    }
    public final int hashCode(){
       return this.c();
    }
}
