package p.bg3;
import p.jf3;
import p.dl3;
import java.lang.Object;

public final class bg3 extends jf3	// class@0010bb from classes.dex
{
    public final dl3 a;

    public void bg3(){
       super();
       this.a = new dl3();
    }
    public final boolean equals(Object p0){
       boolean b = (p0 != this && (!p0 instanceof bg3 && p0.a.equals(this.a)))? false: true;
       return b;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
}
