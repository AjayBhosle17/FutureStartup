def lastword(str):

    cnt=0
    for i in range(len(str)-1,0,-1):

        if(str[i]!=' '):
            cnt+=1
        else:
            if(cnt>0):
                return cnt

len=lastword("Ajay Bhosle ")
print(len)
            
