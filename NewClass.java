/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author VV
 */
public class NewClass {
    control c = new control();
    public static void main(String[] args) {
      thresholdBasedFloatsComparison(23605.9,23605.899999999998);
    }
    private static int thresholdBasedFloatsComparison(double f1,double f2)
{
    final double THRESHOLD = .00000000002;

 
    if (Math.abs(f1 - f2) < THRESHOLD)
        return 1;
    else
        return 0;
}
}
