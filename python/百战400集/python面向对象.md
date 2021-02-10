# 引子

你现在是一家游戏公司的开发人员，现在需要你开发一款叫做<人狗大战>的游戏，你就思考呀，人狗作战，那至少需要2个角色，一个是人， 一个是狗，且人和狗都有不同的技能，比如人拿棍打狗， 狗可以咬人，怎么描述这种不同的角色和他们的功能呢？

列下具体需求：

```
1.人狗大战，生成多条狗，多个人2.狗能咬人，人能打狗3.咬了或被打了都掉血
```

你搜罗了自己掌握的所有技能，写出了下面的代码来描述这两个角色

```
dog_attack_level = {
    "京巴":20,
    "藏獒":80,
    "平头哥":60
}
def dog(name,d_type):
    if d_type in dog_attack_level:
        d = {
            "name":name,
            "type":d_type,
            "life_val" :100
        }
    else:
        print("未知物种，不易接近")
        return None
    return d
def person(name,age,sex):
    d = {
        "name": name,
        "age": age,
        "sex":sex,
        "life_val": 100
    }
    if age > 18:
        d["attack_level"] = 50
    else:
        d["attack_level"] = 30
    return d
```

上面两个方法相当于造了两个模子，游戏开始，你得生成一个人和狗的实际对象吧，怎么生成呢？

```
dog1 = dog("majj","平头哥")
dog2 = dog("二哈","京巴")
p1 = person("alex",22,"male")
```

两个角色对象生成了，狗和人还有不同的功能呀，狗会咬人，人会打狗，对不对? 怎么实现呢，。。想到了， 可以每个功能再写一个函数，想执行哪个功能，直接 调用 就可以了，对不？

```python
def bite(dog_obj,person_obj):
    person_obj["life_val"] -= dog_attack_level[dog_obj["type"]]
    print("疯狗[%s]咬了[%s],掉血[%s]..." %(dog_obj["name"], person_obj['name'], dog_attack_level[dog_obj["type"]]) )
def beat(person_obj,dog_obj):
    dog_obj["life_val"] -= person_obj['attack_level']
    print("[%s] 打了 疯狗[%s],狗掉血[%s]..." %(person_obj["name"], dog_obj["name"], person_obj["attack_level"]))
dog1 = dog("majj","平头哥")
dog2 = dog("二哈","京巴")
p1 = person("alex",22,"male")
bite(dog1,p1) #调用
beat(p1,dog2)
print(dog1,dog2)
```

上面的功能实现的简直是完美！



但是仔细玩耍一会，你就不小心干了下面这件事

把人传给了只有狗能用的方法，导致后面逻辑全部出错了

人是不应该调用狗的功能的，如何在代码级别实现这个限制呢？

```
dog_attack_level = {
    "京巴":20,
    "藏獒":80,
    "平头哥":60
}
def dog(name,d_type):
    if d_type in dog_attack_level:
        d = {
            "name":name,
            "type":d_type,
            "life_val" :100
        }
    else:
        print("未知物种，不易接近")
        return None
    def bite(person_obj): # 把这个方法写在dog里面，表示这是dog独有的功能
        person_obj["life_val"] -= dog_attack_level[d["type"]]
        print("疯狗[%s]咬了[%s],掉血[%s]..." % (d["name"], person_obj['name'], dog_attack_level[d["type"]]))
    d["bite"] = bite
    return d
def person(name,age,sex):
    d = {
        "name": name,
        "age": age,
        "sex":sex,
        "life_val": 100
    }
    if age > 18:
        d["attack_level"] = 50
    else:
        d["attack_level"] = 30
    def beat( dog_obj): # 把这个方法写在person里面，表示这是person独有的功能
        dog_obj["life_val"] -= d['attack_level']
        print("[%s] 打了 疯狗[%s],狗掉血[%s]..." % (d["name"], dog_obj["name"], d["attack_level"]))
    d["beat"] = beat
    return d
dog1 = dog("majj","平头哥")
dog2 = dog("二哈","京巴")
p1 = person("alex",22,"male")
dog1["bite"](p1)  # 调用时只传递要咬谁就行了
p1["beat"](dog2)
print(dog1,dog2)
```

这样就实现了限制人只能用人自己的功能啦。

说了这么多，这跟面向对象有什么关系么？ 当然有，其实你上面写的代码，就是面向对象的代码。

你在设计角色时，为了让一个角色可以变成多个实体对象，你设计了一个基础模板，只要传入不同参数，就会产生不同的狗。 这代表你已经开始切换成上帝视角看事情 ，上帝视角就是面向对象编程的视角，上帝要造世界万物，他肯定不是一个一个的造出来，他肯定是设计出一个个的物种的模板，然后通过模子批量批一个个的实体造出来。造出来的实体各有特色，属性、功能都不尽相同，有的人的贪婪、有的人好色、有的人懦弱，有的人勇猛。这些人之间会发生什么关系 ，谁和谁交媾、谁和谁打仗，上帝懒的管，上帝只控制大局。听着玄乎吧，我们接下来一点点接晓怎么通过面向对象在编程世界里做上帝。

# 面向对象语法

## 面向过程 VS 面向对象

### **编程范式**

编程是 程序 员 用特定的语法+数据结构+算法组成的代码来告诉计算机如何执行任务的过程 ， 一个程序是程序员为了得到一个任务结果而编写的一组指令的集合，正所谓条条大路通罗马，实现一个任务的方式有很多种不同的方式， 对这些不同的编程方式的特点进行归纳总结出来的编程方式类别，即为编程范式。 不同的编程范式本质上代表对各种类型的任务采取的不同的解决问题的思路， 大多数语言只支持一种编程范式，当然也有些语言可以同时支持多种编程范式。 两种最重要的编程范式分别是面向过程编程和面向对象编程。

### 面向过程编程(Procedural Programming)

Procedural programming uses a list of instructions to tell the computer what to do step-by-step. 

面向过程编程依赖 - 你猜到了- procedures，一个procedure包含一组要被进行计算的步骤， 面向过程又被称为top-down languages， 就是程序从上到下一步步执行，一步步从上到下，从头到尾的解决问题 。基本设计思路就是程序一开始是要着手解决一个大的问题，然后把一个大问题分解成很多个小问题或子过程，这些子过程再执行的过程再继续分解直到小问题足够简单到可以在一个小步骤范围内解决。

举个典型的面向过程的例子， 有个需求是对网站日志进行分析，生成邮件报告，整个流程分以下几步：

1. 到各台服务器上收集日志，因为有多台网站服务器，共同对外提供服务

2. 对日志进行各种维度分析，比如pv,uv, 来源地区、访问的设备等

3. 生成报告，发送邮件

代码如下

```python
# 1 整合日志
def collect_logs():
    print("log on server A ,get access.log")
    print("log on server B ,get access.log")
    print("log on server C ,get access.log")
    print("combine logs in to one file")
# 2 日志分析
def log_analyze(log_file):
    print("pv、uv分析....")
    print("用户来源分析....")
    print("访问的设备来源分析....")
    print("页面停留时间分析....")
    print("入口页面分析....")
# 3 生成报告并发送
def send_report(report_data):
    print("connect email server...")
    print("send email....")
def main():
    collect_logs()
    log_analyze('my_db')
    send_report()
if __name__ == '__main__':
    main()
```

这样做的问题也是显而易见的，就是如果你要对程序进行修改，对你修改的那部分有依赖的各个部分你都也要跟着修改， 举个例子，如果程序开头你设置了一个变量值 为1 ， 但如果其它子过程依赖这个值 为1的变量才能正常运行，那如果你改了这个变量，那这个子过程你也要修改，假如又有一个其它子程序依赖这个子过程 ， 那就会发生一连串的影响，随着程序越来越大， 这种编程方式的维护难度会越来越高。 

所以我们一般认为， 如果你只是写一些简单的脚本，去做一些一次性任务，用面向过程的方式是极好的，但如果你要处理的任务是复杂的，且需要不断迭代和维护 的， 那还是用面向对象最方便了。

### 面向对象编程(Object-Oriented Programming)

OOP编程是利用“类”和“对象”来创建各种模型来实现对真实世界的描述，使用面向对象编程的原因一方面是因为它可以使程序的维护和扩展变得更简单，并且可以大大提高程序开发效率 ，另外，基于面向对象的程序可以使它人更加容易理解你的代码逻辑，从而使团队开发变得更从容。

面向对象的几个核心特性如下

**Class 类**

一个类即是对一类拥有相同属性的对象的抽象、蓝图、原型。在类中定义了这些对象的都具备的属性（variables(data)）、共同的方法

**Object 对象** 

一个对象即是一个类的实例化后实例，一个类必须经过实例化后方可在程序中调用，一个类可以实例化多个对象，每个对象亦可以有不同的属性，就像人类是指所有人，每个人是指具体的对象，人与人之前有共性，亦有不同

**Encapsulation 封装**

在类中对数据的赋值、内部调用对外部用户是透明的，这使类变成了一个胶囊或容器，里面包含着类的数据和方法

**Inheritance 继承**

一个类可以派生出子类，在这个父类里定义的属性、方法自动被子类继承

**Polymorphism 多态**

多态是面向对象的重要特性,简单点说:“一个接口，多种实现”，指一个基类中派生出了不同的子类，且每个子类在继承了同样的方法名的同时又对父类的方法做了不同的实现，这就是同一种事物表现出的多种形态。

编程其实就是一个将具体世界进行抽象化的过程，多态就是抽象化的一种体现，把一系列具体事物的共同点抽象出来, 再通过这个抽象的事物, 与不同的具体事物进行对话。

对不同类的对象发出相同的消息将会有不同的行为。比如，你的老板让所有员工在九点钟开始工作, 他只要在九点钟的时候说：“开始工作”即可，而不需要对销售人员说：“开始销售工作”，对技术人员说：“开始技术工作”, 因为“员工”是一个抽象的事物, 只要是员工就可以开始工作，他知道这一点就行了。至于每个员工，当然会各司其职，做各自的工作。

多态允许将子类的对象当作父类的对象使用，某父类型的引用指向其子类型的对象,调用的方法是该子类型的方法。这里引用和调用方法的代码编译前就已经决定了,而引用所指向的对象可以在运行期间动态绑定

#### **面向对象vs面向过程总结**

面向过程的程序设计的核心是过程（流水线式思维），过程即解决问题的步骤，面向过程的设计就好比精心设计好一条流水线，考虑周全什么时候处理什么东西。

**优点是：极大的降低了写程序的复杂度，只需要顺着要执行的步骤，堆叠代码即可。**

**缺点是：一套流水线或者流程就是用来解决一个问题，代码牵一发而动全身。**

面向对象的程序设计的核心是对象（上帝式思维），要理解对象为何物，必须把自己当成上帝，上帝眼里世间存在的万物皆为对象，不存在的也可以创造出来。面向对象的程序设计好比如来设计西游记，如来要解决的问题是把经书传给东土大唐，如来想了想解决这个问题需要四个人：唐僧，沙和尚，猪八戒，孙悟空，每个人都有各自的特征和技能（这就是对象的概念，特征和技能分别对应对象的属性和方法），然而这并不好玩，于是如来又安排了一群妖魔鬼怪，为了防止师徒四人在取经路上被搞死，又安排了一群神仙保驾护航，这些都是对象。然后取经开始，师徒四人与妖魔鬼怪神仙互相缠斗着直到最后取得真经。如来根本不会管师徒四人按照什么流程去取。

面向对象的程序设计的

**优点是：解决了程序的扩展性。对某一个对象单独修改，会立刻反映到整个体系中，如对游戏中一个人物参数的特征和技能修改都很容易。**

**缺点：可控性差，无法向面向过程的程序设计流水线式的可以很精准的预测问题的处理流程与结果，面向对象的程序一旦开始就由对象之间的交互解决问题**，**即便是上帝也无法预测最终结果。于是我们经常看到一个游戏人某一参数的修改极有可能导致阴霸的技能出现，一刀砍死3个人，这个游戏就失去平衡。**

应用场景：需求经常变化的软件，一般需求的变化都集中在用户层，互联网应用，企业内部软件，游戏等都是面向对象的程序设计大显身手的好地方。



## 类的定义

```python
class Dog:  # 类名首字母要大写，驼峰体
    d_type = "京巴"  # 公共属性，又称类变量
    def say_hi(self):  # 类的方法，必须带一个self参数，代表实例本身，具体先不解释
        print("hello , I am a dog,my type is ",self.d_type) # 想调用类里的属性，都要加上self., 原因先不表
d = Dog()  # 生成一个狗的实例
d2 = Dog()  # 生成一个狗的实例
d.say_hi()  # 调用狗这个类的方法
d2.say_hi()
print(d.d_type)  # 调用Dog类的公共属性
```

以上代码就是定义好了Dog这个类，相当于先生成了一个模板，接下来生成了2个实例d, d2，相当于2条有血有肉的狗被创造出来了。

d_type是类变量，是Dog类下所有实例共有的属性，它存在Dog类本身的内存里。你可以查看d1.d_type,d2.d_type的内存地址，指向的是同一处

除了共有属性，有没有私有的呢？ 比如每条狗的名字、年龄、主人都不一样。可以的，如下操作就行：

```python
class Dog:  # 类名首字母要大写，驼峰体
    d_type = "京巴"  # 公共属性，又称类变量
    def __init__(self,name,age,master): # 初始化函数，只要一实例化，就会自动执行
        print('初始化这个实例....',name)
        self.name = name  # self.name 就是实例自己的变量
        self.age = age
        self.master = master
    def say_hi(self):  # 类的方法，必须带一个self参数，代表实例本身，具体先不解释
        print("hello , I am a dog,my type is ",self.d_type) # 想调用类里的属性，都要加上self., 原因先不表
d = Dog("毛毛",2,"Alex")  # 生成一个狗的实例
d2 = Dog("二蛋",3,"Jack")  # 生成一个狗的实例
d.say_hi()  # 调用狗这个类的方法
d2.say_hi()
print(d2.name, d2.age, d2.master) # 调用实例的变量
```

执行输出

```
初始化这个实例.... 毛毛
初始化这个实例.... 二蛋
hello , I am a dog,my type is  京巴
hello , I am a dog,my type is  京巴
二蛋 3 Jack
```

我们并没有调用**init**(self,….),但它会自动执行，因为它叫初始化函数，就是在实例化的时候，用来初始化一些数据的，比如初始化你实例的名字、年龄等属性啦。

这些写在**init**(self,xxxx)里 name,age,master变量，跟d_type有什么区别呢？

区别就是， d_type是存在Dog类自己的内存里， self.name,self.age,self.master是存在每个实例自己的内存里

![img](https://book.apeland.cn/media/images/2019/04/19/image.png)

## self到底是个什么鬼？

想明白self什么意思，我们先搞明白 ，实例化的过程，看下图；

1. step 1, d = Dog(“毛毛”，2，”Alex”) 会申请一会内存空间，指向变量名d

2. step 2, **init**(xxxx)这个初始化方法需要把接收到参数存下来， 存到这个d的内存空间里

3. step 3, 传给初始化方法里的name,age,master想绑定到d的空间里，怎么存呢？ 就得把d的内存空间传到这个方法里， 所以self就是用来接收d的地址的。d = Dog(“毛毛”，2，”Alex”) 相当于Dog(d,”毛毛”,2,”Alex”), 那self.name = name 也就相当于d.name = name 。我们在实例时没有手动传递d到Dog类里， 只写了d = Dog(“毛毛”,2,”Alex”), 是Python解释器帮你自动干了这个事。

![img](https://book.apeland.cn/media/images/2019/04/20/image.png)

到此，我们终于明白 ，**原来self就是代表实例本身。你实例化时python会自动把这个实例本身通过self参数传进去。**

self 代表的是类的实例，代表当前对象的地址，而 **self.__class__** 则指向类。

self 不是 python 关键字，我们把他换成 其他的非关键字也是可以正常执行的:

你说好吧，假装懂了， 但下面这段代码你又不明白了， 为何say_hi(self),要写个self呢？　

```python
def say_hi(self):  # 类的方法，必须带一个self参数，代表实例本身
    print("hello , I am a dog,my type is ",self.d_type,self.name) # 想调用类里的属性，都要加上self.
```



那是因为，你自己也看到了， 这个类的方法其实就是一堆函数对吧。函数被一个实例调用时，它怎么知道是谁在调用它呢？ 函数内部要用到一些实例的属性的时候去哪里取呢？ 比如在say_hi函数里怎么取到d.name,d.age？只能你先传递给它。 所以这就是为何类下的每个方法第一个参数都要是self,因为是为了接收实例这个对象本身。

**注意：self在实例化时自动将对象/实例本身传给init的第一个参数，你也可以给他起个别的名字，但是正常人都不会这么做，因为你瞎改别人就不认识。**

## 属性引用

#### 类的公共属性引用（类名.属性）

```python
class Dog:  # 类名首字母要大写，驼峰体
    d_type = "京巴"  # 公共属性，又称类变量
    def say_hi(self):  
        print("hello , I am a dog,my type is ",self.d_type) 
print(Dog.d_type) # 查看Dog的d_type属性
print(Dog.say_hi)  # 引用Dog的say_hi方法，注意只是引用，不是调用
```

#### **实例属性引用(实例名.属性)**

```python
d2 = Dog("二蛋",3,"Jack")  # 生成一个狗的实例
d2.say_hi() # 调用狗这个类的方法
print(d2.name, d2.age, d2.master) # 调用实例的属性
print(d2.d_type) # 注意通过实例也可以调用类的公共属性
```

你也可以使用以下函数的方式来访问属性：

- getattr(obj, name[, default]) : 访问对象的属性。

- hasattr(obj,name) : 检查是否存在一个属性。

- setattr(obj,name,value) : 设置一个属性。如果属性不存在，会创建一个新属性。

- delattr(obj, name) : 删除属性

  ```pythom
  hasattr(emp1, 'age')    # 如果存在 'age' 属性返回 True。
  getattr(emp1, 'age')    # 返回 'age' 属性的值
  setattr(emp1, 'age', 8) # 添加属性 'age' 值为 8
  delattr(emp1, 'age')    # 删除属性 'age'
  ```

  

# 对象间的交互、组合

## 对象间的交互

在游戏中有很多玩家，他们互砍，如何实现的？

还记得我们开头的引子么，人狗大战，用面向对象如何实现？

```python
class Dog:  # 定义一个狗类
    role = 'dog'  # 狗的角色属性都是狗
    def __init__(self, name, breed, attack_val):
        self.name = name
        self.breed = breed  # 每一只狗都有自己的品种;
        self.attack_val = attack_val  # 每一只狗都有自己的攻击力;
        self.life_val = 100  # 每一只狗都有自己的生命值;
    def bite(self, person):
        # 狗可以咬人，这里传递进来的person也是一个对象。
        person.life_val -= self.attack_val # 狗咬人，那么人的生命值就会根据狗的攻击力而下降
        print("狗[%s]咬了人[%s],人掉血[%s],还剩血量[%s]..." % (self.name,person.name,self.attack_val,person.life_val))
class Person:  # 定义一个人类
    role = 'person'  # 人的角色属性都是人
    def __init__(self, name, sex, attack_val):
        self.name = name
        self.attack_val = attack_val
        self.life_val = 100
        self.sex = sex
    def attack(self,dog):
        # 人可以攻击狗，这里传递进来的dog也是一个对象。
        # 人攻击狗，那么狗的生命值就会根据人的攻击力而下降
        dog.life_val -= self.attack_val
        print("人[%s]打了狗[%s],狗掉血[%s],还剩血量[%s]..." % (self.name,dog.name,self.attack_val,dog.life_val))
d = Dog("mjj","二哈",20)
p = Person("Alex","Male",60)
d.bite(p) # 对象交互,把p实例传递给d的方法
p.attack(d)
```

## 类与类之间的关系

大千世界, 万物之间皆有规则和规律. 我们的类和对象是对大千世界中的所有事物进行归类. 那事物之间存在着相对应的关系. 类与类之间也同样如此. 在面向对象的世界中. 类与类中存在以下关系:

1. 依赖关系，狗和主人的关系
2. 关联关系，你和你的女盆友的关系就是关联关系
3. 组合关系，比聚合还要紧密.比如人的大脑, 心脏, 各个器官. 这些器官组合成一个人. 这时. 人如果挂了. 其他的东西也跟着挂了
4. 聚合关系，电脑的各部件组成完整的电脑，电脑里有CPU, 硬盘, 内存等。 每个组件有自己的生命周期， 电脑挂了. CPU还是好的. 还是完整的个体
5. 继承关系， 类的三大特性之一，子承父业

### 依赖关系

狗和主人的关系可以理解为是一种依赖关系，如果没有主人，它就是流浪狗了，可能会死。

```python
class Dog:
    def __init__(self,name,age,breed,master):
        self.name = name
        self.age = age
        self.breed = breed
        self.master = master # master传进来的应该是个对象
        self.sayhi()  # 调用自己的方法在实例化的时候
    def sayhi(self):
        print("Hi, I'm %s, a %s dog, my master is %s" %(self.name,self.breed,self.master.name))
class Person:
    def __init__(self,name,age,sex):
        self.name = name
        self.age = age
        self.sex = sex
    def walk_dog(self,dog_obj):
        """遛狗"""
        print("主人[%s]带狗[%s]去溜溜。。。" % (self.name,dog_obj.name ))
p = Person("Alex",26,"Male")
d = Dog("Mjj",5,"二哈",p)
p.walk_dog(d)
```

输出

```python
Hi, I'm Mjj, a 二哈 dog, my master is Alex
主人[Alex]带狗[Mjj]去溜溜。。。
```

### 关联关系

你和你女朋友的关系

```
class Person:
    def __init__(self,name,age,sex):
        self.name = name
        self.age = age
        self.sex = sex
        self.partner = None # 另一半，是个对象
    def do_private_stuff(self):
        """和男/女盆友干点羞羞的事"""
        print("%s is doing %s in the 7th hotel." %(self.name,self.partner.name))
p1 = Person("武大郎",25,"男")
p2 = Person("黑姑娘",23,"女")
p1.partner = p2 # 两个对象要互相绑定彼此
p2.partner = p1
p1.do_private_stuff()
p2.do_private_stuff()

```

以上虽然实现了2个对象的关联，但细想其实是有问题的，武大郎和黑姑娘需要在自己的实例中分别绑定下彼此才能实现伴侣关系。假如有一方忘记了关联，那这个伴侣关系就只是单方面成立了，黑姑娘知道自己的另一伴是武大郎，武大郎却不识黑姑娘。

为了确保这两人的关系是一致的，怎么办呢？

可以创建个单独的类，存储2个人的关系状态，2个人在查自己的感情状态时，都到这个单独的实例里来查

```
class RelationShip:
    """保存2个人的感情关联关系"""
    def __init__(self):
        self.couple = []
    def make_couple(self,obj1,obj2):
        self.couple.append(obj1)
        self.couple.append(obj2)
        print("[%s] 和 [%s] 正式结为对象..." % (obj1.name,obj2.name))
    def break_up(self):
        if self.couple:
            print("[%s] 和 [%s] 要分手了...真好" % (self.couple[0].name,self.couple[1].name))
            self.couple.clear()
        else:
            print("你根本就没对象，你分手个蛋呀...")
    def get_my_partner(self,obj):
        """返回我的另一半"""
        for i in self.couple:
            if obj != i: # copule列表里有2个值，一个是我自己，一个是我对象，只要跟传进来的obj不相等，代表找到了我对象
                return i.name
        else:
            print("你没有对象，自己心里没有点数么....")
class Person:
    def __init__(self,name,age,sex,relation_obj):
        self.name = name
        self.age = age
        self.sex = sex
        self.relation = relation_obj # 把RelationShip对象传进来
        #self.partner = None # 另一半，是个对象
    def do_private_stuff(self):
        """和男/女盆友干点羞羞的事"""
        print("%s is doing %s in the 7th hotel." %(self.name,self.relation.get_my_partner(self)))
relation_obj = RelationShip()
p1 = Person("武大郎",25,"男",relation_obj)
p2 = Person("黑姑娘",23,"女",relation_obj)
relation_obj.make_couple(p1,p2) # 把2个人结合在一起
p1.do_private_stuff()
p2.do_private_stuff()
p1.relation.break_up() # 要分手了
p1.relation.get_my_partner(p1) # 再去查，就没有对象了
p2.relation.get_my_partner(p2) # 再去查，就没有对象了
```

### 组合关系

组合指的是，在一个类中以另外一个类的对象作为数据属性，称为类的组合

```
class Dog:  # 定义一个狗类
    role = 'dog'  # 狗的角色属性都是狗
    ......
class Weapon:
    def stick(self,obj):
        """打狗棒"""
        self.name = "打狗棒"
        self.attack_val = 40
        obj.life_val -= self.attack_val
        self.print_log(obj)
    def knife(self,obj):
        """屠龙刀"""
        self.name = "屠龙刀"
        self.attack_val = 80
        obj.life_val -= self.attack_val
        self.print_log(obj)
    def gun(self,obj):
        """AK47"""
        self.name = "AK47"
        self.attack_val = 100
        obj.life_val -= self.attack_val
        self.print_log(obj)
    def print_log(self,obj):
        print("[%s]被[%s]攻击了，掉血[%s],还剩血量[%s]..." %(obj.name,self.name,self.attack_val,obj.life_val))
class Person:  # 定义一个人类
    role = 'person'  # 人的角色属性都是人
    def __init__(self, name, sex, attack_val):
        self.name = name
        self.attack_val = attack_val
        self.life_val = 100
        self.sex = sex
        self.weapon = Weapon() # 在此处实例化一个Weapon对象
    def attack(self,dog):
        # 人可以攻击狗，这里传递进来的dog也是一个对象。
        # 人攻击狗，那么狗的生命值就会根据人的攻击力而下降
        dog.life_val -= self.attack_val
        print("人[%s]打了狗[%s],狗掉血[%s],还剩血量[%s]..." % (self.name,dog.name,self.attack_val,dog.life_val))
d = Dog("mjj","二哈",20)
p = Person("Alex","Male",60)
d.bite(p) # 对象交互,把p实例传递给d的方法
p.attack(d)
p.weapon.knife(d)  # 通过组合的方式调用weapon实例下的具体武器
p.weapon.stick(d) 
```

**用组合的方式建立了类与组合的类之间的关系，它是一种‘有’或者”包含”的关系,比如老师有生日，老师教python课程。 你有女朋友，你朋友有自己的一些特征**

```
class BirthDate:
    def __init__(self, year, month, day):
        self.year = year
        self.month = month
        self.day = day
class Course:
    def __init__(self, name, price, period):
        self.name = name
        self.price = price
        self.period = period
class Teacher:
    def __init__(self, name, gender, birth, course):
        self.name = name
        self.gender = gender
        self.birth = birth
        self.course = course
    def teaching(self):
        print('teaching.....',self.course.name)
p1 = Teacher('Alex', 'Male',
             BirthDate('1995', '1', '27'),
             Course('Python', '28000', '5 months')
             )
print(p1.birth.year, p1.birth.month, p1.birth.day)
print(p1.course.name, p1.course.price, p1.course.period)
```

**当类之间有显著不同，并且较小的类是较大的类所需要的组件时，用组合比较好**

## 类变量的用途

我们知道类变量是存在类里，实例变量存在每个实例里，那什么时候用类变量呢？

例子：我要把中国14亿人的都分别生成一个实例。

```
class Person:
    nationality = "Chinese"
    def __init__(self,name,sex,birthday,hometown):
        self.name = name
        self.sex = sex
        self.birthday = birthday
        self.hometown = hometown
p1 = Person("Alex","Male","1995-05-32","山东德州")
p2 = Person("Mjj","Ladyboy","1992-06-16","河南信阳")
print(p1.nationality,p2.nationality)
输出结果：
Chinese Chinese
```

由于中国人的国籍都是Chinese, 此时你没必要存14亿份这个数据，存一份就好。

可如果有人改国籍怎么办？

```
p2.nationality = "Japan"  # 这个动作相当于把p2.nationality变成了实例变量
print(p1.nationality,p2.nationality)
输出：
Chinese Japan  # 并不会影响p1的国籍
```

## 属性的增删改查

```
class Person:
    nationality = "Chinese"
    addr = "北京"
    def __init__(self,name,age,sex):
        self.name = name
        self.age = age
        self.sex = sex
# 实例属性操作
p = Person("Alex",26,"Male")
p.name = "Alex Li 金角大王" # 修改属性
p.job = "CEO" # 添加实例属性
del p.sex # 删除实例属性
print(p.job)  #打印添加的实例属性
# 类属性操作
Person.nationality = "US"
Person.race = "Yellow" # 添加类属性
del Person.addr
print(p.addr) # 再调用已删除的类属性就会报错了
```

