package p.e64;
import p.iw6;
import android.content.Context;
import java.lang.Object;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.view.ViewConfiguration;
import p.zh7;
import android.os.Build$VERSION;
import p.yh7;
import java.lang.String;
import java.lang.CharSequence;
import p.l64;
import java.lang.IllegalArgumentException;
import android.view.MenuItem;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.List;
import android.content.pm.ResolveInfo;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.Drawable;
import android.view.SubMenu;
import p.ev6;
import p.c74;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.lang.ref.Reference;
import p.c64;
import android.view.KeyEvent;
import android.view.KeyCharacterMap$KeyData;
import java.util.Collection;
import p.m64;
import android.view.ActionProvider;
import java.lang.Class;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.os.BaseBundle;
import p.n6;
import p.os0;

public class e64 implements iw6	// class@001429 from classes.dex
{
    public final Context a;
    public final Resources b;
    public boolean c;
    public boolean d;
    public c64 e;
    public final ArrayList f;
    public final ArrayList g;
    public boolean h;
    public final ArrayList i;
    public final ArrayList j;
    public boolean k;
    public int l;
    public CharSequence m;
    public Drawable n;
    public View o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final ArrayList t;
    public final CopyOnWriteArrayList u;
    public l64 v;
    public boolean w;
    public boolean x;
    public static final int[] y;

    static {
       e64.y = new int[6]{1,4,5,3,2,0};
    }
    public void e64(Context p0){
       boolean b;
       int identifier;
       super();
       int i = 0;
       this.l = i;
       this.p = i;
       this.q = i;
       this.r = i;
       this.s = i;
       this.t = new ArrayList();
       this.u = new CopyOnWriteArrayList();
       this.w = i;
       this.a = p0;
       Resources resources = p0.getResources();
       this.b = resources;
       this.f = new ArrayList();
       this.g = new ArrayList();
       this.h = true;
       this.i = new ArrayList();
       this.j = new ArrayList();
       this.k = true;
       if (resources.getConfiguration().keyboard != true) {
          ViewConfiguration viewConfigur = ViewConfiguration.get(p0);
          if (Build$VERSION.SDK_INT >= 28) {
             b = yh7.b(viewConfigur);
          }else {
             Resources resources1 = p0.getResources();
             b = ((identifier = resources1.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android")) && resources1.getBoolean(identifier))? true: false;
          }
          if (b) {
             i = true;
          }
       }
       this.d = i;
       return;
    }
    public final l64 a(int p0,int p1,int p2,CharSequence p3){
       int i;
       if ((i = (0xffff0000 & p2) >> 16) < 0 || i >= 6) {
          throw new IllegalArgumentException("order does not contain a valid category.");
       }
       i = (e64.y[i] << 16) | (0xffff & p2);
       l64 v1 = new l64(this, p0, p1, p2, i, p3, this.l);
       e64 tf = this.f;
       p1 = tf.size();
       while (true) {
          if ((p1--) >= 0) {
             if (tf.get(p1).d <= i) {
                p1 = p1 + 1;
                break ;
             }
          }else {
             p1 = 0;
             break ;
          }
       }
       tf.add(p1, v1);
       this.p(1);
       return v1;
    }
    public final MenuItem add(int p0){
       return this.a(0, 0, 0, this.b.getString(p0));
    }
    public final MenuItem add(int p0,int p1,int p2,int p3){
       return this.a(p0, p1, p2, this.b.getString(p3));
    }
    public final MenuItem add(int p0,int p1,int p2,CharSequence p3){
       return this.a(p0, p1, p2, p3);
    }
    public final MenuItem add(CharSequence p0){
       return this.a(0, 0, 0, p0);
    }
    public final int addIntentOptions(int p0,int p1,int p2,ComponentName p3,Intent[] p4,Intent p5,int p6,MenuItem[] p7){
       List list;
       ResolveInfo specificInde;
       PackageManager packageManag = this.a.getPackageManager();
       int i = 0;
       int i1 = ((list = packageManag.queryIntentActivityOptions(p3, p4, p5, i)) != null)? list.size(): 0;
       if (!(p6 = p6 & 0x01)) {
          this.removeGroup(p0);
       }
       while (i < i1) {
          ResolveInfo resolveInfo = list.get(i);
          Intent intent = ((specificInde = resolveInfo.specificIndex) < null)? p5: p4[specificInde];
          Intent intent1 = new Intent(intent);
          ResolveInfo activityInfo = resolveInfo.activityInfo;
          intent1.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
          l64 ol64 = this.a(p0, p1, p2, resolveInfo.loadLabel(packageManag));
          ol64.setIcon(resolveInfo.loadIcon(packageManag));
          ol64.g = intent1;
          if (p7 != null && (resolveInfo = resolveInfo.specificIndex) >= null) {
             p7[resolveInfo] = ol64;
          }
          i = i + 1;
       }
       return i1;
    }
    public final SubMenu addSubMenu(int p0){
       return this.addSubMenu(0, 0, 0, this.b.getString(p0));
    }
    public final SubMenu addSubMenu(int p0,int p1,int p2,int p3){
       return this.addSubMenu(p0, p1, p2, this.b.getString(p3));
    }
    public final SubMenu addSubMenu(int p0,int p1,int p2,CharSequence p3){
       l64 ol64 = this.a(p0, p1, p2, p3);
       ev6 uoev6 = new ev6(this.a, this, ol64);
       ol64.o = uoev6;
       uoev6.setHeaderTitle(ol64.e);
       return uoev6;
    }
    public final SubMenu addSubMenu(CharSequence p0){
       return this.addSubMenu(0, 0, 0, p0);
    }
    public final void b(c74 p0,Context p1){
       this.u.add(new WeakReference(p0));
       p0.g(p1, this);
       this.k = true;
    }
    public final void c(boolean p0){
       c74 uoc74;
       if (this.s != null) {
          return;
       }
       this.s = true;
       e64 tu = this.u;
       Iterator iterator = tu.iterator();
       while (iterator.hasNext()) {
          WeakReference weakReferenc = iterator.next();
          if ((uoc74 = weakReferenc.get()) == null) {
             tu.remove(weakReferenc);
          }else {
             uoc74.b(this, p0);
          }
       }
       this.s = false;
       return;
    }
    public final void clear(){
       e64 tv;
       if ((tv = this.v) != null) {
          this.d(tv);
       }
       this.f.clear();
       this.p(true);
       return;
    }
    public final void clearHeader(){
       this.n = null;
       this.m = null;
       this.o = null;
       this.p(false);
    }
    public final void close(){
       this.c(true);
    }
    public boolean d(l64 p0){
       c74 uoc74;
       e64 tu = this.u;
       boolean b = false;
       if (!tu.isEmpty() && this.v == p0) {
          this.w();
          Iterator iterator = tu.iterator();
          while (iterator.hasNext()) {
             WeakReference weakReferenc = iterator.next();
             if ((uoc74 = weakReferenc.get()) == null) {
                tu.remove(weakReferenc);
             }else if(b = uoc74.k(p0)){
                break ;
             }
          }
          this.v();
          if (b) {
             this.v = null;
          }
       }
       return b;
    }
    public boolean e(e64 p0,MenuItem p1){
       e64 te;
       boolean b = ((te = this.e) != null && te.l(p0, p1))? true: false;
       return b;
    }
    public boolean f(l64 p0){
       c74 uoc74;
       e64 tu = this.u;
       boolean b = false;
       if (tu.isEmpty()) {
          return b;
       }
       this.w();
       Iterator iterator = tu.iterator();
       while (iterator.hasNext()) {
          WeakReference weakReferenc = iterator.next();
          if ((uoc74 = weakReferenc.get()) == null) {
             tu.remove(weakReferenc);
          }else if(b = uoc74.h(p0)){
             break ;
          }
       }
       this.v();
       if (b) {
          this.v = p0;
       }
       return b;
    }
    public final MenuItem findItem(int p0){
       l64 ol64;
       MenuItem menuItem;
       int i = this.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return null;
          }
          ol64 = this.f.get(i1);
          if (ol64.a == p0) {
             break ;
          }else if(ol64.hasSubMenu() && (menuItem = ol64.o.findItem(p0)) != null){
             return menuItem;
          }else {
             i1 = i1 + 1;
          }
       }
       return ol64;
    }
    public final l64 g(int p0,KeyEvent p1){
       int i;
       l64 ol64;
       int i2;
       int i3;
       e64 tt = this.t;
       tt.clear();
       this.h(tt, p0, p1);
       if (tt.isEmpty()) {
          return null;
       }
       int metaState = p1.getMetaState();
       KeyCharacterMap$KeyData keyData = new KeyCharacterMap$KeyData();
       p1.getKeyData(keyData);
       if ((i = tt.size()) == 1) {
          return tt.get(0);
       }
       boolean b = this.n();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return null;
          }
          ol64 = tt.get(i1);
          l64 j = (b)? ol64.j: ol64.h;
          KeyCharacterMap$KeyData meta = keyData.meta;
          if (j == meta[0] && (!(i2 = metaState & 0x02) || (j == meta[2] && ((i3 = metaState & 0x02) || (b && (j == 8 && p0 == 67)))))) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return ol64;
    }
    public final MenuItem getItem(int p0){
       return this.f.get(p0);
    }
    public final void h(ArrayList p0,int p1,KeyEvent p2){
       ArrayList uArrayList = p0;
       int i = p1;
       KeyEvent keyEvent = p2;
       boolean b = this.n();
       int modifiers = p2.getModifiers();
       KeyCharacterMap$KeyData keyData = new KeyCharacterMap$KeyData();
       int i1 = 67;
       if (!keyEvent.getKeyData(keyData) && i != i1) {
          return;
       }
       e64 f = this.f;
       int i2 = f.size();
       int i3 = 0;
       while (i3 < i2) {
          l64 ol64 = f.get(i3);
          if (ol64.hasSubMenu()) {
             ol64.o.h(uArrayList, i, keyEvent);
          }
          l64 j = (b)? ol64.j: ol64.h;
          l64 k = (b)? ol64.k: ol64.i;
          i1 = modifiers & 0x1100f;
          int i4 = k & 0x1100f;
          i1 = (i1 == i4)? 1: 0;
          if (i1 && j != null) {
             KeyCharacterMap$KeyData meta = keyData.meta;
             if (j != meta[0] && j != meta[2]) {
                if (b && j == 8) {
                   if (i != 67) {
                   label_007c :
                      i3 = i3 + 1;
                   }
                }else {
                label_007a :
                   meta = 67;
                   goto label_007c ;
                }
             }else {
                meta = 67;
             }
             if (ol64.isEnabled()) {
                uArrayList.add(ol64);
                goto label_007c ;
             }
          }else {
             goto label_007a ;
          }
       }
       return;
    }
    public final boolean hasVisibleItems(){
       if (this.x != null) {
          return true;
       }
       int i = this.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return false;
          }
          if (this.f.get(i1).isVisible()) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return true;
    }
    public final void i(){
       c74 uoc74;
       ArrayList uArrayList = this.l();
       if (this.k == null) {
          return;
       }
       e64 tu = this.u;
       Iterator iterator = tu.iterator();
       int i = 0;
       while (iterator.hasNext()) {
          WeakReference weakReferenc = iterator.next();
          if ((uoc74 = weakReferenc.get()) == null) {
             tu.remove(weakReferenc);
          }else {
             i = i | uoc74.i();
          }
       }
       tu = this.i;
       e64 tj = this.j;
       if (i) {
          tu.clear();
          tj.clear();
          i = uArrayList.size();
          int i1 = 0;
          while (i1 < i) {
             l64 ol64 = uArrayList.get(i1);
             if (ol64.g()) {
                tu.add(ol64);
             }else {
                tj.add(ol64);
             }
             i1 = i1 + 1;
          }
       }else {
          tu.clear();
          tj.clear();
          tj.addAll(this.l());
       }
       this.k = false;
       return;
    }
    public final boolean isShortcutKey(int p0,KeyEvent p1){
       boolean b = (this.g(p0, p1) != null)? true: false;
       return b;
    }
    public String j(){
       return "android:menu:actionviewstates";
    }
    public e64 k(){
       return this;
    }
    public final ArrayList l(){
       e64 tg = this.g;
       if (this.h == null) {
          return tg;
       }
       tg.clear();
       e64 tf = this.f;
       int i = tf.size();
       int i1 = 0;
       while (i1 < i) {
          l64 ol64 = tf.get(i1);
          if (ol64.isVisible()) {
             tg.add(ol64);
          }
          i1 = i1 + 1;
       }
       this.h = false;
       this.k = true;
       return tg;
    }
    public boolean m(){
       return this.w;
    }
    public boolean n(){
       return this.c;
    }
    public boolean o(){
       return this.d;
    }
    public final void p(boolean p0){
       c74 uoc74;
       boolean b = true;
       if (this.p == null) {
          if (p0) {
             this.h = b;
             this.k = b;
          }
          e64 tu = this.u;
          if (!tu.isEmpty()) {
             this.w();
             Iterator iterator = tu.iterator();
             while (iterator.hasNext()) {
                WeakReference weakReferenc = iterator.next();
                if ((uoc74 = weakReferenc.get()) == null) {
                   tu.remove(weakReferenc);
                }else {
                   uoc74.d();
                }
             }
             this.v();
          }
       }else {
          this.q = b;
          if (p0) {
             this.r = b;
          }
       }
       return;
    }
    public final boolean performIdentifierAction(int p0,int p1){
       return this.q(this.findItem(p0), null, p1);
    }
    public final boolean performShortcut(int p0,KeyEvent p1,int p2){
       l64 ol64;
       boolean b = ((ol64 = this.g(p0, p1)) != null)? this.q(ol64, null, p2): false;
       if ((p2 & 0x02)) {
          this.c(true);
       }
       return b;
    }
    public final boolean q(MenuItem p0,c74 p1,int p2){
       l64 a;
       c74 uoc74;
       boolean b = false;
       if (p0 == null || !p0.isEnabled()) {
          return b;
       }
       boolean b1 = p0.f();
       int i = ((a = p0.A) != null && a.a.hasSubMenu())? 1: 0;
       if (p0.e()) {
          if (b1 = b1 | p0.expandActionView()) {
             this.c(true);
          }
       }else if(!p0.hasSubMenu() && !i){
          if (!((p2 & 0x01))) {
             this.c(true);
          }
       }else if(!((p2 & 0x04))){
          this.c(b);
       }
       if (!p0.hasSubMenu()) {
          ev6 uoev6 = new ev6(this.a, this, p0);
          p0.o = uoev6;
          uoev6.setHeaderTitle(p0.e);
       }
       l64 o = p0.o;
       if (i) {
          a.b.getClass();
          a.a.onPrepareSubMenu(o);
       }
       e64 tu = this.u;
       if (!tu.isEmpty()) {
          if (p1 != null) {
             b = p1.f(o);
          }
          Iterator iterator = tu.iterator();
          while (iterator.hasNext()) {
             WeakReference weakReferenc = iterator.next();
             if ((uoc74 = weakReferenc.get()) == null) {
                tu.remove(weakReferenc);
             }else if(!b){
                b = uoc74.f(o);
             }
          }
       }
       if (!(b1 = b1 | b)) {
          this.c(true);
       }
       return b1;
    }
    public final void r(c74 p0){
       c74 uoc74;
       e64 tu = this.u;
       Iterator iterator = tu.iterator();
       while (iterator.hasNext()) {
          WeakReference weakReferenc = iterator.next();
          if ((uoc74 = weakReferenc.get()) != null && uoc74 != p0) {
             continue ;
          }else {
             tu.remove(weakReferenc);
          }
       }
       return;
    }
    public final void removeGroup(int p0){
       int i = this.size();
       int i1 = 0;
       int i2 = 0;
       while (true) {
          e64 tf = this.f;
          if (i2 < i) {
             if (tf.get(i2).b == p0) {
             label_0019 :
                if (i2 >= 0) {
                   i = tf.size() - i2;
                   while (true) {
                      int i3 = i1 + 1;
                      if (i1 < i && tf.get(i2).b == p0) {
                         if (i2 >= 0 && i2 < tf.size()) {
                            tf.remove(i2);
                         }
                         i1 = i3;
                      }else {
                         break ;
                      }
                   }
                   this.p(true);
                }
                break ;
             }else {
                i2 = i2 + 1;
             }
          }else {
             i2 = -1;
             goto label_0019 ;
          }
       }
       return;
    }
    public final void removeItem(int p0){
       int i = this.size();
       int i1 = 0;
       while (true) {
          e64 tf = this.f;
          if (i1 < i) {
             if (tf.get(i1).a == p0) {
             label_0018 :
                if (i1 >= 0 && i1 < tf.size()) {
                   tf.remove(i1);
                   this.p(true);
                   break ;
                }
                break ;
             }else {
                i1 = i1 + 1;
             }
          }else {
             i1 = -1;
             goto label_0018 ;
          }
       }
       return;
    }
    public final void s(Bundle p0){
       View actionView;
       int intx;
       MenuItem menuItem;
       if (p0 == null) {
          return;
       }
       SparseArray sparseParcel = p0.getSparseParcelableArray(this.j());
       int i = this.size();
       int i1 = 0;
       while (i1 < i) {
          MenuItem item = this.getItem(i1);
          if ((actionView = item.getActionView()) != null && actionView.getId() != -1) {
             actionView.restoreHierarchyState(sparseParcel);
          }
          if (item.hasSubMenu()) {
             item.getSubMenu().s(p0);
          }
          i1 = i1 + 1;
       }
       if ((intx = p0.getInt("android:menu:expandedactionview")) > 0 && (menuItem = this.findItem(intx)) != null) {
          menuItem.expandActionView();
       }
       return;
    }
    public final void setGroupCheckable(int p0,boolean p1,boolean p2){
       e64 tf = this.f;
       int i = tf.size();
       int i1 = 0;
       while (i1 < i) {
          l64 ol64 = tf.get(i1);
          if (ol64.b == p0) {
             int i2 = ol64.x & 0xfb;
             int i3 = (p2)? 4: 0;
             i2 = i2 | i3;
             ol64.x = i2;
             ol64.setCheckable(p1);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public void setGroupDividerEnabled(boolean p0){
       this.w = p0;
    }
    public final void setGroupEnabled(int p0,boolean p1){
       e64 tf = this.f;
       int i = tf.size();
       int i1 = 0;
       while (i1 < i) {
          l64 ol64 = tf.get(i1);
          if (ol64.b == p0) {
             ol64.setEnabled(p1);
          }
          i1 = i1 + 1;
       }
       return;
    }
    public final void setGroupVisible(int p0,boolean p1){
       e64 tf = this.f;
       int i = tf.size();
       int i1 = 0;
       int i2 = 0;
       while (i1 < i) {
          l64 ol64 = tf.get(i1);
          if (ol64.b == p0) {
             l64 x = ol64.x;
             int i3 = x & 0xf7;
             int i4 = (p1)? 0: 8;
             i3 = i3 | i4;
             ol64.x = i3;
             ol64 = (x != i3)? 1: 0;
             if (ol64) {
                i2 = 1;
             }
          }
          i1 = i1 + 1;
       }
       if (i2) {
          this.p(true);
       }
       return;
    }
    public void setQwertyMode(boolean p0){
       this.c = p0;
       this.p(false);
    }
    public final int size(){
       return this.f.size();
    }
    public final void t(Bundle p0){
       View actionView;
       int i = this.size();
       SparseArray sparseArray = null;
       int i1 = 0;
       while (i1 < i) {
          MenuItem item = this.getItem(i1);
          if ((actionView = item.getActionView()) != null && actionView.getId() != -1) {
             if (sparseArray == null) {
                sparseArray = new SparseArray();
             }
             actionView.saveHierarchyState(sparseArray);
             if (item.isActionViewExpanded()) {
                p0.putInt("android:menu:expandedactionview", item.getItemId());
             }
          }
          if (item.hasSubMenu()) {
             item.getSubMenu().t(p0);
          }
          i1 = i1 + 1;
       }
       if (sparseArray != null) {
          p0.putSparseParcelableArray(this.j(), sparseArray);
       }
       return;
    }
    public final void u(int p0,CharSequence p1,int p2,Drawable p3,View p4){
       if (p4 != null) {
          this.o = p4;
          this.m = null;
          this.n = null;
       }else if(p0 > 0){
          this.m = this.b.getText(p0);
       }else if(p1 != null){
          this.m = p1;
       }
       if (p2 > 0) {
          this.n = os0.b(this.a, p2);
       }else if(p3 != null){
          this.n = p3;
       }
       this.o = null;
       this.p(false);
       return;
    }
    public final void v(){
       boolean b = false;
       this.p = b;
       if (this.q != null) {
          this.q = b;
          this.p(this.r);
       }
       return;
    }
    public final void w(){
       if (this.p == null) {
          this.p = true;
          this.q = false;
          this.r = false;
       }
       return;
    }
}
