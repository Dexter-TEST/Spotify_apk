package p.go4;
import p.eo4;
import p.dg3;
import java.lang.Float;
import java.lang.Class;
import java.lang.Object;
import p.vf3;
import p.gb6;

public final class go4 extends eo4	// class@00174a from classes.dex
{
    public static final go4 v;

    static {
       go4.v = new go4();
    }
    public void go4(){
       super(Float.class, dg3.t);
    }
    public final void serialize(Object p0,vf3 p1,gb6 p2){
       p1.m0(p0.floatValue());
    }
}
