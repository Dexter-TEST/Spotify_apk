package p.c37;
import android.view.ActionMode$Callback;
import android.widget.TextView;
import java.lang.Object;
import android.view.ActionMode;
import android.view.MenuItem;
import android.view.Menu;
import android.content.Context;
import android.view.View;
import android.content.pm.PackageManager;
import java.lang.String;
import java.lang.Class;
import java.lang.Integer;
import java.lang.reflect.Method;
import android.content.Intent;
import java.util.ArrayList;
import android.app.Activity;
import java.util.List;
import java.util.Iterator;
import android.content.pm.ResolveInfo;
import android.content.pm.ActivityInfo;
import p.w27;
import java.lang.CharSequence;
import android.text.Editable;

public final class c37 implements ActionMode$Callback	// class@00118e from classes.dex
{
    public final ActionMode$Callback a;
    public final TextView b;
    public Class c;
    public Method d;
    public boolean e;
    public boolean f;

    public void c37(ActionMode$Callback p0,TextView p1){
       super();
       this.a = p0;
       this.b = p1;
       this.f = false;
    }
    public final boolean onActionItemClicked(ActionMode p0,MenuItem p1){
       return this.a.onActionItemClicked(p0, p1);
    }
    public final boolean onCreateActionMode(ActionMode p0,Menu p1){
       return this.a.onCreateActionMode(p0, p1);
    }
    public final void onDestroyActionMode(ActionMode p0){
       this.a.onDestroyActionMode(p0);
    }
    public final boolean onPrepareActionMode(ActionMode p0,Menu p1){
       Class uClass;
       Class[] uClassArray;
       c37 td;
       String str1;
       Intent intent;
       ActivityInfo permission;
       c37 tb = this.b;
       Context context = tb.getContext();
       PackageManager packageManag = context.getPackageManager();
       String str = "removeItemAt";
       if (this.f == null) {
          this.f = true;
          try{
             uClass = Class.forName("com.android.internal.view.menu.MenuBuilder");
             this.c = uClass;
             uClassArray = new Class[true];
             uClassArray[0] = Integer.TYPE;
             this.d = uClass.getDeclaredMethod(str, uClassArray);
             this.e = true;
          }catch(java.lang.ClassNotFoundException e0){
             uClass = null;
             this.c = uClass;
             this.d = uClass;
             this.e = false;
          }catch(java.lang.NoSuchMethodException e0){
          }
       }
       try{
          if (this.e != null && this.c.isInstance(p1)) {
             td = this.d;
          }else {
             uClassArray = new Class[true];
             uClassArray[0] = Integer.TYPE;
             td = p1.getClass().getDeclaredMethod(str, uClassArray);
          }
          int i = p1.size() - true;
          while (true) {
             str1 = "android.intent.action.PROCESS_TEXT";
             if (i >= 0) {
                MenuItem item = p1.getItem(i);
                if (item.getIntent() != null && str1.equals(item.getIntent().getAction())) {
                   Object[] objArray = new Object[true];
                   objArray[0] = Integer.valueOf(i);
                   td.invoke(p1, objArray);
                }
                i = i - 1;
             }else {
                break ;
             }
          }
          ArrayList uArrayList = new ArrayList();
          if (context instanceof Activity) {
             Iterator iterator = packageManag.queryIntentActivities(new Intent().setAction(str1).setType("text/plain"), 0).iterator();
             while (iterator.hasNext()) {
                ResolveInfo resolveInfo1 = iterator.next();
                if (!context.getPackageName().equals(resolveInfo1.activityInfo.packageName)) {
                   ResolveInfo activityInfo = resolveInfo1.activityInfo;
                   if (activityInfo.exported == null || ((permission = activityInfo.permission) != null && w27.a(context, permission))) {
                      activityInfo = 0;
                   label_00cf :
                      if (intent) {
                         uArrayList.add(resolveInfo1);
                      }
                   }
                }
                intent = 1;
                goto label_00cf ;
             }
          }
          for (int i1 = 0; i1 < uArrayList.size(); i1 = i1 + 1) {
             ResolveInfo resolveInfo = uArrayList.get(i1);
             int i2 = i1 + 100;
             MenuItem menuItem = p1.add(0, 0, i2, resolveInfo.loadLabel(packageManag));
             intent = new Intent().setAction(str1).setType("text/plain");
             int i3 = (e0 instanceof Editable && (e0.onCheckIsTextEditor() && e0.isEnabled()))? 1: 0;
             i3 = i3 ^ true;
             intent = intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", i3);
             resolveInfo = resolveInfo.activityInfo;
             menuItem.setIntent(intent.setClassName(resolveInfo.packageName, resolveInfo.name)).setShowAsAction(true);
          }
          return this.a.onPrepareActionMode(p0, p1);
       }catch(java.lang.NoSuchMethodException e0){
       }catch(java.lang.IllegalAccessException e0){
       }catch(java.lang.reflect.InvocationTargetException e0){
       }
    }
}
