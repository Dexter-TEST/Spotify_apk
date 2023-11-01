package p.gg6;
import p.uw5;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class gg6 extends uw5	// class@001704 from classes.dex
{
    public final ConfigurationResponse A;

    public void gg6(ConfigurationResponse p0){
       super();
       p0.getClass();
       this.A = p0;
    }
    public final boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (!p0 instanceof gg6) {
          return false;
       }
       return p0.A.equals(this.A);
    }
    public final int hashCode(){
       return (this.A.hashCode() + 0);
    }
    public final String toString(){
       return "ShowTermsAndConditions{signupConfigurationResponse="+this.A+'}';
    }
}
