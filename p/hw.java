package p.hw;
import java.lang.String;
import p.yk5;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.StringBuilder;
import p.en6;

public final class hw	// class@0018da from classes.dex
{
    public final String a;
    public final yk5 b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public void hw(String p0,yk5 p1,String p2,String p3,String p4,String p5,String p6){
       super();
       if (p0 == null) {
          throw new NullPointerException("Null id");
       }
       this.a = p0;
       if (p1 == null) {
          throw new NullPointerException("Null product");
       }
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       return;
    }
    public final boolean equals(Object p0){
       hw tc;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof hw) {
          return false;
       }
       if (this.a.equals(p0.a) && this.b.equals(p0.b)) {
          hw c = p0.c;
          if ((tc = this.c) == null) {
             if (c != null) {
             label_006b :
                b = false;
             label_006c :
                return b;
             }
          }else if(tc.equals(c)){
          }
          c = p0.d;
          if ((tc = this.d) == null) {
             if (c != null) {
             }
          }else if(tc.equals(c)){
          }
          c = p0.e;
          if ((tc = this.e) == null) {
             if (c != null) {
             }
          }else if(tc.equals(c)){
          }
          c = p0.f;
          if ((tc = this.f) == null) {
             if (c != null) {
             }
          }else if(tc.equals(c)){
          }
          p0 = p0.g;
          if ((c = this.g) == null) {
             if (p0 == null) {
                goto label_006c ;
             }else {
                goto label_006b ;
             }
          }else if(c.equals(p0)){
             goto label_006c ;
          }else {
             goto label_006b ;
          }
       }else {
          goto label_006b ;
       }
    }
    public final int hashCode(){
       hw tc;
       hw tg;
       int i = 0xf4243;
       int i1 = (((this.a.hashCode() ^ i) * i) ^ this.b.hashCode()) * i;
       int i2 = 0;
       int i3 = ((tc = this.c) == null)? 0: tc.hashCode();
       i1 = (i1 ^ i3) * i;
       i3 = ((tc = this.d) == null)? 0: tc.hashCode();
       i1 = (i1 ^ i3) * i;
       i3 = ((tc = this.e) == null)? 0: tc.hashCode();
       i1 = (i1 ^ i3) * i;
       i3 = ((tc = this.f) == null)? 0: tc.hashCode();
       i1 = (i1 ^ i3) * i;
       if ((tg = this.g) != null) {
          i2 = tg.hashCode();
       }
       return (i1 ^ i2);
    }
    public final String toString(){
       return en6.p("User{id="+this.a+", product="+this.b+", uri="+this.c+", displayName="+this.d+", email="+this.e+", birthDate="+this.f+", href=", this.g, "}");
    }
}
