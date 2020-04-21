package Methods;

import Interface.SimpleCalculate;

/*
* 偏度
* */
public class Skewness implements SimpleCalculate {
    public double Calculate(double[] x) {
        double u=0;
        double d=0;
        double sum=0;
        for(int i=0;i<x.length;i++)
        {
            sum+=x[i];//和
        }
        double ave=sum/x.length;
        for(int i=0;i<x.length;i++)
        {
            u+=Math.pow(x[i]-ave,3);
        }
        u=u/3;

        for(int i=0;i<x.length;i++)
        {
            d+=Math.pow(x[i]-ave,2);
        }
        d=d/(x.length-1);
        d=Math.pow(d,1.5);
        double b=u/d;
        return b;
    }
}
