package p.ry1;
import p.a02;
import java.lang.Object;
import p.em7;
import p.ic;
import p.ja0;
import p.rs7;

public final class ry1 implements a02	// class@00257e from classes.dex
{
    public final int a;

    public void ry1(int p0){
       this.a = p0;
       super();
    }
    public final Object get(){
       switch (this.a){
           case 0:
             return new ja0();
           case 1:
             return new ic();
           case 2:
             return new em7();
           default:
             return new rs7();
       }
    }
}
