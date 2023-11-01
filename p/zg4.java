package p.zg4;
import p.ah4;
import android.content.Intent;
import java.lang.Object;
import p.co5;
import java.lang.String;
import java.lang.StringBuilder;

public final class zg4 extends ah4	// class@002ef0 from classes.dex
{
    public final Intent a;

    public void zg4(Intent p0){
       this.a = p0;
    }
    public final Intent a(){
       return this.a;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof zg4) {
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
       return "WithIntent\(intent="+this.a+')';
    }
}
