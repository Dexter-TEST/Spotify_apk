package p.dg0;
import p.wy5;
import p.nf2;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.System;
import p.jq7;

public final class dg0 extends wy5	// class@00133c from classes.dex
{
    public static final dg0 a;

    static {
       dg0.a = new dg0();
    }
    public void dg0(){
       super();
    }
    public final void a(nf2 p0){
       p0.h();
       p0.r("DELETE FROM workspec WHERE state IN \(2, 3, 5\) AND \(last_enqueue_time + minimum_retention_duration\) < "+(System.currentTimeMillis() - jq7.a)+" AND \(SELECT COUNT\(*\)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         \(SELECT id FROM workspec WHERE state IN \(2, 3, 5\)\)\)");
       p0.Q();
       p0.g();
    }
}
