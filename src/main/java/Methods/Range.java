package Methods;

import Interface.SimpleCalculate;

/*
* 极差
* */
public class Range implements SimpleCalculate {
    public double Calculate(double[] x) {
        double max=Double.MAX_VALUE;
        double min=Double.MIN_VALUE;
        for(int i=0;i<x.length;i++)
        {
            max=Math.max(max,x[i]);
            min=Math.min(min,x[i]);
        }
        return max-min;
    }
}
