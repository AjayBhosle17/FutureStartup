def climb(num):

    if(num<=3):
        return num
    else:
        a=2
        b=3
        c=0
        for i in range(0,num-3):
            c=a+b
            a=b
            b=c
        return c

data = climb(2)
print(data)

