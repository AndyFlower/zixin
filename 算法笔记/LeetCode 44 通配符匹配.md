### 通配符匹配

给定一个字符串 (s) 和一个字符模式 (p) ，实现一个支持 '?' 和 '*' 的通配符匹配。

'?' 可以匹配任何单个字符。
'*' 可以匹配任意字符串（包括空字符串）。
两个字符串完全匹配才算匹配成功。

说明:

s 可能为空，且只包含从 a-z 的小写字母。
p 可能为空，且只包含从 a-z 的小写字母，以及字符 ? 和 *。
示例 1:

输入:
s = "aa"
p = "a"
输出: false
解释: "a" 无法匹配 "aa" 整个字符串。
示例 2:

输入:
s = "aa"
p = "\*"
输出: true
解释: '*' 可以匹配任意字符串。
示例 3:

输入:
s = "cb"
p = "?a"
输出: false
解释: '?' 可以匹配 'c', 但第二个 'a' 无法匹配 'b'。
示例 4:

输入:
s = "adceb"
p = "\*a\*b"
输出: true
解释: 第一个 '*' 可以匹配空字符串, 第二个 '*' 可以匹配字符串 "dce".
示例 5:

输入:
s = "acdcb"
p = "a*c?b"
输入: false

### 代码

```java
package com.zixin.algorithm;

public class LC44 {

	public static void main(String[] args) {
		System.out.println(isMatch("adceb","*a*b"));

	}

	/**
	 * 思路一：贪心
	本题难点在于处理星号的匹配，用iStar和jStar表示星号在s和p中匹配的位置，初始值为-1，i和j表示当前匹配的位置，匹配过程如下：
	如果s和p中字符匹配，则分别自增i和j
	否则如果p中当前字符为星号，则标记iStar和jStar，同时自增j
	否则如果iStar >= 0，表示之前匹配过星号，因为星号可以匹配任意字符串，所以继续递增i，同时移动j为jStar下一个字符
	否则返回false
	当s中字符匹配完，p中字符不能有除星号以外字符
	 * @param s
	 * @param p
	 * @return
	 */
	static boolean isMatch(String s, String p) {
		int i = 0, j = 0, iStar = -1, jStar = -1, m = s.length(), n = p.length();
		while (i < m) {
			if (j < n && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '?')) {
				++i;
				++j;// i，j向后瞬移
			} else if (j < n && p.charAt(j) == '*') {// 记录后面如果匹配不成功的时候，i和j需要回溯的位置
				iStar = i;// 记录星号
				jStar = j++;// 记录星号，并且j移到下一位，准备下个循环s[i]和p[j]的匹配
			} else if (iStar >= 0) {// 发现字符不匹配且没有星号出现 但是istar>0 说明可能是*匹配的字符数量不对 这时回溯
				i = ++iStar;// i回溯到istar+1 因为上次从s串istar开始对*的尝试匹配已经被证明是不成功的（不然不会落入此分支） 所以需要从istar+1再开始试 同时inc
							// istar 更新回溯位置
				j = jStar + 1;// j回溯到jstar+1 重新使用p串*后的部分开始对s串istar（这个istar在上一行已经inc过了）位置及之后字符的匹配
			} else {
				return false;

			}
		}
		while (j < n && p.charAt(j) == '*')
			++j;// 去除多余星号
		return j == n;
	}

}

```

