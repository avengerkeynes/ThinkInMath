package Methods;

import Interface.SimpleCalculate;

/*
* 平均数
* */
public class Average implements SimpleCalculate {
    public double Calculate(double[] x)
    {
        double t=0;
        for(int i=0;i<x.length;i++)
        {
            t=t+x[i];
        }
            t=t/x.length;
            return t;
    }
}
