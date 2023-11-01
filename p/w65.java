package p.w65;
import android.os.AsyncTask;
import p.x65;
import p.vx5;
import java.lang.Object;
import android.graphics.Bitmap;
import p.z65;
import java.lang.String;
import java.lang.Throwable;
import android.util.Log;
import p.l75;
import java.lang.Class;
import p.d26;
import p.c26;
import p.lv1;

public final class w65 extends AsyncTask	// class@002ad7 from classes.dex
{
    public final vx5 a;
    public final x65 b;

    public void w65(x65 p0,vx5 p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public final Object doInBackground(Object[] p0){
       z65 oz65;
       try{
          oz65 = this.b.a();
       }catch(java.lang.Exception e3){
          Log.e("Palette", "Exception thrown during async generate", e3);
          oz65 = null;
       }
       return oz65;
    }
    public final void onPostExecute(Object p0){
       w65 ta = this.a;
       if (p0 == null) {
          p0 = new l75();
       }else {
          ta.getClass();
          p0 = new d26(p0);
       }
       ta.b.b(p0);
       return;
    }
}
