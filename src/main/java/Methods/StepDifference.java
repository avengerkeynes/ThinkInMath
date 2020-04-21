package Methods;
/*
* 阶差
* */
import Interface.NtoNNCalculate;

import java.util.ArrayList;

public class StepDifference implements NtoNNCalculate {
    public ArrayList<double[]> NtoNNCalculate(double[] x)
    {
        ArrayList<double[]> y=new ArrayList<double[]>();
        y.add(x);
        while(y.get(y.size()-1).length>1)
        {
            double[] t=y.get(y.size()-1);
            double[] tt=new double[t.length-1];
            for(int i=0;i<t.length-1;i++)
            {
                tt[i]=t[i+1]-t[i];
            }
            y.add(tt);
        }
        return y;
    }
}
