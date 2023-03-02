package com.codegym;

public class GenericStackClient {
    private static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("lăm");
        stack.push("bốn");
        stack.push("ba");
        stack.push("hai");
        stack.push("một");
        System.out.println("1.1 kích thước ngăn xếp sau thoa tác đẩy: " + stack.size());
        System.out.printf("1.2. các phần tử pop từ ngăn xếp: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. kích thước ngăn xếp sau thao tác pop : " + stack.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. kích thước ngăn xếp sau thao tác đẩy :" + stack.size());
        System.out.printf("2.2. các phần tư pop từ ngăn xếp :");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 kích thước ngăn xêp sau thao  tác pop : " + stack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. chồng số nguyên");
        stackOfIntegers();
        System.out.println("\n2. chồng dây");
        stackOfIStrings();
    }
}