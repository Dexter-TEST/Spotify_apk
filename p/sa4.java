package p.sa4;
import p.ka4;
import p.nf2;
import java.lang.String;

public final class sa4 extends ka4	// class@0025ee from classes.dex
{
    public static final sa4 c;

    static {
       sa4.c = new sa4();
    }
    public void sa4(){
       super(7, 8);
    }
    public final void a(nf2 p0){
       p0.r("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`\(`period_start_time`\)\n    ");
    }
}
