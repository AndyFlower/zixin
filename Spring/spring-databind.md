# 数据转换

SpringMVC封装自定义类型对象的时候？

javaBean要和页面提交的数据进行一一绑定？

- 页面提交的所有数据都是字符串

牵扯到以下操作：

- 数据绑定期间的数据类型转换` String`-->`Integer`
- 数据绑定期间的数据格式化问题  2017-12-15---->`Date`

- 数据校验
  - 前端校验
  - 后端校验

WebDataBinder：数据绑定器负责数据绑定工作

ConversionService组件：负责数据格式化校验

bindingResult：负责处理校验结果