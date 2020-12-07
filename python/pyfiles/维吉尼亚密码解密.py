fi = [0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0, 0, 0, 0, 0 ,0, 0, 0]
fi[0]= 8.19 *0.01
fi[1]= 1.47 *0.01
fi[2]= 3.83 *0.01
fi[3]= 3.91 *0.01
fi[4]= 12.25 *0.01
fi[5]= 2.26 *0.01
fi[6]= 1.71 *0.01
fi[7]= 4.57 *0.01
fi[8]= 7.10 *0.01
fi[9]= 0.14 *0.01
fi[10]= 0.41 *0.01
fi[11]= 3.77 *0.01
fi[12]= 3.34 *0.01
fi[13]= 7.06 *0.01
fi[14]= 7.26 *0.01
fi[15]= 2.89 *0.01
fi[16]= 0.09 *0.01
fi[17]= 6.85 *0.01
fi[18]= 6.36 *0.01
fi[19]= 9.41 *0.01
fi[20]= 2.58 *0.01
fi[21]= 1.09 *0.01
fi[22]= 1.59 *0.01
fi[23]= 0.21 *0.01
fi[24]= 1.58 *0.01
fi[25]= 0.08 *0.01


# 计算秘钥长度
def cracker (miwen, CI):
   N = [0.0]*(26)
   CI2 = 0.0
   j = 0
   for i in range (len(miwen)):
       if (miwen[i].isupper() or miwen[i].islower()):
           j = j+1
   new_miwen = [0]*(j)
   CT1 = [0]*(j)
   CI1 = [0.0]*(len(new_miwen))
   j = 0
   for i in range (len(miwen)):
       if (miwen[i].isupper() or miwen[i].islower()):
           new_miwen[j] = miwen[i]
           j =j +1
   for i in range (1,len(new_miwen)):
       for k in range (0,i):
           for j in range (k,len(new_miwen),i):
               N[(ord(new_miwen[j])-65)%32] = N[(ord(new_miwen[j])-65)%32] + 1
           for m in range (26):
               if(len(new_miwen)/i<=20):
                   CI1[k] = 0.0
               else:
                   CI1[k] = CI1[k] + float(N[m]*(N[m]-1))/float((len(new_miwen)/i)*((len(new_miwen)/i)-1))
           for n in range (len(N)):
               N[n] = 0.0
           CI2 = CI2 + CI1[k]
       CI2 = CI2 / i
       CT1 [i] = abs(CI2 -float(CI))
       CI2 = 0.0
       for i in range (len(CI1)):
           CI1[i] = 0.0
   minin = CT1[1]
   lmin = 1
   for i in range (1,len(CT1)):
       if (CT1[i]<minin):
           lmin = i
           minin =CT1[i]
   return lmin

# 获得秘钥
def cracking_key (len_key, miwen, fi):
    j = 0
    CI = 0
    N = [0.0]*(26)
    M = [0.0]*(26)
    key = [0]*(len_key)
    for i in range (len(miwen)):
        if (miwen[i].isupper() or miwen[i].islower()):
            j = j+1
    new_miwen = [0]*(j)
    CI1 = [0.0]*(26)
    j = 0
    for i in range (len(miwen)):
        if (miwen[i].isupper() or miwen[i].islower()):
            new_miwen[j] = miwen[i]
            j =j +1
    for i in range (26):
        CI = CI + fi[i]*fi[i]
    for i in range (0,len_key):
        for k in range (26):
            for j in range (i,len(new_miwen),len_key):
                if (new_miwen[j].isupper()):
                    N[(ord(new_miwen[j])-65-k)%26] = N[(ord(new_miwen[j])-65-k)%26] + 1
                else:
                    N[(ord(new_miwen[j])-97-k)%26] = N[(ord(new_miwen[j])-97-k)%26] + 1
            for m in range (26):
                CI1[k] = CI1[k] + (N[m])*(fi[m])/float(len(new_miwen)/len_key)
            for n in range (len(N)):
                N[n] = 0.0
        for p in range (26):
            M[p] = abs(CI1[p] - float(CI))
        for a in range (26):
            CI1[a] = 0.0
        minin = M[0]
        key[i] = 0
        for n in range (26):
            if (M[n]<minin):
                key[i] = (ord('a')+n)
                minin = M[n]
        for n1 in range (26):
            M[n1] = 0.0
    return key
# 密文解密成明文
def decrypto (miwen, key):
    mingwen = [0]*(len(miwen))
    count = 0
    for i in range (len(miwen)):
        if(miwen[i].isalpha()):
            if(miwen[i].isupper()):
                offset1 = key[(i-count)%len(key)]-ord('a')
                mingwen[i] = chr(((ord(miwen[i])+ord('A'))-offset1)%26+ord('A'))
            else:
                offset2 = ord(key[(i-count)%len(key)])-ord('a')
                mingwen[i] = chr(((ord(miwen[i])-ord('a'))-offset2)%26+ord('a'))
        else:
            mingwen[i]=miwen[i]
            count = count + 1
    return mingwen

if __name__ == '__main__':
    miwen = 'KCCPKBGUFDPHQTYAVINRRTMVGRKDNBVFDETDGILTXRGUDDKOTFMBPVGEGLTGCKQRACQCWDNAWCRXIZAKFTLEWRPTYC' \
            'QKYVXCHKFTPONCQQRHJVAJUWETMCMSPKQDYHJVDAHCTRLSVSKCGCZQQDZXGSFRLSWCWSJTBHAFSIASPRJAHKJRJUMV' \
            'GKMITZHFPDISPZL VLGWTFPLKKEBDPGCEBSHCTJRWXBAFSPEZQNRWXCVYCGAONWDDKACKAWBBIKFTIOVKCGGHJVLNHI' \
            'FFSQESVYCLACNVRWBBIREPBBVFEXOSCDYGZWPFDTKFQIYCWHJVLNHIQIBTKHJVNPIST'
    len_key = cracker(miwen, 0.065)
    print(len_key)
    key = cracking_key(len_key, miwen, fi)
    for item in key:
        print(chr(item))
    mingwen = decrypto(miwen, key)
    print(''.join(mingwen).lower())
