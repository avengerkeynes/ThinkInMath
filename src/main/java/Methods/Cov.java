package Methods;
/*
* 协方差
* */
import Interface.DoubleCalculate;
import org.apache.commons.math3.stat.correlation.Covariance;

public class Cov implements DoubleCalculate {
    private boolean bias=false;
    public void setBias(boolean bias)
    {
        this.bias=bias;
    }
    public double Calculate(double[] x, double[] y) {
        double cov=new Covariance().covariance(x,y,bias);
        return cov;
    }
}
