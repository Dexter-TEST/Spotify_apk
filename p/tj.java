package p.tj;
import p.vi7;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import p.rn6;
import p.rf5;
import p.zg0;
import p.tn6;

public final class tj extends vi7	// class@002786 from classes.dex
{
    public final rf5 t;
    public final zg0 v;
    public final tn6 w;
    public static final rn6 A;
    public static final long x;
    public static final rn6 y;
    public static final rn6 z;

    static {
       tj.x = TimeUnit.DAYS.toMillis(14);
       tj.y = rn6.a("key_rater_shown");
       tj.z = rn6.a("key_date_first_launch");
       tj.A = rn6.a("key_rater_plays_amount");
    }
    public void tj(rf5 p0,zg0 p1,tn6 p2){
       super();
       this.t = p0;
       this.v = p1;
       this.w = p2;
    }
}
