package p.za;
import p.db;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;

public final class za extends db	// class@002ebf from classes.dex
{
    public final SearchConfiguration a;

    public void za(SearchConfiguration p0){
       co5.o(p0, "searchConfig");
       super();
       this.a = p0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof za) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final String toString(){
       return "NavigateToSearch\(searchConfig="+this.a+')';
    }
}
