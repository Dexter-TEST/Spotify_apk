package p.rt5;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.qt5;
import p.fb2;
import p.c17;

public final class rt5 implements a02	// class@002556 from classes.dex
{
    public final int a;
    public final tm5 b;

    public void rt5(tm5 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object get(){
       rt5 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return new c17(tb.get());
       }
       return new qt5(tb);
    }
}
