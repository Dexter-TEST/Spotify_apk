package p.se0;
import java.io.Serializable;
import p.y0;
import p.q73;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import p.w51;
import p.re0;
import p.aw6;
import java.util.zip.Checksum;

public final class se0 extends y0 implements Serializable	// class@00260e from classes.dex
{
    public final q73 a;
    public final int b;
    public final String c;

    public void se0(q73 p0,String p1){
       super();
       p0.getClass();
       this.a = p0;
       this.b = 32;
       this.c = p1;
    }
    public final w51 b(){
       return new re0(this, this.a.get());
    }
    public final String toString(){
       return this.c;
    }
}
