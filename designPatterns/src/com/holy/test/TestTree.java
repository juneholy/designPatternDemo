package com.holy.test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by houlin.jiang on 17-3-15.
 */
public class TestTree {

    public static class View{
        public View() {

        }

        List<View> child = new ArrayList<View>();
    }

    public static int getDepth(View view,int nowDepth) {
        if (view.child == null || view.child.size() == 0) {
            System.out.println(view + "dep =  " + nowDepth);
            return nowDepth;
        } else {
            int temp = ++nowDepth;
            for(int i = 0 ;i < view.child.size();i ++) {
                View child = view.child.get(i);
                int childdep = getDepth(child, nowDepth);
                if (temp  < childdep) {
                    temp = childdep;
                }
            }
            System.out.println(view + "dep =  " + temp);
            return temp;
        }
    }

    public static void main(String[] args) {
        View view0 = new View();
        View view1 = new View();
        View view2 = new View();
        View view3 = new View();

        List<View> list0 = new ArrayList<>();
        list0.add(view1);
        list0.add(view2);
        list0.add(view3);
        view0.child = list0;


        View view11 = new View();
        View view12 = new View();
        List<View> list1 = new ArrayList<>();
        list1.add(view11);
        list1.add(view12);
        view1.child = list1;

        View view111 = new View();
        List<View> list11 = new ArrayList<>();
        list11.add(view111);
        view11.child = list11;
        View view1111 = new View();
        List<View> list1111 = new ArrayList<>();
        list1111.add(view1111);
        view111.child = list1111;
        View view121 = new View();
        List<View> list12 = new ArrayList<>();
        list12.add(view121);
        view12.child = list12;
        View view21 = new View();
        List<View> list2 = new ArrayList<>();
        list2.add(view21);
        view2.child = list2;
        System.out.println("++++++++++++" + getDepth(view0,0));



    }
}
