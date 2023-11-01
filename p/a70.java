package p.a70;
import p.qw6;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import p.co5;
import java.io.File;
import org.json.JSONObject;
import android.util.Log;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.InputStream;
import java.io.Closeable;
import p.xj0;
import java.lang.Throwable;
import p.pw6;
import p.rw6;
import p.x91;
import java.util.Objects;
import p.w91;
import p.sf2;
import p.kd3;

public final class a70 implements qw6	// class@000f25 from classes.dex
{
    public Context a;

    public void a70(){
       super();
    }
    public void a70(Context p0){
       this.a = p0;
       super();
    }
    public void a70(Context p0,int p1){
       if (p1 != 1) {
          super();
          this.a = p0;
          return;
       }else {
          co5.o(p0, "context");
          super();
          this.a = p0;
          return;
       }
    }
    public String a(){
       String str = this.a.getString(R.string.error_dialog_button_try_again);
       co5.l(str, "context.getString\(R.stri…_dialog_button_try_again\)");
       return str;
    }
    public File b(){
       File uFile = new File(this.a.getFilesDir(), ".com.google.firebase.crashlytics");
       if (!uFile.exists() && !uFile.mkdirs()) {
          uFile = null;
       }
       return uFile;
    }
    public JSONObject c(){
       int i1;
       Throwable throwable;
       Closeable uCloseable;
       JSONObject jSONObject;
       Closeable uCloseable1;
       int i = 3;
       Log.isLoggable("FirebaseCrashlytics", i);
       try{
          i1 = 0;
          File uFile = new File(new a70(this.a).b(), "com.crashlytics.settings.json");
          if (uFile.exists()) {
             try{
                FileInputStream i2 = new FileInputStream(uFile);
                Scanner scanner = new Scanner(i2).useDelimiter("\\A");
                String str = (scanner.hasNext())? scanner.next(): "";
                jSONObject = new JSONObject(str);
                uCloseable1 = i2;
             }catch(java.lang.Exception e4){
             }
             Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", throwable);
             xj0.l(uCloseable, "Error while closing settings cache file.");
          label_005e :
             return i1;
          }else {
             Log.isLoggable("FirebaseCrashlytics", i);
             jSONObject = i1;
          }
          xj0.l(uCloseable1, "Error while closing settings cache file.");
          JSONObject jSONObject1 = jSONObject;
          goto label_005e ;
       }catch(java.lang.Exception e2){
          throwable = e2;
          uCloseable = i1;
       }
    }
    public rw6 f(pw6 p0){
       a70 ta = this.a;
       Objects.requireNonNull(ta);
       w91 ow91 = new w91(0, ta);
       sf2 ta1 = new sf2(p0.a, p0.b, p0.c, p0.d, p0.e);
       return new x91(ow91, ta);
    }
}
