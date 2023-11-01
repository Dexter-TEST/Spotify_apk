package p.jd;
import p.y81;
import java.lang.Object;
import java.lang.String;
import android.os.Process;
import java.lang.StringBuilder;
import java.util.Locale;
import java.lang.Throwable;
import android.util.Log;
import java.lang.CharSequence;
import android.text.TextUtils;
import javax.net.ssl.SSLSocket;
import java.lang.Class;
import p.co5;
import p.av6;
import java.lang.Exception;
import p.dn6;
import java.lang.AssertionError;
import p.kd;

public final class jd implements y81	// class@00025c from classes2.dex
{
    public String a;

    public void jd(){
       this.a = "com.google.android.gms.org.conscrypt";
       super();
    }
    public void jd(String p0){
       super();
       String str = new StringBuilder(39)+"UID: ["+Process.myUid()+"]  PID: ["+Process.myPid()+"] ";
       p0 = (p0.length())? str.concat(p0): str;
       this.a = p0;
       return;
    }
    public static String h(String p0,String p1,Object[] p2){
       if (p2.length > 0) {
          try{
             p1 = String.format(Locale.US, p1, p2);
          }catch(java.util.IllegalFormatException e0){
             String str = String.valueOf(p1);
             str = (str.length())? "Unable to format ".concat(str): "Unable to format ";
             Log.e("PlayCore", str, e0);
             String str1 = TextUtils.join(", ", p2);
             p1 = new StringBuilder(((String.valueOf(p1).length() + 3) + String.valueOf(str1).length()))+p1+" ["+str1+"]";
          }
       }
       return new StringBuilder(((String.valueOf(p0).length() + 3) + String.valueOf(p1).length()))+p0+" : "+p1;
    }
    public void a(String p0,Object[] p1){
       if (Log.isLoggable("PlayCore", 3)) {
          jd.h(this.a, p0, p1);
       }
       return;
    }
    public boolean b(SSLSocket p0){
       return av6.D0(p0.getClass().getName(), co5.K(".", this.a), false);
    }
    public void c(String p0,Object[] p1){
       if (Log.isLoggable("PlayCore", 6)) {
          Log.e("PlayCore", jd.h(this.a, p0, p1));
       }
       return;
    }
    public void d(Exception p0,String p1,Object[] p2){
       if (Log.isLoggable("PlayCore", 6)) {
          Log.e("PlayCore", jd.h(this.a, p1, p2), p0);
       }
       return;
    }
    public void e(String p0,Object[] p1){
       if (Log.isLoggable("PlayCore", 4)) {
          jd.h(this.a, p0, p1);
       }
       return;
    }
    public void f(String p0,Object[] p1){
       if (Log.isLoggable("PlayCore", 5)) {
          jd.h(this.a, p0, p1);
       }
       return;
    }
    public dn6 g(SSLSocket p0){
       Class class = p0.getClass();
       Class uClass = class;
       while (true) {
          if (co5.c(uClass.getSimpleName(), "OpenSSLSocketImpl")) {
             return new kd(uClass);
          }
          if ((uClass = uClass.getSuperclass()) != null) {
             continue ;
          }else {
             break ;
          }
       }
       throw new AssertionError(co5.K(class, "No OpenSSLSocketImpl superclass of socket of type "));
    }
}
