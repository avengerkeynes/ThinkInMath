package Methods;

import Interface.SimpleCalculate;

/*
* 峰度
* */
public class Kurtosis implements SimpleCalculate {
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
            u+=Math.pow((x[i]-ave),4);
        }
        u=u/x.length;

        for(int i=0;i<x.length;i++)
        {
            d+=Math.pow((x[i]-ave),2);
        }
        d=d/x.length;
        d=Math.pow(d,2);

        double g=u/d-3;
        return g;
    }
}
