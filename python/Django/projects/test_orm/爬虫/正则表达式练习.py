# -*-  encoding=utf-8 -*-
import re
#提取出python
key="javapythonc++php"
re.findall('python',key)[0]
#####################################################################
#提取出hello world
key="hello world"
re.findall('(.*)',key)[0]

#####################################################################

#提取170

string = '我喜欢身高为170的女孩'

re.findall('\d+',string)

#####################################################################

#提取出http://和https://

key='http://www.baidu.com and https://boob.com'

re.findall('https?://',key)

#####################################################################

#提取出hello

key='lalalahellohahah' #输出hello

re.findall('<[Hh][Tt][mM][lL]>(.*)',key)

#####################################################################

#提取出hit.

key='bobo@hit.edu.com'#想要匹配到hit.

re.findall('h.*?\.',key)

#####################################################################

#匹配sas和saas

key='saas and sas and saaas'

re.findall('sa{1,2}s',key)