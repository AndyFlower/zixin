## 题目

设计一个特殊的栈，在实现栈的基本功能的基础上，再实现返回栈中最小元素的操作。

## 要求

- `pop` `push` `getMin`操作的时间复杂度都是O（1）
- 设计的栈类型可以使用现成的栈结构

## 解答

在设计上使用两个栈，一个栈用来保存当前栈中的元素，其功能和一个正常的栈没有区别，这个栈记为`stackData`；另一个栈用于保存每一步的最小值，这个栈记为`stackMin`.实现方案有2种：

### 第一种设计方案

- 压入数据规则

  假设当前数据为`newNum`,先将其压入`stackData`.然后判断`stackMin`是否为空：

  - 如果为空，则`newNum`压入`stackMin`
  - 如果不为空，则比较`newNew`和`stackMin`的栈顶元素中哪一个更小；
  - 如果`newNum`更小或两者相等，则`newNum`也压入`stackMin`
  - 如果`stackMin`中栈顶元素小，则`stackMin`不压入任何内容

- 弹出数据规则

  先在`stackData`中弹出栈顶元素，记为`value`.然后比较当前元素`stackMin`的栈顶元素和`value`哪一个更小。通过上文提到的压入规则可知，`stackMin`中存在的元素是从栈底到栈顶逐渐变小的，`stackMin`栈顶的元素既是`stackMin`栈的最小值，也是当前`stackData`栈的最小值，所以不会出现`value`比`stackMin`的栈顶元素更小的情况，`value`只可能大于或等于`stackMin`的栈顶元素。

  当`value`等于`stackMin`的栈顶元素时，`stackMin`弹出栈顶元素，当`value`大于`stackMin`的栈顶元素时，`stackMin`不弹出栈顶元素，返回`value`。

- 查询当前栈中的最小值操作

  `stackMin`始终记录着`stackData`中的最小值，所以，`stackMin`的栈顶元素始终是当前`stackData`中的最小值。

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

### 第二种设计方案

- 压入数据规则

  假设当前数据为newNum,先将其压入stackDate.然后判断stackMin是否为空。

  如果为空，则newNum也压入stackMin;如果不为空，则比较newNum和stackMin的栈顶元素中哪一个更小：

  如果newNum更小或两者相等，则newNum也压入stackMin;如果stackMin中栈顶元素小，则把stackMin的栈顶元素重复压入stackMin,即在栈顶元素上再压入一个栈顶元素。

- 弹出数据规则

  在stackData中弹出数据，弹出的数据记为value;弹出stackMin中的栈顶；返回value,这样压入和弹出规则是对应的。

- 查询当前栈中的最小值操作

  由上可知，stackMin始终记录着最小值，所以stackMin的栈顶元素始终是当前stackData中的最小值。

```java
public static class MyStack2 {
		//数据栈
		private Stack<Integer> stackData;
		//最小值栈
		private Stack<Integer> stackMin;

		//构造函数，初始化数据栈和最小值栈
		public MyStack2() {
			this.stackData = new Stack<Integer>();
			this.stackMin = new Stack<Integer>();
		}

		/**
		 * 栈内添加元素：
		 *     数据栈直接添加，最小值栈如果为空直接添加，如果新数据小于等于最小值栈的栈顶将新数据入栈，否则将最小值栈的栈顶重复压入栈中
		 * @param newNum
		 */
		public void push(int newNum) {
			if (this.stackMin.isEmpty()) {
				this.stackMin.push(newNum);
			} else if (newNum < this.getmin()) {
				this.stackMin.push(newNum);
			} else {
				int newMin = this.stackMin.peek();
				this.stackMin.push(newMin);
			}
			this.stackData.push(newNum);
		}

		/**
		 * pop:不空的话数据栈和最小值栈同时pop
		 * @return
		 */
		public int pop() {
			if (this.stackData.isEmpty()) {
				throw new RuntimeException("Your stack is empty.");
			}
			this.stackMin.pop();
			return this.stackData.pop();
		}

		/**
		 * 获取最小值：最小值栈的栈顶就是当前的最小值
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

