package p.x42;
import p.um5;
import p.b52;
import android.content.Context;
import java.lang.Object;
import p.j51;
import java.lang.String;
import p.cn5;
import java.lang.Class;
import p.xj0;

public final class x42 implements um5	// class@002c05 from classes.dex
{
    public final b52 a;
    public final Context b;

    public void x42(b52 p0,Context p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Object get(){
       x42 ta = this.a;
       String str = ta.c();
       cn5 uocn5 = ta.d.a(cn5.class);
       return new j51(this.b, str);
    }
}
