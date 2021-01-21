from django.db import models

# Create your models here.

class employee(models.Model):
    name = models.CharField(max_length=32,verbose_name='姓名')
    email = models.EmailField(verbose_name='邮箱')
    dep =models.ForeignKey(to='department',to_field='id',related_name='dep_related',on_delete=models.CASCADE)
    group =models.ManyToManyField(to='group')
    salary = models.DecimalField(max_digits=8,decimal_places=2)
    info = models.OneToOneField(to='employeeinfo',on_delete=models.CASCADE,null=True)

class department(models.Model):
    dep_name = models.CharField(max_length=32, verbose_name='部门名称')
    dep_script = models.CharField(max_length=60, verbose_name='备注')

class group(models.Model):
    group_name = models.CharField(max_length=32, verbose_name='团体名称')
    group_script = models.CharField(max_length=60, verbose_name='备注')


class employeeinfo(models.Model):
    phone = models.CharField(max_length=11)
    address = models.CharField(max_length=50)