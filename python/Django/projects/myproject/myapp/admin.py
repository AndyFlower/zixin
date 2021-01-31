from django.contrib import admin
from .models import UserInfo
# Register your models here.
#自定义数据模型在管理后台的显示样式
class UserInfoAdmin(admin.ModelAdmin):
    list_display = ('user','email') #list_display表示数据列表展示时，显示哪些字段。

admin.site.register(UserInfo,UserInfoAdmin) #admin.site.register()函数表示：如果只有一个参数，以默认方式在后台显示或管理数据表；如果有第二个参数，就按第二个参数传入的类定制的方式显示和管理数据表。
