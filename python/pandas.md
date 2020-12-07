## pandas数据分析实战

### pandas常用数据类型

#### 一维数组与常用操作

Series是pandas提供的一维数组，由索引和值两部分组成，是一个类似于字典的结构。其中值的类型可以不同，如果在创建时没有明确指定索引，则会自动使用从0开始的非负整数作为索引。

```python
# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 16:05:19 2020

@author: sangliping
"""

import pandas as pd
import matplotlib.pyplot as plt
# 设置输出结果列对齐
pd.set_option('display.unicode.ambiguous_as_wide',True)
pd.set_option('display.unicode.east_asian_width',True)
#设置创建从0开始的非负整数索引
s1 = pd.Series(range(1,20,5))
#使用字典创建Series 使用字典的键作为索引
s2 = pd.Series({'语文':90,'数学':92,'物理':87,'化学':92,'Python':100})

#修改指定索引对应的值
s1[3]=-17
s2['语文']=99
print('s1的原始数据'.ljust(20,'='))
print(s1)
print('s1的原始数据求绝对值'.ljust(20,'='))
print(abs(s1))
print('s1的所有值加上5'.ljust(20,'='))
print(s1+5)
print('s1的每行索引前面的数字加2'.ljust(20,'='))
print(s1.add_prefix(2))

print('s2原始数据'.ljust(20,'='))
print(s2)
print('s2数据的直方图'.ljust(20,'='))
s2.hist()
plt.show()

print(s2.add_suffix('_张三'))

print('s2的最大值的索引'.ljust(20,'='))
print(s2.argmax())

print('测试s2的值是否在指定区间内'.ljust(20,'='))
print(s2.between(90,94,inclusive=True))
print('查看s2中90以上的分数'.ljust(20,'='))
print(s2[s2>90])
print('查看s2中大于中值的数据'.ljust(20,'='))
print(s2[s2>s2.median()])

print('查看s2的中值'.ljust(20,'='))
print(s2.median())
print('查看s2中最小的两个值'.ljust(20,'='))
print(s2.nsmallest(2))

#两个等长的Series对象之间可以进行四则运算和幂运算
#只对两个Series对象中都有的索引对应的值进行计算
#非共同索引对应的值为控制NaN
print('两个Series对象相加'.ljust(20,'='))
print(pd.Series(range(5))+pd.Series(range(5,10)))

#pipe()方法可以实现函数链式调用的功能
print('每个值的平方对5的余数'.ljust(20,'='))
print(pd.Series(range(5)).pipe(lambda x,y,z:(x**y)%z,2,5))

print('每个值加3之后再乘以3'.ljust(20,'='))
print(pd.Series(range(5)).pipe(lambda x:x+3).pipe(lambda x:x*3))

# apply方法用来对Series对象的值进行函数运算
print('每个值加3'.ljust(20,'='))
print(pd.Series(range(5)).apply(lambda x:x+3))

print('标准差 无偏方差  无偏标准差'.ljust(20,'='))
print(pd.Series(range(5)).std())
print(pd.Series(range(5)).var())
print(pd.Series(range(5)).sem())

print('查看是否存在等价于Ture的值'.ljust(20,'='))
print(any(pd.Series([3,0,True])))

print('查看是否所有值都等于True'.ljust(20,'='))
print(all(pd.Series([3,0,True])))
```

#### 时间序列与常用操作

- date_range():指定日期时间的起始和结束范围、时间间隔、数据数量等参数

- ```python
  def date_range(
      start=None, #起时间
      end=None,   #截止时间
      periods=None, #要生成的数据数量
      freq=None, #时间间隔
      tz=None,
      normalize=False,
      name=None,
      closed=None,
      **kwargs,
  )
  ```

  

```python
# -*- coding: utf-8 -*-
"""
Created on Thu Dec  3 16:54:10 2020

@author: sangliping
"""

import pandas as pd
# start指定起始日期 end指定结束日期 perods指定生成的数据量
#freq指定时间间隔 D表示天 W表示周H表示小时 M表示月末最后一天 MS表示月初第一天 T表示分钟 Y表示年末最后一天 YS表示年初第一天

print('间隔5天'.ljust(30,'='))
print(pd.date_range(start='20201001',end='20201203',freq='5D'))
 

print('间隔1周'.ljust(30,'='))
print(pd.date_range(start='20201001',end='20201203',freq='W'))
print('间隔2天 5个数据'.ljust(30,'='))
#ValueError: Of the four parameters: start, end, periods, and freq, exactly three must be specified
print(pd.date_range(start='20201001',periods=5,freq='2D'))
print('间隔3小时 8个数据'.ljust(30,'='))
print(pd.date_range(start='20201001',periods=8,freq='3H'))
print('3:00开始 间隔1分钟 12个数据'.ljust(30,'='))
print(pd.date_range(start='202010010300',periods=12,freq='T'))
print('每隔一月，月末最后一天'.ljust(30,'='))
print(pd.date_range(start='20201010',end='20201231',freq='M'))
print('每隔一年，6个数据，年末最后一天'.ljust(30,'='))
print(pd.date_range(start='20200101',periods=6,freq='A'))

print('间隔1年，6个数据，年初第一天'.ljust(30,'='))
print(pd.date_range(start='20200101',periods=6,freq='AS'))

#使用日期时间做索引，创建Series对象
data = pd.Series(index=pd.date_range(start='20200101',periods=24,freq='H'),data=range(24))
print('前5条数据'.ljust(30,'='))
print(data[:5])
print('3分钟重采样，计算均值'.ljust(30,'='))
print(data.resample('3H').mean())
print('5分钟重采样，求和'.ljust(30,'='))
print(data.resample('5H').sum())
print('所有日期替换为第二天'.ljust(30,'='))
data.index = data.index+pd.Timedelta('1D')
print(data[:5])
print('查看指定日期是周几'.ljust(20,'='))
#print(pd.Timestamp('20201204').weekday_name) 这个函数和pandas版本有关 
print('查看指定日期时间所在年是否为闰年'.ljust(30,'='))
print(pd.Timestamp('202012040800').is_leap_year)
print('查看指定日期所在的季度和月份'.ljust(30,'='))
day =pd.Timestamp('20201201')
print(day.quarter,day.month)
print('转换为Python的日期时间对象'.ljust(30,'='))
print(day.to_pydatetime())
```

#### 二维数组DataFrame

每个DataFrame对象可以看作一个二维表格，由索引（index）、列名（columns）和值（values）三部分组成.

![image-20201204092759677](\images\image-20201204092759677.png)

扩展库pandas支持使用多种形式创建DataFrame结构，也支持使用read_csv()、read_excel()、read_json()、read_hdf()、read_html()、read_gbq()、read_pickle()、read_sql_table()、read_sql_query()等函数从不同的数据源读取数据创建DataFrame结构，同时也提供对应的to_excel()、to_csv()等系列方法将数据写入不同类型的文件。

```python
def __init__(
        self,
        data=None,
        index: Optional[Axes] = None,
        columns: Optional[Axes] = None,
        dtype: Optional[Dtype] = None,
        copy: bool = False,
    ): #这是dataFrame的初始化定义
```

```python
# -*- coding: utf-8 -*-
"""
Created on Fri Dec  4 09:28:35 2020

@author: sangliping
"""

import numpy as np;
import pandas as pd;

#设置输出结果列对齐
pd.set_option('display.unicode.ambiguous_as_wide', True)
pd.set_option('display.unicode.east_asian_width',True)

#在[1,20]区间上生成5行3列15个随机数 使用index参数指定索引，columns参数指定每列标题
df = pd.DataFrame(data=np.random.randint(1,20,(5,3)),index=range(5),columns=['A','B','C'])
print(df)
print('='*20)

#模拟2019年7月15日某超市熟食、化妆品、日用品每小时的销量
#使用时间序列作为索引
df = pd.DataFrame(data=np.random.randint(5,15,(13,3)),index=pd.date_range(start='202012040900',end='202012042100',freq='H'),columns=['熟食','化妆品','日用品'])
print(df)
print('='*20)

#模拟考试成绩，使用人名字符串作为索引 Constructing DataFrame from a dictionary.
df = pd.DataFrame({'语文':[87,79,67,92],'数学':[93,89,80,77],'英语':[90,80,70,75]},index=['张三','李四','王五','赵六'])
print(df)
print('='*20)

#自动对B列数据进行扩充，使其和A列数据一样多
df = pd.DataFrame({'A':range(5,10),'B':3})
print(df)
```

### DataFrame数据处理与分析实战

#### 读取Excel文件中的数据

```python
def read_excel(
    io, #要读取的文件
    sheet_name=0,
    header=0,
    names=None,
    index_col=None,
    usecols=None, #usecols用来指定要读取的列的索引或名字
    squeeze=False,
    dtype=None,
    engine=None,
    converters=None,
    true_values=None,
    false_values=None,
    skiprows=None,
    nrows=None,
    na_values=None,
    keep_default_na=True,
    na_filter=True,
    verbose=False,
    parse_dates=False,
    date_parser=None,
    thousands=None,
    comment=None,
    skipfooter=0,
    convert_float=True,
    mangle_dupe_cols=True,
):

```

```python
# -*- coding: utf-8 -*-
"""
Created on Fri Dec  4 09:53:14 2020

@author: sangliping
"""

#读取Excel中的数据
import pandas as pd;
#设置输出结果列对齐
pd.set_option('display.unicode.ambiguous_as_wide', True)
pd.set_option('display.unicode.east_asian_width',True)
# 读取工号、姓名、时段、交易额这4列数据，使用默认索引
df = pd.read_excel(r'营业额数据.xlsx',usecols=['工号','姓名','时段','交易额'])
# 输出前10行数据
print(df[:10],end='\n\n')

# 读取第一个worksheet中所有列 跳过1 3 5 行，指定下标为1 的列中数据为DataFrame的行索引标签
df = pd.read_excel(r'营业额数据.xlsx',skiprows=[1,3,5],index_col=1)
print(df[:10],end='\n\n')
```

#### 筛选符合特定条件的数据

使用下标和切片访问指定行与列的数据,还可以使用布尔数组作为下标访问符合特定条件的数据。另外，DataFrame结构还提供了loc、iloc、at、iat等访问器来访问指定的数据。其中，iloc和iat使用整数来指定行、列的下标，而loc和at使用标签来指定要访问的行和列。

```python
# -*- coding: utf-8 -*-
"""
Created on Fri Dec  4 10:03:25 2020

@author: sangliping
"""

#读取Excel中的数据
import pandas as pd;
#设置输出结果列对齐
pd.set_option('display.unicode.ambiguous_as_wide', True)
pd.set_option('display.unicode.east_asian_width',True)
# 读取工号、姓名、时段、交易额这4列数据，使用默认索引
df = pd.read_excel(r'营业额数据.xlsx')
print('下标在[5,10]区间的行'.ljust(20,'='))
#对行进行切片 注意切片限定的是左闭右开区间
print(df[5:11])
#iloc使用整数做索引
print('索引为5的行'.ljust(20,'='))
print(df.iloc[5])
#iloc使用整数做索引
print('索引为3 5 10的行'.ljust(20,'='))
print(df.iloc[[3,5,10],:])
#行下标为3 5 10 列下标为0 1 4
print('行下标为3 5 10 列下标为0 1 4 '.ljust(20,'='))
print(df.iloc[[3,5,10],[0,1,4]])
print('查看指定的列前5行数据'.ljust(20,'='))
print(df[['姓名','时段','交易额']][:5])
print('查看前10行指定的列'.ljust(20,'='))
print(df[:10][['姓名','日期','柜台']])
print('下标为3 5 10的行的指定列'.ljust(20,'='))
# loc和at使用标签文本做索引
print(df.loc[[3,5,10],['姓名','交易额']])

print('行下标为3姓名列的值'.ljust(20,'='))
print(df.at[3,'姓名'])

print('交易额高于1700元的数据'.ljust(20,'='))
print(df[df['交易额']>1700])
print('交易总额'.ljust(20,'='))
print(df['交易额'].sum())
print('下午班的交易总额'.ljust(20,'='))
print(df[df['时段']=='14:00-21:00']['交易额'].sum())
print('张三下午班的情况'.ljust(20,'='))
print(df[(df.姓名=='张三')&(df.时段=='14:00-21:00')][:10])
print('日用品柜台销售总额'.ljust(20,'='))
print(df[df['柜台']=='日用品']['交易额'].sum())
print('张三和李四2人销售总额'.ljust(20,'='))
print(df[df['姓名'].isin(['张三','李四'])]['交易额'].sum())
print('交易额在指定范围内的记录'.ljust(20,'='))
print(df[df['交易额'].between(800,850)])
```

#### 查看数据特征和统计信息

查看数据的数量、平均值、标准差、最大值、最小值、四分位数等特征.

```python
# -*- coding: utf-8 -*-
"""
Created on Fri Dec  4 10:33:53 2020

@author: sangliping
"""

import pandas as pd;
#设置输出结果列对齐
pd.set_option('display.unicode.ambiguous_as_wide', True)
pd.set_option('display.unicode.east_asian_width',True)
df = pd.read_excel(r'营业额数据.xlsx')

print('查看交易额统计信息'.ljust(20,'='))
print(df['交易额'].describe())
print('查看交易额4分位数'.ljust(20,'='))
print(df['交易额'].quantile([0,0.25,0.5,0.75,1.0]))
print('查看交易额中值'.ljust(20,'='))
print(df['交易额'].median())
print('查看交易额最小的3条记录'.ljust(20,'='))
print(df.nsmallest(3,'交易额'))

print('查看交易额最大的5条记录'.ljust(20,'='))
print(df.nlargest(5,'交易额'))
print('最后一个日期'.ljust(20,'='))
print(df['日期'].max())
print('最小工号'.ljust(20,'='))
print(df['工号'].min())
print('第一个最小交易额的下标'.ljust(20,'='))
index = df['交易额'].idxmin()
print(index)
print('第一个最小交易额'.ljust(20,'='))
print(df.loc[index,'交易额'])
print('第一个最大交易额的行下标'.ljust(20,'='))
index = df['交易额'].idxmax()
print(index)
print('第一个最大交易额'.ljust(20,'='))
print(df.loc[index,'交易额'])
```

#### 按不同标准对数据排序

```python
  def sort_values(  # type: ignore[override] # NOQA # issue 27237
        self,
        by, #用来指定依据哪个或哪些列名进行排序，如果只有一列则直接写出列名，多列的话需要放到列表中；
        axis=0,
        ascending=True, #ascending=True表示升序排序，ascending=False表示降序排序，如果ascending设置为包含若干True/False的列表（必须与by指定的列表长度相等），可以为不同的列指定不同的顺序；
        inplace=False,
        kind="quicksort",
        na_position="last", #指定把缺失值放在最前面（na_position='first'）还是最后面（na_position='last'）
        ignore_index=False,
        key: ValueKeyFunc = None,
    ):
```

```python
 def sort_index(
        self,
        axis=0,
        level=None,
        ascending: bool = True,
        inplace: bool = False,
        kind: str = "quicksort",
        na_position: str = "last",
        sort_remaining: bool = True,
        ignore_index: bool = False,
        key: IndexKeyFunc = None,
    ):
```

```python
# -*- coding: utf-8 -*-
"""
Created on Fri Dec  4 11:09:26 2020

@author: sangliping
"""

import pandas as pd;
#设置输出结果列对齐
pd.set_option('display.unicode.ambiguous_as_wide', True)
pd.set_option('display.unicode.east_asian_width',True)
df = pd.read_excel(r'营业额数据.xlsx')

print('按交易额和工号降序排列'.ljust(20,'='))
print(df.sort_values(by=['交易额','工号'],ascending=False))

print('按交易额降序和工号升序排列'.ljust(20,'='))
print(df.sort_values(by=['交易额','工号'],ascending=[False,True]))
print('按工号升序排序'.ljust(20,'='))
print(df.sort_values(by='工号',na_position='last')[:10])
print('按列名升序排序'.ljust(20,"="))
#这里是汉字的Unicode编码排序
print(df.sort_index(axis=1,ascending=True)[:10])
```

#### 使用分组与聚合进行汇总

DataFrame结构支持使用groupby()方法根据指定的一列或多列的值进行分组，得到一个GroupBy对象。该GroupBy对象支持大量方法对列数据进行求和、求均值和其他操作，并自动忽略非数值列