def ext_gcd(a, b):  # 扩展欧几里得算法
    if b == 0:
        return 1, 0, a
    else:
        x, y, gcd = ext_gcd(b, a % b)  # 递归直至余数等于0(需多递归一层用来判断)
        x, y = y, (x - (a // b) * y)  # 辗转相除法反向推导每层a、b的因子使得gcd(a,b)=ax+by成立
        return  y

'''
唯密文攻击
'''
#频率分布列表
index = ['e', 't', 'a', 'o', 'i', 'n', 's', 'h', 'r', 'd', 'l', 'c', 'u', 'm', 'w', 'f', 'g', 'y', 'p', 'b', 'v', 'k', 'j', 'q', 'x', 'z']

# 返回统计后的字符排列
def frequency_Sort(s):
    d = dict()
    for i in range(ord('a'),ord('z')+1):
        sum = 0
        for j in s:
            if ord(j)==i :
                sum += 1
        d[chr(i)] = sum
    d = sorted(d.items(), key = lambda x: x[1], reverse = True) #d的类型变为list,不再是dict
    print(d)
    c = []
    for k in d:
        c.append(k[0])
    return c

def coefficient(a, b, m, n):     #求系数
    x1 = d[a]  # 密文中出现最多的字符
    x2 = d[b]  # 密文中出现次数第二的字符
    y1 = d[m]  # 频率字母表中对应的字符
    y2 = d[n]
    k = 0
    f = (x2 - x1) % 26
    point = (y2 - y1) % 26
    while f % point != 0:
        f += 26
        k += 1
        if k == 1000:
            break
    if k == 1000:
        return 2, 0
    _a = ( f / point ) % 26
    _b = ( x1 - y1 * _a) % 26
    return _a , _b

def decodeFunction(a, b):
    q = []
    t = [0,1]
    numChu = 26 // a
    numYu = 26 % a
    while numYu != 0:
        q.append(numChu)
        j = a
        a = numYu
        numChu = j // a
        numYu = j % a
    q.append(numChu)
    for i in range(0,len(q) - 1):
        f = -q[i] * t[i + 1] + t[i]
        t.append(f)
    a = t[-1] % 26
    b = (-b * t[-1]) % 26
    return a, b


if __name__ == '__main__':
    # print(ext_gcd(26, 19))
    s = 'AOPCGUDEYKROIFKGBEFMCPIYCRARDEPBAQUFEPGHKJPKDDCJGKPJIEVCGEBEBAYCFAMCXCERIAREHAFFERJGHCRAOKBBKYARRCEDKFAIGHCPCDCKDFCBKKMEFEMCGKXCOKRQKYYEBKYCERBHCCRJKVEIBKPSAQKUFJRKBIDCEMEGHKFCICRBCRQCARQKYDERSERJGEIQKRIAJCPCJRKBBKKXPAOHB'
    s = s.lower()
    j = 0
    d = dict()
    # 字母与数字对应
    for i in range(ord('a'), ord('z') + 1):
        d[chr(i)] = j
        j += 1
    w = frequency_Sort(s)
    bug = ''
    for two in range(0, 25):
        for p1 in range(0, len(w) - 1):
            for p2 in range(p1 + 1, len(w)):
                a, b = coefficient(w[p1], w[p2], index[two], index[two + 1])
                if a % 2 == 0 or a % 13 == 0:
                    continue
                a, b = decodeFunction(a, b)
                c = ''
                for i in s:
                    if i == ' ':
                        c += i
                        continue
                    f = (d[i] * a + b) % 26
                    for q, v in d.items():
                        if v == f:
                            c += q
                            break
                print('明文为：{}'.format(c))
                bug = input("若语义有误则输入'c'继续尝试（输入's'退出）：")
                if bug == 's':
                    break
                else:
                    continue
            if bug == 's':
                break
        if bug == 's':
            break