package p.ii;
import java.lang.Class;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.String;
import p.wh6;
import java.lang.Object;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.ClassLoader;
import java.lang.reflect.AccessibleObject;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import p.hf;
import p.jf;
import androidx.appcompat.widget.AppCompatCheckBox;
import p.lf;
import p.pg;
import p.sg;
import androidx.appcompat.widget.AppCompatImageView;
import p.ug;
import p.xg;
import p.yg;
import p.ah;
import p.mh;
import androidx.appcompat.widget.AppCompatTextView;
import p.gi;
import p.ej4;
import android.content.res.TypedArray;
import p.mt0;
import p.d57;
import android.content.ContextWrapper;
import p.wh7;
import p.ch7;
import p.hi;
import android.view.View$OnClickListener;
import android.os.Build$VERSION;
import p.zg7;
import java.lang.Boolean;
import p.bh7;
import java.lang.CharSequence;

public class ii	// class@0019a1 from classes.dex
{
    private final Object[] mConstructorArgs;
    private static final String LOG_TAG = "AppCompatViewInflater";
    private static final int[] sAccessibilityHeading;
    private static final int[] sAccessibilityPaneTitle;
    private static final String[] sClassPrefixList;
    private static final wh6 sConstructorMap;
    private static final Class[] sConstructorSignature;
    private static final int[] sOnClickAttrs;
    private static final int[] sScreenReaderFocusable;

    static {
       Class[] uClassArray = new Class[]{Context.class,AttributeSet.class};
       ii.sConstructorSignature = uClassArray;
       int[] ointArray = new int[]{0x101026f};
       ii.sOnClickAttrs = ointArray;
       ointArray = new int[]{0x1010580};
       ii.sAccessibilityHeading = ointArray;
       ointArray = new int[]{0x101057c};
       ii.sAccessibilityPaneTitle = ointArray;
       ointArray = new int[]{0x1010574};
       ii.sScreenReaderFocusable = ointArray;
       String[] stringArray = new String[]{"android.widget.","android.view.","android.webkit."};
       ii.sClassPrefixList = stringArray;
       ii.sConstructorMap = new wh6();
    }
    public void ii(){
       super();
       Object[] objArray = new Object[2];
       this.mConstructorArgs = objArray;
    }
    public final View a(Context p0,String p1,String p2){
       Constructor orDefault;
       try{
          wh6 sConstructor = ii.sConstructorMap;
          if ((orDefault = sConstructor.getOrDefault(p1, null)) == null) {
             p2 = (p2 != null)? p2.concat(p1): p1;
             orDefault = Class.forName(p2, false, p0.getClassLoader()).asSubclass(View.class).getConstructor(ii.sConstructorSignature);
             sConstructor.put(p1, orDefault);
          }
          orDefault.setAccessible(true);
          return orDefault.newInstance(this.mConstructorArgs);
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public final void b(View p0,String p1){
       if (p0 != null) {
          return;
       }
       throw new IllegalStateException(this.getClass().getName()+" asked to inflate view for <"+p1+">, but returned null");
    }
    public hf createAutoCompleteTextView(Context p0,AttributeSet p1){
       return new hf(p0, p1, 0x7f03005f);
    }
    public jf createButton(Context p0,AttributeSet p1){
       return new jf(p0, p1);
    }
    public AppCompatCheckBox createCheckBox(Context p0,AttributeSet p1){
       return new AppCompatCheckBox(p0, p1);
    }
    public lf createCheckedTextView(Context p0,AttributeSet p1){
       return new lf(p0, p1, 0x7f030103);
    }
    public pg createEditText(Context p0,AttributeSet p1){
       return new pg(p0, p1);
    }
    public sg createImageButton(Context p0,AttributeSet p1){
       return new sg(p0, p1);
    }
    public AppCompatImageView createImageView(Context p0,AttributeSet p1){
       return new AppCompatImageView(p0, p1);
    }
    public ug createMultiAutoCompleteTextView(Context p0,AttributeSet p1){
       return new ug(p0, p1);
    }
    public xg createRadioButton(Context p0,AttributeSet p1){
       return new xg(p0, p1, 0x7f03052c);
    }
    public yg createRatingBar(Context p0,AttributeSet p1){
       return new yg(p0, p1);
    }
    public ah createSeekBar(Context p0,AttributeSet p1){
       return new ah(p0, p1);
    }
    public mh createSpinner(Context p0,AttributeSet p1){
       return new mh(p0, p1);
    }
    public AppCompatTextView createTextView(Context p0,AttributeSet p1){
       return new AppCompatTextView(p0, p1);
    }
    public gi createToggleButton(Context p0,AttributeSet p1){
       return new gi(p0, p1, 0x101004b);
    }
    public View createView(Context p0,String p1,AttributeSet p2){
       return null;
    }
    public final View createView(View p0,String p1,Context p2,AttributeSet p3,boolean p4,boolean p5,boolean p6,boolean p7){
       yg oyg;
       ii tmConstructo1;
       TypedArray typedArray1;
       String str;
       View view;
       Context context = (p4 && p0 != null)? p0.getContext(): p2;
       int i = 4;
       if (p5 || p6) {
          TypedArray typedArray = context.obtainStyledAttributes(p3, ej4.c0, 0, 0);
          int resourceId = (p5)? typedArray.getResourceId(0, 0): 0;
          if (p6 && !resourceId) {
             resourceId = typedArray.getResourceId(i, 0);
          }
          typedArray.recycle();
          if (resourceId && (!context instanceof mt0 && context.a == resourceId)) {
             context = new mt0(context, resourceId);
          }
       }
       if (p7) {
          d57.a(context);
       }
       p1.getClass();
       int i1 = -1;
       switch (p1.hashCode()){
           case 0x8bfb3116:
             if (!p1.equals("RatingBar")) {
             label_00fa :
                i = -1;
             }else {
                i = 0;
             }
             break;
           case 0xa93fea19:
             if (!p1.equals("CheckedTextView")) {
                goto label_00fa ;
             }else {
                i = 1;
             }
             break;
           case 0xafc55853:
             if (!p1.equals("MultiAutoCompleteTextView")) {
                goto label_00fa ;
             }else {
                i = 2;
             }
             break;
           case 0xc808f992:
             if (!p1.equals("TextView")) {
                goto label_00fa ;
             }else {
                i = 3;
             }
             break;
           case 0xc81fb44d:
             if (!p1.equals("ImageButton")) {
                goto label_00fa ;
             }
             break;
           case 0xd8bf9a5b:
             if (!p1.equals("SeekBar")) {
                goto label_00fa ;
             }else {
                i = 5;
             }
             break;
           case 0xebbf49f9:
             if (!p1.equals("Spinner")) {
                goto label_00fa ;
             }else {
                i = 6;
             }
             break;
           case 0x2e46a6ed:
             if (!p1.equals("RadioButton")) {
                goto label_00fa ;
             }else {
                i = 7;
             }
             break;
           case 0x2fa453c6:
             if (!p1.equals("ToggleButton")) {
                goto label_00fa ;
             }else {
                i = 8;
             }
             break;
           case 0x431b5280:
             if (!p1.equals("ImageView")) {
                goto label_00fa ;
             }else {
                i = 9;
             }
             break;
           case 0x5445f9ba:
             if (!p1.equals("AutoCompleteTextView")) {
                goto label_00fa ;
             }else {
                i = 10;
             }
             break;
           case 0x5f7507c3:
             if (!p1.equals("CheckBox")) {
                goto label_00fa ;
             }else {
                i = 11;
             }
             break;
           case 0x63577677:
             if (!p1.equals("EditText")) {
                goto label_00fa ;
             }else {
                i = 12;
             }
             break;
           case 0x77471352:
             if (!p1.equals("Button")) {
                goto label_00fa ;
             }else {
                i = 13;
             }
             break;
           default:
             goto label_00fa ;
       }
       switch (i){
           case 0:
             oyg = this.createRatingBar(context, p3);
             this.b(oyg, p1);
             break;
           case 1:
             oyg = this.createCheckedTextView(context, p3);
             this.b(oyg, p1);
             break;
           case 2:
             oyg = this.createMultiAutoCompleteTextView(context, p3);
             this.b(oyg, p1);
             break;
           case 3:
             oyg = this.createTextView(context, p3);
             this.b(oyg, p1);
             break;
           case 4:
             oyg = this.createImageButton(context, p3);
             this.b(oyg, p1);
             break;
           case 5:
             oyg = this.createSeekBar(context, p3);
             this.b(oyg, p1);
             break;
           case 6:
             oyg = this.createSpinner(context, p3);
             this.b(oyg, p1);
             break;
           case 7:
             oyg = this.createRadioButton(context, p3);
             this.b(oyg, p1);
             break;
           case 8:
             oyg = this.createToggleButton(context, p3);
             this.b(oyg, p1);
             break;
           case 9:
             oyg = this.createImageView(context, p3);
             this.b(oyg, p1);
             break;
           case 10:
             oyg = this.createAutoCompleteTextView(context, p3);
             this.b(oyg, p1);
             break;
           case 11:
             oyg = this.createCheckBox(context, p3);
             this.b(oyg, p1);
             break;
           case 12:
             oyg = this.createEditText(context, p3);
             this.b(oyg, p1);
             break;
           case 13:
             oyg = this.createButton(context, p3);
             this.b(oyg, p1);
             break;
           default:
             oyg = this.createView(context, p1, p3);
       }
       if (oyg == null && p2 != context) {
          oyg = null;
          if (p1.equals("view")) {
             p1 = p3.getAttributeValue(oyg, "class");
          }
          try{
             ii tmConstructo = this.mConstructorArgs;
             tmConstructo[0] = context;
             tmConstructo[1] = p3;
             if (i1 == p1.indexOf(46)) {
                int i2 = 0;
                while (true) {
                   String[] sClassPrefix = ii.sClassPrefixList;
                   if (i2 < sClassPrefix.length) {
                      if ((view = this.a(context, p1, sClassPrefix[i2])) != null) {
                         tmConstructo1 = this.mConstructorArgs;
                         tmConstructo1[0] = oyg;
                         tmConstructo1[1] = oyg;
                         oyg = view;
                      }else {
                         i2++;
                      }
                   }else {
                      tmConstructo1 = this.mConstructorArgs;
                      tmConstructo1[0] = oyg;
                      tmConstructo1[1] = oyg;
                   }
                }
             }else {
                tmConstructo = this.mConstructorArgs;
                tmConstructo[0] = oyg;
                tmConstructo[1] = oyg;
                oyg = this.a(context, p1, oyg);
             }
          }catch(java.lang.Exception e0){
             tmConstructo1 = this.mConstructorArgs;
             tmConstructo1[0] = oyg;
             tmConstructo1[1] = oyg;
          }
       }
       if (oyg != null) {
          Context context1 = oyg.getContext();
          if (context1 instanceof ContextWrapper && ch7.a(oyg)) {
             typedArray1 = context1.obtainStyledAttributes(p3, ii.sOnClickAttrs);
             if ((str = typedArray1.getString(0)) != null) {
                oyg.setOnClickListener(new hi(oyg, str));
             }
             typedArray1.recycle();
          }
          if (Build$VERSION.SDK_INT <= 28) {
             typedArray1 = context.obtainStyledAttributes(p3, ii.sAccessibilityHeading);
             if (typedArray1.hasValue(0)) {
                new zg7(R.id.tag_accessibility_heading, 3).c(oyg, Boolean.valueOf(typedArray1.getBoolean(0, 0)));
             }
             typedArray1.recycle();
             typedArray1 = context.obtainStyledAttributes(p3, ii.sAccessibilityPaneTitle);
             if (typedArray1.hasValue(0)) {
                wh7.p(oyg, typedArray1.getString(0));
             }
             typedArray1.recycle();
             TypedArray typedArray2 = context.obtainStyledAttributes(p3, ii.sScreenReaderFocusable);
             if (typedArray2.hasValue(0)) {
                new zg7(R.id.tag_screen_reader_focusable, 0).c(oyg, Boolean.valueOf(typedArray2.getBoolean(0, 0)));
             }
             typedArray2.recycle();
          }
       }
       return oyg;
    }
}
