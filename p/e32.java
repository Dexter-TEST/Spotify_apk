package p.e32;
import android.os.AsyncTask;
import java.lang.String;
import java.io.File;
import p.d32;
import java.lang.Object;
import p.co5;
import java.net.URL;
import java.net.URLConnection;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.Boolean;

public final class e32 extends AsyncTask	// class@00140d from classes.dex
{
    public final String a;
    public final File b;
    public final d32 c;

    public void e32(String p0,File p1,d32 p2){
       co5.o(p0, "uriStr");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final Object doInBackground(Object[] p0){
       Boolean tRUE;
       String str = "args";
       try{
          co5.o(p0, str);
          URL uRL = new URL(this.a);
          DataInputStream uDataInputSt = new DataInputStream(uRL.openStream());
          byte[] uobyteArray = new byte[uRL.openConnection().getContentLength()];
          uDataInputSt.readFully(uobyteArray);
          uDataInputSt.close();
          DataOutputStream uDataOutputS = new DataOutputStream(new FileOutputStream(this.b));
          uDataOutputS.write(uobyteArray);
          uDataOutputS.flush();
          uDataOutputS.close();
          tRUE = Boolean.TRUE;
       }catch(java.lang.Exception e0){
          tRUE = Boolean.FALSE;
       }
       return tRUE;
    }
    public final void onPostExecute(Object p0){
       if (p0.booleanValue()) {
          this.c.b(this.b);
       }
       return;
    }
}
