def plus_one(test_case):
    for i in range(len(test_case)-1,-1,-1):
        if test_case[i]!=9:
            test_case[i]+=1
            return test_case
        else:
            test_case[i]=0
    test_case.insert(0,1)
    return test_case
        
            

test_case_1 = [1,2,3]
test_case_2 = [4,3,2,1]
test_case_3 = [9]

print("--- test case 1 ---")
print(f"Input: nums = {test_case_1}\nOutput: {plus_one(test_case_1)}")
print("--- test case 2 ---")
print(f"Input: nums = {test_case_2}\nOutput: {plus_one(test_case_2)}")
print("--- test case 3 ---")
print(f"Input: nums = {test_case_3}\nOutput: {plus_one(test_case_3)}")