package p.hp6;
import p.l01;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;

public final class hp6 implements l01	// class@00189b from classes.dex
{
    public final String a;
    public final String b;

    public void hp6(String p0,String p1){
       co5.o(p0, "username");
       co5.o(p1, "password");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final String a(){
       return "spotify";
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof hp6) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.b.hashCode() + (this.a.hashCode() * 31));
    }
    public final String toString(){
       return hr7.a("SpotifyCredentials\(username="+this.a+", password=", this.b, ')');
    }
}
