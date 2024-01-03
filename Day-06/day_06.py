
def sort(testdata):

    red=0
    white=0
    blue=0
    
    for i in range(len(testdata)):
        if(testdata[i]==0):
            red+=1
        elif(testdata[i]==1):
            white+=1
        else:
            blue+=1
    for i in range(len(testdata)):
        if(i<red):
            testdata[i]= 0
        elif(i<red+white):
            testdata[i]=1
        else:
            testdata[i]=2   
    return testdata     
        
test_case_1 = [2,0,2,1,1,0]
test_case_2 = [2,0,1]


print("--- test case 1 ---");
print(f"Input: nums = {test_case_1}\nOutput: {sort(test_case_1)}")
print("--- test case 2 ---")
print(f"Input: nums = {test_case_2}\nOutput: {sort(test_case_2)}")
