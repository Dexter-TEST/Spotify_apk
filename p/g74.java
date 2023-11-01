package p.g74;
import android.view.Menu;
import p.uy;
import android.content.Context;
import p.iw6;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.view.MenuItem;
import p.e64;
import java.lang.CharSequence;
import p.l64;
import android.content.ComponentName;
import android.content.Intent;
import android.view.SubMenu;
import p.wh6;
import android.view.KeyEvent;
import java.lang.Object;
import p.mw6;

public class g74 extends uy implements Menu	// class@0016b4 from classes.dex
{
    public final iw6 d;

    public void g74(Context p0,iw6 p1){
       super(p0);
       if (p1 == null) {
          throw new IllegalArgumentException("Wrapped Object can not be null.");
       }
       this.d = p1;
       return;
    }
    public final MenuItem add(int p0){
       return this.e(this.d.add(p0));
    }
    public final MenuItem add(int p0,int p1,int p2,int p3){
       return this.e(this.d.add(p0, p1, p2, p3));
    }
    public final MenuItem add(int p0,int p1,int p2,CharSequence p3){
       return this.e(this.d.a(p0, p1, p2, p3));
    }
    public final MenuItem add(CharSequence p0){
       return this.e(this.d.a(0, 0, 0, p0));
    }
    public final int addIntentOptions(int p0,int p1,int p2,ComponentName p3,Intent[] p4,Intent p5,int p6,MenuItem[] p7){
       int i;
       g74 og74 = this;
       MenuItem[] menuItemArra = (i = p7)? new MenuItem[i.length]: null;
       int i1 = og74.d.addIntentOptions(p0, p1, p2, p3, p4, p5, p6, menuItemArra);
       if (menuItemArra != null) {
          int len = menuItemArra.length;
          for (int i2 = 0; i2 < len; i2 = i2 + 1) {
             i[i2] = this.e(menuItemArra[i2]);
          }
       }
       return i1;
    }
    public final SubMenu addSubMenu(int p0){
       return this.d.addSubMenu(p0);
    }
    public final SubMenu addSubMenu(int p0,int p1,int p2,int p3){
       return this.d.addSubMenu(p0, p1, p2, p3);
    }
    public final SubMenu addSubMenu(int p0,int p1,int p2,CharSequence p3){
       return this.d.addSubMenu(p0, p1, p2, p3);
    }
    public final SubMenu addSubMenu(CharSequence p0){
       return this.d.addSubMenu(0, 0, 0, p0);
    }
    public final void clear(){
       uy tb;
       if ((tb = this.b) != null) {
          tb.clear();
       }
       if ((tb = this.c) != null) {
          tb.clear();
       }
       this.d.clear();
       return;
    }
    public final void close(){
       this.d.c(true);
    }
    public final MenuItem findItem(int p0){
       return this.e(this.d.findItem(p0));
    }
    public final MenuItem getItem(int p0){
       return this.e(this.d.getItem(p0));
    }
    public final boolean hasVisibleItems(){
       return this.d.hasVisibleItems();
    }
    public final boolean isShortcutKey(int p0,KeyEvent p1){
       return this.d.isShortcutKey(p0, p1);
    }
    public final boolean performIdentifierAction(int p0,int p1){
       return this.d.performIdentifierAction(p0, p1);
    }
    public final boolean performShortcut(int p0,KeyEvent p1,int p2){
       return this.d.performShortcut(p0, p1, p2);
    }
    public final void removeGroup(int p0){
       if (this.b == null) {
       }else {
          int i = 0;
          while (true) {
             uy tb = this.b;
             if (i < tb.c) {
                if (tb.h(i).getGroupId() == p0) {
                   this.b.i(i);
                   i = i - 1;
                }
                i = i + 1;
             }
          }
       }
       this.d.removeGroup(p0);
       return;
    }
    public final void removeItem(int p0){
       if (this.b == null) {
       }else {
          int i = 0;
          while (true) {
             uy tb = this.b;
             if (i < tb.c) {
                if (tb.h(i).getItemId() == p0) {
                   this.b.i(i);
                   break ;
                }else {
                   i = i + 1;
                }
             }
          }
       }
       this.d.removeItem(p0);
       return;
    }
    public final void setGroupCheckable(int p0,boolean p1,boolean p2){
       this.d.setGroupCheckable(p0, p1, p2);
    }
    public final void setGroupEnabled(int p0,boolean p1){
       this.d.setGroupEnabled(p0, p1);
    }
    public final void setGroupVisible(int p0,boolean p1){
       this.d.setGroupVisible(p0, p1);
    }
    public final void setQwertyMode(boolean p0){
       this.d.setQwertyMode(p0);
    }
    public final int size(){
       return this.d.size();
    }
}
