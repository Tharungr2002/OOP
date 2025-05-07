package com.OOP.Static;
// class test {
//    String name;
//    test(String name) {
//        this.name = name;
//    }
//}
public class Innerclass {

    static class test {
        String name;
        test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        test obj = new test("tharun");
        test obj2 = new test ("rfvnr");
        System.out.println(obj.name + " " + obj2.name);

        System.out.println(obj);
    }
}
