## 题目

设计一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作。

## 要求

- pop push getMin操作的时间复杂度都是O（1）
- 设计的栈类型可以使用现成的栈结构

## 解答

在设计上使用两个栈，一个栈用来保存当前栈中的元素，其功能和一个正常的栈没有区别，这个栈记为stackData；另一个栈用于保存每一步的最小值，这个栈记为stackMin.实现方案有2种：

### 第一种设计方案

- 压入数据规则

  假设当前数据为newNum,先将其压入stackData.然后判断stackMin是否为空：

  - 如果为空，则newNum呀压入stackMin
  - 如果不为空，则比较newNew和stackMin的栈顶元素中哪一个更小；
  - 如果newNum更小或两者相等，则newNum也压入stackMin
  - 如果stackMin中栈顶元素小，则stackMin不压入任何内容

- 弹出数据规则

  先在stackData中弹出栈顶元素，记为value.然后比较当前元素stackMin的栈顶元素和value哪一个更小。通过上文提到的压入规则可知，stackMin中存在的元素是从栈底到栈顶逐渐变小的，stackMin栈顶的元素既是stackMin栈的最小值，也是当前stackData栈的最小值，所以不会出现value比stackMin的栈顶元素更小的情况，value只可能大于或等于stackMin的栈顶元素。

  当value等于stackMin的栈顶元素时，stackMin弹出栈顶元素，当value大于stackMin的栈顶元素时，stackMin不弹出栈顶元素，返回value。

- 查询当前栈中的最小值操作

  stackMin始终记录着stackData中的最小值，所以，stackMin的栈顶元素始终是当前stackData中的最小值。

```java
public static class MyStack1 {
		//数据栈
		private Stack<Integer> stackData;
		//最小值栈
		private Stack<Integer> stackMin;

		//构造函数，初始化两个栈
		public MyStack1() {
			this.stackData = new Stack<Integer>();
			this.stackMin = new Stack<Integer>();
		}

		/**
		 * push:数据栈直接放入  最小值栈如果为空则放入，否则比较新值和最小值栈顶，只有新值更小的时候才放入
		 * @param newNum
		 */
		public void push(int newNum) {
			if (this.stackMin.isEmpty()) {
				this.stackMin.push(newNum);
			} else if (newNum <= this.getmin()) {
				this.stackMin.push(newNum);
			}
			this.stackData.push(newNum);
		}

		/**
		 * pop:数据栈取一个元素，还要和最小值栈比较，如果当前取出的数和最小值栈相等，则最小值栈pop，并且把数据返回
		 * @return
		 */
		public int pop() {
			if (this.stackData.isEmpty()) {
				throw new RuntimeException("Your stack is empty.");
			}
			int value = this.stackData.pop();
			if (value == this.getmin()) {
				this.stackMin.pop();
			}
			return value;
		}

		/**
		 * 获取最小元素 ：取最小值栈的栈顶
		 * @return
		 */
		public int getmin() {
			if (this.stackMin.isEmpty()) {
				throw new RuntimeException("Your stack is empty.");
			}
			return this.stackMin.peek();
		}
	}
```

