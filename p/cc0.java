package p.cc0;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class cc0 extends Enum	// class@0011d9 from classes.dex
{
    public static final cc0 a;
    public static final cc0 b;
    public static final cc0 c;
    public static final cc0[] t;

    static {
       cc0 uocc0 = new cc0("DEFAULT", 0);
       cc0.a = uocc0;
       cc0 uocc01 = new cc0("DOUBLE_LINE_TITLE", 1);
       cc0.b = uocc01;
       cc0 uocc02 = new cc0("DOUBLE_LINE_SUBTITLE", 2);
       cc0.c = uocc02;
       cc0[] uocc0Array = new cc0[]{uocc0,uocc01,uocc02};
       cc0.t = uocc0Array;
       cc0.values();
    }
    public void cc0(String p0,int p1){
       super(p0, p1);
    }
    public static cc0 valueOf(String p0){
       return Enum.valueOf(cc0.class, p0);
    }
    public static cc0[] values(){
       return cc0.t.clone();
    }
}
