package p.mb5;
import p.xj0;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class mb5 extends xj0	// class@001e62 from classes.dex
{
    public final ConfigurationResponse H;

    public void mb5(ConfigurationResponse p0){
       super();
       p0.getClass();
       this.H = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof mb5) {
          return false;
       }
       return p0.H.equals(this.H);
    }
    public final int hashCode(){
       return (this.H.hashCode() + 0);
    }
    public final String toString(){
       return "ShowTermsAndConditions{config="+this.H+'}';
    }
}
