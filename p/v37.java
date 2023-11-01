package p.v37;
import p.wf2;
import p.gh2;
import java.lang.System;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import java.lang.Long;

public final class v37 extends gh2 implements wf2	// class@002977 from classes.dex
{
    public static final v37 z;

    static {
       v37.z = new v37();
    }
    public void v37(){
       super(0, System.class, "currentTimeMillis", "currentTimeMillis\(\)J");
    }
    public final Object invoke(){
       return Long.valueOf(System.currentTimeMillis());
    }
}
