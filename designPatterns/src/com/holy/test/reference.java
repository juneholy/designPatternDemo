package com.holy.test;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by houlin.jiang on 16-4-28.
 */
public class reference {

    /**
     * 强引用（strong reference）
     如：Object object=new Object（），object就是一个强引用了。当内存空间不足，Java虚拟机宁愿抛出OutOfMemoryError错误，使程序异常终止，也不会靠随意回收具有强引用的对象来解决内存不足问题。
     软引用（SoftReference）
     只有内存不够时才回收,常用于缓存；当内存达到一个阀值，GC就会去回收它；
     弱引用（WeakReference）
     弱引用的对象拥有更短暂的生命周期。在垃圾回收器线程扫描它 所管辖的内存区域的过程中，一旦发现了只具有弱引用的对象，不管当前内存空间足够与否，都会回收它的内存。

     虚引用（PhantomReference）
     "虚引用"顾名思义，就是形同虚设，与其他几种引用都不同，虚引用并不会决定对象的生命周期。如果一个对象仅持有虚引用，那么它就和没有任何引用一样，在任何时候都可能被垃圾回收。
     * @param args
     */
    public static void main(String[] args) {
        int length = 10;

        //创建length个MyObject对象的强引用
        Set<MyObject> a = new HashSet<MyObject>();
        for (int i = 0; i < length; i++) {
            MyObject ref = new MyObject("Hard_" + i);
            System.out.println("创建强引用：" + ref);
            a.add(ref);
        }
        //a=null;
        System.gc();

        //创建length个MyObject对象的软引用
        Set<SoftReference<MyObject>> sa = new HashSet<SoftReference<MyObject>>();
        for (int i = 0; i < length; i++) {
            SoftReference<MyObject> ref = new SoftReference<MyObject>(new MyObject("Soft_" + i));
            System.out.println("创建软引用：" + ref.get());
            sa.add(ref);
        }
        System.gc();
        //创建length个MyObject对象的弱引用
        Set<WeakReference<MyObject>> wa = new HashSet<WeakReference<MyObject>>();
        for (int i = 0; i < length; i++) {
            WeakReference<MyObject> ref = new WeakReference<MyObject>(new MyObject("Weak_" + i));
            System.out.println("创建弱引用：" + ref.get());
            wa.add(ref);
        }
        System.gc();
        //创建length个MyObject对象的虚引用
        ReferenceQueue<MyObject> rq = new ReferenceQueue<MyObject>();
        Set<PhantomReference<MyObject>> pa = new HashSet<PhantomReference<MyObject>>();
        for (int i = 0; i < length; i++) {
            PhantomReference<MyObject> ref = new PhantomReference<MyObject>(new MyObject("Phantom_" + i), rq);
            System.out.println("创建虚引用：" + ref.get());
            pa.add(ref);
        }
        System.gc();
    }


    static class MyObject {
        private String id;

        public MyObject(String id) {
            this.id = id;
        }

        public String toString() {
            return id;
        }

        public void finalize() {
            System.out.println("回收对象：" + id);
        }
    }

}

