package Methods;
/*
* 变异系数
* */
import Interface.SimpleCalculate;

public class CoefficientOfVariation implements SimpleCalculate {
    public double Calculate(double[] x) {
        double sum=0;
        for(int i=0;i<x.length;i++)
        {
            sum+=x[i];
        }
        double ave=sum/x.length;
        double var=0;
        for(int i=0;i<x.length;i++)
        {
            var+=Math.pow(x[i]-ave,2);
        }
        double d=Math.pow(var,0.5);
        double c=d/ave;
        return c;
    }
}
