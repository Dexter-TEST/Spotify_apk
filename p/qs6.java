package p.qs6;
import java.util.concurrent.locks.ReentrantLock;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import android.content.SharedPreferences;
import p.w51;
import java.lang.StringBuilder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import org.json.JSONObject;
import android.net.Uri;
import org.json.JSONArray;
import java.util.List;
import com.google.android.gms.common.api.Scope;
import p.ft7;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import android.accounts.Account;
import java.lang.RuntimeException;
import java.lang.Throwable;
import android.content.SharedPreferences$Editor;

public final class qs6	// class@002408 from classes.dex
{
    public final ReentrantLock a;
    public final SharedPreferences b;
    public static final ReentrantLock c;
    public static qs6 d;

    static {
       qs6.c = new ReentrantLock();
    }
    public void qs6(Context p0){
       super();
       this.a = new ReentrantLock();
       this.b = p0.getSharedPreferences("com.google.android.gms.signin", 0);
    }
    public static qs6 a(Context p0){
       w51.k(p0);
       ReentrantLock c = qs6.c;
       c.lock();
       if (qs6.d == null) {
          qs6.d = new qs6(p0.getApplicationContext());
       }
       c.unlock();
       return qs6.d;
    }
    public static String f(String p0,String p1){
       return new StringBuilder((String.valueOf(p1).length() + (p0.length() + 1)))+p0+":"+p1;
    }
    public final GoogleSignInAccount b(){
       GoogleSignInAccount googleSignIn;
       String str = this.g("defaultGoogleSignInAccount");
       if (TextUtils.isEmpty(str)) {
       }else if((str = this.g(qs6.f("googleSignInAccount", str))) != null){
          try{
             googleSignIn = GoogleSignInAccount.b(str);
          }catch(org.json.JSONException e0){
          }
       }
       googleSignIn = null;
       return googleSignIn;
    }
    public final GoogleSignInOptions c(){
       try{
          String str = this.g("defaultGoogleSignInAccount");
          GoogleSignInOptions googleSignIn = null;
          if (TextUtils.isEmpty(str)) {
          }else if((str = this.g(qs6.f("googleSignInOptions", str))) != null){
             googleSignIn = GoogleSignInOptions.b(str);
          }
          return googleSignIn;
       }catch(org.json.JSONException e0){
       }
    }
    public final void d(GoogleSignInAccount p0,GoogleSignInOptions p1){
       GoogleSignInAccount b;
       w51.k(p1);
       GoogleSignInAccount z = p0.z;
       this.e("defaultGoogleSignInAccount", z);
       String str = qs6.f("googleSignInAccount", z);
       try{
          JSONObject jSONObject = new JSONObject();
          if ((b = p0.b) != null) {
             jSONObject.put("id", b);
          }
          if ((b = p0.c) != null) {
             jSONObject.put("tokenId", b);
          }
          if ((b = p0.t) != null) {
             jSONObject.put("email", b);
          }
          if ((b = p0.v) != null) {
             jSONObject.put("displayName", b);
          }
          if ((b = p0.B) != null) {
             jSONObject.put("givenName", b);
          }
          if ((b = p0.C) != null) {
             jSONObject.put("familyName", b);
          }
          if ((b = p0.w) != null) {
             jSONObject.put("photoUrl", b.toString());
          }
          b = p0.x;
          String str1 = "serverAuthCode";
          if (b != null) {
             jSONObject.put(str1, b);
          }
          jSONObject.put("expirationTime", p0.y);
          jSONObject.put("obfuscatedIdentifier", z);
          JSONArray jSONArray = new JSONArray();
          p0 = p0.A;
          Scope[] scopeArray = new Scope[p0.size()];
          Scope[] scopeArray1 = p0.toArray(scopeArray);
          Arrays.sort(scopeArray1, ft7.a);
          int len = scopeArray1.length;
          int i = 0;
          for (int i1 = 0; i1 < len; i1 = i1 + 1) {
             jSONArray.put(scopeArray1[i1].b);
          }
          jSONObject.put("grantedScopes", jSONArray);
          jSONObject.remove(str1);
          this.e(str, jSONObject.toString());
          String str2 = qs6.f("googleSignInOptions", z);
          GoogleSignInOptions y = p1.y;
          GoogleSignInOptions x = p1.x;
          GoogleSignInOptions b1 = p1.b;
          JSONObject jSONObject1 = new JSONObject();
          JSONArray jSONArray1 = new JSONArray();
          Collections.sort(b1, GoogleSignInOptions.F);
          len = b1.size();
          while (i < len) {
             i = i + 1;
             jSONArray1.put(b1.get(i).b);
          }
          jSONObject1.put("scopes", jSONArray1);
          if ((b1 = p1.c) != null) {
             jSONObject1.put("accountName", b1.name);
          }
          jSONObject1.put("idTokenRequested", p1.t);
          jSONObject1.put("forceCodeForRefreshToken", p1.w);
          jSONObject1.put("serverAuthRequested", p1.v);
          if (!TextUtils.isEmpty(x)) {
             jSONObject1.put("serverClientId", x);
          }
          if (!TextUtils.isEmpty(y)) {
             jSONObject1.put("hostedDomain", y);
          }
          this.e(str2, jSONObject1.toString());
          return;
       }catch(org.json.JSONException e10){
          throw new RuntimeException(e10);
       }
    }
    public final void e(String p0,String p1){
       qs6 ta = this.a;
       ta.lock();
       this.b.edit().putString(p0, p1).apply();
       ta.unlock();
    }
    public final String g(String p0){
       qs6 ta = this.a;
       ta.lock();
       ta.unlock();
       return this.b.getString(p0, null);
    }
}
