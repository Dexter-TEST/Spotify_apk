package p.cs;
import p.uy0;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public final class cs extends uy0	// class@00126e from classes.dex
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public void cs(String p0,String p1,String p2,String p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final boolean equals(Object p0){
       cs tc;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof uy0) {
          return false;
       }
       if (this.a.equals(p0.a) && this.b.equals(p0.b)) {
          cs c = p0.c;
          if ((tc = this.c) == null) {
             if (c != null) {
             label_0043 :
                b = false;
             label_0044 :
                return b;
             }
          }else if(tc.equals(c)){
          }
          p0 = p0.d;
          if ((c = this.d) == null) {
             if (p0 == null) {
                goto label_0044 ;
             }else {
                goto label_0043 ;
             }
          }else if(c.equals(p0)){
             goto label_0044 ;
          }else {
             goto label_0043 ;
          }
       }else {
          goto label_0043 ;
       }
    }
    public final int hashCode(){
       cs tc;
       cs td;
       int i = 0xf4243;
       int i1 = (((this.a.hashCode() ^ i) * i) ^ this.b.hashCode()) * i;
       int i2 = 0;
       int i3 = ((tc = this.c) == null)? 0: tc.hashCode();
       i1 = (((i1 ^ i3) * i) ^ i2) * i;
       if ((td = this.d) != null) {
          i2 = td.hashCode();
       }
       return (i1 ^ i2);
    }
    public final String toString(){
       return en6.p("Application{identifier="+this.a+", version="+this.b+", displayVersion="+this.c+", organization=null, installationUuid=", this.d, "}");
    }
}
