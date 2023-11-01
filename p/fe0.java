package p.fe0;
import p.ee0;
import java.lang.String;
import java.lang.StringBuilder;
import p.mi;

public final class fe0 extends ee0	// class@0015ac from classes.dex
{
    public final int C;
    public final char D;

    public void fe0(char p0,int p1){
       this.C = p1;
       this.D = p0;
    }
    public final boolean E(char p0){
       boolean b = false;
       fe0 tD = this.D;
       switch (this.C){
           case 0:
             if (p0 == tD) {
                b = true;
             }
             break;
           default:
             if (p0 != tD) {
                b = true;
             }
             return b;
       }
       return b;
    }
    public final String toString(){
       fe0 tD = this.D;
       switch (this.C){
           case 0:
           default:
             return "CharMatcher.isNot\(\'"+mi.b(tD)+"\'\)";
       }
       return "CharMatcher.is\(\'"+mi.b(tD)+"\'\)";
    }
}
