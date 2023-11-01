package p.z53;
import java.lang.String;
import p.b52;
import java.lang.Object;
import android.content.SharedPreferences;
import android.content.Context;
import p.i52;
import android.util.Base64;
import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import java.security.spec.KeySpec;
import java.security.PublicKey;
import java.security.Key;
import java.security.MessageDigest;

public final class z53	// class@002e8e from classes.dex
{
    public final SharedPreferences a;
    public final String b;
    public static final String[] c;

    static {
       String[] stringArray = new String[]{"*","FCM","GCM",""};
       z53.c = stringArray;
    }
    public void z53(b52 p0){
       i52 e;
       super();
       p0.a();
       this.a = p0.a.getSharedPreferences("com.google.android.gms.appid", 0);
       p0.a();
       b52 c = p0.c;
       if ((e = c.e) != null) {
       }else {
          p0.a();
          e = c.b;
          if (e.startsWith("1:") || e.startsWith("2:")) {
             String[] stringArray = e.split(":");
             if (stringArray.length == 4) {
                e = stringArray[1];
                if (!e.isEmpty()) {
                label_0048 :
                   this.b = e;
                   return;
                }
             }
             e = null;
             goto label_0048 ;
          }
       }
    }
    public final String a(){
       z53 ta = this.a;
       _monitor_enter(ta);
       _monitor_exit(ta);
       return this.a.getString("|S|id", null);
    }
    public final String b(){
       String str1;
       PublicKey publicKey;
       z53 ta = this.a;
       _monitor_enter(ta);
       String str = null;
       if ((str1 = this.a.getString("|S||P|", str)) == null) {
          _monitor_exit(ta);
          return str;
       }else {
          int i = 8;
          try{
             publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str1, i)));
          }catch(java.lang.IllegalArgumentException e1){
          }catch(java.security.spec.InvalidKeySpecException e1){
          }catch(java.security.NoSuchAlgorithmException e1){
          }
          if (publicKey == null) {
             _monitor_exit(ta);
             return str;
          }else {
             byte[] encoded = publicKey.getEncoded();
             try{
                encoded = MessageDigest.getInstance("SHA1").digest(encoded);
                encoded[0] = (byte)(((encoded[0] & 0x0f) + 112) & 0x00ff);
                str = Base64.encodeToString(encoded, 0, i, 11);
                _monitor_exit(e0);
                return str;
             }catch(java.security.NoSuchAlgorithmException e0){
             }
          }
       }
    }
}
