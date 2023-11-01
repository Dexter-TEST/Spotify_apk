package p.ea7;
import java.util.AbstractList;
import java.lang.reflect.TypeVariable;
import java.lang.Class;
import java.util.Collection;
import java.lang.Iterable;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

public abstract class ea7	// class@00144f from classes.dex
{
    public static final TypeVariable[] a;
    public static final TypeVariable[] b;
    public static final TypeVariable[] c;
    public static final TypeVariable[] d;
    public static final TypeVariable[] e;
    public static final TypeVariable[] f;
    public static final TypeVariable[] g;
    public static final TypeVariable[] h;

    static {
       ea7.a = AbstractList.class.getTypeParameters();
       ea7.b = Collection.class.getTypeParameters();
       ea7.c = Iterable.class.getTypeParameters();
       ea7.d = List.class.getTypeParameters();
       ea7.e = ArrayList.class.getTypeParameters();
       ea7.f = Map.class.getTypeParameters();
       ea7.g = HashMap.class.getTypeParameters();
       ea7.h = LinkedHashMap.class.getTypeParameters();
    }
}
