package Methods;

import Interface.SimpleCalculate;
/*
* 方差
* */
public class Var implements SimpleCalculate {
    public double Calculate(double[] x) {
        double t=0;
        for(int i=0;i<x.length;i++)
        {
            t+=x[i];
        }
        t=t/x.length;//平均数
        double var=0;
        for(int i=0;i<x.length;i++)
        {
            var+=(x[i]-t)*(x[i]-t);
        }
        var=var/(x.length-1);
        return var;
    }
}
