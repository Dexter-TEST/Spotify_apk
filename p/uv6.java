package p.uv6;
import android.view.View$OnClickListener;
import p.y01;
import android.content.Context;
import androidx.appcompat.widget.SearchView;
import android.app.SearchableInfo;
import java.util.WeakHashMap;
import java.lang.String;
import java.lang.Object;
import android.view.LayoutInflater;
import android.database.Cursor;
import java.lang.Throwable;
import android.util.Log;
import android.view.View;
import p.tv6;
import java.lang.CharSequence;
import android.widget.TextView;
import android.text.TextUtils;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.res.ColorStateList;
import android.text.SpannableString;
import android.text.style.TextAppearanceSpan;
import android.graphics.drawable.Drawable;
import android.content.ComponentName;
import android.graphics.drawable.Drawable$ConstantState;
import android.content.pm.PackageManager;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.ApplicationInfo;
import android.widget.ImageView;
import android.view.ViewGroup;
import android.net.Uri;
import java.util.List;
import java.lang.Integer;
import java.io.FileNotFoundException;
import java.lang.StringBuilder;
import p.n6;
import p.os0;
import android.content.ContentResolver;
import java.io.InputStream;
import java.util.Objects;
import android.net.Uri$Builder;
import android.widget.BaseAdapter;
import android.os.Bundle;

public final class uv6 extends y01 implements View$OnClickListener	// class@00292d from classes.dex
{
    public final LayoutInflater A;
    public final SearchView B;
    public final SearchableInfo C;
    public final Context D;
    public final WeakHashMap E;
    public final int F;
    public int G;
    public ColorStateList H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public final int y;
    public final int z;
    public static final int O;

    public void uv6(Context p0,SearchView p1,SearchableInfo p2,WeakHashMap p3){
       int suggestionRo = p1.getSuggestionRowLayout();
       super(p0);
       this.z = suggestionRo;
       this.y = suggestionRo;
       this.A = p0.getSystemService("layout_inflater");
       this.G = 1;
       this.I = -1;
       this.J = -1;
       this.K = -1;
       this.L = -1;
       this.M = -1;
       this.N = -1;
       this.B = p1;
       this.C = p2;
       this.F = p1.getSuggestionCommitIconResId();
       this.D = p0;
       this.E = p3;
    }
    public static String h(Cursor p0,int p1){
       if (p1 == -1) {
          return null;
       }
       try{
          return p0.getString(p1);
       }catch(java.lang.Exception e2){
          Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e2);
          return v1;
       }
    }
    public final void a(View p0,Cursor p1){
       uv6 n;
       tv6 b;
       String str1;
       SpannableString spannableStr;
       tv6 c;
       Drawable uDrawable;
       uv6 m;
       Drawable uDrawable1;
       String str2;
       Drawable$ConstantState uConstantSta;
       uv6 ouv6 = this;
       Cursor uCursor = p1;
       Object obj = p0.getTag();
       int i = ((n = ouv6.N) != -1)? uCursor.getInt(n): 0;
       tv6 a = obj.a;
       int i1 = 8;
       if (a != null) {
          String str = uv6.h(uCursor, ouv6.I);
          a.setText(str);
          if (TextUtils.isEmpty(str)) {
             a.setVisibility(i1);
          }else {
             a.setVisibility(0);
          }
       }
       int i2 = 2;
       uv6 d = ouv6.D;
       if ((b = obj.b) != null) {
          if ((str1 = uv6.h(uCursor, ouv6.K)) != null) {
             if (ouv6.H == null) {
                TypedValue typedValue = new TypedValue();
                d.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                ouv6.H = d.getResources().getColorStateList(typedValue.resourceId);
             }
             spannableStr = new SpannableString(str1);
             TextAppearanceSpan textAppearan = v15;
             TextAppearanceSpan textAppearan1 = v15;
             textAppearan = new TextAppearanceSpan(0, 0, 0, ouv6.H, null);
             spannableStr.setSpan(textAppearan1, 0, str1.length(), 33);
          }else {
             str2 = uv6.h(uCursor, ouv6.J);
          }
          if (TextUtils.isEmpty(spannableStr)) {
             if (a != null) {
                a.setSingleLine(0);
                a.setMaxLines(i2);
             }
          }else if(a != null){
             a.setSingleLine(true);
             a.setMaxLines(true);
          }
          b.setText(spannableStr);
          if (TextUtils.isEmpty(spannableStr)) {
             b.setVisibility(i1);
          }else {
             b.setVisibility(0);
          }
       }
       if ((c = obj.c) != null) {
          if ((n = ouv6.L) == -1) {
             uDrawable = null;
          }else if((uDrawable = ouv6.f(uCursor.getString(n))) != null){
             ComponentName searchActivi = ouv6.C.getSearchActivity();
             str2 = searchActivi.flattenToShortString();
             uv6 e1 = ouv6.E;
             if (e1.containsKey(str2)) {
                if ((uConstantSta = e1.get(str2)) == null) {
                   uDrawable = null;
                }else {
                   uDrawable = uConstantSta.newDrawable(d.getResources());
                }
             }else {
                PackageManager packageManag = d.getPackageManager();
                try{
                   uDrawable1 = 128;
                   ActivityInfo activityInfo = packageManag.getActivityInfo(searchActivi, uDrawable1);
                   if (i2 = activityInfo.getIconResource()) {
                      if ((uDrawable1 = packageManag.getDrawable(searchActivi.getPackageName(), i2, activityInfo.applicationInfo)) == null) {
                         searchActivi.flattenToShortString();
                      }else if(uDrawable1 == null){
                         uConstantSta = null;
                      }else {
                         uConstantSta = uDrawable1.getConstantState();
                      }
                      e1.put(str2, uConstantSta);
                      uDrawable = uDrawable1;
                   }
                }catch(android.content.pm.PackageManager$NameNotFoundException e0){
                   e0.toString();
                }
                uDrawable1 = null;
             }
             if (uDrawable == null) {
                uDrawable = d.getPackageManager().getDefaultActivityIcon();
             }
          }
          c.setImageDrawable(uDrawable);
          if (uDrawable == null) {
             c.setVisibility(4);
          }else {
             c.setVisibility(0);
             uDrawable.setVisible(0, 0);
             uDrawable.setVisible(true, 0);
          }
       }
       if ((b = obj.d) != null) {
          uDrawable1 = ((m = ouv6.M) == -1)? null: ouv6.f(uCursor.getString(m));
          b.setImageDrawable(uDrawable1);
          if (uDrawable1 == null) {
             b.setVisibility(8);
          }else {
             b.setVisibility(0);
             uDrawable1.setVisible(0, 0);
             uDrawable1.setVisible(true, 0);
          }
       }
       n = ouv6.G;
       tv6 e = obj.e;
       if (n != 2 && (n != true && ((i & 0x01)))) {
          e.setVisibility(8);
       }else {
          e.setVisibility(0);
          e.setTag(a.getText());
          e.setOnClickListener(ouv6);
       }
       return;
    }
    public final void b(Cursor p0){
       try{
          super.b(p0);
          if (p0 != null) {
             this.I = p0.getColumnIndex("suggest_text_1");
             this.J = p0.getColumnIndex("suggest_text_2");
             this.K = p0.getColumnIndex("suggest_text_2_url");
             this.L = p0.getColumnIndex("suggest_icon_1");
             this.M = p0.getColumnIndex("suggest_icon_2");
             this.N = p0.getColumnIndex("suggest_flags");
          }
       }catch(java.lang.Exception e3){
          Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e3);
       }
       return;
    }
    public final String c(Cursor p0){
       String str;
       String str1;
       String str2;
       if (p0 == null) {
          return null;
       }
       if ((str = uv6.h(p0, p0.getColumnIndex("suggest_intent_query"))) != null) {
          return str;
       }
       uv6 tC = this.C;
       if (tC.shouldRewriteQueryFromData() && (str1 = uv6.h(p0, p0.getColumnIndex("suggest_intent_data"))) != null) {
          return str1;
       }
       if (tC.shouldRewriteQueryFromText() && (str2 = uv6.h(p0, p0.getColumnIndex("suggest_text_1"))) != null) {
          return str2;
       }
       return null;
    }
    public final View d(ViewGroup p0){
       View view = this.A.inflate(this.y, p0, false);
       view.setTag(new tv6(view));
       view.findViewById(R.id.edit_query).setImageResource(this.F);
       return view;
    }
    public final Drawable e(Uri p0){
       List pathSegments;
       int i;
       int i1;
       String authority = p0.getAuthority();
       if (TextUtils.isEmpty(authority)) {
          throw new FileNotFoundException("No authority: "+p0);
       }
       try{
          Resources resourcesFor = this.D.getPackageManager().getResourcesForApplication(authority);
          if ((pathSegments = p0.getPathSegments()) == null) {
             throw new FileNotFoundException("No path: "+p0);
          }
          if ((i = pathSegments.size()) == 1) {
             try{
                i1 = Integer.parseInt(pathSegments.get(0));
             }catch(java.lang.NumberFormatException e0){
                throw new FileNotFoundException("Single path segment is not a resource ID: "+p0);
             }
          }else if(i == 2){
             i1 = resourcesFor.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
          }else {
             throw new FileNotFoundException("More than two path segments: "+p0);
          }
          if (i1) {
             return resourcesFor.getDrawable(i1);
          }else {
             throw new FileNotFoundException("No resource found for: "+p0);
          }
       }catch(android.content.pm.PackageManager$NameNotFoundException e0){
          throw new FileNotFoundException("No package found for authority: "+p0);
       }
    }
    public final Drawable f(String p0){
       uv6 tD;
       Drawable$ConstantState uConstantSta;
       Drawable$ConstantState uConstantSta1;
       Drawable uDrawable1;
       InputStream inputStream;
       Drawable uDrawable4;
       try{
          uv6 tE = this.E;
          tD = this.D;
          String str = "android.resource://";
          if (p0 != null && (!p0.isEmpty() && !"0".equals(p0))) {
             int i = Integer.parseInt(p0);
             str = str+tD.getPackageName()+"/"+i;
             Drawable uDrawable3 = ((uConstantSta = tE.get(str)) == null)? null: uConstantSta.newDrawable();
             if (uDrawable3 != null) {
                return uDrawable3;
             }else if((uDrawable4 = os0.b(tD, i)) != null){
                tE.put(str, uDrawable4.getConstantState());
             }
             return uDrawable4;
          }
       }catch(java.lang.NumberFormatException e0){
          Drawable uDrawable = ((uConstantSta1 = e0.get(p0)) == null)? null: uConstantSta1.newDrawable();
          if (uDrawable != null) {
             return uDrawable;
          }else {
             Uri uri = Uri.parse(p0);
             String str1 = "Failed to open ";
             try{
                String str2 = "Resource does not exist: ";
                if ("android.resource".equals(uri.getScheme())) {
                   try{
                      uDrawable1 = this.e(uri);
                   }catch(android.content.res.Resources$NotFoundException e0){
                      throw new FileNotFoundException(str2+uri);
                   }
                }else if((inputStream = tD.getContentResolver().openInputStream(uri)) != null){
                   Drawable uDrawable2 = Drawable.createFromStream(inputStream, null);
                   try{
                      inputStream.close();
                   }catch(java.io.IOException e1){
                      Log.e("SuggestionsAdapter", "Error closing icon stream for "+uri, e1);
                   }
                   uDrawable1 = uDrawable2;
                }else {
                   throw new FileNotFoundException(str1+uri);
                }
             }catch(java.io.FileNotFoundException e1){
                Objects.toString(uri);
                e1.getMessage();
             }
             if (null != null) {
                e0.put(p0, null.getConstantState());
             }
          }
       }catch(android.content.res.Resources$NotFoundException e0){
          return null;
       }
       return null;
    }
    public final Cursor g(SearchableInfo p0,String p1){
       String suggestAutho;
       String suggestPath;
       String suggestSelec;
       Cursor uCursor = null;
       if (p0 == null) {
          return uCursor;
       }
       if ((suggestAutho = p0.getSuggestAuthority()) == null) {
          return uCursor;
       }
       Uri$Builder uBuilder = new Uri$Builder().scheme("content").authority(suggestAutho).query("").fragment("");
       if ((suggestPath = p0.getSuggestPath()) != null) {
          uBuilder.appendEncodedPath(suggestPath);
       }
       uBuilder.appendPath("search_suggest_query");
       if ((suggestSelec = p0.getSuggestSelection()) != null) {
          uCursor = new String[]{p1};
       }else {
          uBuilder.appendPath(p1);
       }
       uBuilder.appendQueryParameter("limit", String.valueOf(50));
       return this.D.getContentResolver().query(uBuilder.build(), null, suggestSelec, uCursor, null);
    }
    public final View getDropDownView(int p0,View p1,ViewGroup p2){
       try{
          return super.getDropDownView(p0, p1, p2);
       }catch(java.lang.RuntimeException e3){
          if ((p1 = this.A.inflate(this.z, p2, false)) != null) {
             p1.getTag().a.setText(e3.toString());
          }
          return p1;
       }
    }
    public final View getView(int p0,View p1,ViewGroup p2){
       try{
          return super.getView(p0, p1, p2);
       }catch(java.lang.RuntimeException e1){
          p1 = this.d(p2);
          p1.getTag().a.setText(e1.toString());
          return p1;
       }
    }
    public final boolean hasStableIds(){
       return false;
    }
    public final void notifyDataSetChanged(){
       y01 tc;
       super.notifyDataSetChanged();
       Bundle extras = ((tc = this.c) != null)? tc.getExtras(): null;
       if (extras != null) {
          extras.getBoolean("in_progress");
       }
       return;
    }
    public final void notifyDataSetInvalidated(){
       y01 tc;
       super.notifyDataSetInvalidated();
       Bundle extras = ((tc = this.c) != null)? tc.getExtras(): null;
       if (extras != null) {
          extras.getBoolean("in_progress");
       }
       return;
    }
    public final void onClick(View p0){
       p0 = p0.getTag();
       if (p0 instanceof CharSequence) {
          this.B.p(p0);
       }
       return;
    }
}
