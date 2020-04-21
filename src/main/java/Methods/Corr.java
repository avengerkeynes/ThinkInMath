package Methods;
/*
* 相关系数
* */
import Interface.DoubleCalculate;
import org.apache.commons.math3.stat.correlation.PearsonsCorrelation;

public class Corr implements DoubleCalculate {
    public double Calculate(double[] x, double[] y) {
        PearsonsCorrelation personCorrelation=new PearsonsCorrelation();
        double corr=personCorrelation.correlation(x, y);
        return corr;
    }
}
