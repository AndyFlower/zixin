from django.db import models #第一行代码导入models模块

# Create your models here.

class UserInfo(models.Model): #通过建立UserInfo类建立UserInfo数据表。
    user = models.CharField(max_length=32,verbose_name='姓名')
    email = models.EmailField(verbose_name='邮箱')

    def __str__(self): #__str__返回模型对象的描述
        return self.user