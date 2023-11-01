package p.lo7;
import p.no7;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import java.lang.Class;
import java.lang.Object;
import p.to7;
import p.j33;
import java.lang.String;
import java.lang.StringBuilder;

public final class lo7 extends no7	// class@001d94 from classes.dex
{
    public final ConfigurationResponse a;

    public void lo7(ConfigurationResponse p0){
       super();
       p0.getClass();
       this.a = p0;
    }
    public final Object a(to7 p0,to7 p1,to7 p2,to7 p3,to7 p4,to7 p5,to7 p6,to7 p7,to7 p8,to7 p9,j33 p10,to7 p11){
       return p5.apply(this);
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof lo7) {
          return false;
       }
       return p0.a.equals(this.a);
    }
    public final int hashCode(){
       return (this.a.hashCode() + 0);
    }
    public final String toString(){
       return "SignupConfiguration{configuration="+this.a+'}';
    }
}
