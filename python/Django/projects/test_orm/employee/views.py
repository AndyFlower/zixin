from django.shortcuts import render

# Create your views here.
from django.shortcuts import render,redirect,HttpResponse
from .models import employee,department,group,employeeinfo
def list_dep_old(request):
    dep_list = department.objects.all();
    return render(request, 'test_orm_old/list_dep_old.html', {'dep_list': dep_list})