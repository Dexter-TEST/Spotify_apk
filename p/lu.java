package p.lu;
import p.t67;
import java.lang.Long;
import p.la5;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;
import p.en6;

public final class lu	// class@001dca from classes.dex
{
    public final String a;
    public final la5 b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public static final int h;

    static {
       t67 ot67 = new t67(5);
       ot67.x = Long.valueOf(0);
       ot67.g(la5.a);
       ot67.w = Long.valueOf(0);
       ot67.d();
    }
    public void lu(String p0,la5 p1,String p2,String p3,long p4,long p5,String p6){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
    }
    public final boolean equals(Object p0){
       lu ta;
       lu tc;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof lu) {
          return false;
       }
       if ((ta = this.a) == null) {
          if (p0.a == null) {
          label_001c :
             if (this.b.equals(p0.b)) {
                ta = p0.c;
                if ((tc = this.c) == null) {
                   if (ta != null) {
                   label_0064 :
                      b = false;
                   label_0065 :
                      return b;
                   }
                }else if(tc.equals(ta)){
                }
                ta = p0.d;
                if ((tc = this.d) == null) {
                   if (ta != null) {
                   }
                }else if(tc.equals(ta)){
                }
                if (!(this.e - p0.e) && !(this.f - p0.f)) {
                   p0 = p0.g;
                   if ((ta = this.g) == null) {
                      if (p0 == null) {
                         goto label_0065 ;
                      }else {
                         goto label_0064 ;
                      }
                   }else if(ta.equals(p0)){
                      goto label_0065 ;
                   }else {
                      goto label_0064 ;
                   }
                }else {
                   goto label_0064 ;
                }
             }else {
                goto label_0064 ;
             }
          }else {
             goto label_0064 ;
          }
       }else if(ta.equals(p0.a)){
          goto label_001c ;
       }else {
          goto label_0064 ;
       }
    }
    public final int hashCode(){
       lu ta;
       lu tc;
       lu tg;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       int i2 = 0xf4243;
       i1 = (((i1 ^ i2) * i2) ^ this.b.hashCode()) * i2;
       int i3 = ((tc = this.c) == null)? 0: tc.hashCode();
       i1 = (i1 ^ i3) * i2;
       i3 = ((tc = this.d) == null)? 0: tc.hashCode();
       tc = this.e;
       tc = this.f;
       i1 = (((((i1 ^ i3) * i2) ^ (int)(tc ^ (tc >> 32))) * i2) ^ (int)(tc ^ (tc >> 32))) * i2;
       if ((tg = this.g) != null) {
          i = tg.hashCode();
       }
       return (i ^ i1);
    }
    public final String toString(){
       return en6.p("PersistedInstallationEntry{firebaseInstallationId="+this.a+", registrationStatus="+this.b+", authToken="+this.c+", refreshToken="+this.d+", expiresInSecs="+this.e+", tokenCreationEpochInSecs="+this.f+", fisError=", this.g, "}");
    }
}
