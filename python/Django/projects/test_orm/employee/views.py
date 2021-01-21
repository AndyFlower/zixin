from django.shortcuts import render

# Create your views here.
from django.shortcuts import render,redirect,HttpResponse
from .models import employee,department,group,employeeinfo
def list_dep_old(request):
    dep_list = department.objects.all();
    return render(request, 'test_orm_old/list_dep_old.html', {'dep_list': dep_list})

def add_dep_old(request):
    if request.method=='POST':
        dep_name=request.POST.get('dep_name') #request.POST.get()函数中的参数就是HTML文件中<input>标签的name属性
        dep_script=request.POST.get('dep_script')
        if dep_name.strip()=='':
            return render(request,'test_orm_old/add_dep_old.html',{'error_info':'部门名称不能为空'})
        try:
            p=department.objects.create(dep_name=dep_name,dep_script=dep_script);
            return redirect('/test_orm_old/list_dep_old/')#重新定向到部门列表页面
        except Exception as e:
            return  render(request,'test_orm_old/add_dep_old.html',{'error_info':'输入名称重复或信息有错误'})
        finally:
            pass
    return render(request,'test_orm_old/add_dep_old.html') #如果判断出不是POST请求，表示当前用户是第一次请求增加部门页面

def del_dep_old(request,dep_id):
    dep_object = department.objects.get(id=dep_id) ## 通过get()函数取得一条记录
    dep_object.delete() ## 删除部门记录
    return redirect('/test_orm_old/list_dep_old')

def edit_dep_old(request,dep_id):
    if request.method=='POST':
        id = request.POST.get('id');
        dep_name=request.POST.get('dep_name')
        dep_script=request.POST.get('dep_script')
        dep_object =department.objects.get(id=id);
        dep_object.dep_name=dep_name
        dep_object.dep_script=dep_script
        dep_object.save()
        return redirect('/test_orm_old/list_dep_old/')
    else:
        dep_object=department.objects.get(id=id)
        return render(request,'test_orm_old/edit_dep_old.html',{'department':dep_object})

def list_group_old(request):
    group_list=group.objects.all();
    return render(request,'test_orm_old/list_group_old.html',{'group_list':group_list})

def add_group_old(request):
    if request.method=='POST':
        group_name = request.POST.get('group_name')
        group_script=request.POST.get('group_script')
        if group_name.strip()=='':
            return  render(request,'test_orm_old/add_group.html',{'error_info':'团体名称不能为空'})
        try:
            group.objects.create(group_name=group_name,group_script=group_script)
            return  redirect('/test_orm_old/list_group_old/')
        except Exception as e:
            return render(request,'test_orm_old/add_group_old.html',{'error_info':'输入名称重复或者有误'})
        finally:
            pass

    return render(request,'test_orm_old/add_group_old.html')

def del_group_old(request,group_id):
    group_object=group.objects.get(id=group_id)
    group_object.delete();
    return redirect('/test_orm_old/list_group_old/')

def edit_gtoup_old(request,group_id):
    if request.method=='POST':
        id =request.POST.get('id')
        group_name=request.POST.get('group_name')
        group_script=request.POST.get('group_script')
        group_object = group.objects.get(id=id)
        group_object.group_name=group_name
        group_object.group_script=group_script
        group_object.save()
        return redirect('/test_orm_old/list_group_old/')
    else:
        group_object=group.objects.get(id=group_id)
        return  render(request,'test_orm_old/edit_group_old.html',{'group':group_object})


def list_employeeinfo_old(request):
    info_list = employeeinfo.objects.all();
    return render(request,'test_orm_old/list_employeeinfo_old.html',{'info_list':info_list})

def add_employeeinfo_old(request):
    if request.method=='POST':
        phone=request.POST.get('phone')
        address = request.POST.get('address')
        if phone.strip()=='':
            return render(request,'test_orm_old/add_employeeinfo_old.html',{'error_info':'电话号码不能为空'})
        try:
            employeeinfo.objects.create(phone=phone,address=address)
            return redirect('/test_orm_old/list_employeeinfo_old/')
        except Exception as e:
            return  render(request,'test_orm_old/add_employeeinfo_old.html',{'error_info':'信息有误'})
        finally:
            pass
    return  render(request,'test_orm_old/add_employeeinfo_info.html')


def del_employeeinfo_old(request,info_id):
    info_object = employeeinfo.objects.get(id=info_id)
    info_object.delete()
    return  redirect('/test_orm_old/list_employeeinfo_old/')


def edit_employeeinfo_old(request,info_id):
    if request.method == 'POST':
        id = request.POST.get('id')
        phone = request.POST.get('phone')
        address = request.POST.get('address')
        info_object = employeeinfo.objects.get(id=id)
        info_object.phone = phone
        info_object.address = address
        info_object.save()
        return redirect('/test_orm_old/list_employeeinfo_old/')
    else:
        info_object = employeeinfo.objects.get(id=info_id)
    return render(request, 'test_orm_old/edit_employeeinfo_old.html', {'info': info_object})

def list_employee_old(request):
    emp = employee.objects.all()
    return render(request, 'test_orm_old/list_employee_old.html', {'emp_list': emp})

def delete_employee_old(request,emp_id):
    emp = employee.objects.get(id=emp_id)
    # 删除记录对象emp.delete()
    return redirect('/test_orm_old/list_employee_old')


def add_employee_old(request):
    if request.method == "POST":
        name = request.POST.get("name")
        email = request.POST.get("email")
        dep = request.POST.get("dep")
        info = request.POST.get("info")
        salary = request.POST.get("salary")
        # 取得多个值
        groups=request.POST.getlist("group")
        new_emp=employee.objects.create(name=name,email=email,salary=salary,dep_id=dep,info_id=info)
        # 给多对多键字段赋值
        new_emp.group.set(groups)
        return redirect('/test_orm_old/list_employee_old/')
        dep_list=department.objects.all()
        group_list=group.objects.all()
        info_list = employeeinfo.objects.all()
        return render(request,'test_orm_old/add_employee_old.html',{'dep_list':dep_list,'group_list':group_list,'info_list':info_list})


def edit_employee_old(request,emp_id):
    if request.method == "POST":
        id = request.POST.get('id')
        name = request.POST.get("name")
        email = request.POST.get("email")
        dep = request.POST.get("dep")
        info = request.POST.get("info")
        groups = request.POST.getlist("group")
        emp = employee.objects.get(id=id)
        emp.name = name
        emp.email = email
        emp.dep_id = dep
        emp.info_id = info
        emp.group.set(groups)
        emp.save()
        return redirect('/test_orm_old/list_employee_old/')
    emp = employee.objects.get(id=emp_id)
    dep_list = department.objects.all()
    group_list = group.objects.all()
    info_list = employeeinfo.objects.all()
    return render(request, 'test_orm_old/edit_employee_old.html',
                      {'emp': emp, 'dep_list': dep_list, 'group_list': group_list, 'info_list': info_list})


def test_foreign(request):
    emp = employee.objects.get(id=16)
    dep_name = emp.dep.dep_name
    dep_obj = department.objects.get(id=6)
    emp_list = dep_obj.employee_set.all() #通过“表名_set”进行反向查询
    emp_names = [emp.name for emp in emp_list]
    return HttpResponse("1.正向关联：员工名称：{0},所在部门名称:{1} <br> 2.反向查找：部门名称:{2},部门员工:{3}".format(emp.name, dep_name, dep_obj.dep_name,
                                                                               emp_names))