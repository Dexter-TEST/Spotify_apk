package p.l64;
import p.mw6;
import p.e64;
import java.lang.CharSequence;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.m64;
import p.uv1;
import android.view.MenuItem;
import android.view.MenuItem$OnActionExpandListener;
import android.graphics.drawable.Drawable;
import p.eb3;
import android.content.res.ColorStateList;
import p.ce1;
import android.graphics.PorterDuff$Mode;
import android.view.View;
import android.view.MenuItem$OnMenuItemClickListener;
import android.content.Intent;
import android.content.Context;
import java.lang.Throwable;
import android.util.Log;
import android.view.ActionProvider;
import java.lang.UnsupportedOperationException;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.SubMenu;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import java.lang.Character;
import android.view.KeyEvent;
import java.lang.Class;
import java.util.ArrayList;
import java.lang.IllegalArgumentException;
import p.ev6;

public final class l64 implements mw6	// class@001cf1 from classes.dex
{
    public m64 A;
    public MenuItem$OnActionExpandListener B;
    public boolean C;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public Intent g;
    public char h;
    public int i;
    public char j;
    public int k;
    public Drawable l;
    public int m;
    public final e64 n;
    public ev6 o;
    public MenuItem$OnMenuItemClickListener p;
    public CharSequence q;
    public CharSequence r;
    public ColorStateList s;
    public PorterDuff$Mode t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public View z;

    public void l64(e64 p0,int p1,int p2,int p3,int p4,CharSequence p5,int p6){
       super();
       this.i = 4096;
       this.k = 4096;
       this.m = 0;
       this.s = null;
       this.t = null;
       this.u = false;
       this.v = false;
       this.w = false;
       this.x = 16;
       this.C = false;
       this.n = p0;
       this.a = p2;
       this.b = p1;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.y = p6;
    }
    public static void c(int p0,int p1,String p2,StringBuilder p3){
       if (((p0 & p1)) == p1) {
          p3+p2;
       }
       return;
    }
    public final mw6 a(m64 p0){
       l64 tA;
       this.z = null;
       this.A = p0;
       this.n.p(true);
       if ((tA = this.A) != null) {
          tA.d(new uv1(3, this));
       }
       return this;
    }
    public final m64 b(){
       return this.A;
    }
    public final boolean collapseActionView(){
       l64 tB;
       if (!((this.y & 0x08))) {
          return false;
       }
       if (this.z == null) {
          return true;
       }
       if ((tB = this.B) != null && !tB.onMenuItemActionCollapse(this)) {
          return false;
       }
       return this.n.d(this);
    }
    public final Drawable d(Drawable p0){
       if (p0 != null && (this.w != null && (this.u != null && this.v == null))) {
          p0 = eb3.L(p0).mutate();
          if (this.u != null) {
             ce1.h(p0, this.s);
          }
          if (this.v != null) {
             ce1.i(p0, this.t);
          }
          this.w = false;
       }
       return p0;
    }
    public final boolean e(){
       l64 tA;
       boolean b = false;
       if ((this.y & 0x08)) {
          if (this.z == null && (tA = this.A) != null) {
             this.z = tA.b(this);
          }
          if (this.z != null) {
             b = true;
          }
       }
       return b;
    }
    public final boolean expandActionView(){
       l64 tB;
       if (!this.e()) {
          return false;
       }
       if ((tB = this.B) != null && !tB.onMenuItemActionExpand(this)) {
          return false;
       }
       return this.n.f(this);
    }
    public final boolean f(){
       l64 tp;
       l64 tg;
       if ((tp = this.p) != null && tp.onMenuItemClick(this)) {
          return true;
       }
       tp = this.n;
       if (tp.e(tp, this)) {
          return true;
       }
       if ((tg = this.g) != null) {
          try{
             tp.a.startActivity(tg);
             return true;
          }catch(android.content.ActivityNotFoundException e0){
             Log.e("MenuItemImpl", "Can\'t find activity to handle intent; ignoring", e0);
          }
          if ((tp = this.A) != null && tp.a.onPerformDefaultAction()) {
             return v1;
          }
          return false;
       }else {
       }
    }
    public final boolean g(){
       boolean b = (((this.x & 32)) == 32)? true: false;
       return b;
    }
    public final ActionProvider getActionProvider(){
       throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider\(\)");
    }
    public final View getActionView(){
       l64 tz;
       if ((tz = this.z) != null) {
          return tz;
       }
       if ((tz = this.A) == null) {
          return null;
       }
       View view = tz.b(this);
       this.z = view;
       return view;
    }
    public final int getAlphabeticModifiers(){
       return this.k;
    }
    public final char getAlphabeticShortcut(){
       return this.j;
    }
    public final CharSequence getContentDescription(){
       return this.q;
    }
    public final int getGroupId(){
       return this.b;
    }
    public final Drawable getIcon(){
       l64 tl;
       if ((tl = this.l) != null) {
          return this.d(tl);
       }
       if ((tl = this.m) == null) {
          return null;
       }
       Drawable uDrawable = eb3.m(this.n.a, tl);
       this.m = 0;
       this.l = uDrawable;
       return this.d(uDrawable);
    }
    public final ColorStateList getIconTintList(){
       return this.s;
    }
    public final PorterDuff$Mode getIconTintMode(){
       return this.t;
    }
    public final Intent getIntent(){
       return this.g;
    }
    public final int getItemId(){
       return this.a;
    }
    public final ContextMenu$ContextMenuInfo getMenuInfo(){
       return null;
    }
    public final int getNumericModifiers(){
       return this.i;
    }
    public final char getNumericShortcut(){
       return this.h;
    }
    public final int getOrder(){
       return this.c;
    }
    public final SubMenu getSubMenu(){
       return this.o;
    }
    public final CharSequence getTitle(){
       return this.e;
    }
    public final CharSequence getTitleCondensed(){
       l64 tf;
       if ((tf = this.f) != null) {
       }else {
          tf = this.e;
       }
       return tf;
    }
    public final CharSequence getTooltipText(){
       return this.r;
    }
    public final void h(boolean p0){
       this.x = (p0)? this.x | 0x20: this.x & 0xdf;
       return;
    }
    public final boolean hasSubMenu(){
       boolean b = (this.o != null)? true: false;
       return b;
    }
    public final boolean isActionViewExpanded(){
       return this.C;
    }
    public final boolean isCheckable(){
       int i = 1;
       if (((this.x & i)) == i) {
       }else {
          i = false;
       }
       return i;
    }
    public final boolean isChecked(){
       boolean b = (((this.x & 2)) == 2)? true: false;
       return b;
    }
    public final boolean isEnabled(){
       boolean b = ((this.x & 0x10))? true: false;
       return b;
    }
    public final boolean isVisible(){
       l64 tA = this.A;
       boolean b = true;
       if (tA != null && tA.c()) {
          if (((this.x & 0x08)) || !this.A.a()) {
             b = false;
          }
          return b;
       }else if(!((this.x & 0x08))){
          b = false;
       }
       return b;
    }
    public final MenuItem setActionProvider(ActionProvider p0){
       throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider\(\)");
    }
    public final MenuItem setActionView(int p0){
       l64 ta;
       l64 tn = this.n;
       e64 a = tn.a;
       LayoutInflater layoutInflat = LayoutInflater.from(a);
       LinearLayout linearLayout = new LinearLayout(a);
       View view = layoutInflat.inflate(p0, linearLayout, false);
       this.z = view;
       this.A = null;
       if (view != null && (view.getId() == -1 && (ta = this.a) > null)) {
          view.setId(ta);
       }
       tn.k = true;
       tn.p(true);
       return this;
    }
    public final MenuItem setActionView(View p0){
       l64 ta;
       this.z = p0;
       this.A = null;
       if (p0 != null && (p0.getId() == -1 && (ta = this.a) > null)) {
          p0.setId(ta);
       }
       l64 tn = this.n;
       tn.k = true;
       tn.p(true);
       return this;
    }
    public final MenuItem setAlphabeticShortcut(char p0){
       if (this.j == p0) {
          return this;
       }
       this.j = Character.toLowerCase(p0);
       this.n.p(false);
       return this;
    }
    public final MenuItem setAlphabeticShortcut(char p0,int p1){
       if (this.j == p0 && this.k == p1) {
          return this;
       }
       this.j = Character.toLowerCase(p0);
       this.k = KeyEvent.normalizeMetaState(p1);
       this.n.p(false);
       return this;
    }
    public final MenuItem setCheckable(boolean p0){
       l64 tx = this.x;
       int i = p0 | (tx & 0xfe);
       this.x = i;
       if (tx != i) {
          this.n.p(false);
       }
       return this;
    }
    public final MenuItem setChecked(boolean p0){
       int i2;
       l64 tx = this.x;
       l64 tn = this.n;
       int i = 2;
       if ((tx & 0x04)) {
          tn.getClass();
          e64 f = tn.f;
          int i1 = f.size();
          tn.w();
          i2 = 0;
          while (i2 < i1) {
             l64 ol64 = f.get(i2);
             if (ol64.b == this.b) {
                int i3 = ol64.x & 0x04;
                int i4 = 1;
                i3 = (i3)? 1: 0;
                if (i3 && ol64.isCheckable()) {
                   if (ol64 != this) {
                      i4 = 0;
                   }
                   l64 x = ol64.x;
                   int i5 = x & 0xfd;
                   i4 = (i4)? 2: 0;
                   i4 = i4 | i5;
                   ol64.x = i4;
                   if (x != i4) {
                      ol64.n.p(false);
                   }
                }
             }
             i2 = i2 + 1;
          }
          tn.v();
       }else {
          i2 = tx & 0xfd;
          if (!p0) {
             i = 0;
          }
          int i6 = i | i2;
          this.x = i6;
          if (tx != i6) {
             tn.p(false);
          }
       }
       return this;
    }
    public final MenuItem setContentDescription(CharSequence p0){
       this.setContentDescription(p0);
       return this;
    }
    public final mw6 setContentDescription(CharSequence p0){
       this.q = p0;
       this.n.p(false);
       return this;
    }
    public final MenuItem setEnabled(boolean p0){
       this.x = (p0)? this.x | 0x10: this.x & 0xef;
       this.n.p(false);
       return this;
    }
    public final MenuItem setIcon(int p0){
       this.l = null;
       this.m = p0;
       this.w = true;
       this.n.p(false);
       return this;
    }
    public final MenuItem setIcon(Drawable p0){
       this.m = 0;
       this.l = p0;
       this.w = true;
       this.n.p(0);
       return this;
    }
    public final MenuItem setIconTintList(ColorStateList p0){
       this.s = p0;
       this.u = true;
       this.w = true;
       this.n.p(false);
       return this;
    }
    public final MenuItem setIconTintMode(PorterDuff$Mode p0){
       this.t = p0;
       this.v = true;
       this.w = true;
       this.n.p(false);
       return this;
    }
    public final MenuItem setIntent(Intent p0){
       this.g = p0;
       return this;
    }
    public final MenuItem setNumericShortcut(char p0){
       if (this.h == p0) {
          return this;
       }
       this.h = p0;
       this.n.p(false);
       return this;
    }
    public final MenuItem setNumericShortcut(char p0,int p1){
       if (this.h == p0 && this.i == p1) {
          return this;
       }
       this.h = p0;
       this.i = KeyEvent.normalizeMetaState(p1);
       this.n.p(false);
       return this;
    }
    public final MenuItem setOnActionExpandListener(MenuItem$OnActionExpandListener p0){
       this.B = p0;
       return this;
    }
    public final MenuItem setOnMenuItemClickListener(MenuItem$OnMenuItemClickListener p0){
       this.p = p0;
       return this;
    }
    public final MenuItem setShortcut(char p0,char p1){
       this.h = p0;
       this.j = Character.toLowerCase(p1);
       this.n.p(false);
       return this;
    }
    public final MenuItem setShortcut(char p0,char p1,int p2,int p3){
       this.h = p0;
       this.i = KeyEvent.normalizeMetaState(p2);
       this.j = Character.toLowerCase(p1);
       this.k = KeyEvent.normalizeMetaState(p3);
       this.n.p(false);
       return this;
    }
    public final void setShowAsAction(int p0){
       int i;
       if ((i = p0 & 0x03) && (i != 1 && i != 2)) {
          throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
       }
       this.y = p0;
       l64 tn = this.n;
       tn.k = true;
       tn.p(true);
       return;
    }
    public final MenuItem setShowAsActionFlags(int p0){
       this.setShowAsAction(p0);
       return this;
    }
    public final MenuItem setTitle(int p0){
       this.setTitle(this.n.a.getString(p0));
       return this;
    }
    public final MenuItem setTitle(CharSequence p0){
       l64 to;
       this.e = p0;
       this.n.p(false);
       if ((to = this.o) != null) {
          to.setHeaderTitle(p0);
       }
       return this;
    }
    public final MenuItem setTitleCondensed(CharSequence p0){
       this.f = p0;
       this.n.p(false);
       return this;
    }
    public final MenuItem setTooltipText(CharSequence p0){
       this.setTooltipText(p0);
       return this;
    }
    public final mw6 setTooltipText(CharSequence p0){
       this.r = p0;
       this.n.p(false);
       return this;
    }
    public final MenuItem setVisible(boolean p0){
       l64 tx = this.x;
       int i = tx & 0xf7;
       int i1 = 0;
       int i2 = (p0)? 0: 8;
       i2 = i2 | i;
       this.x = i2;
       if (tx != i2) {
          i1 = 1;
       }
       if (i1) {
          l64 tn = this.n;
          tn.h = true;
          tn.p(true);
       }
       return this;
    }
    public final String toString(){
       l64 te;
       String str = ((te = this.e) != null)? te.toString(): null;
       return str;
    }
}
