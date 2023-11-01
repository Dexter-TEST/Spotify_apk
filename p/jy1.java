package p.jy1;
import p.ny1;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.lang.Object;
import p.co5;

public final class jy1 extends ny1	// class@001b69 from classes.dex
{
    public final int a;
    public final String b;

    public void jy1(String p0,int p1,String p2){
       super(p0);
       this.a = p1;
       this.b = p2;
    }
    public final String toString(){
       String str = "{FacebookDialogException: errorCode: "+this.a+", message: "+this.getMessage()+", url: "+this.b+"}";
       co5.l(str, "StringBuilder\(\)\n        .append\(\"{FacebookDialogException: \"\)\n        .append\(\"errorCode: \"\)\n        .append\(errorCode\)\n        .append\(\", message: \"\)\n        .append\(message\)\n        .append\(\", url: \"\)\n        .append\(failingUrl\)\n        .append\(\"}\"\)\n        .toString\(\)");
       return str;
    }
}
