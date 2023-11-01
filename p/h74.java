package p.h74;
import p.zr0;
import java.lang.String;
import java.lang.Object;
import p.bw3;
import p.sv3;
import p.sy;
import p.or0;
import java.lang.Class;
import p.js3;
import java.lang.StringBuilder;
import p.tp2;

public final class h74 implements zr0	// class@0017f7 from classes.dex
{
    public final int a;

    public void h74(String p0,int p1,boolean p2){
       super();
       this.a = p1;
    }
    public final or0 a(bw3 p0,sv3 p1,sy p2){
       p0.getClass();
       js3.a("Animation contains merge paths but they are disabled.");
       return null;
    }
    public final String toString(){
       return "MergePaths{mode="+tp2.E(this.a)+'}';
    }
}
