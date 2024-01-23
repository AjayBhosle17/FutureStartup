def prime(num):

    flag=0
    for i in range(1,num+1):
    
        cnt=0;
        for j in range(1,i+1):
            
            if(i%j==0):
                cnt+=1;
            
        if cnt==2 : 
             flag+=1
        
    return flag

count = prime(10)
print(count)