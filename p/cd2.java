package p.cd2;
import java.lang.RuntimeException;
import java.lang.String;
import java.lang.Throwable;
import android.os.Parcel;
import java.lang.Object;
import java.lang.StringBuilder;

public class cd2 extends RuntimeException	// class@0011e4 from classes.dex
{
    public final int a;

    public void cd2(){
       this.a = 5;
       super("Failed to bind to the service.");
    }
    public void cd2(int p0){
       this.a = p0;
       super();
    }
    public void cd2(int p0,String p1,Throwable p2){
       this.a = p0;
       super(p1, p2);
    }
    public void cd2(int p0,Throwable p1){
       this.a = p0;
       super(p1);
    }
    public void cd2(String p0,int p1){
       this.a = p1;
       super(p0);
    }
    public void cd2(String p0,Parcel p1){
       this.a = 4;
       super(new StringBuilder((String.valueOf(p0).length() + 41))+p0+" Parcel: pos="+p1.dataPosition()+" size="+p1.dataSize());
    }
    private synchronized void a(){
    }
    public synchronized final Throwable fillInStackTrace(){
       switch (this.a){
           case 8:
           default:
             Throwable throwable = super.fillInStackTrace();
             return throwable;
       }
       this.a();
       return this;
    }
}
