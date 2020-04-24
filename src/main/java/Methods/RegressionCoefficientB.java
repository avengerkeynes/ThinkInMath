package Methods;
/*
 线性回归截距
 */
import Interface.DoubleCalculate;

public class RegressionCoefficientB implements DoubleCalculate {

    private double b=0;//截距
    private double u=0;//上算子
    private double d=0;//下算子
    public double Calculate(double[] x, double[] y) {
        if(x.length!=y.length)
        {
            System.out.println("变量不构成映射！");
        }
        else
            {
                double sumx=0;
                double sumx_2=0;
                double sumy=0;
                double sumxy=0;
                int n=x.length;
                for(int i=0;i<n;i++)
                {
                    sumx+=x[i];
                    sumx_2+=(x[i]*x[i]);
                    sumy+=y[i];
                    sumxy+=(x[i]*y[i]);
                }
                u=sumy*sumx_2-(sumx*sumy);
                d=n*sumx_2-(sumx*sumx);
                if(d==0)
                {
                    System.out.println("截距为无穷大，不存在！");
                }
                else
                    {
                        b=u/d;
                    }
            }
        return b;
    }
}
