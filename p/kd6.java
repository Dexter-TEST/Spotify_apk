package p.kd6;
import p.zr0;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import p.bw3;
import p.sv3;
import p.sy;
import p.or0;
import p.qr0;
import java.lang.StringBuilder;
import java.util.Arrays;

public final class kd6 implements zr0	// class@001bf3 from classes.dex
{
    public final String a;
    public final List b;
    public final boolean c;

    public void kd6(String p0,List p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final or0 a(bw3 p0,sv3 p1,sy p2){
       return new qr0(p0, p2, this, p1);
    }
    public final String toString(){
       return "ShapeGroup{name=\'"+this.a+"\' Shapes: "+Arrays.toString(this.b.toArray())+'}';
    }
}
