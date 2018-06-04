package com.jkwar.code.chapter11;

import edu.princeton.cs.algs4.StdOut;

/**
 * 基础编程模型第六题
 */
public class Ex06 {
  public static void main(String[] args) {
    int f = 0;
    int g = 1;
    for (int i = 0; i <= 15; i++) {
      StdOut.println(f);
      f = f + g;
      g = f - g;
    }
  }
}
