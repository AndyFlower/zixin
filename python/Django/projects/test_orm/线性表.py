class SeqList(object):
    def __init__(self,max = 8):
        self.max = max # 默认为8
        self.num = 0
        self.date = [None] *self.max
        # list()会默认创建八个元素大小的列表，num=0,并有链接关系
        #此处仅做练习用哦

    def is_empty(self):
        return self.num is 0

    def is_full(self):
        return self.num is self.max


    def __getitem__(self, key):
        if not isinstance(key ,int):
            raise TypeError
        if 0<=key<self.num:
            return  self.date[key]
        else:
            #表为空或者索引超出范围都会引发索引错误
            raise IndexError;

    def __setitem__(self, key, value):
        if not isinstance(key ,int):
            raise TypeError
        #只能访问列表里已有的元素，self.num=0时，一个都不能访问 self.num=1时，只能访问0
        if 0<=key <self.num:
            self.date[key] = value #该位置无元素会发生错误
        else:
            raise IndexError

    def clear(self):
        self.__init__()

    def count(self):
        return self.num

    def __len__(self):
        return self.num

    def append(self,value):
        if self.is_full():
            print('list is full')
            return
        else:
            self.date[self.num]=value
            self.num+=1

    def insert(self,key,value):
        if not isinstance(key,int):
            raise TypeError
        if key<0:
            raise IndexError
        if key>=self.num:
            self.append(value)
        else:
            for i in range(self.num,key,-1):
                self.date[i]=self.date[i-1]
            self.date[key]=value
            self.num += 1

    def pop(self,key=-1):
        if not isinstance(key,int):
            raise TypeError
        if self.num-1<0:
            raise IndexError('pop from empty list')
        elif key ==-1:
            self.num-=1
        else:
            for i in range(key,self.num-1):
                self.date[i]=self.date[i+1]
            self.num-=1

    def index(self,value,start=0):
        for i in range(start,self.num):
            if self.date[i] == value:
                return i

        raise ValueError('%d is not in the list' %value)

    def reverse(self):
        i,j=0,self.num-1
        while i<j:
            self.date[i] ,self.date[j]=self.date[j],self.date[i]
            i,j= i+1,j-1

if __name__ =='__main__':
    a = SeqList()
    print(a.date)
    print(a.is_empty())
    a.append(0)
    a.append(1)
    a.append(2)
    print(a.date)
    print(a.num)
    print(a.max)
    a.insert(1,6)
    print(a.date)
    a[1]=5
    print(a.date)
    print(a.count())
    print(a.index(2,1))
    t=1
    if t:
        a.pop(1)
        print(a.date)
        print(a.num)
    else:
        a.pop()
        print(a.date)
        print(a.num)
    print('---')
    print(len(a))
    a.reverse()
    print(a.date)
    print(a.is_full())
    a.clear()
    print(a.date)
    print(a.count())