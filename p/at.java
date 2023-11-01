package p.at;
import java.lang.String;
import java.lang.Object;
import p.qo5;
import java.lang.StringBuilder;
import p.en6;

public final class at	// class@000fef from classes.dex
{
    public final String a;
    public final int b;
    public final boolean c;

    public void at(String p0,int p1,boolean p2){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static qo5 a(){
       return new qo5(0);
    }
    public static at b(int p0,String p1,boolean p2){
       qo5 oqo5 = at.a();
       oqo5.d(p1);
       oqo5.i(p0);
       oqo5.f(p2);
       return oqo5.c();
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof at) {
          return false;
       }
       if (!this.a.equals(p0.a) || (this.b != p0.b || this.c != p0.c)) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       int i = (((this.a.hashCode() ^ 0xf4243) * 0xf4243) ^ this.b) * 0xf4243;
       int i1 = (this.c != null)? 1231: 1237;
       return (i ^ i1);
    }
    public final String toString(){
       return en6.q("EpisodeProgressEntity{episodeUri="+this.a+", position="+this.b+", fullyPlayed=", this.c, "}");
    }
}
