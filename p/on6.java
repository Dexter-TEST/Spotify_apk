package p.on6;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;

public final class on6	// class@002157 from classes.dex
{
    public final String a;
    public final boolean b;

    public void on6(String p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final String toString(){
       on6 ta;
       String str = (this.b != null)? "Applink": "Unclassified";
       if ((ta = this.a) != null) {
          str = str+'('+ta+')';
       }
       return str;
    }
}
