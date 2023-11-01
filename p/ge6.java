package p.ge6;
import p.gl;
import p.e63;
import java.lang.Object;
import java.lang.ThreadLocal;
import java.lang.String;
import java.lang.ref.SoftReference;
import android.content.Context;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import android.content.res.AssetManager;
import java.io.InputStream;
import java.io.Reader;
import java.lang.StringBuilder;
import org.json.JSONObject;
import java.lang.Throwable;
import android.util.Log;
import p.up0;
import p.t37;
import java.lang.Class;
import java.lang.AssertionError;
import com.spotify.base.java.logging.Logger;
import p.il;
import p.fr0;
import p.hl;
import java.lang.Boolean;
import p.en6;

public final class ge6 implements gl	// class@0016f2 from classes.dex
{
    public Object a;
    public static ge6 b;

    public void ge6(){
       super();
       this.a = e63.D;
    }
    public void ge6(int p0){
       int i = 3;
       if (p0 != i) {
          if (p0 != 4) {
             super();
             return;
          }else {
             super();
             this.a = new ThreadLocal();
             return;
          }
       }else {
          super();
          String[] stringArray = new String[i];
          this.a = new SoftReference(stringArray);
          return;
       }
    }
    public void ge6(Context p0){
       String str1;
       super();
       BufferedReader obj = null;
       try{
          this.a = obj;
          InputStreamReader inputStreamR = new InputStreamReader(p0.getAssets().open("branch.json"));
          try{
             obj = new BufferedReader(inputStreamR);
             StringBuilder str = "";
             while ((str1 = obj.readLine()) != null) {
                str = str.append(str1);
             }
             this.a = new JSONObject(str);
          }catch(org.json.JSONException e5){
             Log.e("BranchJsonConfig", "Error parsing branch.json: "+e5.getMessage());
          }
       }catch(java.io.FileNotFoundException e0){
       label_0064 :
          return;
       }catch(java.io.IOException e5){
          Log.e("BranchJsonConfig", "Error loading branch.json: "+e5.getMessage());
          goto label_0064 ;
       }catch(org.json.JSONException e5){
       }
    }
    public void ge6(up0 p0){
       super();
       this.a = p0;
    }
    public static void a(Object[] p0){
       ge6[] a = t37.a;
       int len = a.length;
       for (int i = 0; i < len; i = i + 1) {
          a[i].getClass();
          ge6.a(p0);
       }
       return;
    }
    public static void e(Object[] p0){
       ge6[] a = t37.a;
       int len = a.length;
       for (int i = 0; i < len; i = i + 1) {
          a[i].getClass();
          ge6.e(p0);
       }
       return;
    }
    public static void f(Object[] p0){
       ge6[] a = t37.a;
       int len = a.length;
       for (int i = 0; i < len; i = i + 1) {
          a[i].getClass();
          ge6.f(p0);
       }
       return;
    }
    public static void i(Object[] p0){
       ge6[] a = t37.a;
       int len = a.length;
       for (int i = 0; i < len; i = i + 1) {
          a[i].getClass();
          ge6.i(p0);
       }
       return;
    }
    public static void k(Object[] p0){
       ge6[] a = t37.a;
       int len = a.length;
       for (int i = 0; i < len; i = i + 1) {
          a[i].getClass();
          ge6.k(p0);
       }
       return;
    }
    public static void l(Object[] p0){
       ge6[] a = t37.a;
       int len = a.length;
       for (int i = 0; i < len; i = i + 1) {
          a[i].getClass();
          ge6.l(p0);
       }
       return;
    }
    public static void m(Object[] p0){
       ge6[] a = t37.a;
       int len = a.length;
       for (int i = 0; i < len; i = i + 1) {
          a[i].getClass();
          ge6.m(p0);
       }
       return;
    }
    public final void b(AssertionError p0){
       Object[] objArray = new Object[0];
       Logger.c(p0, "", objArray);
       throw p0;
    }
    public final void c(il p0){
       Throwable cause;
       if ((cause = p0.getCause()) != null) {
          p0.getMessage();
          cause.getMessage();
       }else {
          p0.getMessage();
       }
       this.a.b.accept(p0);
       return;
    }
    public final void d(hl p0){
       this.c(p0);
    }
    public final String g(){
       String str = "testKey";
       ge6 ta = this.a;
       if (ta == null) {
          return null;
       }
       try{
          if (!ta.has(str)) {
             return null;
          }
          return this.a.getString(str);
       }catch(org.json.JSONException e0){
          Log.e("BranchJsonConfig", "Error parsing branch.json: "+e0.getMessage());
          return null;
       }
    }
    public final Boolean h(){
       if (!this.j(4)) {
          return null;
       }
       try{
          return Boolean.valueOf(this.a.getBoolean("useTestInstance"));
       }catch(org.json.JSONException e0){
          Log.e("BranchJsonConfig", "Error parsing branch.json: "+e0.getMessage());
          return Boolean.FALSE;
       }
    }
    public final boolean j(int p0){
       ge6 ta;
       boolean b = ((ta = this.a) != null && ta.has(en6.x(p0)))? true: false;
       return b;
    }
}
