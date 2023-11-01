package p.k95;
import java.lang.Enum;
import p.b95;
import p.c95;
import p.d95;
import p.e95;
import p.f95;
import p.g95;
import p.h95;
import p.i95;
import p.j95;
import p.r85;
import p.s85;
import p.t85;
import p.u85;
import p.v85;
import p.w85;
import p.x85;
import p.y85;
import p.z85;
import p.a95;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class k95 extends Enum	// class@001bce from classes.dex
{
    public final Class a;
    public static final k95[] b;
    public static final k95[] c;

    static {
       k95[] ok95Array = new k95[19];
       ok95Array[0] = new b95();
       ok95Array[1] = new c95();
       ok95Array[2] = new d95();
       ok95Array[3] = new e95();
       ok95Array[4] = new f95();
       ok95Array[5] = new g95();
       ok95Array[6] = new h95();
       ok95Array[7] = new i95();
       ok95Array[8] = new j95();
       ok95Array[9] = new r85();
       ok95Array[10] = new s85();
       ok95Array[11] = new t85();
       ok95Array[12] = new u85();
       ok95Array[13] = new v85();
       ok95Array[14] = new w85();
       ok95Array[15] = new x85();
       ok95Array[16] = new y85();
       ok95Array[17] = new z85();
       ok95Array[18] = new a95();
       k95.c = ok95Array;
       k95.b = k95.values();
    }
    public void k95(String p0,int p1,Class p2){
       super(p0, p1);
       this.a = p2;
    }
    public static k95 valueOf(String p0){
       return Enum.valueOf(k95.class, p0);
    }
    public static k95[] values(){
       return k95.c.clone();
    }
    public abstract View a(Context p0,AttributeSet p1,int p2);
    public int b(){
       return 0;
    }
}
