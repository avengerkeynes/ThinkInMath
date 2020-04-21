package Methods;

import Interface.NtoNNCalculate;
/*
* 商
* */
import java.util.ArrayList;

public class StepQuotient implements NtoNNCalculate {
    public ArrayList<double[]> NtoNNCalculate(double[] x) {
        double Nonzero=1;
        for(int i=0;i<x.length;i++)
        {
            Nonzero=Nonzero*x[i];
        }
        ArrayList<double[]> y=new ArrayList<double[]>();
        if(Nonzero!=0){
            y.add(x);
            while(y.get(y.size()-1).length>1)
            {
                double[] t=y.get(y.size()-1);
                double[] tt=new double[t.length-1];
                for(int i=0;i<t.length-1;i++)
                {
                    tt[i]=t[i+1]/t[i];
                }
                y.add(tt);
            }
        }
        else
        {
            System.out.println("数列不可做商");
        }

        return y;
    }
}
