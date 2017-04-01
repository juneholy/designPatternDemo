package com.holy.test;


import com.holy.test.thread.TestYieldThread;

/**
 * Created by houlin.jiang on 16-6-3.
 */
public class TestJava {
    public static synchronized boolean isA() {
        return a;
    }

    public static synchronized void setA(boolean a) {

        TestJava.a = a;
    }

    private static boolean a;

    public static void main(String[] args) {
        TestYieldThread thread1 = new TestYieldThread("1");
        TestYieldThread thread2 = new TestYieldThread("2");
        TestYieldThread thread3 = new TestYieldThread("3");
        TestYieldThread thread4 = new TestYieldThread("4");
        TestYieldThread thread5 = new TestYieldThread("5");
        thread1.setPriority(1);
        thread2.setPriority(4);
        thread3.setPriority(2);
        thread4.setPriority(2);
        thread5.setPriority(2);
        thread3.run();
        thread2.start();
        thread1.start();
        thread4.start();
        thread5.start();

    }

    private static void test6() {
        try {
            throw new ExceptionB();
        } catch (ExceptionB e) {
            System .out.println("this is B");
        } catch (ExceptionA e) {
            System .out.println("this is A");
        }catch (Exception e) {
            System .out.println("this is father");
        }
    }

    public static class ExceptionA extends Exception {

    }

    public static class ExceptionB extends ExceptionA {

    }
    private static int test5() {
        int a =0;
        try {
            a = 1;
            throw new Exception("test Exception ");
        } catch (Exception e) {
            a =2;
            System .out.println("this is catch");
            e.printStackTrace();
        } finally {
            a =3 ;
            System .out.println("this is finally");
        }
        return a;
    }

    private static void test4() {
        int c = 3;
        assert(c==2) :"c!=2";
    }

    private static void test3() {
        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program" + "ming";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s1.intern());
    }

    private static void test2() {
        Student student = new Student();
        student.no = 1;
        student.sex = false;
        change(student);
        System.out.println(student.no + "    " +student.sex + "");
    }

    private static void test1() {
        Integer a = new Integer(3);
        Integer b = 3;
        int c = 3;
        System.out.println(a == b);
        System.out.println(b == c);
        System.out.println(a == c);
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
        System.out.println(f1 == f2);
        System.out.println(f3 == f4);
    }

    private static void change(Student student) {
        student.no = 2;
        student.sex = true;
    }

    public static class Student{
        public Student() {
        }

        int no;
        boolean sex;
    }


    private static void yanghui(int m) {
        for(int i = 1;i < m; i++) {
            String st = "";
            int[] result = getNext(i);
            for(int j = 0;j < i; j++) {
                st += result[j] + "  ";
            }
            System.out.println(st);
            char a = '中';
        }
    }

    private static int[] getNext(int n) {
        int[] result = new int[n];
        for(int i = 0;i < n; i++) {
            if (i == 0 || i == n -1 ) {
                result[i] = 1;
            }else {
                result[i] = zuhe(n-1, i);
            }
        }
        return result;
    }

    private static int zuhe(int n, int i) {
        return jiecheng(n) / jiecheng(i)/jiecheng(n-i);
    }

    private static int jiecheng(int n) {
        int result = 1 ;
        for(int i = 1 ;i <= n ;i++ ){
            result *=i;
        }
        return result;
    }

    private static boolean checkID(String id) {
        if (id.length() != 15 && id.length() != 18) {
            return false;
        }

        if (id.length() == 15) {
            return true;
        } else {
            String checkNum = id.charAt(17) + "";
            int proviceCode ;
            int birthdayCode ;
            int idNum;
            try {
                proviceCode = Integer.parseInt(id.substring(0,6));
                birthdayCode = Integer.parseInt(id.substring(6,14));
                idNum = Integer.parseInt(id.substring(14,17));
            } catch (Exception e) {
                return false;
            }
            System.out.println("=======id ========" + proviceCode);
            System.out.println("=======id ========" + birthdayCode);
            System.out.println("=======id ========" + idNum);
            String[] codeMap = new String[]{"1","0","x","9","8","7","6","5","4","3","2"};
            int[] weight = new int[]{7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
            int sum = 0;
            for(int i = 0 ; i < id.length() - 1;i ++){
                int num = getNum(id,i);
                sum += weight[i] *num;
            }
            if (codeMap[sum%11].equals(checkNum)){
                return true;
            } else {
                return false;
            }
        }
    }

    private static int getNum(String id, int i) {
        try{
            return Integer.parseInt(id.charAt(i) +"");
        } catch (Exception e) {

        }
        return 0;
    }
}
