## 普通Socket的用法

Socket分为ServerSocket和Socket两大类，ServerSocket用于服务端，可以通过accept方法监听请求，监听到请求后返回Socket，Socket用于具体完成数据传输，客户端直接使用Socket发起请求并传输数据。

ServerSocket的使用可以分为三步：

1. 创建ServerSocket。ServerSocket的构造方法一共有5个，用起来最方便的是Server-Socket（int port），只需要一个port（端口号）就可以了。
2. 调用创建出来的ServerSocket的accept方法进行监听。accept方法是阻塞方法，也就是说调用accept方法后程序会停下来等待连接请求，在接收到请求之前程序将不会往下走，当接收到请求后accept方法会返回一个Socket。
3. 使用accept方法返回的Socket与客户端进行通信。

## NioSocket的用法

ServerSocketChannel和SocketChannel，它们分别对应原来的ServerSocket和Socket。

理解NioSocket的使用必须先理解三个概念：Buffer、Channel和Selector。为了方便大家理解，我们来看个例子。记得我上学的时候有个同学批发了很多方便面、电话卡和别的日用品在宿舍卖，而且提供送货上门的服务，只要公寓里有打电话买东西，他就送过去、收钱、返回来，然后再等下一个电话，这种模式就相当于普通Socket处理请求的模式。如果请求不是很多，这是没有问题的，当请求多起来的时候这种模式就应付不过来了，如果现在的电商网站也用这种配送方式，效果大家可想而知，所以电商网站必须采用新的配送模式，这就是现在快递的模式（也许以后还会有更合理的模式）。快递并不会一件一件地送，而是将很多件货一起拿去送，而且在中转站都有专门的分拣员负责按配送范围把货物分给不同的送货员，这样效率就提高了很多。这种模式就相当于NioSocket的处理模式，Buffer就是所要送的货物，Channel就是送货员（或者开往某个区域的配货车），Selector就是中转站的分拣员。