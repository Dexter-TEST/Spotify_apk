package p.gi7;
import java.lang.ref.WeakReference;
import java.lang.Object;
import android.view.View;
import java.util.ArrayList;
import android.view.ViewGroup;
import java.lang.String;
import p.co5;
import android.widget.ImageView;
import android.view.ViewParent;
import android.widget.AdapterView;
import java.lang.Class;
import p.qh4;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Switch;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.DatePicker;
import android.widget.RatingBar;
import android.widget.RadioGroup;
import java.lang.ref.Reference;
import org.json.JSONObject;
import org.json.JSONArray;
import java.lang.Throwable;
import android.util.Log;
import android.view.View$OnClickListener;
import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;
import java.lang.NullPointerException;
import android.view.View$OnTouchListener;
import p.sz1;
import java.lang.CharSequence;
import android.widget.CompoundButton;
import java.lang.Integer;
import p.kg4;
import android.widget.TimePicker;
import java.lang.Number;
import android.widget.RadioButton;
import java.lang.reflect.Method;
import java.lang.IllegalStateException;
import p.io2;
import p.ej4;

public abstract class gi7	// class@001717 from classes.dex
{
    public static WeakReference a;
    public static Method b;

    static {
       gi7.a = new WeakReference(null);
    }
    public static final ArrayList a(View p0){
       int childCount;
       ArrayList uArrayList = new ArrayList();
       if (p0 instanceof ViewGroup && (childCount = p0.getChildCount()) > 0) {
          int i = 0;
          while (true) {
             int i1 = i + 1;
             uArrayList.add(p0.getChildAt(i));
             if (i1 < childCount) {
                i = i1;
             }
          }
       }
       return uArrayList;
    }
    public static final int b(View p0){
       Class uClass;
       co5.o(p0, "view");
       int i = 0;
       int i1 = (p0 instanceof ImageView)? 2: 0;
       if (p0.isClickable()) {
          i1 = i1 | 0x20;
       }
       ViewParent parent = p0.getParent();
       if (!parent instanceof AdapterView) {
          String str = "android.support.v4.view.NestedScrollingChild";
          int i2 = 0;
          try{
             uClass = Class.forName(str);
          }catch(java.lang.ClassNotFoundException e0){
             uClass = i2;
          }
          if (uClass == null || !uClass.isInstance(parent)) {
             try{
                qh4 oqh4 = qh4.class;
                if (oqh4 == null || !oqh4.isInstance(parent)) {
                label_003c :
                   if (i) {
                      i1 = i1 | 0x0200;
                   }
                   if (p0 instanceof TextView) {
                      i1 = (i1 | 0x0400) | 1;
                      if (p0 instanceof Button) {
                         i1 = i1 | 0x04;
                         if (p0 instanceof Switch) {
                            i1 = i1 | 0x2000;
                         }else if(p0 instanceof CheckBox){
                            i1 = i1 | 0x8000;
                         }
                      }
                      if (p0 instanceof EditText) {
                         i1 = i1 | 0x0800;
                      }
                   }else if(!p0 instanceof Spinner && !p0 instanceof DatePicker){
                      if (p0 instanceof RatingBar) {
                         i1 = i1 | 0x10000;
                      }else if(p0 instanceof RadioGroup){
                         i1 = i1 | 0x4000;
                      }else if(p0 instanceof ViewGroup && gi7.i(p0, gi7.a.get())){
                         i1 = i1 | 0x40;
                      }
                   }else {
                      i1 = i1 | 0x1000;
                   }
                   return i1;
                }
             }catch(java.lang.ClassNotFoundException e0){
             }
          }
       }
       i = 1;
       goto label_003c ;
    }
    public static final JSONObject c(View p0){
       JSONObject jSONObject;
       int i;
       co5.o(p0, "view");
       if (co5.c(p0.getClass().getName(), "com.facebook.react.ReactRootView")) {
          gi7.a = new WeakReference(p0);
       }
       try{
          jSONObject = new JSONObject();
          gi7.j(p0, jSONObject);
          JSONArray jSONArray = new JSONArray();
          ArrayList uArrayList = gi7.a(p0);
          if ((i = uArrayList.size() - 1) >= 0) {
             int i1 = 0;
             while (true) {
                int i2 = i1 + 1;
                jSONArray.put(gi7.c(uArrayList.get(i1)));
                if (i2 <= i) {
                   i1 = i2;
                }
             }
          }
          jSONObject.put("childviews", jSONArray);
       }catch(org.json.JSONException e5){
          Log.e("p.gi7", "Failed to create JSONObject for view.", e5);
       }
       return jSONObject;
    }
    public static JSONObject d(View p0){
       JSONObject jSONObject;
       try{
          jSONObject = new JSONObject();
          jSONObject.put("top", p0.getTop());
          jSONObject.put("left", p0.getLeft());
          jSONObject.put("width", p0.getWidth());
          jSONObject.put("height", p0.getHeight());
          jSONObject.put("scrollx", p0.getScrollX());
          jSONObject.put("scrolly", p0.getScrollY());
          jSONObject.put("visibility", p0.getVisibility());
       }catch(org.json.JSONException e3){
          Log.e("p.gi7", "Failed to create JSONObject for dimension.", e3);
       }
       return jSONObject;
    }
    public static final View$OnClickListener e(View p0){
       View$OnClickListener onClickListe = null;
       try{
          Field declaredFiel = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
          co5.l(declaredFiel, "forName\(\"android.view.View\"\).getDeclaredField\(\"mListenerInfo\"\)");
          declaredFiel.setAccessible(true);
          if ((p0 = declaredFiel.get(p0)) == null) {
             return onClickListe;
          }
          declaredFiel = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
          co5.l(declaredFiel, "forName\(\"android.view.View\\$ListenerInfo\"\).getDeclaredField\(\"mOnClickListener\"\)");
          declaredFiel.setAccessible(true);
          if ((p0 = declaredFiel.get(p0)) != null) {
             return p0;
          }
          throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
       }catch(java.lang.NoSuchFieldException e0){
          return e0;
       }catch(java.lang.ClassNotFoundException e0){
       }catch(java.lang.IllegalAccessException e0){
       }
    }
    public static final View$OnTouchListener f(View p0){
       View$OnTouchListener onTouchListe = null;
       try{
          Field declaredFiel = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
          co5.l(declaredFiel, "forName\(\"android.view.View\"\).getDeclaredField\(\"mListenerInfo\"\)");
          declaredFiel.setAccessible(true);
          if ((p0 = declaredFiel.get(p0)) == null) {
             return onTouchListe;
          }
          declaredFiel = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener");
          co5.l(declaredFiel, "forName\(\"android.view.View\\$ListenerInfo\"\).getDeclaredField\(\"mOnTouchListener\"\)");
          declaredFiel.setAccessible(true);
          if ((p0 = declaredFiel.get(p0)) != null) {
             return p0;
          }
          throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
       }catch(java.lang.NoSuchFieldException e0){
          HashSet a = sz1.a;
       }catch(java.lang.ClassNotFoundException e0){
          a = sz1.a;
       }catch(java.lang.IllegalAccessException e0){
          a = sz1.a;
       }
       return e0;
    }
    public static final String g(View p0){
       CharSequence hint;
       String str1;
       if (p0 instanceof EditText) {
          hint = p0.getHint();
       }else if(p0 instanceof TextView){
          hint = p0.getHint();
       }else {
          hint = null;
       }
       String str = "";
       if (hint != null && (str1 = hint.toString()) != null) {
          str = str1;
       }
       return str;
    }
    public static final String h(View p0){
       CharSequence text;
       String str;
       String str1;
       int childCount;
       if (p0 instanceof TextView) {
          text = p0.getText();
          if (p0 instanceof Switch) {
             str = (p0.isChecked())? "1": "0";
             text = str;
          }
       }else if(p0 instanceof Spinner){
          if (p0.getCount() > 0 && (p0 = p0.getSelectedItem()) != null) {
             str1 = p0.toString();
          }
       }else {
          String str2 = "java.lang.String.format\(format, *args\)";
          int i = 2;
          int i1 = 1;
          int i2 = 0;
          if (p0 instanceof DatePicker) {
             Object[] objArray = new Object[]{Integer.valueOf(p0.getYear()),Integer.valueOf(p0.getMonth()),Integer.valueOf(p0.getDayOfMonth())};
             str1 = kg4.q(objArray, 3, "%04d-%02d-%02d", str2);
          }else if(p0 instanceof TimePicker){
             Integer currentHour = p0.getCurrentHour();
             co5.l(currentHour, "view.currentHour");
             Integer currentMinut = p0.getCurrentMinute();
             co5.l(currentMinut, "view.currentMinute");
             Object[] objArray1 = new Object[i];
             objArray1[i2] = Integer.valueOf(currentHour.intValue());
             objArray1[i1] = Integer.valueOf(currentMinut.intValue());
             str1 = kg4.q(objArray1, i, "%02d:%02d", str2);
          }else if(p0 instanceof RadioGroup){
             int checkedRadio = p0.getCheckedRadioButtonId();
             if ((childCount = p0.getChildCount()) > 0) {
                while (true) {
                   i = i2 + 1;
                   View childAt = p0.getChildAt(i2);
                   if (childAt.getId() == checkedRadio && childAt instanceof RadioButton) {
                      text = childAt.getText();
                      break ;
                   }else if(i >= childCount){
                      i2 = i;
                   }
                }
             }
          }else if(p0 instanceof RatingBar){
             str1 = String.valueOf(p0.getRating());
          }
       }
       str1 = null;
       str = "";
       if (text != null && (str1 = text.toString()) != null) {
          str = str1;
       }
       return str;
    }
    public static boolean i(View p0,View p1){
       Method b;
       View view;
       ViewParent parent;
       co5.o(p0, "view");
       int i = 0;
       if (co5.c(p0.getClass().getName(), "com.facebook.react.views.view.ReactViewGroup")) {
          int i1 = 2;
          int[] ointArray = new int[i1];
          p0.getLocationOnScreen(ointArray);
          float[] uofloatArray = new float[i1];
          uofloatArray[i] = (float)ointArray[i];
          uofloatArray[1] = (float)ointArray[1];
          String str = "Required value was null.";
          if (gi7.b == null) {
             try{
                Class[] uClassArray = new Class[i1];
                uClassArray[i] = float[].class;
                uClassArray[1] = ViewGroup.class;
                b = Class.forName("com.facebook.react.uimanager.TouchTargetHelper").getDeclaredMethod("findTouchTargetView", uClassArray);
                gi7.b = b;
                if (b != null) {
                   b.setAccessible(1);
                }else {
                   throw new IllegalStateException(str.toString());
                }
             }catch(java.lang.ClassNotFoundException e0){
                HashSet a1 = sz1.a;
             }catch(java.lang.NoSuchMethodException e0){
                a1 = sz1.a;
             }
          }
          b = gi7.b;
          view = null;
          if (b != null && p1 != null) {
             try{
                Object[] objArray = new Object[i1];
                objArray[i] = uofloatArray;
                objArray[1] = p1;
                if ((p1 = b.invoke(view, objArray)) != null) {
                   if (p1.getId() > 0) {
                      if ((parent = p1.getParent()) != null) {
                         view = parent;
                      }else {
                         throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                      }
                   }
                }else {
                   throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
             }catch(java.lang.IllegalAccessException e0){
                HashSet a = sz1.a;
             }catch(java.lang.reflect.InvocationTargetException e0){
                a = sz1.a;
             }
          }
          if (view != null && view.getId() == p0.getId()) {
             i = true;
          }
       }
       return i;
    }
    public static final void j(View p0,JSONObject p1){
       String str = "view";
       try{
          co5.o(p0, str);
          str = gi7.h(p0);
          String str1 = gi7.g(p0);
          Object tag = p0.getTag();
          CharSequence contentDescr = p0.getContentDescription();
          p1.put("classname", p0.getClass().getCanonicalName());
          p1.put("classtypebitmask", gi7.b(p0));
          p1.put("id", p0.getId());
          if (!io2.o(p0)) {
             p1.put("text", ej4.m(ej4.O0(str)));
          }else {
             p1.put("text", "");
             p1.put("is_user_input", true);
          }
          p1.put("hint", ej4.m(ej4.O0(str1)));
          if (tag != null) {
             p1.put("tag", ej4.m(ej4.O0(tag.toString())));
          }
          if (contentDescr != null) {
             p1.put("description", ej4.m(ej4.O0(contentDescr.toString())));
          }
          p1.put("dimension", gi7.d(p0));
       }catch(org.json.JSONException e0){
          HashSet a = sz1.a;
       }
       return;
    }
}
