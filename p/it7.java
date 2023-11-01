package p.it7;
import android.content.DialogInterface$OnClickListener;
import java.lang.Object;
import android.content.DialogInterface;
import android.os.Build;
import java.lang.CharSequence;
import java.lang.String;
import java.lang.Throwable;
import android.util.Log;

public abstract class it7 implements DialogInterface$OnClickListener	// class@001a02 from classes.dex
{

    public void it7(){
       super();
    }
    public abstract void a();
    public final void onClick(DialogInterface p0,int p1){
       try{
          this.a();
          p0.dismiss();
          return;
       }catch(android.content.ActivityNotFoundException e5){
          String str = "Failed to start resolution intent.";
          if (Build.FINGERPRINT.contains("generic")) {
             str = str.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
          }
          Log.e("DialogRedirect", str, e5);
          p0.dismiss();
          return;
       }
    }
}
