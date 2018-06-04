package com.jkwar.code.chapter11;

import edu.princeton.cs.algs4.StdOut;
import java.util.Scanner;

/**
 * 基础编程模型第三题
 */
public class Ex03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if (a==b&&b==c){
      StdOut.println("equal");
    }else{
      StdOut.println("not equal");
    }
  }
}
