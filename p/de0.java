package p.de0;
import p.mi;
import java.lang.String;
import java.util.Arrays;
import java.lang.Class;
import java.lang.Object;
import java.lang.Character;
import java.lang.StringBuilder;

public class de0 extends mi	// class@00132b from classes.dex
{
    public final int C;
    public final Object D;

    public void de0(){
       this.C = 0;
       super();
       char[] uocharArray = "0123456789.".toCharArray();
       this.D = uocharArray;
       Arrays.sort(uocharArray);
    }
    public void de0(mi p0){
       this.C = 1;
       super();
       p0.getClass();
       this.D = p0;
    }
    public final boolean E(char p0){
       boolean b = true;
       de0 tD = this.D;
       switch (this.C){
           case 0:
             break;
           default:
             return (tD.E(p0) ^ b);
       }
       if (Arrays.binarySearch(tD, p0) < 0) {
          b = false;
       }
       return b;
    }
    public final mi Q(){
       switch (this.C){
           case 1:
           default:
             return new de0(this);
       }
       return this.D;
    }
    public final boolean apply(Object p0){
       switch (this.C){
           case 0:
           default:
             return this.E(p0.charValue());
       }
       return this.E(p0.charValue());
    }
    public final String toString(){
       de0 tD = this.D;
       switch (this.C){
           case 0:
             break;
           default:
             return tD+".negate\(\)";
       }
       String str = "CharMatcher.anyOf\(\"";
       int len = tD.length;
       for (int i = 0; i < len; i = i + 1) {
          str = str.append(mi.b(tD[i]));
       }
       return str+"\"\)";
    }
}
