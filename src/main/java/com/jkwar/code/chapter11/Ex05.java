package com.jkwar.code.chapter11;

import edu.princeton.cs.algs4.StdOut;
import java.util.Scanner;

/**
 * 基础编程模型第五题
 */
public class Ex05 {
  public static void main(String[] args) {
    double x, y;
    Scanner sc = new Scanner(System.in);
    x = sc.nextDouble();
    y = sc.nextDouble();
    StdOut.println(x > 0 && x < 1 && y > 0 && y < 1);
  }
}
