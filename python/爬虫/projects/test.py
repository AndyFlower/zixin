import re
str1 = '你好$$$我正在学Python@#@#现在需要&%&%&修改字符串'
str2 = re.sub('[$@#&%]+', ' ' ,str1)
print (str2)