package p.yi5;
import p.fm5;
import p.eh2;
import java.lang.Object;
import p.gh2;
import java.lang.System;
import java.lang.Class;
import java.lang.String;
import p.co5;

public final class yi5 implements fm5, eh2	// class@002dc5 from classes.dex
{
    public static final yi5 a;

    static {
       yi5.a = new yi5();
    }
    public void yi5(){
       super();
    }
    public final gh2 a(){
       return new gh2(1, System.class, "getProperty", "getProperty\(Ljava/lang/String;\)Ljava/lang/String;");
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof fm5 && p0 instanceof eh2)? co5.c(this.a(), p0.a()): false;
       return b;
    }
    public final int hashCode(){
       return this.a().e();
    }
}
