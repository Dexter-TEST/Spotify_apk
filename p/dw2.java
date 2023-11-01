package p.dw2;
import p.hw2;
import p.bu2;
import java.lang.String;
import p.ju2;
import p.au2;
import java.lang.Object;
import java.lang.StringBuilder;
import p.jl;

public final class dw2 extends hw2	// class@0013cb from classes.dex
{

    public void dw2(bu2 p0){
       super("EMPTY_STATE", 1, "glue2:emptyState", p0);
    }
    public final int e(ju2 p0){
       String str = p0.b().q("style");
       if ("error".equals(str)) {
          return hw2.t;
       }
       int v = hw2.v;
       if ("noResults".equals(str)) {
          return v;
       }
       jl.d("Unsupported empty state style: "+str);
       return v;
    }
}
