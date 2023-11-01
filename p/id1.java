package p.id1;
import java.lang.String;
import android.graphics.PointF;
import java.lang.Object;
import p.tp2;
import p.en6;
import java.lang.Float;

public final class id1	// class@00196e from classes.dex
{
    public String a;
    public String b;
    public float c;
    public int d;
    public int e;
    public float f;
    public float g;
    public int h;
    public int i;
    public float j;
    public boolean k;
    public PointF l;
    public PointF m;

    public void id1(String p0,String p1,float p2,int p3,int p4,float p5,float p6,int p7,int p8,float p9,boolean p10,PointF p11,PointF p12){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
       this.k = p10;
       this.l = p11;
       this.m = p12;
    }
    public final int hashCode(){
       long l = (long)Float.floatToRawIntBits(this.f);
       return (((((((en6.A(this.d) + ((int)((float)tp2.g(this.b, (this.a.hashCode() * 31), 31) + this.c) * 31)) * 31) + this.e) * 31) + (int)(l ^ (l >> 32))) * 31) + this.h);
    }
}
