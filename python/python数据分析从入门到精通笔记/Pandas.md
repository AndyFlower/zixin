## 一、什么是Pandas?

一个开源的Python类库：用于数据分析、数据处理、数据可视化。有如下几个特点：

- 高性能
- 容易使用的数据结构
- 容易使用的数据分析工具

很方便和其他类库一起使用：

- numpy:用于数学计算
- scikit-learn：用于机器学习

## 二、怎样下载安装pandas

1. 下载使用python类库集成安装包anaconda
2. pip install pandas

## 三、Pandas数据读取

Pandas需要先读取==表格类型==的数据，然后进行分析

| 数据类型      | 说明                            | Pandas读取方法 |
| ------------- | ------------------------------- | -------------- |
| csv  tsv  txt | 用逗号分隔，tab分割分纯文本文件 | pd.read_csv    |
| excel         | 微软xls或者xlsx文件             | pd.read_excel  |
| mysql         | 关系型数据库表                  | pd.read_sql    |

### 1.读取纯文本文件

#### 1.1 读取csv，使用默认的标题行、逗号分隔符

```python
import pandas as pd
fpath = "./datas/ml-latest-small/ratings.csv"
# 使用pd.read_csv读取数据
ratings = pd.read_csv(fpath)
# 查看前几行数据
ratings.head()
# 查看数据的形状，返回(行数、列数)
ratings.shape
# 查看列名列表
ratings.columns
# 查看索引列
ratings.index
# 查看每列的数据类型
ratings.dtypes
```

#### 1.2 读取txt文件，自己指定分隔符、列名

```python
fpath = "./datas/crazyant/access_pvuv.txt"
pvuv = pd.read_csv(
    fpath,
    sep="\t",
    header=None,
    names=['pdate', 'pv', 'uv']
)
```

### 2、读取excel文件

```python
fpath = "./datas/crazyant/access_pvuv.xlsx"
pvuv = pd.read_excel(fpath)
```

### 3、读取MySQL数据库

```python
import pymysql
conn = pymysql.connect(
        host='127.0.0.1',
        user='root',
        password='12345678',
        database='test',
        charset='utf8'
    )

```

## 四、Pandas数据结构

```python
import pandas as pd
import numpy as np
```

### 1.Series

Series是一种类似于一维数组的对象，它由一组数据（不同数据类型）以及一组与之相关的数据标签（即索引）组成。

#### 1.1 仅有数据列表即可产生最简单的Series

```python
s1 = pd.Series([1,'a',5.2,7])
# 左侧为索引，右侧是数据
s1
# 获取索引
s1.index
# 获取数据
s1.values
```

#### 1.2 创建一个具有标签索引的Series

```python
s2 = pd.Series([1, 'a', 5.2, 7], index=['d','b','a','c'])
s2
s2.index
```

#### 1.3 使用Python字典创建Series

```python
sdata={'Ohio':35000,'Texas':72000,'Oregon':16000,'Utah':5000}
s3=pd.Series(sdata)
s3
```

#### 1.4 根据标签索引查询数据

类似Python的字典dict

```python
s2
s2['a']
type(s2['a'])
s2[['b','a']]
type(s2[['b','a']]) #pandas.core.series.Series
```

### 2. DataFrame

DataFrame是一个表格型的数据结构

- 每列可以是不同的值类型（数值、字符串、布尔值等）
- 既有行索引index,也有列索引columns
- 可以被看做由Series组成的字典

#### 2.1 根据多个字典序列创建dataframe

```python
data={
        'state':['Ohio','Ohio','Ohio','Nevada','Nevada'],
        'year':[2000,2001,2002,2001,2002],
        'pop':[1.5,1.7,3.6,2.4,2.9]
    }
df = pd.DataFrame(data)
df
df.dtypes
df.columns
df.index
```

### 3. 从DataFrame中查询出Series

- 如果只查询一行、一列，返回的是pd.Series
- 如果查询多行、多列，返回的是pd.DataFrame

```python
df
```

#### 3.1 查询一列，结果是一个pd.Series

```python
df['year']
type(df['year']) #pandas.core.series.Series
```

#### 3.2 查询多列，结果是一个pd.DataFrame

```python
df[['year', 'pop']]
type(df[['year', 'pop']]) #pandas.core.frame.DataFrame
```

####  3.3 查询一行，结果是一个pd.Series

```python
df.loc[1]
type(df.loc[1]) #pandas.core.series.Series
```

#### 3.4 查询多行，结果是一个pd.DataFrame

```python
df.loc[1:3]
type(df.loc[1:3])
pandas.core.frame.DataFrame
```

## 五、Pandas查询数据

### Pandas查询数据的几种方法

1. df.loc方法，根据行、列的标签值查询
2. df.iloc方法，根据行、列的数字位置查询
3. df.where方法
4. df.query方法

.loc既能查询，又能覆盖写入，强烈推荐！

### Pandas使用df.loc查询数据的方法

1. 使用单个label值查询数据
2. 使用值列表批量查询
3. 使用数值区间进行范围查询
4. 使用条件表达式查询
5. 调用函数查询

### 注意

* 以上查询方法，既适用于行，也适用于列
* 注意观察降维dataFrame>Series>值

```python
import pandas as pd
```

### 0、读取数据

数据为北京2018年全年天气预报

```python
df = pd.read_csv("./datas/beijing_tianqi/beijing_tianqi_2018.csv")
df.head()
# 设定索引为日期，方便按日期筛选
df.set_index('ymd', inplace=True)
# 时间序列见后续，本次按字符串处理
df.index
df.head()
# 替换掉温度的后缀℃
df.loc[:, "bWendu"] = df["bWendu"].str.replace("℃", "").astype('int32')
df.loc[:, "yWendu"] = df["yWendu"].str.replace("℃", "").astype('int32')
df.dtypes
df.head()
```

### 1、使用单个label值查询数据

行或者列，都可以只传入单个值，实现精确匹配

```python
# 得到单个值
df.loc['2018-01-03', 'bWendu']
# 得到一个Series
df.loc['2018-01-03', ['bWendu', 'yWendu']]
```

### 2、使用值列表批量查询

```python
# 得到Series
df.loc[['2018-01-03','2018-01-04','2018-01-05'], 'bWendu']
# 得到DataFrame
df.loc[['2018-01-03','2018-01-04','2018-01-05'], ['bWendu', 'yWendu']]
```

### 3、使用数值区间进行范围查询

注意：区间既包含开始，也包含结束

```python
# 行index按区间
df.loc['2018-01-03':'2018-01-05', 'bWendu']
# 列index按区间
df.loc['2018-01-03', 'bWendu':'fengxiang']
# 行和列都按区间查询
df.loc['2018-01-03':'2018-01-05', 'bWendu':'fengxiang']
```

### 4、使用条件表达式查询

bool列表的长度得等于行数或者列数

```python
#简单条件查询，最低温度低于-10度的列表
df.loc[df["yWendu"]<-10, :]
# 观察一下这里的boolean条件
df["yWendu"]<-10
```

复杂条件查询，查一下我心中的完美天气

注意，组合条件用&符号合并，每个条件判断都得带括号

```python
## 查询最高温度小于30度，并且最低温度大于15度，并且是晴天，并且天气为优的数据
df.loc[(df["bWendu"]<=30) & (df["yWendu"]>=15) & (df["tianqi"]=='晴') & (df["aqiLevel"]==1), :]
```

### 5、调用函数查询

```python
# 直接写lambda表达式
df.loc[lambda df : (df["bWendu"]<=30) & (df["yWendu"]>=15), :]
# 编写自己的函数，查询9月份，空气质量好的数据
def query_my_data(df):
    return df.index.str.startswith("2018-09") & (df["aqiLevel"]==1)
    
df.loc[query_my_data, :]
```

