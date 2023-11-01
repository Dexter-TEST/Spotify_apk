package p.yu5;
import p.lv1;
import p.tn6;
import p.rn6;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class yu5 extends lv1	// class@002e2d from classes.dex
{
    public final tn6 P;
    public final rn6 Q;
    public final rn6 R;
    public final rn6 S;

    public void yu5(tn6 p0,rn6 p1,rn6 p2,rn6 p3){
       co5.o(p0, "sharedPreferences");
       co5.o(p1, "accessTokenKey");
       co5.o(p2, "usernameKey");
       co5.o(p3, "storedCredentialKey");
       super(0);
       this.P = p0;
       this.Q = p1;
       this.R = p2;
       this.S = p3;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof yu5) {
          return false;
       }
       if (!co5.c(this.P, p0.P)) {
          return false;
       }
       if (!co5.c(this.Q, p0.Q)) {
          return false;
       }
       if (!co5.c(this.R, p0.R)) {
          return false;
       }
       if (!co5.c(this.S, p0.S)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.S.hashCode() + ((this.R.hashCode() + ((this.Q.hashCode() + (this.P.hashCode() * 31)) * 31)) * 31));
    }
    public final String toString(){
       return "Preferences\(sharedPreferences="+this.P+", accessTokenKey="+this.Q+", usernameKey="+this.R+", storedCredentialKey="+this.S+')';
    }
}
