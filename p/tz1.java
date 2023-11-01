package p.tz1;
import p.ny1;
import p.oz1;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;

public final class tz1 extends ny1	// class@00280e from classes.dex
{
    public final oz1 a;

    public void tz1(oz1 p0,String p1){
       co5.o(p0, "requestError");
       super(p1);
       this.a = p0;
    }
    public final String toString(){
       tz1 ta = this.a;
       String str = "{FacebookServiceException: httpResponseCode: "+ta.a+", facebookErrorCode: "+ta.b+", facebookErrorType: "+ta.t+", message: "+ta.a()+"}";
       co5.l(str, "StringBuilder\(\)\n        .append\(\"{FacebookServiceException: \"\)\n        .append\(\"httpResponseCode: \"\)\n        .append\(requestError.requestStatusCode\)\n        .append\(\", facebookErrorCode: \"\)\n        .append\(requestError.errorCode\)\n        .append\(\", facebookErrorType: \"\)\n        .append\(requestError.errorType\)\n        .append\(\", message: \"\)\n        .append\(requestError.errorMessage\)\n        .append\(\"}\"\)\n        .toString\(\)");
       return str;
    }
}
