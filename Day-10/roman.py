
def romanInt(str):
    
    sum=0;
    for i in range(len(str)):

        ch1=str[i]

        if((i+1) < len(str) and getdata(ch1) < getdata(str[i+1])):
            sum=sum -getdata(ch1)
        else:
            sum=sum + getdata(ch1)
    return sum

def getdata(ch):
    
    if(ch=='I'):
        return 1;
    elif(ch=='V'):
        return 5;
    elif(ch=='X'):
        return 10;
    elif(ch=='L'):
        return 50;
    elif(ch=='C'):
        return 100;
    elif(ch=='D'):
        return 500;
    elif(ch=='M'):
        return 1000;
            
    return -1;
    
str="III"
sum1=romanInt(str)
print(sum1)
