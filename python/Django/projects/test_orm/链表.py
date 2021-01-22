#定义节点类Node
class Node:
    """
    data:节点保存的数据
    _next:保存下一个节点对象
    """
    def __init__(self,data,pnext=None):
        self.data=data
        self._next = pnext
        self.head=self
        self.length=1

    def __repr__(self):
        """
        用来定义Node的字符输出
        print用于输出data
        :return:
        """
        print(str(self.data))

    #链表是否为空。
    def isEmpty(self):
        return (self.length ==0)

    #链表末尾增加一个节点
    def append(self,dataOrNode):
        item = None
        if isinstance(dataOrNode ,Node):
            item = dataOrNode
        else:
            item =Node(dataOrNode)
        if not self.head:
            self.head = item
            self.length +=1
        else:
            node = self.head
            while node._next:
                node = node._next
            node._next=item
            self.length +=1

    #delete()删除一个节点
    def delete(self,index):
        if self.isEmpty():
            print('this chain table is empty')
            return
        if index <0 or index >=self.length:
            print('out of index')
            return
        if index ==0:
            self.head = self.head._next
            self.length -=1
            return
        j = 0;
        node = self.head
        prev = self.head
        while node._next and j<index:
            prev = node
            node = node._next
            j+=1
        if j== index:
            prev._next = node._next
            self.length-=1

    #修改一个节点
    def update(self,index,data):
        if self.isEmpty() or index <0 or index >=self.length:
            print('error:out of index')
            return
        j=0
        node = self.head
        while node._next and j<index:
            node = node._next
            j+=1

        if j ==index:
            node.data=data

    #getItem()查找一个节点
    def getItem(self,index):
        if self.isEmpty() or index<0 or index>=self.length:
            print('out of range')
            return
        j=0
        node = self.head
        while node._next and j<index:
            node = node._next
            j+=1
        return node.data
    #getIndex()查找一个节点的索引
    def getIndex(self,data):
        j = 0;
        if self.isEmpty():
            print('this chain is empty')
            return
        node = self.head
        while node:
            if node.data == data:
                return j
            node = node._next
            j+=1
        if j == self.length:
            print('%s not found' %str(data))
            return

    #insert()插入一个新的节点
    def insert(self,index,dataOrNode):
        if self.isEmpty():
            print('this chain table is empty')
            return
        if index <=0 or index>=self.lenth:
            print('out of range')
            return
        item = None
        if isinstance(dataOrNode,Node):
            item = dataOrNode
        else:
            item =Node(dataOrNode)
        if index == 0 :
            item._next = self.head
            self.head = item
            self.length +=1
            return
        j = 0
        node = self.head
        prev = self.head
        while node._next  and j<index:
            prev = node
            node = node._next
            j+=1
        if j == index:
            item._next=node
            prev._next=item
            self.length+=1
    #清空链表
    def clear(self):
        self.head=Node
        self.length =0
node = Node(2)
node.append(3)
print(node._next.data)