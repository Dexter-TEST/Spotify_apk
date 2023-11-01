package p.vo6;
import p.a02;
import p.z84;
import p.tm5;
import java.lang.Object;
import p.tn6;
import p.zg0;
import p.uo6;

public final class vo6 implements a02	// class@002a37 from classes.dex
{
    public final tm5 a;
    public final tm5 b;

    public void vo6(z84 p0,tm5 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Object get(){
       return new uo6(this.a.get(), this.b.get());
    }
}
