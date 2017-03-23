package com.holy.create.factoryPattern;

/**
 * Created by houlin.jiang on 16-4-25.
 */
//定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。

public class FactoryDemo {
    public static void main(String[] args) {
        /**
         * 定义一个用于创建对象的接口，让子类决定实例化哪一个类。Factory Method 使一个类的实例化延迟到其子类。

         适用性：

         当一个类不知道它所必须创建的对象的类的时候。

         当一个类希望由它的子类来指定它所创建的对象的时候。

         当类将创建对象的职责委托给多个帮助子类中的某一个，并且你希望将哪一个帮助子类是代理者这一信息局
         */
        RealFactory factory = new RealFactory();

        Factory carFactory = factory.getFactory("car");
        carFactory.create();

        Factory computerFactory = factory.getFactory("computer");
        computerFactory.create();
    }
}
