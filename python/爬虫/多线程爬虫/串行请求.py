import requests
import time
link_list = []

with open('most.txt') as file:
    file_list = file.readlines()
    for each in file_list:
        link = each.split()[1]
        link = link.replace('\n','')
        link_list.append(link)
    start = time.time()
    for eachone in link_list:
        try:
            r = requests.get(eachone)
            print(r.status_code,eachone)
        except Exception as e:
            print('Error:',e)
    end = time.time()
    print('串行时间：',end-start)