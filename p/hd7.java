package p.hd7;
import java.lang.UnsupportedOperationException;
import p.q12;
import java.lang.String;
import java.lang.Object;
import java.lang.StringBuilder;

public final class hd7 extends UnsupportedOperationException	// class@001830 from classes.dex
{
    public final q12 a;

    public void hd7(q12 p0){
       super();
       this.a = p0;
    }
    public final String getMessage(){
       String str = String.valueOf(this.a);
       return new StringBuilder((str.length() + 8))+"Missing "+str;
    }
}
