package com.github.lihongjie.algorithm.Fundamentals.BasicProgModel;

import com.github.lihongjie.algorithm.StdLib.StdOut;

public class Ex_1_1_07 {

    public static void main(String[] args)
    {
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .00001)
        {
            t = (9.0/t + t) / 2.0;
            StdOut.printf("%.5f\n", t);
        }
        
        // System.out.println('b' + 'c');
    }

}
