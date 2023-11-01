package p.p6;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class p6 extends Enum	// class@002202 from classes.dex
{
    public static final p6 A;
    public static final p6 B;
    public static final p6 C;
    public static final p6 D;
    public static final p6 E;
    public static final p6[] F;
    public static final p6 a;
    public static final p6 b;
    public static final p6 c;
    public static final p6 t;
    public static final p6 v;
    public static final p6 w;
    public static final p6 x;
    public static final p6 y;
    public static final p6 z;

    static {
       p6 op6 = new p6("FRAGMENT_PRE_ATTACHED", 0);
       p6.a = op6;
       p6 op61 = new p6("FRAGMENT_ATTACHED", 1);
       p6.b = op61;
       p6 op62 = new p6("FRAGMENT_PRE_CREATED", 2);
       p6.c = op62;
       p6 op63 = new p6("FRAGMENT_CREATED", 3);
       p6.t = op63;
       p6 op64 = new p6("FRAGMENT_ACTIVITY_CREATED", 4);
       p6.v = op64;
       p6 op65 = new p6("FRAGMENT_VIEW_CREATED", 5);
       p6.w = op65;
       p6 op66 = new p6("FRAGMENT_STARTED", 6);
       p6.x = op66;
       p6 op67 = new p6("FRAGMENT_RESUMED", 7);
       p6.y = op67;
       p6 op68 = new p6("FRAGMENT_PAUSED", 8);
       p6.z = op68;
       p6 op69 = new p6("FRAGMENT_STOPPED", 9);
       p6.A = op69;
       p6 op610 = new p6("FRAGMENT_INSTANCE_SAVED", 10);
       p6.B = op610;
       p6 op611 = new p6("FRAGMENT_VIEW_DESTROYED", 11);
       p6.C = op611;
       p6 op612 = new p6("FRAGMENT_DESTROYED", 12);
       p6.D = op612;
       p6 op613 = new p6("FRAGMENT_DETACHED", 13);
       p6.E = op613;
       p6[] op6Array = new p6[14];
       op6Array[0] = op6;
       op6Array[1] = op61;
       op6Array[2] = op62;
       op6Array[3] = op63;
       op6Array[4] = op64;
       op6Array[5] = op65;
       op6Array[6] = op66;
       op6Array[7] = op67;
       op6Array[8] = op68;
       op6Array[9] = op69;
       op6Array[10] = op610;
       op6Array[11] = op611;
       op6Array[12] = op612;
       op6Array[13] = op613;
       p6.F = op6Array;
    }
    public void p6(String p0,int p1){
       super(p0, p1);
    }
    public static p6 valueOf(String p0){
       return Enum.valueOf(p6.class, p0);
    }
    public static p6[] values(){
       return p6.F.clone();
    }
}
