# ThinkInMath

### 基础统计
---
#### 接口
接口名|结构
--|:--
SimpleCalculate.java|单变量double数组x输入并以double数字输出
DoubleCalculate.java|双变量double数组x[] y[]输入并以double数字输出
NtoNCalculate.java|单变量double数组x输入并以double数组输出
NtoNNCalculate.java|单变量double数组x输入并以ArrayList<double[]>形式输出
---
#### 类
类名|实现功能|实现接口
--|:--:|--
Average.java|求平均数|SimpleCalculate
Var.java|求方差|SimpleCalculate
Dev.java|求标准差|SimpleCalculate
Cov.java|求协方差|DoubleCalculate
Corr.java|求相关系数|DoubleCalculate
CoefficientOfVariation.java|求变异系数|SimpleCalculate
Skewness.java|求样本偏度|SimpleCalculate
Kurtosis.java|求样本峰度|SimpleCalculate
Range.java|求极差|SimpleCalculate
RegressionCoefficientB.java|求线性回归截距|DoubleCalculate
RegressionCoeffientM.java|求线性回归斜率|DoubleCalculate
StepDifference.java|求阶差|NtoNNCalculate
StepQuotient.java|求商|NtoNNCalculate

```flow
st=>start: 开始
op=>operation: My Operation
cond=>condition: Yes or No?
e=>end
st->op->cond
cond(yes)->e
cond(no)->op
&```
