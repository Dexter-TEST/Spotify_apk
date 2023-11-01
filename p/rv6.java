package p.rv6;
import java.lang.Class;
import android.widget.Switch;
import android.widget.Spinner;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.EditText;
import android.widget.AdapterView;
import java.lang.Object;
import java.util.List;
import p.ye7;
import android.view.View;
import java.util.ArrayList;
import java.lang.String;
import p.co5;
import java.util.Iterator;
import p.gi7;
import java.util.Collection;
import org.json.JSONObject;
import org.json.JSONArray;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;
import android.widget.TextView;

public abstract class rv6	// class@002569 from classes.dex
{
    public static final List a;

    static {
       Class[] uClassArray = new Class[]{Switch.class,Spinner.class,DatePicker.class,TimePicker.class,RadioGroup.class,RatingBar.class,EditText.class,AdapterView.class};
       rv6.a = ye7.K(uClassArray);
    }
    public static final ArrayList a(View p0){
       co5.o(p0, "view");
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = rv6.a.iterator();
       while (true) {
          if (iterator.hasNext()) {
             if (iterator.next().isInstance(p0)) {
                return uArrayList;
             }
             continue ;
          }else if(p0.isClickable()){
             uArrayList.add(p0);
          }
          Iterator iterator1 = gi7.a(p0).iterator();
          while (iterator1.hasNext()) {
             uArrayList.addAll(rv6.a(iterator1.next()));
          }
          return uArrayList;
       }
    }
    public static final JSONObject b(View p0,View p1){
       try{
          co5.o(p0, "view");
          JSONObject jSONObject = new JSONObject();
          if (p0 == p1) {
             jSONObject.put("is_interacted", true);
          }
          rv6.e(p0, jSONObject);
          JSONArray jSONArray = new JSONArray();
          Iterator iterator = gi7.a(p0).iterator();
          while (iterator.hasNext()) {
             jSONArray.put(rv6.b(iterator.next(), p1));
          }
          jSONObject.put("childviews", jSONArray);
          return e0;
       }catch(org.json.JSONException e0){
       }
    }
    public static ArrayList c(View p0){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = gi7.a(p0).iterator();
       while (iterator.hasNext()) {
          View view = iterator.next();
          String str = gi7.h(view);
          int i = (str.length() > 0)? 1: 0;
          if (i) {
             uArrayList.add(str);
          }
          uArrayList.addAll(rv6.c(view));
       }
       return uArrayList;
    }
    public static final String d(View p0){
       co5.o(p0, "hostView");
       String str = gi7.h(p0);
       int i = (str.length() > 0)? 1: 0;
       if (i) {
          return str;
       }else {
          String str1 = TextUtils.join(" ", rv6.c(p0));
          co5.l(str1, "join\(\" \", childrenText\)");
          return str1;
       }
    }
    public static final void e(View p0,JSONObject p1){
       String str = "view";
       try{
          co5.o(p0, str);
          str = gi7.h(p0);
          String str1 = gi7.g(p0);
          p1.put("classname", p0.getClass().getSimpleName());
          p1.put("classtypebitmask", gi7.b(p0));
          int i = 0;
          int i1 = (str.length() > 0)? 1: 0;
          if (i1) {
             p1.put("text", str);
          }
          if (str1.length() > 0) {
             i = 1;
          }
          if (i) {
             p1.put("hint", str1);
          }
          if (p0 instanceof EditText) {
             p1.put("inputtype", p0.getInputType());
          }
          return;
       }catch(org.json.JSONException e0){
       }
    }
}
