package p.uo6;
import p.w50;
import p.rn6;
import java.lang.String;
import p.b07;
import p.tn6;
import p.zg0;
import java.lang.Object;
import p.co5;

public final class uo6 implements w50	// class@0028ef from classes.dex
{
    public final tn6 a;
    public final zg0 b;
    public static final rn6 c;
    public static final rn6 d;

    static {
       b07 b = rn6.b;
       uo6.c = b.a("branch_partner_id");
       uo6.d = b.a("branch_partner_id_cache_time_key");
    }
    public void uo6(tn6 p0,zg0 p1){
       co5.o(p0, "preferences");
       co5.o(p1, "clock");
       super();
       this.a = p0;
       this.b = p1;
    }
}
