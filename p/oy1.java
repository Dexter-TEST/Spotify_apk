package p.oy1;
import p.ny1;
import p.xm2;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Throwable;
import p.oz1;
import java.lang.Object;
import p.co5;

public final class oy1 extends ny1	// class@0021b2 from classes.dex
{
    public final xm2 a;

    public void oy1(xm2 p0,String p1){
       super(p1);
       this.a = p0;
    }
    public final String toString(){
       oy1 ta;
       String message;
       oz1 ooz1 = ((ta = this.a) == null)? null: ta.c;
       String str = "{FacebookGraphResponseException: ";
       if ((message = this.getMessage()) != null) {
          str = str+message+" ";
       }
       if (ooz1 != null) {
          str = str+"httpResponseCode: "+ooz1.a+", facebookErrorCode: "+ooz1.b+", facebookErrorType: "+ooz1.t+", message: "+ooz1.a()+"}";
       }
       String str1 = str;
       co5.l(str1, "errorStringBuilder.toString\(\)");
       return str1;
    }
}
